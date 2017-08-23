
package views.html.consumer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object consumerView_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object consumerView_Scope1 {
import scalaz.{\/}

class consumerView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumerIdentity],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String,
  consumer: String,
  errorOrConsumerIdentity: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.ConsumerIdentity
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*11.2*/theMenu/*11.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.13*/("""
    """),_display_(/*12.6*/views/*12.11*/.html.navigation.clusterMenu(cluster,"Consumer","",menus.clusterMenus(cluster)(
        errorOrConsumerIdentity.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*13.139*/("""
""")))};
Seq[Any](format.raw/*9.111*/("""

"""),format.raw/*14.2*/("""

"""),_display_(/*16.2*/main(
    "Consumer View",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Consumer View",cluster,consumer)))/*19.140*/ {_display_(Seq[Any](format.raw/*19.142*/("""
"""),format.raw/*20.1*/("""<div class="col-md-12 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>"""),_display_(/*23.160*/consumer),format.raw/*23.168*/("""</h3>
        </div>
        """),_display_(/*25.10*/errorOrConsumerIdentity/*25.33*/.fold(views.html.errors.onApiError(_),views.html.consumer.consumerViewContent(cluster,consumer,_))),format.raw/*25.131*/("""
    """),format.raw/*26.5*/("""</div>
</div>
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,consumer:String,errorOrConsumerIdentity:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumerIdentity],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumer,errorOrConsumerIdentity)(af,messages,menus)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumerIdentity]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumer,errorOrConsumerIdentity) => (af,messages,menus) => apply(cluster,consumer,errorOrConsumerIdentity)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object consumerView extends consumerView_Scope0.consumerView_Scope1.consumerView
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/consumer/consumerView.scala.html
                  HASH: d489ca7484423450432987af0d19db21850a26ee
                  MATRIX: 772->135|1099->386|1114->393|1195->397|1227->403|1241->408|1481->626|1523->383|1552->628|1581->631|1777->817|1818->819|1846->820|2141->1087|2171->1095|2228->1125|2260->1148|2380->1246|2412->1251|2457->1266
                  LINES: 23->6|30->11|30->11|32->11|33->12|33->12|34->13|36->9|38->14|40->16|43->19|43->19|44->20|47->23|47->23|49->25|49->25|49->25|50->26|52->28
                  -- GENERATED --
              */
          