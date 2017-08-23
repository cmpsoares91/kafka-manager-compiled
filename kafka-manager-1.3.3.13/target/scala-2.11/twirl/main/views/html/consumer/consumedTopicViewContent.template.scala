
package views.html.consumer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object consumedTopicViewContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object consumedTopicViewContent_Scope1 {
import b3.vertical.fieldConstructor

class consumedTopicViewContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,String,kafka.manager.model.ActorModel.ConsumedTopicState,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, consumer: String, topic: String, state: kafka.manager.model.ActorModel.ConsumedTopicState
)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/getTopicCoverage/*10.18*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.39*/("""
    """),_display_(/*11.6*/percentage/*11.16*/ match/*11.22*/ {/*12.9*/case i if i <=  99 =>/*12.30*/ {_display_(Seq[Any](format.raw/*12.32*/("""danger""")))}/*13.9*/case i =>/*13.18*/ {}}),format.raw/*14.6*/("""
""")))};def /*17.2*/ifPartitionNotOwned/*17.21*/(owner: Option[String]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.48*/("""
    """),_display_(/*18.6*/owner/*18.11*/ match/*18.17*/ {/*19.5*/case None =>/*19.17*/ {_display_(Seq[Any](format.raw/*19.19*/("""warning""")))}/*20.5*/case Some(a) =>/*20.20*/ {}}),format.raw/*21.6*/("""
""")))};
Seq[Any](format.raw/*7.45*/("""


"""),format.raw/*15.2*/("""

"""),format.raw/*22.2*/("""

"""),format.raw/*24.1*/("""<div class="row">
    <div class="col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Topic Summary</h4></div>
            <table class="table">
                <tbody>
                <tr>
                    <td>Total Lag</td>
                    <td>"""),_display_(/*32.26*/state/*32.31*/.totalLag.getOrElse(" ")),format.raw/*32.55*/("""</td>
                </tr>
                <tr>
                    <td>% of Partitions assigned to a consumer instance</td>
                    <td class=""""),_display_(/*36.33*/getTopicCoverage(state.percentageCovered)),format.raw/*36.74*/("""">"""),_display_(/*36.77*/state/*36.82*/.percentageCovered),format.raw/*36.100*/("""</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading"><h4><a href=""""),_display_(/*46.54*/routes/*46.60*/.Topic.topic(cluster,topic)),format.raw/*46.87*/("""">"""),_display_(/*46.90*/topic),format.raw/*46.95*/("""</a></h4></div>
            <table class="table">
                <thead>
                <tr><th>Partition</th><th>LogSize</th><th>Consumer Offset</th><th>Lag</th><th>Consumer Instance Owner</th></tr>
                </thead>
                <tbody>
                """),_display_(/*52.18*/for(tp:Int <- 0 until state.numPartitions) yield /*52.60*/ {_display_(Seq[Any](format.raw/*52.62*/("""
                """),format.raw/*53.17*/("""<tr>
                    <td>"""),_display_(/*54.26*/tp),format.raw/*54.28*/("""</td>
                    <td>"""),_display_(/*55.26*/state/*55.31*/.topicOffsets(tp).getOrElse(" ")),format.raw/*55.63*/("""</td>
                    <td>"""),_display_(/*56.26*/state/*56.31*/.partitionOffsets.get(tp)),format.raw/*56.56*/("""</td>
                    <td>"""),_display_(/*57.26*/state/*57.31*/.partitionLag(tp).getOrElse(" ")),format.raw/*57.63*/(""" """),format.raw/*57.64*/("""</td>
                    <td class=""""),_display_(/*58.33*/ifPartitionNotOwned(state.partitionOwners.get(tp))),format.raw/*58.83*/("""">"""),_display_(/*58.86*/state/*58.91*/.partitionOwners.get(tp).getOrElse("None")),format.raw/*58.133*/("""</td>
                </tr>
                """)))}),format.raw/*60.18*/("""
                """),format.raw/*61.17*/("""</tbody>
            </table>
        </div>
    </div>
</div>"""))
      }
    }
  }

  def render(cluster:String,consumer:String,topic:String,state:kafka.manager.model.ActorModel.ConsumedTopicState,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumer,topic,state)(messages)

  def f:((String,String,String,kafka.manager.model.ActorModel.ConsumedTopicState) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumer,topic,state) => (messages) => apply(cluster,consumer,topic,state)(messages)

  def ref: this.type = this

}


}
}

/**/
object consumedTopicViewContent extends consumedTopicViewContent_Scope0.consumedTopicViewContent_Scope1.consumedTopicViewContent
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/consumer/consumedTopicViewContent.scala.html
                  HASH: 5d2ae44d07790e992f2a82368d69b638c23788f4
                  MATRIX: 744->152|974->307|999->323|1097->344|1129->350|1148->360|1163->366|1173->377|1203->398|1243->400|1268->416|1286->425|1310->434|1335->439|1363->458|1467->485|1499->491|1513->496|1528->502|1538->509|1559->521|1599->523|1625->536|1649->551|1673->560|1714->303|1744->436|1773->562|1802->564|2127->862|2141->867|2186->891|2371->1049|2433->1090|2463->1093|2477->1098|2517->1116|2792->1364|2807->1370|2855->1397|2885->1400|2911->1405|3206->1673|3264->1715|3304->1717|3349->1734|3406->1764|3429->1766|3487->1797|3501->1802|3554->1834|3612->1865|3626->1870|3672->1895|3730->1926|3744->1931|3797->1963|3826->1964|3891->2002|3962->2052|3992->2055|4006->2060|4070->2102|4146->2147|4191->2164
                  LINES: 23->6|28->10|28->10|30->10|31->11|31->11|31->11|31->12|31->12|31->12|31->13|31->13|31->14|32->17|32->17|34->17|35->18|35->18|35->18|35->19|35->19|35->19|35->20|35->20|35->21|37->7|40->15|42->22|44->24|52->32|52->32|52->32|56->36|56->36|56->36|56->36|56->36|66->46|66->46|66->46|66->46|66->46|72->52|72->52|72->52|73->53|74->54|74->54|75->55|75->55|75->55|76->56|76->56|76->56|77->57|77->57|77->57|77->57|78->58|78->58|78->58|78->58|78->58|80->60|81->61
                  -- GENERATED --
              */
          