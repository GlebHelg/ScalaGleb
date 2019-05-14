class Point(val xc: Int, val yc: Int){
  var x: Int = xc
  var y: Int = yc

  println("Initial point x location: " + xc)
  println("Initial point y location: " + yc)

  def move(dx: Int, dy: Int){
    x = x + dx
    y += dy
    println("Point x location : " + x)
    println("Point y location : " + y)
  }

}