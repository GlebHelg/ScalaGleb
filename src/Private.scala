class Private {
  class Outer {
    class Inner {
      private def f() {
        println("f")
      }

      class InnerMost {
        f() //OK
      }

    }
    //(new Inner).f() Would throw an error, because private member not accessible from outside of class
  }
}
