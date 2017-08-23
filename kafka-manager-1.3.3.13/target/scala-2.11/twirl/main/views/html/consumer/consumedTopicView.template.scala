
package views.html.consumer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object consumedTopicView_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object consumedTopicView_Scope1 {
import scalaz.{\/}

class consumedTopicView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,String,String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumedTopicState],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String,
  consumer: String,
  consumerType: String,
  topic: String,
  errorOrConsumedTopicState: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.ConsumedTopicState
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*13.2*/theMenu/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),_display_(/*14.6*/views/*14.11*/.html.navigation.clusterMenu(cluster,"Topic Consumption","",menus.clusterMenus(cluster)(
        errorOrConsumedTopicState.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*15.141*/("""
""")))};
Seq[Any](format.raw/*11.111*/("""

"""),format.raw/*16.2*/("""

"""),_display_(/*18.2*/main(
    "Consumed Topic View",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndClusterAndConsumerWithType("Consumer View",cluster,consumer,consumerType,topic)))/*21.178*/ {_display_(Seq[Any](format.raw/*21.180*/("""
"""),format.raw/*22.1*/("""<div class="col-md-12 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>"""),_display_(/*25.160*/consumer),format.raw/*25.168*/(""" """),format.raw/*25.169*/("""/ """),_display_(/*25.172*/topic),format.raw/*25.177*/("""</h3>
        </div>
        """),_display_(/*27.10*/errorOrConsumedTopicState/*27.35*/.fold(views.html.errors.onApiError(_),views.html.consumer.consumedTopicViewContent(cluster,consumer,topic,_))),format.raw/*27.144*/("""
    """),format.raw/*28.5*/("""</div>
</div>
""")))}),format.raw/*30.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,consumer:String,consumerType:String,topic:String,errorOrConsumedTopicState:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumedTopicState],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumer,consumerType,topic,errorOrConsumedTopicState)(af,messages,menus)

  def f:((String,String,String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumedTopicState]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumer,consumerType,topic,errorOrConsumedTopicState) => (af,messages,menus) => apply(cluster,consumer,consumerType,topic,errorOrConsumedTopicState)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object consumedTopicView extends consumedTopicView_Scope0.consumedTopicView_Scope1.consumedTopicView
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/consumer/consumedTopicView.scala.html
                  HASH: 4dfc2017c0691a8b53c8435744b6bd1fda673919
                  MATRIX: 803->135|1175->431|1190->438|1271->442|1303->448|1317->453|1568->682|1611->428|1640->684|1669->687|1909->917|1950->919|1978->920|2273->1187|2303->1195|2333->1196|2364->1199|2391->1204|2448->1234|2482->1259|2613->1368|2645->1373|2690->1388
                  LINES: 23->6|32->13|32->13|34->13|35->14|35->14|36->15|38->11|40->16|42->18|45->21|45->21|46->22|49->25|49->25|49->25|49->25|49->25|51->27|51->27|51->27|52->28|54->30
                  -- GENERATED --
              */
          