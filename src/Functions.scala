class Functions {

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }

  def delayed( t: => Long): Unit ={
    println("In delayed method")
    println("Param: " + t)
  }

  //Function with Variable Arguments
  def printStrings(args: String*): Unit ={
    var i : Int = 0;

    for(arg <- args){
      println("Arg value["+ i + "] = " + arg );
      i = i + 1;
    }
  }

  // A recursion function
  def factorial(n: BigInt): BigInt = {
    if(n <= 1)
      1
    else
      n * factorial(n - 1)
  }

  // Higher order functions
  def apply(f: Int => String, v: Int) = f(v)
  def layout[A](x: A) = "[" + x.toString() + "]"


  //Nested Functions
  def factorial2(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if(i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  // Anonymous Functions
  var inc = (x: Int) => x + 1
  var mul = (x: Int, y: Int) => x * y
}
