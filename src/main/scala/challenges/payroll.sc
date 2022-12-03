abstract class Worker(val hours: Int):
  /**
   * Prints this Worker's pay to console.
   */
  def printPay(): Unit
end Worker

class Salaried(hours: Int) extends Worker(hours) :
  override def printPay(): Unit = println("Salaried Worker!")
end Salaried

/**
 * A hourly worker
 *
 * @param hours         hours worked
 * @param rate          hourly rate
 * @param standardHours hours paid with standard rate
 * @param overrate      pay for hours over standard hours
 */
class Hourly(hours: Int, rate: Double = 10.5, standardHours: Int = 40, overrate: Double = 1.5) extends Worker(hours) :

  /**
   * Calculate pay.
   *
   * @return pay, based on hours worked and rates applied.
   */
  def calculatePay(): Double = {
    val standardHours = 40
    var pay = 0.0
    if (hours <= standardHours) hours * rate
    else rate * (standardHours + (hours - standardHours) * overrate)

  }

  override def printPay(): Unit = println(s"Worker's pay: ${calculatePay()}")

end Hourly


val w1 = new Salaried(30)
val w2 = new Hourly(40)
val w3 = new Hourly(60)
val w4 = new Hourly(20)

assert(w2.calculatePay() == 420)
assert(w3.calculatePay() == 420 + 210 * 1.5)
assert(w4.calculatePay() == 210)

val workers = List(w1, w2, w3, w4)
workers.foreach(_.printPay())
