import java.io._

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

// an object is a member of an anonymous class
object Test {
  def main(args: Array[String]){

    val tpnl = new TestPointAndLocation();

  }
}