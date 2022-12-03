package chellenges

import challenges.Arrays

import scala.NotImplementedError
import org.scalatest.funsuite.AnyFunSuite

private class ArraysTests extends AnyFunSuite:

  // could be improved
  // https://stackoverflow.com/a/65378521
  class Expected(val a: Array[Int], val sum: Int, val avg: Int, val min: Int, val max: Int)
  val testParams: List[Expected] =List(
    new Expected(Array(1, 2, 3), 6, 2, 1, 3)
  )

  for (expected <- testParams) {
    test("sum function") {
      assert(Arrays.sum(expected.a) === expected.sum)
    }

    test("avg function") {
      assert(Arrays.avg(expected.a) === expected.avg)
    }

    test("min function") {
      assert(Arrays.min(expected.a) === expected.min)
    }
    test("max function") {
      assert(Arrays.max(expected.a) === expected.max)
    }
  }


end ArraysTests
