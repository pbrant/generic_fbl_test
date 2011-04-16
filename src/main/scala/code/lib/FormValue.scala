package code.lib

import net.liftweb.common.{Empty, Box}

class FormValue[T](val enteredValue:String, val value: Box[T]) {
  def this() = this("", Empty)
}
