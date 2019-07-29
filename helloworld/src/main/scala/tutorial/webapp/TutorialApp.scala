package tutorial.webapp

import org.scalajs.dom
import dom.document
import org.querki.jquery._

import scala.scalajs.js.annotation.JSExportTopLevel


object TutorialApp {

    def main(args: Array[String]): Unit = {
        $(() => setupUI())
    }

    def setupUI(): Unit = {
        $("body").append("<p>Hello World</p>")
        $("#click-me-button").click(() => addClickedMessage())
    }



    @JSExportTopLevel("addClickedMessage")
    def addClickedMessage(): Unit = {
        $("body").append("<p>u clicked me!  </p>")
    }


}
