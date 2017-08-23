
package views.html.consumer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object consumerViewContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object consumerViewContent_Scope1 {
import b3.vertical.fieldConstructor

class consumerViewContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,kafka.manager.model.ActorModel.ConsumerIdentity,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, consumer: String, consumerIdentity: kafka.manager.model.ActorModel.ConsumerIdentity)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/getTopicCoverage/*8.18*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.39*/("""
    """),_display_(/*9.6*/percentage/*9.16*/ match/*9.22*/ {/*10.9*/case i if i <=  99 =>/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""danger""")))}/*11.9*/case i =>/*11.18*/ {}}),format.raw/*12.6*/("""
""")))};
Seq[Any](format.raw/*6.146*/("""

"""),format.raw/*13.2*/("""

"""),format.raw/*15.1*/("""<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Consumed Topic Information</h4></div>
            <table class="table">
                <thead>
                <tr><th>Topic</th><th>Partitions Covered %</th><th>Total Lag</th></tr>
                </thead>
                <tbody>
                """),_display_(/*24.18*/for((topic: String, state: kafka.manager.model.ActorModel.ConsumedTopicState) <- consumerIdentity.topicMap) yield /*24.125*/ {_display_(Seq[Any](format.raw/*24.127*/("""
                """),format.raw/*25.17*/("""<tr>
                    <td><a href=""""),_display_(/*26.35*/routes/*26.41*/.Consumer.consumerAndTopic(cluster, consumer, topic, consumerIdentity.consumerType.toString)),format.raw/*26.133*/("""">"""),_display_(/*26.136*/topic),format.raw/*26.141*/("""</a></td>
                    <td class=""""),_display_(/*27.33*/getTopicCoverage(state.percentageCovered)),format.raw/*27.74*/("""">
                        """),_display_(/*28.26*/state/*28.31*/.percentageCovered),format.raw/*28.49*/("""
                    """),format.raw/*29.21*/("""</td>
                    <td>"""),_display_(/*30.26*/state/*30.31*/.totalLag.getOrElse("not available")),format.raw/*30.67*/("""</td>
                </tr>
                """)))}),format.raw/*32.18*/("""
                """),format.raw/*33.17*/("""</tbody>
            </table>
        </div>
    </div>
</div>
"""))
      }
    }
  }

  def render(cluster:String,consumer:String,consumerIdentity:kafka.manager.model.ActorModel.ConsumerIdentity,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumer,consumerIdentity)(messages)

  def f:((String,String,kafka.manager.model.ActorModel.ConsumerIdentity) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumer,consumerIdentity) => (messages) => apply(cluster,consumer,consumerIdentity)(messages)

  def ref: this.type = this

}


}
}

/**/
object consumerViewContent extends consumerViewContent_Scope0.consumerViewContent_Scope1.consumerViewContent
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/consumer/consumerViewContent.scala.html
                  HASH: 9ba607cfb8d58923e0da610a7ad743f7a84d1395
                  MATRIX: 720->152|942->299|966->315|1063->336|1094->342|1112->352|1126->358|1136->369|1166->390|1206->392|1231->408|1249->417|1273->426|1315->296|1344->428|1373->430|1780->810|1904->917|1945->919|1990->936|2056->975|2071->981|2185->1073|2216->1076|2243->1081|2312->1123|2374->1164|2429->1192|2443->1197|2482->1215|2531->1236|2589->1267|2603->1272|2660->1308|2736->1353|2781->1370
                  LINES: 23->6|27->8|27->8|29->8|30->9|30->9|30->9|30->10|30->10|30->10|30->11|30->11|30->12|32->6|34->13|36->15|45->24|45->24|45->24|46->25|47->26|47->26|47->26|47->26|47->26|48->27|48->27|49->28|49->28|49->28|50->29|51->30|51->30|51->30|53->32|54->33
                  -- GENERATED --
              */
          