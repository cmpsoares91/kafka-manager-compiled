
package views.html.broker

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object brokerListContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object brokerListContent_Scope1 {
import kafka.manager.model.ActorModel.BrokerIdentity

class brokerListContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,kafka.manager.BrokerListExtended,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, brokerListExtended: kafka.manager.BrokerListExtended)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.115*/("""

            """),format.raw/*8.13*/("""<table class="table">
                <thead>
                <tr>
                    <td>Id</td>
                    <td>Host</td>
                    <td>Port</td>
                    <td>JMX Port</td>
                    <td>Bytes In</td>
                    <td>Bytes Out</td>
                    """),_display_(/*17.22*/if(brokerListExtended.clusterContext.config.jmxEnabled && brokerListExtended.clusterContext.config.displaySizeEnabled)/*17.140*/ {_display_(Seq[Any](format.raw/*17.142*/("""
                    """),format.raw/*18.21*/("""<td>Size</td>
                    """)))}),format.raw/*19.22*/("""
                """),format.raw/*20.17*/("""</tr>
                </thead>
                <tbody>
                """),_display_(/*23.18*/for(broker <- brokerListExtended.list) yield /*23.56*/ {_display_(Seq[Any](format.raw/*23.58*/("""
                """),format.raw/*24.17*/("""<tr>
                    <td><a href=""""),_display_(/*25.35*/routes/*25.41*/.Cluster.broker(cluster,broker.id.toInt)),format.raw/*25.81*/("""">"""),_display_(/*25.84*/broker/*25.90*/.id),format.raw/*25.93*/("""</a></td>
                    <td>"""),_display_(/*26.26*/broker/*26.32*/.host),format.raw/*26.37*/("""</td>
                    <td>"""),_display_(/*27.26*/broker/*27.32*/.endpointsString),format.raw/*27.48*/("""</td>
                    <td>"""),_display_(/*28.26*/broker/*28.32*/.jmxPort),format.raw/*28.40*/("""</td>
                    <td>
                        <span class="badge">
                            """),_display_(/*31.30*/brokerListExtended/*31.48*/.metrics.get(broker.id).map(_.bytesInPerSec.formatOneMinuteRate)),format.raw/*31.112*/("""
                        """),format.raw/*32.25*/("""</span>
                    </td>
                    <td>
                        <span class="badge">
                            """),_display_(/*36.30*/brokerListExtended/*36.48*/.metrics.get(broker.id).map(_.bytesOutPerSec.formatOneMinuteRate)),format.raw/*36.113*/("""
                        """),format.raw/*37.25*/("""</span>
                    </td>
                    """),_display_(/*39.22*/if(brokerListExtended.clusterContext.config.jmxEnabled && brokerListExtended.clusterContext.config.displaySizeEnabled)/*39.140*/ {_display_(Seq[Any](format.raw/*39.142*/("""
                    """),format.raw/*40.21*/("""<td>
                        <span class="badge">
                            """),_display_(/*42.30*/brokerListExtended/*42.48*/.metrics.get(broker.id).map(_.size.formatSize)),format.raw/*42.94*/("""
                        """),format.raw/*43.25*/("""</span>
                    </td>
                    """)))}),format.raw/*45.22*/("""
                """),format.raw/*46.17*/("""</tr>
                """)))}),format.raw/*47.18*/("""
                """),format.raw/*48.17*/("""</tbody>
            </table>

"""))
      }
    }
  }

  def render(cluster:String,brokerListExtended:kafka.manager.BrokerListExtended,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,brokerListExtended)(messages)

  def f:((String,kafka.manager.BrokerListExtended) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,brokerListExtended) => (messages) => apply(cluster,brokerListExtended)(messages)

  def ref: this.type = this

}


}
}

/**/
object brokerListContent extends brokerListContent_Scope0.brokerListContent_Scope1.brokerListContent
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/broker/brokerListContent.scala.html
                  HASH: 3578dedf490f103d4f67e5065072e5bbdb4678c7
                  MATRIX: 707->169|916->282|957->296|1287->599|1415->717|1456->719|1505->740|1571->775|1616->792|1715->864|1769->902|1809->904|1854->921|1920->960|1935->966|1996->1006|2026->1009|2041->1015|2065->1018|2127->1053|2142->1059|2168->1064|2226->1095|2241->1101|2278->1117|2336->1148|2351->1154|2380->1162|2512->1267|2539->1285|2625->1349|2678->1374|2838->1507|2865->1525|2952->1590|3005->1615|3087->1670|3215->1788|3256->1790|3305->1811|3411->1890|3438->1908|3505->1954|3558->1979|3644->2034|3689->2051|3743->2074|3788->2091
                  LINES: 23->6|28->6|30->8|39->17|39->17|39->17|40->18|41->19|42->20|45->23|45->23|45->23|46->24|47->25|47->25|47->25|47->25|47->25|47->25|48->26|48->26|48->26|49->27|49->27|49->27|50->28|50->28|50->28|53->31|53->31|53->31|54->32|58->36|58->36|58->36|59->37|61->39|61->39|61->39|62->40|64->42|64->42|64->42|65->43|67->45|68->46|69->47|70->48
                  -- GENERATED --
              */
          