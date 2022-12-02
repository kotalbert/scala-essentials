package ch2

import io.StdIn. {readLine, readInt, readDouble}

object ConsoleReading extends App {
 def printRead(x: Any): Unit = {
   println("This is a double I read:")
   println(x.getClass)
   println(x)
 }
  println("Hello from Grades")
  print("Put some text here\n>")
  val line = readLine()
  printRead(line)

 print("Put some int here\n>")
 val i = readInt()
  printRead(i)

  print("Now I'm reading double\n>")
  val dbl = readDouble()
  printRead(dbl)

}

