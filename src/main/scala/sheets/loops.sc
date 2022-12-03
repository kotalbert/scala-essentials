var i = 0
while (i < 10) {
  println(i)
  i += 1
}

for (j <- 0 to 10) {
  println(j)
}

val ns = for (i <- 1 to 20)
    yield i

print(ns)

val word = "Monday"

for (i <- 0 until word.length)
  println(word(i))

"Monday".toCharArray.foreach(println)