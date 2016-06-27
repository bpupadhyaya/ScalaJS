package com.equalinformation.scalajs.scala


import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp

/**
  * Created by bpupadhyaya on 6/18/16.
  */
object SampleApp extends JSApp {

    def main(): Unit = {
      jQuery(setupUI _)
    }

  def setupUI(): Unit = {
    jQuery("#click-button").click(addButtonClickMessage _)
    jQuery("body").append("<p>Test program jQuery</p>")
  }

    def addButtonClickMessage(): Unit = {
     jQuery("body").append("<p>Test program button click jQuery </p>")
    }


  // DOM based implementation - uncomment if you want to test DOM based solution, but jQuery uses DOM internally so...
/*  def main(): Unit = {
    appendPar(document.body, "Test program")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)

  }

  @JSExport
  def addButtonClickMessage(): Unit = {
    appendPar(document.body, "Test program button click")
  }*/

}
