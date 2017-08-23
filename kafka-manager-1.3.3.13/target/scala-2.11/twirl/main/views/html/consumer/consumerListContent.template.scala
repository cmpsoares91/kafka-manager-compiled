
package views.html.consumer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object consumerListContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object consumerListContent_Scope1 {
import kafka.manager.model.ActorModel.ConsumerType
import kafka.manager.model.ActorModel.ConsumerIdentity
import kafka.manager.model.ClusterContext

class consumerListContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, ConsumerType], Option[ConsumerIdentity]]],ClusterContext,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(cluster: String, consumers: IndexedSeq[((String, ConsumerType), Option[ConsumerIdentity])],
        clusterContext: ClusterContext)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*11.2*/getConsumedTopicSummary/*11.25*/(state: kafka.manager.model.ActorModel.ConsumedTopicState):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.87*/("""
    """),_display_(/*12.6*/state/*12.11*/.percentageCovered/*12.29*/ match/*12.35*/ {/*13.9*/case i if i <=  99 =>/*13.30*/ {_display_(Seq[Any](format.raw/*13.32*/("""
            """),format.raw/*14.13*/("""<span style="background-color: #F2DEDE">
                ("""),_display_(/*15.19*/state/*15.24*/.percentageCovered),format.raw/*15.42*/("""% coverage, """),_display_(/*15.55*/state/*15.60*/.totalLag.getOrElse("Lag unavailable")),format.raw/*15.98*/(""" """),format.raw/*15.99*/("""lag)
            </span>
        """)))}/*18.9*/case i =>/*18.18*/ {_display_(Seq[Any](format.raw/*18.20*/("""("""),_display_(/*18.22*/state/*18.27*/.percentageCovered),format.raw/*18.45*/("""% coverage, """),_display_(/*18.58*/state/*18.63*/.totalLag.getOrElse("Lag unavailable")),format.raw/*18.101*/(""" """),format.raw/*18.102*/("""lag)""")))}}),format.raw/*19.6*/("""
""")))};
Seq[Any](format.raw/*9.83*/("""

"""),format.raw/*20.2*/("""
    """),format.raw/*21.5*/("""<table class="table" id="consumer-table">
        <thead>
        <tr><th>Consumer</th>
            <th>Type</th>
            """),_display_(/*25.14*/if(clusterContext.config.pollConsumers)/*25.53*/ {_display_(Seq[Any](format.raw/*25.55*/("""
            """),format.raw/*26.13*/("""<th>Topics it consumes from</th>
            """)))}),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</tr>
        </thead>
        <tbody>
        """),_display_(/*31.10*/for( ((consumer, consumerType), consumerIdentityOpt) <- consumers) yield /*31.76*/ {_display_(Seq[Any](format.raw/*31.78*/("""
            """),format.raw/*32.13*/("""<tr>
                <td><a href=""""),_display_(/*33.31*/routes/*33.37*/.Consumer.consumer(cluster,consumer,consumerType.toString)),format.raw/*33.95*/("""">"""),_display_(/*33.98*/consumer),format.raw/*33.106*/("""</a></td>
                <td>"""),_display_(/*34.22*/consumerType/*34.34*/.toString),format.raw/*34.43*/("""</td>
                """),_display_(/*35.18*/if(clusterContext.config.pollConsumers)/*35.57*/ {_display_(Seq[Any](format.raw/*35.59*/("""
                """),format.raw/*36.17*/("""<td>
                    """),_display_(/*37.22*/consumerIdentityOpt/*37.41*/.fold/*37.46*/{_display_(Seq[Any](format.raw/*37.47*/("""
                        """),format.raw/*38.25*/("""No details available for this consumer at this time
                    """)))}/*39.22*/{ a:kafka.manager.model.ActorModel.ConsumerIdentity =>_display_(Seq[Any](format.raw/*39.76*/("""
                        """),_display_(/*40.26*/for((topic: String, state: kafka.manager.model.ActorModel.ConsumedTopicState) <- a.topicMap) yield /*40.118*/ {_display_(Seq[Any](format.raw/*40.120*/("""
                            """),format.raw/*41.29*/("""<a href=""""),_display_(/*41.39*/routes/*41.45*/.Consumer.consumerAndTopic(cluster,consumer,topic,consumerType.toString)),format.raw/*41.117*/("""">"""),_display_(/*41.120*/topic),format.raw/*41.125*/("""</a>:
                            """),_display_(/*42.30*/getConsumedTopicSummary(state)),format.raw/*42.60*/(""" """),format.raw/*42.61*/("""<br>
                        """)))}),format.raw/*43.26*/("""
                    """)))}),format.raw/*44.22*/("""
                """),format.raw/*45.17*/("""</td>
                """)))}),format.raw/*46.18*/("""
            """),format.raw/*47.13*/("""</tr>
        """)))}),format.raw/*48.10*/("""
        """),format.raw/*49.9*/("""</tbody>
    </table>
"""))
      }
    }
  }

  def render(cluster:String,consumers:IndexedSeq[scala.Tuple2[scala.Tuple2[String, ConsumerType], Option[ConsumerIdentity]]],clusterContext:ClusterContext,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumers,clusterContext)(messages)

  def f:((String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, ConsumerType], Option[ConsumerIdentity]]],ClusterContext) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumers,clusterContext) => (messages) => apply(cluster,consumers,clusterContext)(messages)

  def ref: this.type = this

}


}
}

/**/
object consumerListContent extends consumerListContent_Scope0.consumerListContent_Scope1.consumerListContent
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/consumer/consumerListContent.scala.html
                  HASH: 60f82ccabeee4926ddb3b0bccfdbc6a79d68b56a
                  MATRIX: 879->266|1133->444|1165->467|1304->529|1336->535|1350->540|1377->558|1392->564|1402->575|1432->596|1472->598|1513->611|1599->670|1613->675|1652->693|1692->706|1706->711|1765->749|1794->750|1846->793|1864->802|1904->804|1933->806|1947->811|1986->829|2026->842|2040->847|2100->885|2130->886|2166->897|2207->441|2236->899|2268->904|2422->1031|2470->1070|2510->1072|2551->1085|2628->1131|2664->1140|2739->1188|2821->1254|2861->1256|2902->1269|2964->1304|2979->1310|3058->1368|3088->1371|3118->1379|3176->1410|3197->1422|3227->1431|3277->1454|3325->1493|3365->1495|3410->1512|3463->1538|3491->1557|3505->1562|3544->1563|3597->1588|3689->1661|3781->1715|3834->1741|3943->1833|3984->1835|4041->1864|4078->1874|4093->1880|4187->1952|4218->1955|4245->1960|4307->1995|4358->2025|4387->2026|4448->2056|4501->2078|4546->2095|4600->2118|4641->2131|4687->2146|4723->2155
                  LINES: 25->8|30->11|30->11|32->11|33->12|33->12|33->12|33->12|33->13|33->13|33->13|34->14|35->15|35->15|35->15|35->15|35->15|35->15|35->15|37->18|37->18|37->18|37->18|37->18|37->18|37->18|37->18|37->18|37->18|37->19|39->9|41->20|42->21|46->25|46->25|46->25|47->26|48->27|49->28|52->31|52->31|52->31|53->32|54->33|54->33|54->33|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|57->36|58->37|58->37|58->37|58->37|59->38|60->39|60->39|61->40|61->40|61->40|62->41|62->41|62->41|62->41|62->41|62->41|63->42|63->42|63->42|64->43|65->44|66->45|67->46|68->47|69->48|70->49
                  -- GENERATED --
              */
          