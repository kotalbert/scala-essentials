package ch2

object SetsExample extends App {

  val s0 = Set(2, 3, 4)
  val s1 = Range(1, 20).toSet
  val s2 = Range(15, 30).toSet

  assert(s0.subsetOf(s1))
  assert(!s1.subsetOf(s0))
  assert(s0.contains(2))
  assert(!s2.contains(6))

  val s3 = Set(1, 2, 3)
  val s4 = Set(2,3,4,5)
  assert(s3 ++ s4 == Set(1,2,3,4,5))


}
