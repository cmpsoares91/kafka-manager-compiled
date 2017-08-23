
package views.html.common

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object expandedBrokerMetrics_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class expandedBrokerMetrics extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Option[kafka.manager.model.ActorModel.BrokerMetrics],play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(brokerMetrics: Option[kafka.manager.model.ActorModel.BrokerMetrics])(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.114*/("""
"""),format.raw/*2.1*/("""<table class="table">
    <tr>
        <th>Rate</th>
        <th>Mean</th>
        <th>15&nbsp;min</th>
    </tr>
    <tr class="metric-row" name="messages in sec">
        <td>Messages in /sec</td>
        <td>
            <span class="badge">"""),_display_(/*11.34*/brokerMetrics/*11.47*/.map(_.messagesInPerSec.formatMeanRate)),format.raw/*11.86*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*14.34*/brokerMetrics/*14.47*/.map(_.messagesInPerSec.formatFifteenMinuteRate)),format.raw/*14.95*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="bytes in sec">
        <td>Bytes in /sec</td>
        <td>
            <span class="badge">"""),_display_(/*20.34*/brokerMetrics/*20.47*/.map(_.bytesInPerSec.formatMeanRate)),format.raw/*20.83*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*23.34*/brokerMetrics/*23.47*/.map(_.bytesInPerSec.formatFifteenMinuteRate)),format.raw/*23.92*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="bytes out sec">
        <td>Bytes out /sec</td>
        <td>
            <span class="badge">"""),_display_(/*29.34*/brokerMetrics/*29.47*/.map(_.bytesOutPerSec.formatMeanRate)),format.raw/*29.84*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*32.34*/brokerMetrics/*32.47*/.map(_.bytesOutPerSec.formatFifteenMinuteRate)),format.raw/*32.93*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="bytes rejected sec">
        <td>Bytes rejected /sec</td>
        <td>
            <span class="badge">"""),_display_(/*38.34*/brokerMetrics/*38.47*/.map(_.bytesRejectedPerSec.formatMeanRate)),format.raw/*38.89*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*41.34*/brokerMetrics/*41.47*/.map(_.bytesRejectedPerSec.formatFifteenMinuteRate)),format.raw/*41.98*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="failed fetch request sec">
        <td>Failed fetch request /sec</td>
        <td>
            <span class="badge">"""),_display_(/*47.34*/brokerMetrics/*47.47*/.map(_.failedFetchRequestsPerSec.formatMeanRate)),format.raw/*47.95*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*50.34*/brokerMetrics/*50.47*/.map(_.failedFetchRequestsPerSec.formatFifteenMinuteRate)),format.raw/*50.104*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="failed produce request">
        <td>Failed produce request /sec</td>
        <td>
            <span class="badge">"""),_display_(/*56.34*/brokerMetrics/*56.47*/.map(_.failedProduceRequestsPerSec.formatMeanRate)),format.raw/*56.97*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*59.34*/brokerMetrics/*59.47*/.map(_.failedProduceRequestsPerSec.formatFifteenMinuteRate)),format.raw/*59.106*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="process cpu load">
        <td>Process CPU Load</td>
        <td>
            <span class="badge">"""),_display_(/*65.34*/brokerMetrics/*65.47*/.map(_.oSystemMetrics.formatProcessCpuLoad)),format.raw/*65.90*/("""</span>
        </td>
        <td></td>
    <tr>
    <tr class="metric-row" name="system cpu load">
        <td>System CPU Load</td>
        <td>
            <span class="badge">"""),_display_(/*72.34*/brokerMetrics/*72.47*/.map(_.oSystemMetrics.formatSystemCpuLoad)),format.raw/*72.89*/("""</span>
        </td>
        <td></td>
    <tr>
</table>"""))
      }
    }
  }

  def render(brokerMetrics:Option[kafka.manager.model.ActorModel.BrokerMetrics],messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(brokerMetrics)(messages)

  def f:((Option[kafka.manager.model.ActorModel.BrokerMetrics]) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (brokerMetrics) => (messages) => apply(brokerMetrics)(messages)

  def ref: this.type = this

}


}

/**/
object expandedBrokerMetrics extends expandedBrokerMetrics_Scope0.expandedBrokerMetrics
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/common/expandedBrokerMetrics.scala.html
                  HASH: 4694f1ce65f0f235d6601b53e954bddd3c62d5dd
                  MATRIX: 635->1|843->113|870->114|1142->359|1164->372|1224->411|1319->479|1341->492|1410->540|1593->696|1615->709|1672->745|1767->813|1789->826|1855->871|2040->1029|2062->1042|2120->1079|2215->1147|2237->1160|2304->1206|2499->1374|2521->1387|2584->1429|2679->1497|2701->1510|2773->1561|2980->1741|3002->1754|3071->1802|3166->1870|3188->1883|3267->1940|3474->2120|3496->2133|3567->2183|3662->2251|3684->2264|3765->2323|3955->2486|3977->2499|4041->2542|4247->2721|4269->2734|4332->2776
                  LINES: 20->1|25->1|26->2|35->11|35->11|35->11|38->14|38->14|38->14|44->20|44->20|44->20|47->23|47->23|47->23|53->29|53->29|53->29|56->32|56->32|56->32|62->38|62->38|62->38|65->41|65->41|65->41|71->47|71->47|71->47|74->50|74->50|74->50|80->56|80->56|80->56|83->59|83->59|83->59|89->65|89->65|89->65|96->72|96->72|96->72
                  -- GENERATED --
              */
          