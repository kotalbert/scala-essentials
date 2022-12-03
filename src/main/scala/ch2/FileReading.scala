package ch2

import io.Source.fromFile
import util.Using

/**
 * Reading files with resource management with [[scala.util.Using]] object.
 *
 * This is to avoid 'file not closed' warning.
 */
object FileReading extends App {
  val fileName = "resources/file-formats.txt"
  val lines: List[String] = Using.resource(fromFile(fileName)) {
    reader => reader.getLines.toList
  }
  lines.map(x => x.toUpperCase()).foreach(println)

}
