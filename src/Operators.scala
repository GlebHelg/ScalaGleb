/*
//Assignment Operators:
//=   +=   -=   *=   /=   %=   <<=   >>=   &=   ^=   |=
//
//
//Also, read about Precedence !!!
*/


class Operators(a: Int, b: Int) {

  println("a:" + a + "\nb:" + b)

  def arithmetic(): Unit ={
    //Arithmetical Operators:
    //+    -    *   /   %
    val added       = a + b
    val subtracted  = a - b
    val multiplied  = a * b
    val divided     = a / b
    val modulated   = a % b

    println("\nAdded: " + added, " Subtracted: " + subtracted, " Multiplied: " + multiplied,
      " Divided: " + divided, " Modulated: " + modulated + "\n")
  }

  def relational(): Unit ={
    //Relational Operators:
    //==    !=    >    <    >=    <=
    println("\na == b: " + (a == b), " a != b: " + (a != b),
            " a > b: " + (a > b),  " a < b: " + (a < b),
            " a >= b: " + (a >= b), " a <= b: " + (a <= b) + "\n")
  }

  def logical(): Unit ={
    //Logical Operators:
    //&&    ||    !
    val x = (a > b)
    val y = (a < b)
    println("\nx = (a > b) = " + x, "y = (a < b) = " + y + "\n")
    println("\nx && y: " + (x && y), " x || y: " + (x || y), " !x && y: " + (!x && y) + "\n")
  }


  def bitwise(): Unit ={
    //
    //Bitwise Operators:
    //& - AND    | - OR    ^ - XOR   ~ - NOT/Inverse   << - LEFT Shift  >> - RIGHT Shift   >>> - SHIFT Right Zero Fill
    //
    //var result: Nothing = 4.toBinaryString
    println("\nBinary of a: " + a.toBinaryString + "\nBinary of b: " + b.toBinaryString)
    println("a & b: " + (a&b) + "\nBinary of (a & b): " + (a&b).toBinaryString)
    println("a | b: " + (a|b) + "\nBinary of (a | b): " + (a|b).toBinaryString)
    println("a ^ b: " + (a^b) + "\nBinary of (a ^ b): " + (a^b).toBinaryString)
    println("a >>> 1: " + (a>>>1) + "\nBinary of (a >>> 1): " + (a>>>1).toBinaryString)
    println("a >>> 2: " + (a>>>2) + "\nBinary of (a >>> 2): " + (a>>>2).toBinaryString)
    println("a >> 1 : " + (a>>1 ) + "\nBinary of (a >>  2): " + (a>>1 ).toBinaryString)
  }
}
