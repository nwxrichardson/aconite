# Getting Started
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

### QuickStart guide for a new Aconite Project
#### Initial Setup
First step is to create a new empty project by going "File > New > Project > Project".
 
Then right-click on the new project "New > Other > Emfatic File" which will create an [Emfatic](https://eclipse.dev/emfatic/) file in which you can specify your metamodel. The next step is to generate the code metamodel, which starts by right-clicking the `.emf` file and clicking "Generate Ecore Metamodel". We then right-click the new `.ecore` file and go "New > Other > EMF Generator Model" and click through the wizard till the button greys out and click load before continuing to click through. This will create a `.genmodel`, open the file and right-click the top level element and select "Generate All". 

This should generate the projects below from the project `original.project.name` we then right click the top project and go to "Run As > Eclipse Application". 

* original.project.name.edit
* original.project.name.editor
* original.project.name.tests

Within the nested ("runtime") Eclipse, into which we import only  `original.project.name` by clicking on the "File > Import" menu item and selecting "General > Existing Projects into Workspace" unticking the other projects.

To allow us to be able to experiment with Aconite in this new project as in the example project (see above section) we need to create an instance of the model and the `.aird` file. To do this right click on the project "New > Other > _Package Name_ Model" this will create a model conforming to your metamodel. Then right-click on this new file "New > Representation File" and click through the the wizard. 
#### Making structural changes to the metamodel

To make structural changes to the metamodel (for example, changing the EClasses or their features), please follow these steps:

1. Close the "runtime" Eclipse instance.
1. Make the changes to the `.emf` file from the main Eclipse instance.
1. Regenerate the `.ecore` file by right-clicking on the `.emf` file and using "Generate Ecore Package".
1. Open the `.genmodel` file and regenerate the model/edit/editor code by right-clicking on the root of the tree.
1. Launch the "runtime" Eclipse instance as above.
#### Wider Context
In order to simplify this QuickStart section we have ignored the underlying technologies that have been used. As Aconite is based on the generation of the Sirius VSM it is based on the Eclipse Modelling Framework [EMF](https://eclipsesource.com/blogs/tutorials/emf-tutorial/) which will be the source if you want to further customise your models. This is also true of Sirius which has more customisation options than Aconite currently allows for with full range to be found [here](https://eclipse.dev/sirius/doc/specifier/Sirius%20Specifier%20Manual.html).
