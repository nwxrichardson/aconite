

# Aconite
## Introduction
This work is based on Eugenia for GMF (https://eclipse.dev/epsilon/doc/eugenia/) targeting instead the Sirius Model Editor. It allows you to add EAnnotations to an Ecore based metamodel to generate a Sirius Editor for models that conform to the metamodel. It is done in a way that both allows access to all of the feature but the defaults are set in such a way to be a gental introduction to Sirius and aql. 
## Instruction of use
The full set of instructions on how to get started are in the readme located in the examples file. This is to allow the table below to be the main screen as we realise that people will need to refer to this page from time to time.
 ## Table of annotations and properties
 ### @aconite - attach to the EPackage
 ```java
@aconite(iconFolder = "uk.ac.york.aconite.family/icons/")
package basicfamily;
```

| Properties | Description                                                                              | Required | Default |
| ---------- | ---------------------------------------------------------------------------------------- | -------- | ------- |
| iconFolder | This sets the location of a folder from which all icon paths and image paths start from. | ❎        | ""      |

### @aconite.diagram

| Properties | Description                                                                                                                                              | Required | Default |
| ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | ------- |
| name       | The name of the diagram used at the UID within  Sirius and Aconite                                                                                       | ✅        | N/A     |
| abstract   | Sets the diagram to be abstract, therefore it will not be created. This can be used to store information to be used by other annotations through extend. | ❎        | false   |

### @aconite.container, @aconite.node, and @aconite.border Properties

|                                                    |                                                                                                                            Description                                                                                                                             | Required |           Default           |
| :------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------: | :-------------------------: |
|                        name                        |                                                                                                 The name of the element used at the UID within Sirius and Aconite                                                                                                  |    ✅     |             N/A             |
|  container (@aconite.container and @aconite.node)  | This point to the contain of the node. This can be either a @aconite.diagram or @aconite.container, using their name property as their ID. This can contain multiple value (container = "XXX, YYY, ZZZ") a copy of this container would then be contained in each. |   ✅   |             N/A             |
|            container (@aconite.border)             |                                    The only distinction of the border node is the way that it works with container. As you can select any @aconite.container or @aconite.node to which it will then be attached to the border.                                     |    ✅     |             N/A             |
|                       label                        |                                                                  This sets the label of this mapping within Sirius, effecting how it will appear in the VSM and effect the naming of some tools.                                                                   |    ❎     |       property: name        |
|                      abstract                      |                                                      Sets the diagram to be abstract, therefore it will not be created. This can be used to store information to be used by other annotations through extend.                                                      |    ❎     |            false            |
|                   createElements                   |                                                        Sets whether the Sirius editor is able to create elements of this description. This does not automatically create the tools to do so if set to true.                                                        |    ❎     |            true             |
|                     createable                     |                       When set to true Aconite will attempt to create a tool which allows for that element to be created. It does this be checking whether the container within the diagram is it container and if so it will create a tool.                       |    ❎     |            true             |
|                  directlyEditable                  |                                                            When set to true Aconite will attempt to create tool which is able to directly edit the text of the label shown for this within the diagram.                                                            |    ❎     |            true             |
|         sce / semanticCandidateExpression          |                                                                        This allows you to take over the Semantic Candidate Expression from Aconite. (Expression current begins aql:self. )                                                                         |    ❎     | an sce generated by Aconite |
| childrenPresentation (@aconite.container specific) |                                                                 Set how all of the nodes and containers within the container at to be displayed. {freeForm, horizontalStack, list, verticalStack}                                                                  |    ❎     |          freeFrom           |
### @aconite.container.description, @aconite.node.description, and @aconite.border.description

|                                                    |               The following are properties of @aconite.container, @aconite.node, and @aconite.border but they are about presentation. They can therefore be put in a separate annotation.                | Required |                               Default                               |
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
| horizontalDiameterComputationExpression | Sets the width that the element will start as when put into the diagram.  | ❎    | 2       |
| verticalDiameterComputationExpression   | Sets the height that the element will start as when put into the diagram. | ❎    | 2       |
#### Workspace Image - create a image node 
| Property  | Description                                                                                                                            | Required | Default |
| --------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------- | ------- |
| imagePath | Sets the file location of an image which is used as the element. Similar to icon this is added to the folder location set by @aconite. | ✅    | N/A     |

#### General edge table

| @aconite.edge General Properties | Description                                                                                                                     | Required | Default        |
| -------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | -------- | -------------- |
| name                             | The name of the edge used at the UID within Sirius and Aconite                                                                  | ✅    | N/A            |
| label                            | This sets the label of this mapping within Sirius, effecting how it will appear in the VSM and effect the naming of some tools. | ❎    | property: name |
| createable                       | This when set to true will mean Aconite will *attempt* to create a tool to create that edge.                                    | ❎    | true           |
| reconnectable                    | This when set to true will *attempt* to create the tools to be able reconnect either end of the edge to similar elements.       | ❎    | true           |
#### Reference edges - those connected to an EReference
TODO Images here please

| @aconite.edge Reference Properties | Description                                                                                                                                                                                                                                        | Required | Default |
| ---------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | ------- |
| targetNode                         | Target node is used to change the set of elements that this edge can be pointing at. As by default it will pick everything that reference could point at.                                                                                          |          |         |
| targetFinderExpression             | This allows a user to take control of the target expression which works like a SCE to get the element to point at. In general this should only be used to filter down the references as the other will be set by default as if that were the case. |          |         |
| target                             | A special case of the target finder expression which adds aql:self. automatically. Use this if you are just doing a path through references and it will generate targetNode for you.                                                               |          |         |
#### Element edges - those connected to an EClass
TODO Images here please

| @aconite.edge Reference Properties | Description                                                                                                                                                                                                                                        | Required | Default |     |
| ---------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | ------- | --- |
| sce / semanticCandidateExpression  | An SCE like for @aconite.node which is an element the rest of the properties point out from.                                                                                                                                                       |          |         |     |
| sourceFinderExpression             | This allows a user to take control of the source expression which works like a SCE to get the element to point at. In general this should only be used to filter down the references as the other will be set by default as if that were the case. |          |         |     |
| targetFinderExpression             | This allows a user to take control of the target expression which works like a SCE to get the element to point at. In general this should only be used to filter down the references as the other will be set by default as if that were the case. |          |         |     |
| source                             | A special case of the source finder expression which adds aql:self. automatically. Use this if you are just doing a path through references and it will generate sourceNode for you.                                                               |          |         |     |
| target                             | A special case of the target finder expression which adds aql:self. automatically. Use this if you are just doing a path through references and it will generate targetNode for you.                                                               |          |         |     |
| sourceNode                         | Source node is used to change the set of elements that this edge can be pointing from. As by default it will pick everything that source reference could point at.                                                                                 |          |         |     |
| targetNode                         | Target node is used to change the set of elements that this edge can be pointing at. As by default it will pick everything that the target reference could point at.                                                                               |          |         |     |
## Color 
Example : light_red, dark_chocolate
### Colors
(white, black, chocolate, gray, green, orange, purple, red, yellow)
### Prefix (optional)
(light_, dark_)
