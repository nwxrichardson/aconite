# Eugenia-Sirius
## Introduction
This work is based on Eugenia for GMF (https://eclipse.dev/epsilon/doc/eugenia/) targeting instead the Sirius Model Editor. It allows you to add EAnnotations to an Ecore based metamodel to generate a Sirius Editor for models that conform to the metamodel. It is done in a way that both allows access to all of the feature but the defaults are set in such a way to be a gental introduction to Sirius and aql. 

 ## Options use @sirius.________(name="The Name")
 ### @sirius.diagram
 - name (Unique ID)

 ### @sirius.node
 - name (Unique ID)
 - container (required)
   - To point at a sirius.diagram or a sirius.container
 - label (default name)
 - color (default light_yellow)

 ### @sirius.container
 - name (Unique ID)
 - container (required)
   - To point at a sirius.diagram or a sirius.container
 - label (default name)
 - color (default light_yellow)

 ### @sirius.edge
This can work on both EClass and EReference
 - name (Unique ID)
 - container (required)
   - To point at a sirius.diagram or a sirius.container
 - label (default No label)
 - source (EClass only)
 - target (EClass only)

## Color 
Example : light_red, dark_chocolate
### Colors
(white, black, chocolate, gray, green, orange, purple, red, yellow)
### Prefix (optional)
(light_, dark_)
  
