
package views.html.navigation

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object defaultMenu_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class defaultMenu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(navHtml : Html = Html("")):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.29*/("""
"""),format.raw/*6.1*/("""<nav class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <img src=""""),_display_(/*15.24*/routes/*15.30*/.Assets.versioned("images/favicon.png")),format.raw/*15.69*/("""">
            <a class="navbar-brand un-float-me" href=""""),_display_(/*16.56*/routes/*16.62*/.Application.index()),format.raw/*16.82*/("""">Kafka Manager</a>
        </div>
        """),_display_(/*18.10*/navHtml),format.raw/*18.17*/("""
    """),format.raw/*19.5*/("""</div>
</nav>
"""))
      }
    }
  }

  def render(navHtml:Html): play.twirl.api.HtmlFormat.Appendable = apply(navHtml)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (navHtml) => apply(navHtml)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object defaultMenu extends defaultMenu_Scope0.defaultMenu
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/navigation/defaultMenu.scala.html
                  HASH: d4a0defe52fa2033e674625e028e16582bcf7990
                  MATRIX: 657->115|779->142|806->143|1321->631|1336->637|1396->676|1481->734|1496->740|1537->760|1608->804|1636->811|1668->816
                  LINES: 23->5|28->5|29->6|38->15|38->15|38->15|39->16|39->16|39->16|41->18|41->18|42->19
                  -- GENERATED --
              */
          