
package views.html.broker

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object brokerViewContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class brokerViewContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Int,kafka.manager.model.ActorModel.BVView,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster: String, brokerId: Int, brokerView :kafka.manager.model.ActorModel.BVView)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/renderBrokerMetrics/*7.21*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.25*/("""
    """),_display_(/*8.6*/if(brokerView.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*8.104*/ {_display_(Seq[Any](format.raw/*8.106*/("""
        """),_display_(/*9.10*/views/*9.15*/.html.common.brokerMetrics(brokerView.metrics)),format.raw/*9.61*/("""
    """)))}/*10.7*/else/*10.12*/{_display_(Seq[Any](format.raw/*10.13*/("""
        """),format.raw/*11.9*/("""<div class="alert alert-info" role="alert">
            Please enable JMX polling <a href=""""),_display_(/*12.49*/routes/*12.55*/.Cluster.updateCluster(cluster)),format.raw/*12.86*/("""" class="alert-link">here</a>.
        </div>
    """)))}),format.raw/*14.6*/("""
""")))};
Seq[Any](format.raw/*5.128*/("""

"""),format.raw/*15.2*/("""

        """),format.raw/*17.9*/("""<div class="row">
            <div class="col-md-7">
                <div class="panel panel-default">
                    <div class="panel-heading"><h4>Summary</h4></div>
                    <table class="table">
                        <tbody>
                        <tr><td># of Topics</td><td>"""),_display_(/*23.54*/brokerView/*23.64*/.numTopics),format.raw/*23.74*/("""</td></tr>
                        <tr><td># of Partitions</td><td>"""),_display_(/*24.58*/brokerView/*24.68*/.numPartitions),format.raw/*24.82*/("""</td></tr>
                        <tr><td># of Partitions as Leader</td><td>"""),_display_(/*25.68*/brokerView/*25.78*/.numPartitionsAsLeader),format.raw/*25.100*/("""</td></tr>
                        """),_display_(/*26.26*/if(brokerView.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*26.124*/ {_display_(Seq[Any](format.raw/*26.126*/("""
                        """),format.raw/*27.25*/("""<tr><td>% of Messages</td><td>"""),_display_(/*27.56*/brokerView/*27.66*/.stats.map(_.perMessages)),format.raw/*27.91*/("""</td></tr>
                        <tr><td>% of Incoming</td><td>"""),_display_(/*28.56*/brokerView/*28.66*/.stats.map(_.perIncoming)),format.raw/*28.91*/("""</td></tr>
                        <tr><td>% of Outgoing</td><td>"""),_display_(/*29.56*/brokerView/*29.66*/.stats.map(_.perOutgoing)),format.raw/*29.91*/("""</td></tr>
                        """)))}),format.raw/*30.26*/("""
                        """),format.raw/*31.25*/("""</tbody>
                    </table>
                </div>
            </div>
            <div class="col-md-5">
                <div class="panel panel-default">
                    <div class="panel-heading"><h4>Metrics</h4></div>
                    """),_display_(/*38.22*/renderBrokerMetrics),format.raw/*38.41*/("""
                """),format.raw/*39.17*/("""</div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-default">
                    <div class="panel-heading"><h4>Messages count</h4></div>
                    <div class="ct-chart"></div>
                    <script>
                        var options = """),format.raw/*48.39*/("""{"""),format.raw/*48.40*/("""
                            """),format.raw/*49.29*/("""axisY: """),format.raw/*49.36*/("""{"""),format.raw/*49.37*/("""
                                """),format.raw/*50.33*/("""type: Chartist.AutoScaleAxis,
                                low: """),_display_(/*51.39*/brokerView/*51.49*/.messagesPerSecCountHistory.map(v => v.head.count - 1).getOrElse(0)),format.raw/*51.116*/(""",
                                high: """),_display_(/*52.40*/brokerView/*52.50*/.messagesPerSecCountHistory.map(v => v.last.count + 1).getOrElse(0)),format.raw/*52.117*/(""",
                                onlyInteger: true
                            """),format.raw/*54.29*/("""}"""),format.raw/*54.30*/("""
                        """),format.raw/*55.25*/("""}"""),format.raw/*55.26*/(""";
                        var data = """),format.raw/*56.36*/("""{"""),format.raw/*56.37*/("""
                          """),format.raw/*57.27*/("""labels: ["""),_display_(/*57.37*/Html(brokerView.messagesPerSecCountHistory.map(_.map(v => s"'${v.date.toString("HH:mm:ss")}'").mkString(",")).getOrElse(""))),format.raw/*57.161*/("""],
                          series: [
                            ["""),_display_(/*59.31*/brokerView/*59.41*/.messagesPerSecCountHistory.map(_.map(_.count).mkString(","))),format.raw/*59.102*/("""]
                          ]
                        """),format.raw/*61.25*/("""}"""),format.raw/*61.26*/(""";
                        new Chartist.Line('.ct-chart', data, options);
                    </script>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Per Topic Detail</h4></div>
            <table class="table" id="broker-table" style="table-layout: fixed; width: 100%">
                <thead>
                <tr>
                    <th>Topic</th>
                    <th>Replication</th>
                    <th>Total Partitions</th>
                    <th>Partitions on Broker</th>
                    <th>Partitions</th>
                    <th><span title="Broker has more partitions than the average">Skewed?</span></th>
                    <th># Partitions as Leader</th>
                </tr>
                </thead>
                <tbody>
                """),_display_(/*82.18*/for((ti,bp) <- brokerView.topicPartitions) yield /*82.60*/ {_display_(Seq[Any](format.raw/*82.62*/("""
                """),format.raw/*83.17*/("""<tr>
                    <td><a href=""""),_display_(/*84.35*/routes/*84.41*/.Topic.topic(cluster,ti.topic)),format.raw/*84.71*/("""">"""),_display_(/*84.74*/ti/*84.76*/.topic),format.raw/*84.82*/("""</a></td>
                    <td>"""),_display_(/*85.26*/ti/*85.28*/.replicationFactor),format.raw/*85.46*/("""</td>
                    <td>"""),_display_(/*86.26*/ti/*86.28*/.partitions),format.raw/*86.39*/("""</td>
                    <td>"""),_display_(/*87.26*/bp/*87.28*/.partitions.size),format.raw/*87.44*/("""</td>
                    <td style="word-wrap: break-word">"""),_display_(/*88.56*/bp/*88.58*/.partitions.mkString("(",",",")")),format.raw/*88.91*/("""</td>
                    <td>"""),_display_(/*89.26*/ti/*89.28*/.partitionsByBroker.find(_.id == brokerId).map(_.isSkewed).getOrElse("Unknown")),format.raw/*89.107*/("""</td>
                    <td>"""),_display_(/*90.26*/bp/*90.28*/.partitionsAsLeader.size),format.raw/*90.52*/("""</td>
                </tr>
                """)))}),format.raw/*92.18*/("""
                """),format.raw/*93.17*/("""</tbody>
            </table>
        </div>

"""))
      }
    }
  }

  def render(cluster:String,brokerId:Int,brokerView:kafka.manager.model.ActorModel.BVView,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,brokerId,brokerView)(messages)

  def f:((String,Int,kafka.manager.model.ActorModel.BVView) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,brokerId,brokerView) => (messages) => apply(cluster,brokerId,brokerView)(messages)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object brokerViewContent extends brokerViewContent_Scope0.brokerViewContent
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/broker/brokerViewContent.scala.html
                  HASH: ebc1dace34735e8fa9413355e2d18039a6127245
                  MATRIX: 732->115|936->244|963->263|1043->267|1074->273|1181->371|1221->373|1257->383|1270->388|1336->434|1360->441|1373->446|1412->447|1448->456|1567->548|1582->554|1634->585|1715->636|1757->241|1786->638|1823->648|2150->948|2169->958|2200->968|2295->1036|2314->1046|2349->1060|2454->1138|2473->1148|2517->1170|2580->1206|2688->1304|2729->1306|2782->1331|2840->1362|2859->1372|2905->1397|2998->1463|3017->1473|3063->1498|3156->1564|3175->1574|3221->1599|3288->1635|3341->1660|3624->1916|3664->1935|3709->1952|4083->2298|4112->2299|4169->2328|4204->2335|4233->2336|4294->2369|4389->2437|4408->2447|4497->2514|4565->2555|4584->2565|4673->2632|4781->2712|4810->2713|4863->2738|4892->2739|4957->2776|4986->2777|5041->2804|5078->2814|5224->2938|5320->3007|5339->3017|5422->3078|5504->3132|5533->3133|6425->3998|6483->4040|6523->4042|6568->4059|6634->4098|6649->4104|6700->4134|6730->4137|6741->4139|6768->4145|6830->4180|6841->4182|6880->4200|6938->4231|6949->4233|6981->4244|7039->4275|7050->4277|7087->4293|7175->4354|7186->4356|7240->4389|7298->4420|7309->4422|7410->4501|7468->4532|7479->4534|7524->4558|7600->4603|7645->4620
                  LINES: 23->5|27->7|27->7|29->7|30->8|30->8|30->8|31->9|31->9|31->9|32->10|32->10|32->10|33->11|34->12|34->12|34->12|36->14|38->5|40->15|42->17|48->23|48->23|48->23|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|55->30|56->31|63->38|63->38|64->39|73->48|73->48|74->49|74->49|74->49|75->50|76->51|76->51|76->51|77->52|77->52|77->52|79->54|79->54|80->55|80->55|81->56|81->56|82->57|82->57|82->57|84->59|84->59|84->59|86->61|86->61|107->82|107->82|107->82|108->83|109->84|109->84|109->84|109->84|109->84|109->84|110->85|110->85|110->85|111->86|111->86|111->86|112->87|112->87|112->87|113->88|113->88|113->88|114->89|114->89|114->89|115->90|115->90|115->90|117->92|118->93
                  -- GENERATED --
              */
          