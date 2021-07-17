package util

import java.util.*
import java.util.Calendar.*

/**
 * @作者 做就行了！
 * @时间 2021/7/17 18:38
 * @该类描述： -
 * @使用说明： -
 */
fun getLibVersion(): String {
  val cal = Calendar.getInstance()
  val year: Int = cal.get(YEAR) - 1992
  val month: Int = cal.get(MONTH) + 1
  val day: Int = cal.get(DATE)
  return "$year.$month.$day"
}