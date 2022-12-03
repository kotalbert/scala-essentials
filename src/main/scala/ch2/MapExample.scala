package ch2

object MapExample extends App {

  var latinToGreek = Map(
    'a' -> "Alpha",
    'b' -> "Beta",
    'c' -> "Kappa",
  )

  latinToGreek += ('d' -> "Delta")

  val mapped = "abcd".toCharArray.map(latinToGreek).mkString(",")
  println(mapped)

  assert(latinToGreek.getOrElse('z', "Not Mapped") == "Not Mapped")

  latinToGreek.values.foreach(println)

}
