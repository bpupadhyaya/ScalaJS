package com.equalinformation.scalajs.scala

import org.scalajs.dom
import dom.document

import scala.scalajs.js.JSApp

/**
  * Created by bpupadhyaya on 6/18/16.
  */
object SampleApp extends JSApp {
  def main(): Unit = {
    appendPar(document.body, "Test program")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)

  }

}
