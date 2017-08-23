
package views.html.logkafka

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateConfig_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object updateConfig_Scope1 {
import scalaz.{\/}

class updateConfig extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateLogkafkaConfig], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, logkafka_id: String, log_path: String,
errorOrForm: kafka.manager.ApiError \/ (Form[models.form.UpdateLogkafkaConfig], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import controllers.routes
def /*14.2*/theMenu/*14.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.13*/("""
    """),_display_(/*15.6*/views/*15.11*/.html.navigation.clusterMenu(cluster,"Logkafka","Update Config",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*16.115*/("""
""")))};def /*19.2*/renderForm/*19.12*/(updateLogkafkaConfigForm: Form[models.form.UpdateLogkafkaConfig]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.82*/("""
    """),_display_(/*20.6*/b3/*20.8*/.form(routes.Logkafka.handleUpdateConfig(cluster, logkafka_id, log_path))/*20.81*/ {_display_(Seq[Any](format.raw/*20.83*/("""
        """),format.raw/*21.9*/("""<table class="table">
            <thead>
            <tr><th>Update Config</th></tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        """),_display_(/*28.26*/b3/*28.28*/.text(updateLogkafkaConfigForm("logkafka_id"), '_label -> "Logkafka Id", 'placeholder -> "", 'autofocus -> true )),format.raw/*28.141*/("""
                        """),_display_(/*29.26*/b3/*29.28*/.text(updateLogkafkaConfigForm("log_path"), '_label -> "Log Path", 'placeholder -> "", 'autofocus -> true )),format.raw/*29.135*/("""
                        """),_display_(/*30.26*/helper/*30.32*/.repeat(updateLogkafkaConfigForm("configs"), min = 1)/*30.85*/ { configsForm =>_display_(Seq[Any](format.raw/*30.102*/("""
                            """),_display_(/*31.30*/b3/*31.32*/.hidden(configsForm("name").name, configsForm("name").value.getOrElse(""))),format.raw/*31.106*/("""
                            """),_display_(/*32.30*/b3/*32.32*/.text(configsForm("value"), '_label -> configsForm("name").value.getOrElse(""))),format.raw/*32.111*/("""
                        """)))}),format.raw/*33.26*/("""
                    """),format.raw/*34.21*/("""</td>
                </tr>
            </tbody>
        </table>
        """),_display_(/*38.10*/b3/*38.12*/.submit('class -> "submit-button btn btn-primary")/*38.62*/{_display_(Seq[Any](format.raw/*38.63*/(""" """),format.raw/*38.64*/("""Update Config """)))}),format.raw/*38.79*/("""
        """),format.raw/*39.9*/("""<a href=""""),_display_(/*39.19*/routes/*39.25*/.Logkafka.logkafka(cluster,logkafka_id,log_path)),format.raw/*39.73*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
    """)))}),format.raw/*40.6*/("""
""")))};
Seq[Any](format.raw/*8.111*/("""

"""),format.raw/*13.1*/("""
"""),format.raw/*17.2*/("""
        
"""),format.raw/*41.2*/("""

"""),_display_(/*43.2*/main(
    "Update Config",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndClusterAndLogkafka("Logkafka View",cluster,logkafka_id,log_path,"Update Config")))/*46.179*/ {_display_(Seq[Any](format.raw/*46.181*/("""
    """),format.raw/*47.5*/("""<div class="col-md-6 un-pad-me">
        <div class="panel panel-default">
            <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Update Config</h3></div>
            <div class="panel-body">
                """),_display_(/*51.18*/errorOrForm/*51.29*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*51.91*/("""
            """),format.raw/*52.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*55.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,logkafka_id:String,log_path:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateLogkafkaConfig], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,logkafka_id,log_path,errorOrForm)(af,messages,menus)

  def f:((String,String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateLogkafkaConfig], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,logkafka_id,log_path,errorOrForm) => (af,messages,menus) => apply(cluster,logkafka_id,log_path,errorOrForm)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object updateConfig extends updateConfig_Scope0.updateConfig_Scope1.updateConfig
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/logkafka/updateConfig.scala.html
                  HASH: 84211a145777307f29d0c11b5db244d90bc1f697
                  MATRIX: 820->135|1259->503|1274->510|1355->514|1387->520|1401->525|1630->732|1655->745|1674->755|1821->825|1853->831|1863->833|1945->906|1985->908|2021->917|2246->1115|2257->1117|2392->1230|2445->1256|2456->1258|2585->1365|2638->1391|2653->1397|2715->1450|2771->1467|2828->1497|2839->1499|2935->1573|2992->1603|3003->1605|3104->1684|3161->1710|3210->1731|3312->1806|3323->1808|3382->1858|3421->1859|3450->1860|3496->1875|3532->1884|3569->1894|3584->1900|3653->1948|3753->2018|3795->418|3824->501|3852->734|3889->2020|3918->2023|4153->2248|4194->2250|4226->2255|4592->2594|4612->2605|4695->2667|4736->2680|4800->2714
                  LINES: 23->6|31->14|31->14|33->14|34->15|34->15|35->16|36->19|36->19|38->19|39->20|39->20|39->20|39->20|40->21|47->28|47->28|47->28|48->29|48->29|48->29|49->30|49->30|49->30|49->30|50->31|50->31|50->31|51->32|51->32|51->32|52->33|53->34|57->38|57->38|57->38|57->38|57->38|57->38|58->39|58->39|58->39|58->39|59->40|61->8|63->13|64->17|66->41|68->43|71->46|71->46|72->47|76->51|76->51|76->51|77->52|80->55
                  -- GENERATED --
              */
          