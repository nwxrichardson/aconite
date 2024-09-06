# Aconite

## Introduction
This work is based on Eugenia for GMF (https://eclipse.dev/epsilon/doc/eugenia/) targeting instead the Sirius Model Editor. It allows you to add EAnnotations to an Ecore based metamodel to generate a Sirius Editor for models that conform to the metamodel. It is done in a way that both allows access to all of the feature but the defaults are set in such a way to be a gentle introduction to Sirius and aql. 

## Requirements
- Eclipse Modeling Environment 2023-09
- Java 17+
- Epsilon 2.5+
- Emfatic 1.1+ (To use textual notation)
- Sirius 7

## Quick-start

1. Install Eclipse through the [Eclipse installer](https://wiki.eclipse.org/Eclipse_Installer). Once you reach the welcome screen of Eclipse, go ahead an close that tab with the x in the top left.
2. To install Aconite go to the menu bar and click Help > Install new software... Then click add on the wizard that appears and copy https://nwxrichardson.github.io/aconite/updates/ in the location and set the name as Aconite then click add. Select the tick box that appears and then click finished. It will ask to restart to install.
3. Once it has restarted we are going to go to Help > Install new software... twice more. To install Epsilon and Emfatic for each we first select the drop down arrow next to the add.
	1. Epsilon, from the dropdown select http://download.eclipse.org/epsilon/updates/2.5. In the main section we select Core, EMF, and Sirius Integration, but installing all of them won't break Aconite. Then hit finish and again it will ask to restart.
	2. Emfatic (for textual notation), from the dropdown select http://download.eclipse.org/emfatic/update. Tick the Emfatic and hit finish.
4. For Sirius we are going to go Help > Eclipse Marketplace, search for Sirius and hit install before a final restart.  
5. Clone the repo. (Ignore if working on your own models. Skip to 7)
6. Importing a project First we open File > Import in the wizard find General > Existing Projects into Workspace. Find the cloned repo and open examples folder and select on of the folders contained within and click Select Folder then click finish. 
7. Right click the top project in the Model Explorer (The one containing the your metamodel) and select Run As... > Eclipse Application. 
8. In this new runtime eclipse, we need to import our project which includes our metamodel. For our examples we do this by going File > Import in the wizard find General > Existing Projects into Workspace. Again we go examples and select a folder and click Select Folder, then instead of hitting Finish we untick all ones with an additional ending (XXX.edit, XXX.editor, XXX.tests) and then hit Finish.
9. Now within this runtime eclipse open up the project and find a folder named description. Within this folder will be four files open the one ending .emf and make some edits, using the table of annotation and properties.
10. To generate the new odesign simply select a file ending either .emf (or .ecore) and select Aconte > Generate Odesign

## Table of annotations and properties

### @aconite

For Aconite to work, each Ecore file must contain exactly one @aconite annotation:

```java
@aconite(iconFolder = "uk.ac.york.aconite.family/icons/")
package basicfamily;
```

| Properties | Description                                                                              | Required | Default |
| ---------- | ---------------------------------------------------------------------------------------- | -------- | ------- |
| iconFolder | This sets the location of a folder from which all icon paths and image paths start from. | ❎        | ""      |
### @aconite.diagram
``` java
@aconite.diagram ( name = " Project Diagram ")
class Project { /* ... */ }
```

| Properties | Description                                                                                                                                              | Required | Default |
| ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | ------- |
| name       | The name of the diagram used at the UID within  Sirius and Aconite                                                                                       | ✅        | N/A     |
| abstract   | Sets the diagram to be abstract, therefore it will not be created. This can be used to store information to be used by other annotations through extend. | ❎        | false   |

### @aconite.container, @aconite.node, and @aconite.border Properties
``` java
@aconite.container ( name = " Task Container ", container = " Project Diagram ")
class Task { /* ... */ }

@aconite.node ( name = " Deliverable Node ", container = " Task Container ")
 class Deliverable { /* ... */ }

@aconite.border ( name = " Lead Border Node",  container = " Deliverable Node ")
class Person { /* ... */ }
```

|                      Property                      |                                                                                                                            Description                                                                                                                             | Required |           Default           |
| :------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------: | :-------------------------: |
|                        name                        |                                                                                                 The name of the element used at the UID within Sirius and Aconite                                                                                                  |    ✅     |             N/A             |
|  container (@aconite.container and @aconite.node)  | This point to the contain of the node. This can be either a @aconite.diagram or @aconite.container, using their name property as their ID. This can contain multiple value (container = "XXX, YYY, ZZZ") a copy of this container would then be contained in each. |    ✅     |             N/A             |
|            container (@aconite.border)             |                                    The only distinction of the border node is the way that it works with container. As you can select any @aconite.container or @aconite.node to which it will then be attached to the border.                                     |    ✅     |             N/A             |
|                       label                        |                                                                  This sets the label of this mapping within Sirius, effecting how it will appear in the VSM and effect the naming of some tools.                                                                   |    ❎     |       property: name        |
|                      abstract                      |                                                      Sets the diagram to be abstract, therefore it will not be created. This can be used to store information to be used by other annotations through extend.                                                      |    ❎     |            false            |
|                   createElements                   |                                                        Sets whether the Sirius editor is able to create elements of this description. This does not automatically create the tools to do so if set to true.                                                        |    ❎     |            true             |
|                     createable                     |                       When set to true Aconite will attempt to create a tool which allows for that element to be created. It does this be checking whether the container within the diagram is it container and if so it will create a tool.                       |    ❎     |            true             |
|                  directlyEditable                  |                                                            When set to true Aconite will attempt to create tool which is able to directly edit the text of the label shown for this within the diagram.                                                            |    ❎     |            true             |
|         sce / semanticCandidateExpression          |                                                                        This allows you to take over the Semantic Candidate Expression from Aconite. (Expression current begins aql:self. )                                                                         |    ❎     | an sce generated by Aconite |
| childrenPresentation (@aconite.container specific) |                                                                 Set how all of the nodes and containers within the container at to be displayed. {freeForm, horizontalStack, list, verticalStack}                                                                  |    ❎     |          freeFrom           |
### @aconite.container.description, @aconite.node.description, and @aconite.border.description
The following are also properties of @aconite.container, @aconite.node, and @aconite.border but they are about presentation. Aconite therefore allows them to be separated into another annotation. 
``` java
@aconite.node ( name = " Deliverable Node ", container = " Task Container ")
@aconite.node.description (node = " Deliverable Node ", color = "red")
 class Deliverable { /* ... */ }
```
**or**
``` java
@aconite.node ( name = " Deliverable Node ", container = " Task Container ", color = "red")
 class Deliverable { /* ... */ }
```

|                      Property                      |                                                                                               Description                                                                                                | Required |                               Default                               |
| :------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------: | :-----------------------------------------------------------------: |
|                        node                        |                                                  This property is how @aconite.XXX.description is connected. Using the node or container's name as UID.                                                  |    ✅     |                                 N/A                                 |
|                       shape                        |            The property shape selects from the list of possible ways that the element can be represented each of which include new properties to be set which can be found after this table.             |    ❎     | @aconite.container: flat<br>@aconite.node & @aconite.border: square |
|                       color                        |                                              This sets the color of the element will be in general. However the shape selected might mean that isn't shown.                                              |    ❎     |                            light_yellow                             |
|                 hideLabelByDefault                 |                                                              If set to true the label text will be hidden by default until manually shown.                                                               |    ❎     |                                false                                |
|                      iconPath                      |                                         For setting a file path in which the icon is stored. This works by adding the folder path to the front of the file path.                                         |    ❎     |                                 ""                                  |
|            heightComputationExpression             |                                 Sets how the height of the element is to be calculated. The value -1 means that it will just leave it to the user to resize the element.                                 |    ❎     |                                 -1                                  |
|             widthComputationExpression             |                                 Sets how the width of the element is to be calculated. The value -1 means that it will just leave it to the user to resize the element.                                  |    ❎     |                                 -1                                  |
|                    borderColor                     |                                                                               Set the color of the border of the element.                                                                                |    ❎     |                                black                                |
|                  borderLineStyle                   |                                                                         Set the line style between {dot, dash, dashDot, solid}.                                                                          |    ❎     |                                solid                                |
|                     borderSize                     |                                                                                       Sets the size of the border.                                                                                       |    ❎     |                                  3                                  |
|                   labelAlignment                   |                                                             How the label will be aligned within the element between {center, left, right}.                                                              |    ❎     |                               center                                |
|                     labelColor                     |                                                                                       The color of the text label.                                                                                       |    ❎     |                                black                                |
|                     labelValue                     |          Allow the user full control of the SCE used to generate the label. For new users this is the property to allow you to manually set the string for a set of elements. (" 'Siblings' ")           |    ❎     |                aql:self. (property labelExpression)                 |
|                  labelExpression                   |                                       This is a helper property and is only used if labelValue is not set. It sets up the beginning of the expression for an SCE.                                        |    ❎     |                                name                                 |
|                    labelFormat                     |                                                   Allow you to select multiple formatting for the text from {italic, bold, underline, strikeThrough}.                                                    |    ❎     |                                 ""                                  |
|                     labelSize                      |                                                                                       Sets the size of the label.                                                                                        |    ❎     |                                 12                                  |
|                      showIcon                      |                                                                 Whether the element will attempt to show the icon it is assigned or not.                                                                 |    ❎     |                                false                                |
|                      tooltip                       | Sets a SCE the returns a String which is a text that will show up if the user hovers over the element for a time. This can be set to a single string for all of the elements also similar to labelValue. |    ❎     |                                 ""                                  |
| @aconite.container.description specific properties |                                                                                                                                                                                                          |          |                                                                     |
|                   roundedCorner                    |                                                                            Sets whether to round the corners of the element.                                                                             |    ❎     |                                false                                |
|                     arcHeight                      |                                                                                Sets the arc height of the rounded corner.                                                                                |    ❎     |                                  1                                  |
|                      arcWidth                      |                                                                                Sets the arc width of the rounded corner.                                                                                 |    ❎     |                                  1                                  |
### @aconite.container shapes
#### Flat - A rectangle which can have a gradient

| Property        | Description                                                                                      | Required | Default             |
| --------------- | ------------------------------------------------------------------------------------------------ | -------- | ------------------- |
| backgroundStyle | This sets the way the colors are represented. {gradientLeftToRight, gradientRightToLeft, liquid} | ❎    | gradientLeftToRight |
| backgroundColor | This sets the background color if the flat style is set to a gradient option.                    | ❎    | Property: color     |
| foregroundColor | This sets the foreground color if the flat style is set to a gradient option.                    | ❎    | Property: color     |
#### Shape - Creates a parallelogram - no different properties
### @aconite.node and @aconite.border shapes
#### Square - A rectangle

| Property | Description                                                               | Required | Default |
| -------- | ------------------------------------------------------------------------- | -------- | ------- |
| height   | Sets the height that the element will start as when put into the diagram. | ❎    | 0       |
| width    | Sets the width that the element will start as when put into the diagram.  | ❎    | 0       |

#### Dot - Creates a circle element. 
#### Ellipse - Creates a circle element.

| Property                                | Description                                                               | Required | Default |
| --------------------------------------- | ------------------------------------------------------------------------- | -------- | ------- |
| horizontalDiameterComputationExpression | Sets the width that the element will start as when put into the diagram.  | ❎        | 2       |
| verticalDiameterComputationExpression   | Sets the height that the element will start as when put into the diagram. | ❎        | 2       |
#### Workspace Image - create a image node 
| Property  | Description                                                                                                                            | Required | Default |
| --------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------- | ------- |
| imagePath | Sets the file location of an image which is used as the element. Similar to icon this is added to the folder location set by @aconite. | ✅    | N/A     |

### @aconite.edge table

| @aconite.edge General Properties | Description                                                                                                                     | Required | Default        |
| -------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | -------- | -------------- |
| name                             | The name of the edge used at the UID within Sirius and Aconite                                                                  | ✅    | N/A            |
| label                            | This sets the label of this mapping within Sirius, effecting how it will appear in the VSM and effect the naming of some tools. | ❎    | property: name |
| createable                       | This when set to true will mean Aconite will *attempt* to create a tool to create that edge.                                    | ❎    | true           |
| reconnectable                    | This when set to true will *attempt* to create the tools to be able reconnect either end of the edge to similar elements.       | ❎    | true           |
### Reference edges - those connected to an EReference
```java
class Deliverable {
 @aconite.edge ( name =" Lead Edge ", container = " Leader Diagram ")
 ref Person lead ;
 }
```

| @aconite.edge Reference Properties | Description                                                                                                                                                                                                                                        | Required | Default   |
| ---------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | --------- |
| targetNode                         | Target node is used to change the set of elements that this edge can be pointing at. As by default it will pick everything that reference could point at.                                                                                          | ❎        | generated |
| targetFinderExpression             | This allows a user to take control of the target expression which works like a SCE to get the element to point at. In general this should only be used to filter down the references as the other will be set by default as if that were the case. | ❎        | generated |
| target                             | A special case of the target finder expression which adds aql:self. automatically. Use this if you are just doing a path through references and it will generate targetNode for you.                                                               | ❎        | generated |
### Element edges - those connected to an EClass

```java
@aconite.edge ( name =" Effort Edge ",
 container =" Effort Diagram ",
 labelExpression =" percentage ",
 source =" person ", target =" task ")
class Effort {
 ref Task [1]# effort task ;
 ref Person person ;
 attr int percentage = 100;
 }
```

| @aconite.edge Reference Properties | Description                                                                                                                                                                                                                                        | Required | Default   |
| ---------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | --------- |
| sce / semanticCandidateExpression  | An SCE like for @aconite.node which is an element the rest of the properties point out from.                                                                                                                                                       | ❎        | generated |
| sourceFinderExpression             | This allows a user to take control of the source expression which works like a SCE to get the element to point at. In general this should only be used to filter down the references as the other will be set by default as if that were the case. | ❎        | generated |
| targetFinderExpression             | This allows a user to take control of the target expression which works like a SCE to get the element to point at. In general this should only be used to filter down the references as the other will be set by default as if that were the case. | ❎        | generated |
| source                             | A special case of the source finder expression which adds aql:self. automatically. Use this if you are just doing a path through references and it will generate sourceNode for you.                                                               | ✅        | N/A       |
| target                             | A special case of the target finder expression which adds aql:self. automatically. Use this if you are just doing a path through references and it will generate targetNode for you.                                                               | ✅        | N/A       |
| sourceNode                         | Source node is used to change the set of elements that this edge can be pointing from. As by default it will pick everything that source reference could point at.                                                                                 | ❎        | generated |
| targetNode                         | Target node is used to change the set of elements that this edge can be pointing at. As by default it will pick everything that the target reference could point at.                                                                               | ❎        | generated |
## Color 
Example : light_red, dark_chocolate, orange
### Colors
(white, black, chocolate, gray, green, orange, purple, red, yellow)
### Prefix (optional)
(light_, dark_)

![Screenshot 2024-09-04 123300](https://github.com/user-attachments/assets/d7bfe009-ed22-4cb8-b246-e218cccd79dc)

