
package views.html.cluster

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object clusterList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class clusterList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[IndexedSeq[kafka.manager.model.ClusterConfig],features.ApplicationFeatures,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(clusters: IndexedSeq[kafka.manager.model.ClusterConfig])(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*5.136*/("""

"""),format.raw/*8.1*/("""
            """),format.raw/*9.13*/("""<table class="table">
                <thead>
                <tr><th>Active</th><th>Operations</th><th>Version</th></tr>
                </thead>
                <tbody>
                """),_display_(/*14.18*/for(cluster <- clusters) yield /*14.42*/ {_display_(Seq[Any](format.raw/*14.44*/("""
                """),format.raw/*15.17*/("""<tr>
                    <td>
                        """),_display_(/*17.26*/if(cluster.enabled)/*17.45*/ {_display_(Seq[Any](format.raw/*17.47*/("""
                            """),format.raw/*18.29*/("""<a href=""""),_display_(/*18.39*/routes/*18.45*/.Cluster.cluster(cluster.name)),format.raw/*18.75*/("""">"""),_display_(/*18.78*/cluster/*18.85*/.name),format.raw/*18.90*/("""</a>
                        """)))}/*19.27*/else/*19.32*/{_display_(Seq[Any](format.raw/*19.33*/("""
                            """),_display_(/*20.30*/cluster/*20.37*/.name),format.raw/*20.42*/("""
                        """)))}),format.raw/*21.26*/("""
                    """),format.raw/*22.21*/("""</td>
                    <td>
                        <div class="btn-group-horizontal" role="group" aria-label="...">
                        """),_display_(/*25.26*/features/*25.34*/.app(features.KMClusterManagerFeature)/*25.72*/ {_display_(Seq[Any](format.raw/*25.74*/("""
                            """),_display_(/*26.30*/if(cluster.enabled)/*26.49*/ {_display_(Seq[Any](format.raw/*26.51*/("""
                                """),format.raw/*27.33*/("""<a href=""""),_display_(/*27.43*/routes/*27.49*/.Cluster.updateCluster(cluster.name)),format.raw/*27.85*/("""" class="btn btn-default ops-button" role="button">Modify</a>
                                """),_display_(/*28.34*/b3/*28.36*/.form(routes.Cluster.handleUpdateCluster(cluster.name))/*28.91*/ {_display_(Seq[Any](format.raw/*28.93*/("""
                                """),format.raw/*29.33*/("""<input type="hidden" name="name" value=""""),_display_(/*29.74*/cluster/*29.81*/.name),format.raw/*29.86*/("""">
                                <input type="hidden" name="kafkaVersion" value=""""),_display_(/*30.82*/cluster/*30.89*/.version.toString),format.raw/*30.106*/("""">
                                <input type="hidden" name="zkHosts" value=""""),_display_(/*31.77*/cluster/*31.84*/.curatorConfig.zkConnect),format.raw/*31.108*/("""">
                                <input type="hidden" name="securityProtocol" value=""""),_display_(/*32.86*/cluster/*32.93*/.securityProtocol.stringId),format.raw/*32.119*/("""">
                                <input type="hidden" name="operation" value="Disable">
                                """),_display_(/*34.34*/b3/*34.36*/.submit('class -> "btn btn-warning ops-button")/*34.83*/{_display_(Seq[Any](format.raw/*34.84*/(""" """),format.raw/*34.85*/("""Disable """)))}),format.raw/*34.94*/("""
                                """)))}),format.raw/*35.34*/("""
                            """)))}/*36.31*/else/*36.36*/{_display_(Seq[Any](format.raw/*36.37*/("""
                                """),_display_(/*37.34*/b3/*37.36*/.form(routes.Cluster.handleUpdateCluster(cluster.name))/*37.91*/ {_display_(Seq[Any](format.raw/*37.93*/("""
                                """),format.raw/*38.33*/("""<input type="hidden" name="name" value=""""),_display_(/*38.74*/cluster/*38.81*/.name),format.raw/*38.86*/("""">
                                <input type="hidden" name="kafkaVersion" value=""""),_display_(/*39.82*/cluster/*39.89*/.version.toString),format.raw/*39.106*/("""">
                                <input type="hidden" name="zkHosts" value=""""),_display_(/*40.77*/cluster/*40.84*/.curatorConfig.zkConnect),format.raw/*40.108*/("""">
                                <input type="hidden" name="securityProtocol" value=""""),_display_(/*41.86*/cluster/*41.93*/.securityProtocol.stringId),format.raw/*41.119*/("""">
                                <input type="hidden" name="operation" value="Enable">
                                """),_display_(/*43.34*/b3/*43.36*/.submit('class -> "btn btn-success ops-button")/*43.83*/{_display_(Seq[Any](format.raw/*43.84*/(""" """),format.raw/*43.85*/("""Enable """)))}),format.raw/*43.93*/("""
                                """)))}),format.raw/*44.34*/("""
                                """),_display_(/*45.34*/b3/*45.36*/.form(routes.Cluster.handleUpdateCluster(cluster.name))/*45.91*/ {_display_(Seq[Any](format.raw/*45.93*/("""
                                """),format.raw/*46.33*/("""<input type="hidden" name="name" value=""""),_display_(/*46.74*/cluster/*46.81*/.name),format.raw/*46.86*/("""">
                                <input type="hidden" name="kafkaVersion" value=""""),_display_(/*47.82*/cluster/*47.89*/.version.toString),format.raw/*47.106*/("""">
                                <input type="hidden" name="zkHosts" value=""""),_display_(/*48.77*/cluster/*48.84*/.curatorConfig.zkConnect),format.raw/*48.108*/("""">
                                <input type="hidden" name="securityProtocol" value=""""),_display_(/*49.86*/cluster/*49.93*/.securityProtocol.stringId),format.raw/*49.119*/("""">
                                <input type="hidden" name="operation" value="Delete">
                                """),_display_(/*51.34*/b3/*51.36*/.submit('class -> "btn btn-danger ops-button")/*51.82*/{_display_(Seq[Any](format.raw/*51.83*/(""" """),format.raw/*51.84*/("""Delete """)))}),format.raw/*51.92*/("""
                                """)))}),format.raw/*52.34*/("""
                            """)))}),format.raw/*53.30*/("""
                        """)))}),format.raw/*54.26*/("""
                        """),format.raw/*55.25*/("""</div>
                    </td>
                    <td>
                        """),_display_(/*58.26*/cluster/*58.33*/.version.toString),format.raw/*58.50*/("""
                    """),format.raw/*59.21*/("""</td>
                </tr>
                """)))}),format.raw/*61.18*/("""
                """),format.raw/*62.17*/("""</tbody>
            </table>

"""))
      }
    }
  }

  def render(clusters:IndexedSeq[kafka.manager.model.ClusterConfig],af:features.ApplicationFeatures,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(clusters)(af,messages)

  def f:((IndexedSeq[kafka.manager.model.ClusterConfig]) => (features.ApplicationFeatures,play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (clusters) => (af,messages) => apply(clusters)(af,messages)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object clusterList extends clusterList_Scope0.clusterList
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/cluster/clusterList.scala.html
                  HASH: b20d36b12dc9b7364ca5cb7b517b655af4d88d79
                  MATRIX: 747->115|1012->249|1040->288|1080->301|1295->489|1335->513|1375->515|1420->532|1502->587|1530->606|1570->608|1627->637|1664->647|1679->653|1730->683|1760->686|1776->693|1802->698|1851->729|1864->734|1903->735|1960->765|1976->772|2002->777|2059->803|2108->824|2280->969|2297->977|2344->1015|2384->1017|2441->1047|2469->1066|2509->1068|2570->1101|2607->1111|2622->1117|2679->1153|2801->1248|2812->1250|2876->1305|2916->1307|2977->1340|3045->1381|3061->1388|3087->1393|3198->1477|3214->1484|3253->1501|3359->1580|3375->1587|3421->1611|3536->1699|3552->1706|3600->1732|3750->1855|3761->1857|3817->1904|3856->1905|3885->1906|3925->1915|3990->1949|4039->1980|4052->1985|4091->1986|4152->2020|4163->2022|4227->2077|4267->2079|4328->2112|4396->2153|4412->2160|4438->2165|4549->2249|4565->2256|4604->2273|4710->2352|4726->2359|4772->2383|4887->2471|4903->2478|4951->2504|5100->2626|5111->2628|5167->2675|5206->2676|5235->2677|5274->2685|5339->2719|5400->2753|5411->2755|5475->2810|5515->2812|5576->2845|5644->2886|5660->2893|5686->2898|5797->2982|5813->2989|5852->3006|5958->3085|5974->3092|6020->3116|6135->3204|6151->3211|6199->3237|6348->3359|6359->3361|6414->3407|6453->3408|6482->3409|6521->3417|6586->3451|6647->3481|6704->3507|6757->3532|6867->3615|6883->3622|6921->3639|6970->3660|7046->3705|7091->3722
                  LINES: 23->5|28->5|30->8|31->9|36->14|36->14|36->14|37->15|39->17|39->17|39->17|40->18|40->18|40->18|40->18|40->18|40->18|40->18|41->19|41->19|41->19|42->20|42->20|42->20|43->21|44->22|47->25|47->25|47->25|47->25|48->26|48->26|48->26|49->27|49->27|49->27|49->27|50->28|50->28|50->28|50->28|51->29|51->29|51->29|51->29|52->30|52->30|52->30|53->31|53->31|53->31|54->32|54->32|54->32|56->34|56->34|56->34|56->34|56->34|56->34|57->35|58->36|58->36|58->36|59->37|59->37|59->37|59->37|60->38|60->38|60->38|60->38|61->39|61->39|61->39|62->40|62->40|62->40|63->41|63->41|63->41|65->43|65->43|65->43|65->43|65->43|65->43|66->44|67->45|67->45|67->45|67->45|68->46|68->46|68->46|68->46|69->47|69->47|69->47|70->48|70->48|70->48|71->49|71->49|71->49|73->51|73->51|73->51|73->51|73->51|73->51|74->52|75->53|76->54|77->55|80->58|80->58|80->58|81->59|83->61|84->62
                  -- GENERATED --
              */
          