package ch2

object PatternMatching extends App {
  
  def toGreek(letter: Char): String = {
    letter.toLower match {
      case 'a' => "Alpha"
      case 'b' => "Beta"
      case 'c' => "Kappa"
      case 'd' => "Delta"
      case _ => "_ERROR_"
    }
  }
  
  val encoded = "abcdx".toCharArray.map(toGreek)
  println(encoded.mkString(sep = ","))

}
