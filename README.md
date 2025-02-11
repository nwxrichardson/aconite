# Aconite

## Introduction

Aconite is a tool that generates graphical modelling notations from an annotated [Ecore metamodel](https://www.vogella.com/tutorials/EclipseEMF/article.html), targeting [Eclipse Sirius](https://eclipse.dev/sirius/).
It is inspired on the approach followed by [Eugenia](https://eclipse.dev/epsilon/doc/eugenia/), which targeted the [Graphical Modeling Framework](https://projects.eclipse.org/projects/modeling.gmf-tooling) tooling (now archived).

Aconite allows you to add EAnnotations to an Ecore based metamodel to generate a Sirius editor for models that conform to the metamodel.
Aconite is designed to expose as many Sirius features as possible, while providing sane defaults that act as a gentle introduction to Sirius and the [Acceleo Query Language](https://eclipse.dev/acceleo/documentation/). 

## Requirements

- [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/) 2023-09 or newer
- Java 17+
- [Eclipse Epsilon](https://eclipse.dev/epsilon/) 2.5.0+
- [Eclipse Emfatic](https://eclipse.dev/emfatic/) 1.1+ (To use textual notation)
- [Eclipse Sirius](https://eclipse.dev/sirius/) 7.x

## Quickstart guide
### Setting up the Eclipse IDE

First, install Eclipse through the [Eclipse installer](https://www.eclipse.org/downloads/packages/installer), by choosing "Eclipse Modeling Tools" from its main window. The first time Eclipse is launched, it will show a "Welcome" tab: close it by clicking on the X button of the tab.

To install Aconite, go to the menu bar and click "Help > Install new software...", then replace the contents of "Work with:" with `https://nwxrichardson.github.io/aconite/updates/` and press Enter. Once the "Aconite" category appears in the list, click on "Select All" and then "Next". It should then list that the "Aconite Feature" is going to be installed. Accept the terms of the Eclipse Public License, indicate that you trust the update site (as it is currently unsigned), and let Eclipse restart once prompted.

Once it has restarted, we are going to use "Help > Install new software..." twice more:

1. First, to install Epsilon from `http://download.eclipse.org/epsilon/updates/2.5`. Select "Epsilon Core", "Epsilon EMF Integration - Epsilon EMF Integration", and "Epsilon Sirius Integration". Trust the `org.apache.commons.math3` library if required to do so.
1. Next, install Emfatic from `http://download.eclipse.org/emfatic/update`. Select the "Emfatic" category.

Finally, for Sirius we are going to go to "Help > Eclipse Marketplace", search for "Sirius" and click on "Install" before a final restart.

### Trying out Aconite on one of the provided examples

#### Initial setup

Clone the [repository](https://github.com/nwxrichardson/aconite). We will use the example in its [`examples/siriusfamily`](examples/siriusfamily) folder.

Import the projects in that folder into your Eclipse workspace, by clicking on the "File > Import" menu item and selecting "General > Existing Projects into Workspace".
Find the downloaded subdirectory and import these four projects:

* uk.ac.york.aconite.family
* uk.ac.york.aconite.family.edit
* uk.ac.york.aconite.family.editor
* uk.ac.york.aconite.family.tests

Once imported, right-click on `uk.ac.york.aconite.family` and click "Run As... > Eclipse Application". This will open a nested ("runtime") Eclipse, into which we import only  `uk.ac.york.aconite.family` by clicking on the "File > Import" menu item and selecting "General > Existing Projects into Workspace" unticking the other projects.

#### Experimenting with Aconite annotations

Within the "Model Explorer" view of the runtime eclipse, expand the `uk.ac.york.aconite.family` project and its `description` folder, and right-click on its `basicfamily.emf` file.
Select "Aconite - Generate Odesign" to produce the `basicfamily.odesign` in the same folder.

To experiment with Aconite, edit the `basicfamily.emf` file using Emfatic and the annotations documented below, while regenerating the `.odesign` file as described above after any changes. To view the results of these changes on the diagrams themselves, expand the `model` folder in the "Model Explorer" view, then select `family.aird`:

* Pre-existing representations can be viewed from the "Representations" list in the `.aird` editor, by double-clicking on their contents. One of the predefined representations is shown below.
* To generate a new representation, double-click on those preceded by ![Representation](https://github.com/user-attachments/assets/75f637c0-79a7-424b-a451-3d0d581359e8), then select a valid model element (those for which the `Finish` button is enabled).
* Representations can only be created for models `.aird` is aware of; to create views for a new model, you need to go to "Add > Browse Workspace" and then find the relevant model.

<picture>
<!--   <source media="(prefers-color-scheme: light)" srcset="https://github.com/user-attachments/assets/d1bc218d-17f3-4cf8-b2bb-04e53a095b86">
  <source media="(prefers-color-scheme: dark)" srcset="https://github.com/user-attachments/assets/60381f19-a710-4c83-9c1a-e2d859630740"> -->
  <img alt="A representation of the current family." src="https://github.com/user-attachments/assets/763c8f7b-60b4-429c-9a06-7413d38ec0fe" width = 550>
</picture>


#### The expected family representation
<picture>
  <source media="(prefers-color-scheme: light)" srcset="https://github.com/user-attachments/assets/d1bc218d-17f3-4cf8-b2bb-04e53a095b86">
  <source media="(prefers-color-scheme: dark)" srcset="https://github.com/user-attachments/assets/60381f19-a710-4c83-9c1a-e2d859630740">
  <img alt="A representation of the current family." src="https://user-images.githubusercontent.com/25423296/163456779-a8556205-d0a5-45e2-ac17-42d089e3c3f8.png" width = 300>
</picture>

#### Making structural changes to the metamodel

To make structural changes to the metamodel (for example, changing the EClasses or their features), please follow these steps:

1. Close the "runtime" Eclipse instance.
1. Make the changes to the `.emf` file from the main Eclipse instance.
1. Regenerate the `.ecore` file by right-clicking on the `.emf` file and using "Generate Ecore Package".
1. Open the `.genmodel` file and regenerate the model/edit/editor code by right-clicking on the root of the tree.
1. Launch the "runtime" Eclipse instance as above.

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
@aconite.diagram ( name = "Project Diagram")
class Project { /* ... */ }
```

| Properties | Description                                                                                                                                              | Required | Default |
| ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | ------- |
| name       | The name of the diagram used at the UID within  Sirius and Aconite                                                                                       | ✅        | N/A     |
| abstract   | Sets the diagram to be abstract, therefore it will not be created. This can be used to store information to be used by other annotations through extend. | ❎        | false   |

### @aconite.container, @aconite.node, and @aconite.border Properties
``` java
@aconite.container ( name = "Task Container", container = "Project Diagram")
class Task { /* ... */ }

@aconite.node ( name = "Deliverable Node", container = "Task Container")
 class Deliverable { /* ... */ }

@aconite.border ( name = "Lead Border Node",  container = "Deliverable Node")
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
The following are also properties of @aconite.container, @aconite.node, and @aconite.border focused on presentation. They should be used in the @aconite.node form for simple annotations, but the .description version can be used if, for example, the annotation is too long or to contrast multiple designs without duplication. 
``` java
@aconite.node ( name = "Deliverable Node", container = "Task Container")
@aconite.node.description (node = "Deliverable Node , color = "red")
 class Deliverable { /* ... */ }
```
**or**
``` java
@aconite.node ( name = "Deliverable Node", container = "Task Container", color = "red")
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
 @aconite.edge ( name ="Lead Edge", container = "Leader Diagram")
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
@aconite.edge ( name = "Effort Edge",
 container ="Effort Diagram",
 labelExpression = "percentage",
 source ="person", target ="task")
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

