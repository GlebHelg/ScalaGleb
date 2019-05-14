import java.io._
import ObjWithImplicitClass._


class TestPointAndLocation(){
  val pt = new Point(10, 20);
  println("\nJust created the object...\n")
  // Move to a new location
  pt.move(10, 10);

  println("\nAnotherone\n")

  val loc = new Location(10, 20, 15);
  println("\nCreated loc object\n")
  // Move to a new location
  loc.move(10, 10, 5)


  println("\n" + loc)
  println("\n" + pt)
}

class TestObjWithImplicitClass{
  4 times println("Hello")
}

class SingletonTest(x: Int, y: Int){
  val point = new Point(x, y)
  printPoint

  def printPoint{
    println("\nPoint x location : " + point.x)
    println("Point y location : " + point.y)
  }
}

class Outer{
  class Inner{
    private def f(){println("f")}

    class InnerMost{
      f() //OK
    }
  }
  //(new Inner).f() Would throw an error, because private member not accessible from outside of class
}

package p{
  class Super{
    protected def f(){ println("f") }
  }

  class Sub extends Super{
    f() // OK
  }

  class Other{
    //(new Super).f() would throw an error, because f is protected for use in subclasses
  }
}

// an object is a member of an anonymous class
object Test {
  def main(args: Array[String]){

    println("\n\nTesting tpln: ")
    val tpnl = new TestPointAndLocation();

    println("\n\nTesting run: ")
    val run  = new TestObjWithImplicitClass();

    println("\n\nTesting st: ")
    val st   = new SingletonTest(10, 20)

  }
}