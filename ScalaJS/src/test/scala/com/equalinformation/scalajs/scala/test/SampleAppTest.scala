package com.equalinformation.scalajs.scala.test

import com.equalinformation.scalajs.scala.SampleApp
import utest._
import org.scalajs.jquery.jQuery

/**
  * Created by bpupadhyaya on 6/28/16.
  */
object SampleAppTest extends TestSuite {
  //Initialization
  SampleApp.setupUI()

  def tests = TestSuite {
    'TestProgram {
      assert(jQuery("p:contains('Test program jQuery')").length == 1)
    }

    'ButtonClick {
      def messageCount = jQuery("p:contains('Test program button click jQuery')").length

      val button = jQuery("button:contains('Click here')")
      assert(button.length == 1)
      assert(messageCount == 0)

      for(i <- 1 to 5) {
        button.click()
        assert(messageCount == i)
      }
    }

  }
}
