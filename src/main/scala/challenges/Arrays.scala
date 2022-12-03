package challenges

object Arrays extends App {

def sum(a: Array[Int]): Int = a.sum

def avg(a: Array[Int]): Double = a.sum/a.length.toDouble
def min(a: Array[Int]): Int = a.min

def max(a: Array[Int]): Int = a.max

// challenge program
private val ar = Array(463, 543, 276, 124, 567, 234, 5342, 125, 751, 134)

  println(s"""
    |Array: [${ar.mkString(", ")}]
    |sum:   ${sum(ar)}
    |avg:   ${avg(ar)}
    |min:   ${min(ar)}
    |max:   ${max(ar)}
    |""".stripMargin
  )
}
