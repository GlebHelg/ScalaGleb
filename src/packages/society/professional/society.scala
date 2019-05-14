package packages.society {
  package packages.professional {

    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another : Executive){
        println(another.workDetails)
        // println(another.secrets) Gives us ERROR
      }
    }

  }
}