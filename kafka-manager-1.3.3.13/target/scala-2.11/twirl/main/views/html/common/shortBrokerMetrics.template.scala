
package views.html.common

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object shortBrokerMetrics_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object shortBrokerMetrics_Scope1 {
import kafka.manager.model.ActorModel.{TopicIdentity, BVView}

class shortBrokerMetrics extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Seq[BVView],play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(brokersViews: Seq[BVView])(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.72*/("""

"""),format.raw/*5.1*/("""<table class="table">
    <tr>
      <th>Broker </th>
      <th>Messages in /sec</th>
      <th>Bytes in /sec</th>
      <th>Bytes out /sec</th>
    </tr>
  """),_display_(/*12.4*/brokersViews/*12.16*/.zipWithIndex.map/*12.33*/ { case (brokerView, idx) =>_display_(Seq[Any](format.raw/*12.61*/("""
    """),_display_(/*13.6*/if(brokerView.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*13.104*/ {_display_(Seq[Any](format.raw/*13.106*/("""
      """),format.raw/*14.7*/("""<tr>
        <td>"""),_display_(/*15.14*/idx),format.raw/*15.17*/("""</td>
        <td>
          <span class="badge">"""),_display_(/*17.32*/brokerView/*17.42*/.metrics.map(_.messagesInPerSec.formatMeanRate)),format.raw/*17.89*/("""</span>
        </td>
        <td>
          <span class="badge">"""),_display_(/*20.32*/brokerView/*20.42*/.metrics.map(_.bytesInPerSec.formatMeanRate)),format.raw/*20.86*/("""</span>
        </td>
        <td>
          <span class="badge">"""),_display_(/*23.32*/brokerView/*23.42*/.metrics.map(_.bytesOutPerSec.formatMeanRate)),format.raw/*23.87*/("""</span>
        </td>
      </tr>
    """)))}/*26.7*/else/*26.12*/{_display_(Seq[Any](format.raw/*26.13*/("""
      """),format.raw/*27.7*/("""<tr>
        <td>"""),_display_(/*28.14*/idx),format.raw/*28.17*/("""</td>
        <td>
          <span class="badge">NA</span>
        </td>
        <td>
          <span class="badge">NA</span>
        </td>
        <td>
          <span class="badge">NA</span>
        </td>
      </tr>
    """)))}),format.raw/*39.6*/("""
  """)))}),format.raw/*40.4*/("""
"""),format.raw/*41.1*/("""</table>

<table class="table">
  <tr>
    <th>Broker </th>
    <th>Bytes rejected /sec</th>
    <th>Failed fetch request /sec</th>
    <th>Failed produce request /sec</th>
  </tr>
  """),_display_(/*50.4*/brokersViews/*50.16*/.zipWithIndex.map/*50.33*/ { case (brokerView, idx) =>_display_(Seq[Any](format.raw/*50.61*/("""
  """),_display_(/*51.4*/if(brokerView.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*51.102*/ {_display_(Seq[Any](format.raw/*51.104*/("""
  """),format.raw/*52.3*/("""<tr>
    <td>"""),_display_(/*53.10*/idx),format.raw/*53.13*/("""</td>
    <td>
      <span class="badge">"""),_display_(/*55.28*/brokerView/*55.38*/.metrics.map(_.bytesRejectedPerSec.formatMeanRate)),format.raw/*55.88*/("""</span>
    </td>
    <td>
      <span class="badge">"""),_display_(/*58.28*/brokerView/*58.38*/.metrics.map(_.failedFetchRequestsPerSec.formatMeanRate)),format.raw/*58.94*/("""</span>
    </td>
    <td>
      <span class="badge">"""),_display_(/*61.28*/brokerView/*61.38*/.metrics.map(_.failedProduceRequestsPerSec.formatMeanRate)),format.raw/*61.96*/("""</span>
    </td>
  </tr>
  """)))}/*64.5*/else/*64.10*/{_display_(Seq[Any](format.raw/*64.11*/("""
  """),format.raw/*65.3*/("""<tr>
    <td>"""),_display_(/*66.10*/idx),format.raw/*66.13*/("""</td>
    <td>
      <span class="badge">NA</span>
    </td>
    <td>
      <span class="badge">NA</span>
    </td>
    <td>
      <span class="badge">NA</span>
    </td>
  </tr>
  """)))}),format.raw/*77.4*/("""
  """)))}),format.raw/*78.4*/("""
"""),format.raw/*79.1*/("""</table>
"""))
      }
    }
  }

  def render(brokersViews:Seq[BVView],messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(brokersViews)(messages)

  def f:((Seq[BVView]) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (brokersViews) => (messages) => apply(brokersViews)(messages)

  def ref: this.type = this

}


}
}

/**/
object shortBrokerMetrics extends shortBrokerMetrics_Scope0.shortBrokerMetrics_Scope1.shortBrokerMetrics
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/common/shortBrokerMetrics.scala.html
                  HASH: 84b2b015c740cd1f7996dd5a937eba147c239805
                  MATRIX: 691->65|856->135|884->137|1068->295|1089->307|1115->324|1181->352|1213->358|1321->456|1362->458|1396->465|1441->483|1465->486|1542->536|1561->546|1629->593|1722->659|1741->669|1806->713|1899->779|1918->789|1984->834|2041->874|2054->879|2093->880|2127->887|2172->905|2196->908|2450->1132|2484->1136|2512->1137|2722->1321|2743->1333|2769->1350|2835->1378|2865->1382|2973->1480|3014->1482|3044->1485|3085->1499|3109->1502|3178->1544|3197->1554|3268->1604|3349->1658|3368->1668|3445->1724|3526->1778|3545->1788|3624->1846|3671->1876|3684->1881|3723->1882|3753->1885|3794->1899|3818->1902|4030->2084|4064->2088|4092->2089
                  LINES: 23->3|28->3|30->5|37->12|37->12|37->12|37->12|38->13|38->13|38->13|39->14|40->15|40->15|42->17|42->17|42->17|45->20|45->20|45->20|48->23|48->23|48->23|51->26|51->26|51->26|52->27|53->28|53->28|64->39|65->40|66->41|75->50|75->50|75->50|75->50|76->51|76->51|76->51|77->52|78->53|78->53|80->55|80->55|80->55|83->58|83->58|83->58|86->61|86->61|86->61|89->64|89->64|89->64|90->65|91->66|91->66|102->77|103->78|104->79
                  -- GENERATED --
              */
          