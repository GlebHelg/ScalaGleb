import java.io._

import ObjWithImplicitClass._
import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators


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


class PublicProtectedPrivateTest{

  def publicClasstest {
    val publ = new Public_Class
  }

  def protectedClassInPackageTest {
    import packages._

    val superClass = new Super
    //superClass.superF() not work

    val subClass = new Sub
    //This prints the desired magic
  }
}

class Looper() {
  def funkyLoops(): Unit = {

    var a = 0
    while (a > -20) {
      a -= 1
      if (a % 2 == 0) {
        println(a)
      }
    }

    println(s"While loop done. a = ${a}")

    do{
      a += 1
      if (a % 2 == 0) {
        println(a)
      }
    }while(a < 20)

    println(s"Dowhile done. a = ${a}")
  }

  def forWithCollections(l: List[Int]): Unit ={
    var a = 0
    for(a <- l if a % 2 == 0; if a * 1 == 2){
      println(s"Value of a: ${a}")
    }
  }

  def yieldForLoop(): Unit ={
    var a = 0
    var numList = List(1,2,3,4,5,6,7,8,9,10)

    // for loop execution with a yield
    var retVal = for{ a <- numList if a != 3; if a < 8 }yield a

    // Now print returned values using another loop.
    for(a <- retVal){
      println("Value of a: " + a)
    }
  }

}


// an object is a member of an anonymous class
object Test {
  def main(args: Array[String]){

    //val tpnl = new TestPointAndLocation();
    //println("\n\nTesting tpln: ")
    //println("\n\nTesting run: ")
    //val run  = new TestObjWithImplicitClass();
    //println("\n\nTesting st: ")
    //val st   = new SingletonTest(10, 20)
    //println("\n\nTesting pppt: ")
    //val pppt = new PublicProtectedPrivateTest
    //pppt.publicClasstest
    //pppt.protectedClassInPackageTest // this one prints the f
    //val operators = new Operators(7, 13)
    //operators.arithmetic()
    //operators.relational()
    //operators.logical()
    //operators.bitwise()
    //var conditionals = new Conditionals(4, 5)
    //conditionals(5, 5) does not work
    //var loopman = new Looper()
    //loopman.funkyLoops()
    //loopman.forWithCollections(List(2,5,6,87,32))
    //loopman.yieldForLoop()
    val funct = new Functions()
    //funct.delayed(funct.time())
    //funct.printStrings("Hello", "Scala", "Python")
    //val i = 10
    //println(s"Factorial of ${i} is: " + funct.factorial(i))

    println(funct.apply(funct.layout, 4))

  }
}