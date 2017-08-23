
package views.html.topic

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

class updateConfig extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateTopicConfig], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, topic: String, errorOrForm: kafka.manager.ApiError \/ (Form[models.form.UpdateTopicConfig], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import controllers.routes
def /*13.2*/theMenu/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),_display_(/*14.6*/views/*14.11*/.html.navigation.clusterMenu(cluster,"Topic","Update Config",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*15.115*/("""
""")))};def /*18.2*/renderForm/*18.12*/(updateTopicConfigForm: Form[models.form.UpdateTopicConfig]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.76*/("""
    """),_display_(/*19.6*/b3/*19.8*/.form(routes.Topic.handleUpdateConfig(cluster, topic))/*19.62*/ {_display_(Seq[Any](format.raw/*19.64*/("""
        """),format.raw/*20.9*/("""<table class="table">
            <thead>
            <tr><th>Update Config</th></tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        """),_display_(/*27.26*/b3/*27.28*/.text(updateTopicConfigForm("topic"), '_label -> "Topic", 'placeholder -> "", 'autofocus -> true )),format.raw/*27.126*/("""
                        """),_display_(/*28.26*/b3/*28.28*/.hidden(updateTopicConfigForm("readVersion").name,updateTopicConfigForm("readVersion").value.getOrElse(-1))),format.raw/*28.135*/("""
                        """),_display_(/*29.26*/helper/*29.32*/.repeat(updateTopicConfigForm("configs"), min = 1)/*29.82*/ { configsForm =>_display_(Seq[Any](format.raw/*29.99*/("""
                            """),_display_(/*30.30*/b3/*30.32*/.hidden(configsForm("name").name, configsForm("name").value.getOrElse(""))),format.raw/*30.106*/("""
                            """),_display_(/*31.30*/b3/*31.32*/.text(configsForm("value"), '_label -> configsForm("name").value.getOrElse(""))),format.raw/*31.111*/("""
                        """)))}),format.raw/*32.26*/("""
                    """),format.raw/*33.21*/("""</td>
                </tr>
            </tbody>
        </table>
        """),_display_(/*37.10*/b3/*37.12*/.submit('class -> "submit-button btn btn-primary")/*37.62*/{_display_(Seq[Any](format.raw/*37.63*/(""" """),format.raw/*37.64*/("""Update Config """)))}),format.raw/*37.79*/("""
        """),format.raw/*38.9*/("""<a href=""""),_display_(/*38.19*/routes/*38.25*/.Topic.topic(cluster,topic)),format.raw/*38.52*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
    """)))}),format.raw/*39.6*/("""
""")))};
Seq[Any](format.raw/*7.111*/("""

"""),format.raw/*12.1*/("""
"""),format.raw/*16.2*/("""
        
"""),format.raw/*40.2*/("""

"""),_display_(/*42.2*/main(
    "Update Config",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndClusterAndTopic("Topic View",cluster,topic,"Update Config")))/*45.158*/ {_display_(Seq[Any](format.raw/*45.160*/("""
    """),format.raw/*46.5*/("""<div class="col-md-6 un-pad-me">
        <div class="panel panel-default">
            <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Update Config</h3></div>
            <div class="panel-body">
                """),_display_(/*50.18*/errorOrForm/*50.29*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*50.91*/("""
            """),format.raw/*51.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*54.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,topic:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateTopicConfig], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,errorOrForm)(af,messages,menus)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateTopicConfig], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,errorOrForm) => (af,messages,menus) => apply(cluster,topic,errorOrForm)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object updateConfig extends updateConfig_Scope0.updateConfig_Scope1.updateConfig
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/updateConfig.scala.html
                  HASH: 9532bf2679c9d84de64b0f53e936411fc39ee534
                  MATRIX: 807->135|1219->476|1234->483|1315->487|1347->493|1361->498|1587->702|1612->715|1631->725|1772->789|1804->795|1814->797|1877->851|1917->853|1953->862|2178->1060|2189->1062|2309->1160|2362->1186|2373->1188|2502->1295|2555->1321|2570->1327|2629->1377|2684->1394|2741->1424|2752->1426|2848->1500|2905->1530|2916->1532|3017->1611|3074->1637|3123->1658|3225->1733|3236->1735|3295->1785|3334->1786|3363->1787|3409->1802|3445->1811|3482->1821|3497->1827|3545->1854|3645->1924|3687->391|3716->474|3744->704|3781->1926|3810->1929|4024->2133|4065->2135|4097->2140|4463->2479|4483->2490|4566->2552|4607->2565|4671->2599
                  LINES: 23->6|30->13|30->13|32->13|33->14|33->14|34->15|35->18|35->18|37->18|38->19|38->19|38->19|38->19|39->20|46->27|46->27|46->27|47->28|47->28|47->28|48->29|48->29|48->29|48->29|49->30|49->30|49->30|50->31|50->31|50->31|51->32|52->33|56->37|56->37|56->37|56->37|56->37|56->37|57->38|57->38|57->38|57->38|58->39|60->7|62->12|63->16|65->40|67->42|70->45|70->45|71->46|75->50|75->50|75->50|76->51|79->54
                  -- GENERATED --
              */
          