package ch2

import java.io.FileNotFoundException
import scala.io.Source.fromFile

object ErrorHandling extends App {

  try {
    //noinspection SourceNotClosed
    for (line <- fromFile("no-file.txt").getLines())
      println(line.toLowerCase())
  } catch {
    case e: FileNotFoundException => println("The file was not found!")
    case _: Exception => println("Your program had an error.")
  }

  try 10/0
  catch
    case e: ArithmeticException => println("Don't divide by 0!")

}
