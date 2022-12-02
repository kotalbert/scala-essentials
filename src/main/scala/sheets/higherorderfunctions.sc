val double = (i: Int) => i * 2
val triple = (i: Int) => i * 3

def higherOrder(x: Int, y: Int => Int) = y(x)

assert(higherOrder(2, double) == 4)
assert(higherOrder(3, triple) == 9)

// closure
val y = 5
def multiplier(x: Int) = x * y
assert(multiplier(10) == 50)