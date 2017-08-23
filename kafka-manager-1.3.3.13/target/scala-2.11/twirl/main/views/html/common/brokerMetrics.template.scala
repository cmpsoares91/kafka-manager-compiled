
package views.html.common

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object brokerMetrics_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class brokerMetrics extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Option[kafka.manager.model.ActorModel.BrokerMetrics],play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(brokerMetrics: Option[kafka.manager.model.ActorModel.BrokerMetrics])(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.114*/("""
"""),format.raw/*2.1*/("""<table class="table">
  <thead>
    <tr>
      <th>Rate</th>
      <th>Mean</th>
      <th>1&nbsp;min</th>
      <th>5&nbsp;min</th>
      <th>15&nbsp;min</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Messages in /sec</td>
      <td>
        <span class="badge">"""),_display_(/*16.30*/brokerMetrics/*16.43*/.map(_.messagesInPerSec.formatMeanRate)),format.raw/*16.82*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*19.30*/brokerMetrics/*19.43*/.map(_.messagesInPerSec.formatOneMinuteRate)),format.raw/*19.87*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*22.30*/brokerMetrics/*22.43*/.map(_.messagesInPerSec.formatFiveMinuteRate)),format.raw/*22.88*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*25.30*/brokerMetrics/*25.43*/.map(_.messagesInPerSec.formatFifteenMinuteRate)),format.raw/*25.91*/("""</span>
      </td>
    <tr>
    <tr>
      <td>Bytes in /sec</td>
      <td>
        <span class="badge">"""),_display_(/*31.30*/brokerMetrics/*31.43*/.map(_.bytesInPerSec.formatMeanRate)),format.raw/*31.79*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*34.30*/brokerMetrics/*34.43*/.map(_.bytesInPerSec.formatOneMinuteRate)),format.raw/*34.84*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*37.30*/brokerMetrics/*37.43*/.map(_.bytesInPerSec.formatFiveMinuteRate)),format.raw/*37.85*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*40.30*/brokerMetrics/*40.43*/.map(_.bytesInPerSec.formatFifteenMinuteRate)),format.raw/*40.88*/("""</span>
      </td>
    <tr>
    <tr>
      <td>Bytes out /sec</td>
      <td>
        <span class="badge">"""),_display_(/*46.30*/brokerMetrics/*46.43*/.map(_.bytesOutPerSec.formatMeanRate)),format.raw/*46.80*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*49.30*/brokerMetrics/*49.43*/.map(_.bytesOutPerSec.formatOneMinuteRate)),format.raw/*49.85*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*52.30*/brokerMetrics/*52.43*/.map(_.bytesOutPerSec.formatFiveMinuteRate)),format.raw/*52.86*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*55.30*/brokerMetrics/*55.43*/.map(_.bytesOutPerSec.formatFifteenMinuteRate)),format.raw/*55.89*/("""</span>
      </td>
    <tr>
    <tr>
      <td>Bytes rejected /sec</td>
      <td>
        <span class="badge">"""),_display_(/*61.30*/brokerMetrics/*61.43*/.map(_.bytesRejectedPerSec.formatMeanRate)),format.raw/*61.85*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*64.30*/brokerMetrics/*64.43*/.map(_.bytesRejectedPerSec.formatOneMinuteRate)),format.raw/*64.90*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*67.30*/brokerMetrics/*67.43*/.map(_.bytesRejectedPerSec.formatFiveMinuteRate)),format.raw/*67.91*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*70.30*/brokerMetrics/*70.43*/.map(_.bytesRejectedPerSec.formatFifteenMinuteRate)),format.raw/*70.94*/("""</span>
      </td>
    <tr>
    <tr>
      <td>Failed fetch request /sec</td>
      <td>
        <span class="badge">"""),_display_(/*76.30*/brokerMetrics/*76.43*/.map(_.failedFetchRequestsPerSec.formatMeanRate)),format.raw/*76.91*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*79.30*/brokerMetrics/*79.43*/.map(_.failedFetchRequestsPerSec.formatOneMinuteRate)),format.raw/*79.96*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*82.30*/brokerMetrics/*82.43*/.map(_.failedFetchRequestsPerSec.formatFiveMinuteRate)),format.raw/*82.97*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*85.30*/brokerMetrics/*85.43*/.map(_.failedFetchRequestsPerSec.formatFifteenMinuteRate)),format.raw/*85.100*/("""</span>
      </td>
    <tr>
    <tr>
      <td>Failed produce request /sec</td>
      <td>
        <span class="badge">"""),_display_(/*91.30*/brokerMetrics/*91.43*/.map(_.failedProduceRequestsPerSec.formatMeanRate)),format.raw/*91.93*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*94.30*/brokerMetrics/*94.43*/.map(_.failedProduceRequestsPerSec.formatOneMinuteRate)),format.raw/*94.98*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*97.30*/brokerMetrics/*97.43*/.map(_.failedProduceRequestsPerSec.formatFiveMinuteRate)),format.raw/*97.99*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*100.30*/brokerMetrics/*100.43*/.map(_.failedProduceRequestsPerSec.formatFifteenMinuteRate)),format.raw/*100.102*/("""</span>
      </td>
    <tr>
  </tbody>
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
object brokerMetrics extends brokerMetrics_Scope0.brokerMetrics
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/common/brokerMetrics.scala.html
                  HASH: 36f7ac59734a91ce831911e184f053bb14119ffb
                  MATRIX: 619->1|827->113|854->114|1153->386|1175->399|1235->438|1322->498|1344->511|1409->555|1496->615|1518->628|1584->673|1671->733|1693->746|1762->794|1896->901|1918->914|1975->950|2062->1010|2084->1023|2146->1064|2233->1124|2255->1137|2318->1179|2405->1239|2427->1252|2493->1297|2628->1405|2650->1418|2708->1455|2795->1515|2817->1528|2880->1570|2967->1630|2989->1643|3053->1686|3140->1746|3162->1759|3229->1805|3369->1918|3391->1931|3454->1973|3541->2033|3563->2046|3631->2093|3718->2153|3740->2166|3809->2214|3896->2274|3918->2287|3990->2338|4136->2457|4158->2470|4227->2518|4314->2578|4336->2591|4410->2644|4497->2704|4519->2717|4594->2771|4681->2831|4703->2844|4782->2901|4930->3022|4952->3035|5023->3085|5110->3145|5132->3158|5208->3213|5295->3273|5317->3286|5394->3342|5482->3402|5505->3415|5587->3474
                  LINES: 20->1|25->1|26->2|40->16|40->16|40->16|43->19|43->19|43->19|46->22|46->22|46->22|49->25|49->25|49->25|55->31|55->31|55->31|58->34|58->34|58->34|61->37|61->37|61->37|64->40|64->40|64->40|70->46|70->46|70->46|73->49|73->49|73->49|76->52|76->52|76->52|79->55|79->55|79->55|85->61|85->61|85->61|88->64|88->64|88->64|91->67|91->67|91->67|94->70|94->70|94->70|100->76|100->76|100->76|103->79|103->79|103->79|106->82|106->82|106->82|109->85|109->85|109->85|115->91|115->91|115->91|118->94|118->94|118->94|121->97|121->97|121->97|124->100|124->100|124->100
                  -- GENERATED --
              */
          