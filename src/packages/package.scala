/*
Scala provides package objects as a convenient container shared across an entire package.ObjWithImplicitClass
Package objects can contain arbitrary definitions, not just variable and method definitions.
For instance, they are frequently used to hold package-wide type aliasses
and implicit conversions. Package objects can even inherit Scala classes and traits.
By convention, the source code for a package object is usually put in a sourcefile named package.scala.

Each package is allowed to have one package object. any definitions placed in a package object are considered members of the package itself.

See example below. Assume first class Fruit and three Fruit objects in a package gardening.fruits.
*/


package packages {

  class Super {
    protected def superF() {
      println("f")
    }
  }

  class Sub extends Super {
    superF() //OK
  }

  class Other {
    //(new Super).f() would throw an error, because f is protected for use in subclasses
  }

}