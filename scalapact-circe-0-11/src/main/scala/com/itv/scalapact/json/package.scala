package com.itv.scalapact

import com.itv.scalapact.circe11.{PactReader, PactWriter}
import com.itv.scalapact.shared.typeclasses.{IPactReader, IPactWriter}

package object json {
  implicit val pactReaderInstance: IPactReader = new PactReader

  implicit val pactWriterInstance: IPactWriter = new PactWriter

  val JsonConversionFunctions: circe11.JsonConversionFunctions.type = circe11.JsonConversionFunctions
}
