
package views.html.logkafka

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createLogkafka_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object createLogkafka_Scope1 {
import scalaz.{\/}

class createLogkafka extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateLogkafka], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, errorOrForm: kafka.manager.ApiError \/ (Form[models.form.CreateLogkafka], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import controllers.routes
def /*13.2*/theMenu/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),_display_(/*14.6*/views/*14.11*/.html.navigation.clusterMenu(cluster,"Logkafka","Create",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*15.115*/("""
""")))};def /*18.2*/renderForm/*18.12*/(createLogkafkaForm: Form[models.form.CreateLogkafka]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.70*/("""
"""),format.raw/*19.1*/("""<div class="panel-body">
    """),_display_(/*20.6*/b3/*20.8*/.form(routes.Logkafka.handleCreateLogkafka(cluster))/*20.60*/ {_display_(Seq[Any](format.raw/*20.62*/("""
    """),format.raw/*21.5*/("""<table class="table">
        <tbody>
        <tr>
            <td>
                """),_display_(/*25.18*/b3/*25.20*/.text(createLogkafkaForm("logkafka_id"), '_label -> "Logkafka Id", 'placeholder -> "test.logkafka.net", 'autofocus -> true )),format.raw/*25.144*/("""
                """),_display_(/*26.18*/b3/*26.20*/.text(createLogkafkaForm("log_path"), '_label -> "Log Path", 'placeholder -> "/usr/local/apache2/logs/access_log.%Y%m%d")),format.raw/*26.141*/("""
                """),_display_(/*27.18*/b3/*27.20*/.submit('class -> "submit-button btn btn-primary")/*27.70*/{_display_(Seq[Any](format.raw/*27.71*/(""" """),format.raw/*27.72*/("""Create """)))}),format.raw/*27.80*/("""
                """),format.raw/*28.17*/("""<a href=""""),_display_(/*28.27*/routes/*28.33*/.Logkafka.logkafkas(cluster)),format.raw/*28.61*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
            </td>
            <td>
                """),_display_(/*31.18*/helper/*31.24*/.repeat(createLogkafkaForm("configs"), min = 1)/*31.71*/ { configsForm =>_display_(Seq[Any](format.raw/*31.88*/("""
                    """),_display_(/*32.22*/b3/*32.24*/.hidden(configsForm("name").name, configsForm("name").value.getOrElse(""))),format.raw/*32.98*/("""
                    """),_display_(/*33.22*/b3/*33.24*/.text(configsForm("value"), '_label -> configsForm("name").value.getOrElse(""))),format.raw/*33.103*/("""
                """)))}),format.raw/*34.18*/("""
            """),format.raw/*35.13*/("""</td>
        </tr>
        </tbody>
    </table>
    """)))}),format.raw/*39.6*/("""
"""),format.raw/*40.1*/("""</div>
""")))};
Seq[Any](format.raw/*7.111*/("""

"""),format.raw/*12.1*/("""
"""),format.raw/*16.2*/("""
        
"""),format.raw/*41.2*/("""

"""),_display_(/*43.2*/main(
    "Create Logkafka",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Create Logkafka",cluster)))/*46.128*/ {_display_(Seq[Any](format.raw/*46.130*/("""
    """),format.raw/*47.5*/("""<div class="col-md-12 un-pad-me">
        <div class="panel panel-default">
            <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Create Logkafka</h3></div>
            """),_display_(/*50.14*/errorOrForm/*50.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*50.87*/("""
        """),format.raw/*51.9*/("""</div>
    </div>
""")))}),format.raw/*53.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateLogkafka], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrForm)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateLogkafka], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrForm) => (af,messages,menus) => apply(cluster,errorOrForm)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object createLogkafka extends createLogkafka_Scope0.createLogkafka_Scope1.createLogkafka
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/logkafka/createLogkafka.scala.html
                  HASH: 945fe9bbb0142c60d86f67ccfcdac0ec3b11b9aa
                  MATRIX: 806->135|1200->458|1215->465|1296->469|1328->475|1342->480|1564->680|1589->693|1608->703|1743->761|1771->762|1827->792|1837->794|1898->846|1938->848|1970->853|2082->938|2093->940|2239->1064|2284->1082|2295->1084|2438->1205|2483->1223|2494->1225|2553->1275|2592->1276|2621->1277|2660->1285|2705->1302|2742->1312|2757->1318|2806->1346|2950->1463|2965->1469|3021->1516|3076->1533|3125->1555|3136->1557|3231->1631|3280->1653|3291->1655|3392->1734|3441->1752|3482->1765|3567->1820|3595->1821|3643->373|3672->456|3700->682|3737->1829|3766->1832|3952->2008|3993->2010|4025->2015|4353->2316|4373->2327|4456->2389|4492->2398|4541->2417
                  LINES: 23->6|30->13|30->13|32->13|33->14|33->14|34->15|35->18|35->18|37->18|38->19|39->20|39->20|39->20|39->20|40->21|44->25|44->25|44->25|45->26|45->26|45->26|46->27|46->27|46->27|46->27|46->27|46->27|47->28|47->28|47->28|47->28|50->31|50->31|50->31|50->31|51->32|51->32|51->32|52->33|52->33|52->33|53->34|54->35|58->39|59->40|61->7|63->12|64->16|66->41|68->43|71->46|71->46|72->47|75->50|75->50|75->50|76->51|78->53
                  -- GENERATED --
              */
          