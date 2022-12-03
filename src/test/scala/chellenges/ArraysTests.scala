package chellenges

import challenges.Arrays
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.matchers.should.Matchers._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.prop.TableFor5

private class ArraysTests extends AnyFunSuite:

  // could be improved
  // https://stackoverflow.com/a/65378521
  // todo: implement as property based tests
  //
  val examples: TableFor5[Array[Int], Int, Double, Int, Int] = Table(
    ("array", "sum", "avg", "min", "max"),
    (Array(1, 2, 3), 6, 2d, 1, 3),
    (Array(-2, -1, 0), -3, -1d, -2, 0),
  )

  forAll(examples) { (array: Array[Int], sumExpected: Int, avgExpected: Double, minExpected: Int, maxExpected: Int) =>
    Arrays.sum(array) should equal(sumExpected)
    Arrays.avg(array) should equal(avgExpected)
    Arrays.min(array) should equal(minExpected)
    Arrays.max(array) should equal(maxExpected)
  }

end ArraysTests
