
package views.html.logkafka

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logkafkaViewContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object logkafkaViewContent_Scope1 {
import b3.vertical.fieldConstructor

class logkafkaViewContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,String,kafka.manager.model.ActorModel.LogkafkaIdentity,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, logkafka_id: String, log_path: String, logkafkaIdentity: kafka.manager.model.ActorModel.LogkafkaIdentity
)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.45*/("""

"""),format.raw/*9.1*/("""<div class="row">
    <div class="col-md-8">
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Logkafka Summary</h4></div>
            <table class="table">
                <tbody>
                <tr>
                    <td>Logkafka Id</td>
                    <td>"""),_display_(/*17.26*/logkafka_id),format.raw/*17.37*/("""</td>
                <tr>
                    <td>Log Path</td>
                    <td>"""),_display_(/*20.26*/log_path),format.raw/*20.34*/("""</td>
                </tr>
                </tbody>
            </table>
            """),_display_(/*24.14*/if(!logkafkaIdentity.identityMap.isEmpty && !logkafkaIdentity.identityMap.get(log_path).isEmpty)/*24.110*/ {_display_(Seq[Any](format.raw/*24.112*/("""
              """),_display_(/*25.16*/defining(logkafkaIdentity.identityMap.get(log_path).get)/*25.72*/ { identityTuple =>_display_(Seq[Any](format.raw/*25.91*/("""
                """),_display_(/*26.18*/if(identityTuple._1.isDefined)/*26.48*/ {_display_(Seq[Any](format.raw/*26.50*/("""
                """),format.raw/*27.17*/("""<table class="table">
                    <thead>
                    <th>Config</th><th>Value</th>
                    </thead>
                    <tbody>
                    """),_display_(/*32.22*/identityTuple/*32.35*/._1.map/*32.42*/ { config =>_display_(Seq[Any](format.raw/*32.54*/("""
                        """),_display_(/*33.26*/for((k, v) <- config) yield /*33.47*/ {_display_(Seq[Any](format.raw/*33.49*/("""
                            """),format.raw/*34.29*/("""<tr>
                                <td>"""),_display_(/*35.38*/k),format.raw/*35.39*/("""</td>
                                <td>"""),_display_(/*36.38*/v),format.raw/*36.39*/("""</td>
                            </tr>
                        """)))}),format.raw/*38.26*/("""
                    """)))}),format.raw/*39.22*/("""
                    """),format.raw/*40.21*/("""</tbody>
                </table>
                """)))}),format.raw/*42.18*/("""
              """)))}),format.raw/*43.16*/("""
            """)))}),format.raw/*44.14*/("""
        """),format.raw/*45.9*/("""</div>
    </div>
    <div class="col-md-4">
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Operations</h4></div>
            <table class="table">
                <tbody>
                <tr>
                    <td>
                        """),_display_(/*54.26*/b3/*54.28*/.form(routes.Logkafka.handleDeleteLogkafka(cluster, logkafka_id, log_path))/*54.103*/ {_display_(Seq[Any](format.raw/*54.105*/("""
                        """),format.raw/*55.25*/("""<fieldset>
                            """),_display_(/*56.30*/b3/*56.32*/.hidden("logkafka_id", logkafka_id)),format.raw/*56.67*/("""
                            """),_display_(/*57.30*/b3/*57.32*/.hidden("log_path", log_path)),format.raw/*57.61*/("""
                            """),_display_(/*58.30*/b3/*58.32*/.submit('class -> "submit-button btn btn-primary")/*58.82*/{_display_(Seq[Any](format.raw/*58.83*/(""" """),format.raw/*58.84*/("""Delete Logkafka """)))}),format.raw/*58.101*/("""
                        """),format.raw/*59.25*/("""</fieldset>
                        """)))}),format.raw/*60.26*/("""
                    """),format.raw/*61.21*/("""</td>
                </tr>
                <tr>
                    <td>
                        <a href=""""),_display_(/*65.35*/routes/*65.41*/.Logkafka.updateConfig(cluster,logkafka_id,log_path)),format.raw/*65.93*/("""" class="submit-button btn btn-primary" role="button">Update Config</a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
"""))
      }
    }
  }

  def render(cluster:String,logkafka_id:String,log_path:String,logkafkaIdentity:kafka.manager.model.ActorModel.LogkafkaIdentity,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,logkafka_id,log_path,logkafkaIdentity)(messages)

  def f:((String,String,String,kafka.manager.model.ActorModel.LogkafkaIdentity) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,logkafka_id,log_path,logkafkaIdentity) => (messages) => apply(cluster,logkafka_id,log_path,logkafkaIdentity)(messages)

  def ref: this.type = this

}


}
}

/**/
object logkafkaViewContent extends logkafkaViewContent_Scope0.logkafkaViewContent_Scope1.logkafkaViewContent
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/logkafka/logkafkaViewContent.scala.html
                  HASH: 7e55c9a5cb4f4198633d602446c90fac5413d3a2
                  MATRIX: 727->152|988->318|1016->320|1346->623|1378->634|1495->724|1524->732|1638->819|1744->915|1785->917|1828->933|1893->989|1950->1008|1995->1026|2034->1056|2074->1058|2119->1075|2324->1253|2346->1266|2362->1273|2412->1285|2465->1311|2502->1332|2542->1334|2599->1363|2668->1405|2690->1406|2760->1449|2782->1450|2878->1515|2931->1537|2980->1558|3062->1609|3109->1625|3154->1639|3190->1648|3498->1929|3509->1931|3594->2006|3635->2008|3688->2033|3755->2073|3766->2075|3822->2110|3879->2140|3890->2142|3940->2171|3997->2201|4008->2203|4067->2253|4106->2254|4135->2255|4184->2272|4237->2297|4305->2334|4354->2355|4489->2463|4504->2469|4577->2521
                  LINES: 23->6|29->7|31->9|39->17|39->17|42->20|42->20|46->24|46->24|46->24|47->25|47->25|47->25|48->26|48->26|48->26|49->27|54->32|54->32|54->32|54->32|55->33|55->33|55->33|56->34|57->35|57->35|58->36|58->36|60->38|61->39|62->40|64->42|65->43|66->44|67->45|76->54|76->54|76->54|76->54|77->55|78->56|78->56|78->56|79->57|79->57|79->57|80->58|80->58|80->58|80->58|80->58|80->58|81->59|82->60|83->61|87->65|87->65|87->65
                  -- GENERATED --
              */
          