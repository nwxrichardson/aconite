# Instructions

## Requirements
Epsilon  2.4+
Sirius   6.0+

## Startup
The first step of any setup with Aconite, once you have cloned the repo, is to import uk.ac.york.aconite; for this, we go to File > Import; then, within the wizard opened, find General > Existing Projects into Workspace. We then import everything from the bundle file of the cloned repo.
### Running with examples
To run our examples, we are going import again an Existing Project into Workspace; this time opening up the examples files and selecting one of the examples (bpmn, siriusfamily...) and import all four projects. Once this is done we right click on the uk.ac.york.aconite project and select Run As > Eclipse application. This should open a runtime instance of Eclipse into which we are going to again import from that same project this time only selecting original project (uk.ac.york.XXX without .edit or .editor). Within this project will be a description folder containing a file XXX.emf this file can be opened and altered to generate a new odesign based on the changes save and then right click on the .emf file Aconite > Generate Odesign (Be aware it will override any edit in the design.
### Running on your models
