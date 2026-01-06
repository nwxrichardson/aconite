# Home
Aconite is a tool that generates graphical modelling notations from an annotated [Ecore Metamodel](https://www.vogella.com/tutorials/EclipseEMF/article.html), targeting [Eclipse Sirius](https://eclipse.dev/sirius/).
It is inspired on the approach followed by [Eugenia](https://eclipse.dev/epsilon/doc/eugenia/), which targeted the [Graphical Modeling Framework](https://projects.eclipse.org/projects/modeling.gmf-tooling) tooling (now archived).

Aconite allows you to add EAnnotations to an Ecore based metamodel to generate a Sirius editor for models that conform to the metamodel.
Aconite is designed to expose as many Sirius features as possible, while providing sane defaults that act as a gentle introduction to Sirius and the [Acceleo Query Language](https://eclipse.dev/acceleo/documentation/). 

``` java

@aconite(iconFolder = "uk.ac.york.aconite.family/icons/")
@namespace(uri="http://www.eclipse.org/sirius/sample/basicfamily", prefix="basicfamily")
package basicfamily;

@aconite.diagram(name = "Relationships")
@aconite.node(name = "Rel Default",~abstract = "true", color = "white", showIcon = "true", childrenPresentation = "List")

@aconite.container(extend = "Rel Default", name = "Person",sce = "", foregroundColor = "light_green", container = "Relationships")

@aconite.border(extend = "Rel Default", sce="parents", name = "Parent", container =  "Person")

@aconite.node(extend = "Rel Default", name = "Child", container = "Person")

@aconite.container(extend = "Rel Default", name = "Siblings", sce = "", labelValue = "Siblings", foregroundColor = "light_yellow", container = "Relationships", showIcon = "false")

@aconite.node(name = "Sibling",  container = "Siblings", sce = "parents.children->excluding(self)", showIcon = "true")
abstract class Person {
	attr String name;
	@aconite.edge(name = "SiblingsEdge",creatable = "false", labelExpression = "", color = "gray", container = "Relationships", targetFinderExpression = "aql:self", sourceNode = "Person", targetNode = "Siblings")
	ref Person[*]#parents children;
	ref Person[0..2]#children parents;
	@aconite.edge(reconnectable = "false", name = "Mother", container = "Family" , sourceNode = "Man, Woman", labelExpression = "", color = "purple")
	derived ref Woman mother;
	@aconite.edge(extend = "Mother", name = "Father", color = "blue")
	derived ref Man father;
}

@aconite.diagram(name = "Family")
class Family {
	attr String name;
	val Person[*] members;
}

@aconite.node(name = "Man", container = "Family", shape = "image", imagePath = "man.svg", borderSize= "0")
class Man extends Person {
}

@aconite.node(extend = "Man", name = "Woman", imagePath = "woman.svg")
class Woman extends Person {
}

```
