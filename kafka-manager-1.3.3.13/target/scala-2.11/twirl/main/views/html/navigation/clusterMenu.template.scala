
package views.html.navigation

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object clusterMenu_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class clusterMenu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,IndexedSeq[models.navigation.Menu],play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster: String, menuTitle: String, menuItem: String, menuList: IndexedSeq[models.navigation.Menu]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.102*/("""

"""),format.raw/*7.1*/("""<div class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <!--  Display three horizontal lines when navbar collapsed. -->
                <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
            </button>
            <img src=""""),_display_(/*14.24*/routes/*14.30*/.Assets.versioned("images/favicon.png")),format.raw/*14.69*/("""">
            <a class="navbar-brand un-float-me" href=""""),_display_(/*15.56*/routes/*15.62*/.Application.index()),format.raw/*15.82*/("""">
                Kafka Manager</a><span class="label label-primary">"""),_display_(/*16.69*/cluster),format.raw/*16.76*/("""</span>
        </div>
        """),_display_(/*18.10*/menuNav(menuTitle,menuItem,menuList)),format.raw/*18.46*/("""
    """),format.raw/*19.5*/("""</div>
</div>
"""))
      }
    }
  }

  def render(cluster:String,menuTitle:String,menuItem:String,menuList:IndexedSeq[models.navigation.Menu]): play.twirl.api.HtmlFormat.Appendable = apply(cluster,menuTitle,menuItem,menuList)

  def f:((String,String,String,IndexedSeq[models.navigation.Menu]) => play.twirl.api.HtmlFormat.Appendable) = (cluster,menuTitle,menuItem,menuList) => apply(cluster,menuTitle,menuItem,menuList)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object clusterMenu extends clusterMenu_Scope0.clusterMenu
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/navigation/clusterMenu.scala.html
                  HASH: 700a3bc5f37cb4f7c7e4f854f88f303a7528c50d
                  MATRIX: 708->115|904->215|932->217|1422->680|1437->686|1497->725|1582->783|1597->789|1638->809|1736->880|1764->887|1823->919|1880->955|1912->960
                  LINES: 23->5|28->5|30->7|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|41->18|41->18|42->19
                  -- GENERATED --
              */
          