
package views.html.cluster

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pendingClusterList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class pendingClusterList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[IndexedSeq[kafka.manager.model.ClusterConfig],play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(clusters: IndexedSeq[kafka.manager.model.ClusterConfig])(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*5.102*/("""

"""),format.raw/*8.1*/("""
"""),_display_(/*9.2*/if(clusters.nonEmpty)/*9.23*/ {_display_(Seq[Any](format.raw/*9.25*/("""
            """),format.raw/*10.13*/("""<div class="panel-body"><br></div>
            <table class="table">
                <thead>
                <tr><th>Pending</th><th>Status</th><th>Version</th></tr>
                </thead>
                <tbody>
                """),_display_(/*16.18*/for(cluster <- clusters) yield /*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""
                """),format.raw/*17.17*/("""<tr>
                    <td>"""),_display_(/*18.26*/cluster/*18.33*/.name),format.raw/*18.38*/("""</td>
                    <td>pending changes</td>
                    <td>"""),_display_(/*20.26*/cluster/*20.33*/.version.toString),format.raw/*20.50*/("""</td>
                </tr>
                """)))}),format.raw/*22.18*/("""
                """),format.raw/*23.17*/("""</tbody>
            </table>
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(clusters:IndexedSeq[kafka.manager.model.ClusterConfig],messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(clusters)(messages)

  def f:((IndexedSeq[kafka.manager.model.ClusterConfig]) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (clusters) => (messages) => apply(clusters)(messages)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object pendingClusterList extends pendingClusterList_Scope0.pendingClusterList
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/cluster/pendingClusterList.scala.html
                  HASH: 7fcfd15b924434163eab3f9b62561622fb710c9d
                  MATRIX: 732->115|963->215|991->254|1018->256|1047->277|1086->279|1127->292|1386->524|1426->548|1466->550|1511->567|1568->597|1584->604|1610->609|1713->685|1729->692|1767->709|1843->754|1888->771|1949->802
                  LINES: 23->5|28->5|30->8|31->9|31->9|31->9|32->10|38->16|38->16|38->16|39->17|40->18|40->18|40->18|42->20|42->20|42->20|44->22|45->23|47->25
                  -- GENERATED --
              */
          