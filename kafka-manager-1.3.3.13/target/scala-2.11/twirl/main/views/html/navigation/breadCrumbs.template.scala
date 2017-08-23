
package views.html.navigation

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object breadCrumbs_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class breadCrumbs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(crumbs: IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.navigation.BreadCrumbs._
def /*9.2*/renderLink/*9.12*/(name: String, link: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.44*/("""
"""),format.raw/*10.1*/("""<li><a href=""""),_display_(/*10.15*/link),format.raw/*10.19*/("""">"""),_display_(/*10.22*/name),format.raw/*10.26*/("""</a></li>
""")))};def /*13.2*/renderText/*13.12*/(name: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.30*/("""
"""),format.raw/*14.1*/("""<li>"""),_display_(/*14.6*/name),format.raw/*14.10*/("""</li>
""")))};def /*17.2*/renderActive/*17.14*/(name: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.32*/("""
"""),format.raw/*18.1*/("""<li class="active">"""),_display_(/*18.21*/name),format.raw/*18.25*/("""</li>
""")))};
Seq[Any](format.raw/*5.72*/("""

"""),format.raw/*8.1*/("""
"""),format.raw/*11.2*/("""

"""),format.raw/*15.2*/("""

"""),format.raw/*19.2*/("""


"""),format.raw/*22.1*/("""<ol class="breadcrumb">
    """),_display_(/*23.6*/crumbs/*23.12*/.map/*23.16*/ {/*24.9*/case BCLink(name, link) =>/*24.35*/  {_display_(Seq[Any](format.raw/*24.38*/(""" """),_display_(/*24.40*/renderLink(name,link)),format.raw/*24.61*/(""" """)))}/*25.9*/case BCText(name) =>/*25.29*/ {_display_(Seq[Any](format.raw/*25.31*/(""" """),_display_(/*25.33*/renderText(name)),format.raw/*25.49*/(""" """)))}/*26.9*/case BCActive(name) =>/*26.31*/ {_display_(Seq[Any](format.raw/*26.33*/(""" """),_display_(/*26.35*/renderActive(name)),format.raw/*26.53*/(""" """)))}}),format.raw/*27.6*/("""
"""),format.raw/*28.1*/("""</ol>

"""))
      }
    }
  }

  def render(crumbs:IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered]): play.twirl.api.HtmlFormat.Appendable = apply(crumbs)

  def f:((IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered]) => play.twirl.api.HtmlFormat.Appendable) = (crumbs) => apply(crumbs)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object breadCrumbs extends breadCrumbs_Scope0.breadCrumbs
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/navigation/breadCrumbs.scala.html
                  HASH: f01efc081614d7512fc5d137c5d27b459f26b2b9
                  MATRIX: 713->115|899->229|917->239|1025->271|1053->272|1094->286|1119->290|1149->293|1174->297|1208->311|1227->321|1322->339|1350->340|1381->345|1406->349|1436->359|1457->371|1552->389|1580->390|1627->410|1652->414|1698->185|1726->227|1754->308|1783->356|1812->421|1842->424|1897->453|1912->459|1925->463|1935->474|1970->500|2011->503|2040->505|2082->526|2102->537|2131->557|2171->559|2200->561|2237->577|2257->588|2288->610|2328->612|2357->614|2396->632|2429->640|2457->641
                  LINES: 23->5|27->9|27->9|29->9|30->10|30->10|30->10|30->10|30->10|31->13|31->13|33->13|34->14|34->14|34->14|35->17|35->17|37->17|38->18|38->18|38->18|40->5|42->8|43->11|45->15|47->19|50->22|51->23|51->23|51->23|51->24|51->24|51->24|51->24|51->24|51->25|51->25|51->25|51->25|51->25|51->26|51->26|51->26|51->26|51->26|51->27|52->28
                  -- GENERATED --
              */
          