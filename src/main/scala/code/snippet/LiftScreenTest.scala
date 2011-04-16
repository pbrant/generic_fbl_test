package code.snippet

import net.liftweb.http.LiftScreen
import net.liftweb.common.{Empty, Box}
import code.lib._

object LiftScreenTest extends LiftScreen with ScreenValidations {
  val someOtherTypeField1 = field("Some other type field #1", new FormValue[SomeOtherType]())
  val someOtherTypeField2 = field[FormValue[SomeOtherType]]("Some other type field #2", new FormValue[SomeOtherType]())

  val someOtherTypeField3 = field(
    "Some other type field #3", new FormValue[SomeOtherType](), valConversion)
  val someOtherTypeField4 = field[FormValue[SomeOtherType]](
    "Some other type field #4", new FormValue[SomeOtherType](), valConversion)
  val someOtherTypeField5 = field(
    "Some other type field #5", new FormValue[SomeOtherType](), valConversion[FormValue[SomeOtherType]])

  def finish() {

  }
}