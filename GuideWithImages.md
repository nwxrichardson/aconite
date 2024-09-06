## Quickstart guide - with images

### Setting up the Eclipse IDE

First, install Eclipse through the [Eclipse installer](https://www.eclipse.org/downloads/packages/installer), by choosing "Eclipse Modeling Tools" from its main window. The first time Eclipse is launched, it will show a "Welcome" tab: close it by clicking on the X button of the tab.

To install Aconite, go to the menu bar and click "Help > Install new software...", then replace the contents of "Work with:" with `https://nwxrichardson.github.io/aconite/updates/` and press Enter. Once the "Aconite" category appears in the list, click on "Select All" and then "Next". It should then list that the "Aconite Feature" is going to be installed. Accept the terms of the Eclipse Public License, indicate that you trust the update site (as it is currently unsigned), and let Eclipse restart once prompted.

Once it has restarted, we are going to use "Help > Install new software..." twice more:

1. First, to install Epsilon from `http://download.eclipse.org/epsilon/updates/2.5`. Select "Epsilon Core", "Epsilon EMF Integration - Epsilon EMF Integration", and "Epsilon Sirius Integration". Trust the `org.apache.commons.math3` library if required to do so.
1. Next, install Emfatic from `http://download.eclipse.org/emfatic/update`. Select the "Emfatic" category.

Finally, for Sirius we are going to go to "Help > Eclipse Marketplace", search for "Sirius" and click on "Install" before a final restart.

### Trying out Aconite on one of the provided examples

Clone the repository. We will use the example in its [`examples/siriusfamily`](examples/siriusfamily) folder.

Import the projects in that folder into your Eclipse workspace, by clicking on the "File > Import" menu item, and selecting "General > Existing Projects into Workspace".
Find the downloaded subdirectory and import these four projects:

* uk.ac.york.aconite.family
* uk.ac.york.aconite.family.edit
* uk.ac.york.aconite.family.editor
* uk.ac.york.aconite.family.tests

Within the "Model Explorer" view, expand the `uk.ac.york.aconite.family` project and its `description` folder, and right-click on its `basicfamily.emf` file.
Select "Aconite - Generate Odesign" to produce the `basicfamily.odesign` in the same folder.

To experiment with Aconite, edit the `basicfamily.emf` file using Emfatic and the annotations documented below, while regenerating the `.odesign` file as described above after each change. To view the result of these changes on the diagrams themselves, open up the model folder, then select `family.aird` and try out any of the representations by double-clicking.
