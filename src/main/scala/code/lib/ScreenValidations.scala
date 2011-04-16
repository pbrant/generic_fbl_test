package code.lib

import net.liftweb.util.FieldError
import net.liftweb.common.Failure
import net.liftweb.http.AbstractScreen

trait ScreenValidations {
  self: AbstractScreen =>

 def valConversion[T](): FormValue[T] => List[FieldError] = formValue =>
  formValue.value match {
    case Failure(message, _, _) => message
    case _ => Nil
  }
}