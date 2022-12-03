def abs(x: Int): Int = if (x < 0) -x else x

assert(abs(1) == 1)
assert(abs(-1) == 1)

//noinspection SimplifiableFoldOrReduce
def fac(n: Int): Long = {
  if (n == 0) 1
  else
    (1 to n).foldLeft(1L)(_ * _)
}

assert(fac(0) == 1)
assert(fac(1) == 1)
assert(fac(3) == 6)
assert(fac(4) == 24)
assert(fac(8) == 40320)
assert(fac(12) == 479001600)
assert(fac(15) == 1307674368000L)
assert(fac(20) == 2432902008176640000L)

def printName(first: String, last: String): Unit = {
  println(s"My name is ${first.capitalize} ${last.capitalize}.")
}
printName("albert", "daniluk")

//noinspection SimplifiableFoldOrReduce
def mySum(ints: Int*): Int = {
  ints.fold(0)(_ + _)
}

assert(mySum(1, 2, 3) == 6)
assert(mySum(1,2,3,-5) == 1)