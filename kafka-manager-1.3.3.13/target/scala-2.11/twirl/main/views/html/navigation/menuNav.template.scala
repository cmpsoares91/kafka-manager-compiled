
package views.html.navigation

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object menuNav_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class menuNav extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,IndexedSeq[models.navigation.Menu],play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(menuTitle: String, menuItem: String, menuList: IndexedSeq[models.navigation.Menu]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.85*/("""

        """),format.raw/*7.9*/("""<div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                """),_display_(/*9.18*/menuList/*9.26*/.map/*9.30*/ { m =>_display_(Seq[Any](format.raw/*9.37*/("""
                    """),_display_(/*10.22*/if(m.items.isEmpty)/*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""
                        """),_display_(/*11.26*/if(m.title == menuTitle)/*11.50*/ {_display_(Seq[Any](format.raw/*11.52*/("""
                            """),format.raw/*12.29*/("""<li class="active"><a href=""""),_display_(/*12.58*/m/*12.59*/.route.map(_.toString).getOrElse("#")),format.raw/*12.96*/("""">"""),_display_(/*12.99*/m/*12.100*/.title),format.raw/*12.106*/("""</a></li>
                        """)))}/*13.27*/else/*13.32*/{_display_(Seq[Any](format.raw/*13.33*/("""
                            """),format.raw/*14.29*/("""<li><a href=""""),_display_(/*14.43*/m/*14.44*/.route.map(_.toString).getOrElse("#")),format.raw/*14.81*/("""">"""),_display_(/*14.84*/m/*14.85*/.title),format.raw/*14.91*/("""</a></li>
                        """)))}),format.raw/*15.26*/("""
                    """)))}/*16.23*/else/*16.28*/{_display_(Seq[Any](format.raw/*16.29*/("""
                        """),format.raw/*17.25*/("""<li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">"""),_display_(/*18.89*/m/*18.90*/.title),format.raw/*18.96*/("""<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                            """),_display_(/*20.30*/m/*20.31*/.items.map/*20.41*/ { case (item,route) =>_display_(Seq[Any](format.raw/*20.64*/("""
                                """),_display_(/*21.34*/if(m.title == menuTitle && item == menuItem)/*21.78*/ {_display_(Seq[Any](format.raw/*21.80*/("""
                                    """),format.raw/*22.37*/("""<li class="active"><a href=""""),_display_(/*22.66*/route/*22.71*/.toString),format.raw/*22.80*/("""">"""),_display_(/*22.83*/item),format.raw/*22.87*/("""</a></li>
                                """)))}/*23.35*/else/*23.40*/{_display_(Seq[Any](format.raw/*23.41*/("""
                                    """),format.raw/*24.37*/("""<li><a href=""""),_display_(/*24.51*/route/*24.56*/.toString),format.raw/*24.65*/("""">"""),_display_(/*24.68*/item),format.raw/*24.72*/("""</a></li>
                                """)))}),format.raw/*25.34*/("""
                            """)))}),format.raw/*26.30*/("""
                            """),format.raw/*27.29*/("""</ul>
                        </li>
                    """)))}),format.raw/*29.22*/("""
                """)))}),format.raw/*30.18*/("""
            """),format.raw/*31.13*/("""</ul>
        </div>
"""))
      }
    }
  }

  def render(menuTitle:String,menuItem:String,menuList:IndexedSeq[models.navigation.Menu]): play.twirl.api.HtmlFormat.Appendable = apply(menuTitle,menuItem,menuList)

  def f:((String,String,IndexedSeq[models.navigation.Menu]) => play.twirl.api.HtmlFormat.Appendable) = (menuTitle,menuItem,menuList) => apply(menuTitle,menuItem,menuList)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object menuNav extends menuNav_Scope0.menuNav
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/navigation/menuNav.scala.html
                  HASH: 00107ce07e1c85c7cf1da9d35dd11fc3d18afde0
                  MATRIX: 693->115|871->198|907->208|1029->304|1045->312|1057->316|1101->323|1150->345|1178->364|1218->366|1271->392|1304->416|1344->418|1401->447|1457->476|1467->477|1525->514|1555->517|1566->518|1594->524|1648->560|1661->565|1700->566|1757->595|1798->609|1808->610|1866->647|1896->650|1906->651|1933->657|1999->692|2040->715|2053->720|2092->721|2145->746|2282->856|2292->857|2319->863|2474->991|2484->992|2503->1002|2564->1025|2625->1059|2678->1103|2718->1105|2783->1142|2839->1171|2853->1176|2883->1185|2913->1188|2938->1192|3000->1236|3013->1241|3052->1242|3117->1279|3158->1293|3172->1298|3202->1307|3232->1310|3257->1314|3331->1357|3392->1387|3449->1416|3537->1473|3586->1491|3627->1504
                  LINES: 23->5|28->5|30->7|32->9|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|35->12|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|37->14|37->14|37->14|37->14|38->15|39->16|39->16|39->16|40->17|41->18|41->18|41->18|43->20|43->20|43->20|43->20|44->21|44->21|44->21|45->22|45->22|45->22|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24|47->24|47->24|47->24|48->25|49->26|50->27|52->29|53->30|54->31
                  -- GENERATED --
              */
          