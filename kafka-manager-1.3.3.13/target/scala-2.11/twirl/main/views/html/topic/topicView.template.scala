
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object topicView_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object topicView_Scope1 {
import scalaz.{\/}
import kafka.manager.model.ActorModel.ConsumerType
import models.form.ReassignPartitionOperation

class topicView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],Option[Iterable[scala.Tuple2[String, ConsumerType]]],ReassignPartitionOperation,features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(cluster:String
, topic: String
, errorOrTopicIdentity: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.TopicIdentity
, optConsumerList: Option[Iterable[(String, ConsumerType)]]
, reassignPartitionOperation: ReassignPartitionOperation
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*15.2*/theMenu/*15.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.13*/("""
    """),_display_(/*16.6*/views/*16.11*/.html.navigation.clusterMenu(cluster,"Topic","",menus.clusterMenus(cluster)(
        errorOrTopicIdentity.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*17.136*/("""
""")))};
Seq[Any](format.raw/*13.111*/("""

"""),format.raw/*18.2*/("""

"""),_display_(/*20.2*/main(
    "Topic View",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Topic View",cluster,topic)))/*23.134*/ {_display_(Seq[Any](format.raw/*23.136*/("""
"""),format.raw/*24.1*/("""<div class="col-md-12 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>"""),_display_(/*27.160*/topic),format.raw/*27.165*/("""</h3>
        </div>
        """),_display_(/*29.10*/errorOrTopicIdentity/*29.30*/.fold(views.html.errors.onApiError(_),views.html.topic.topicViewContent(cluster,topic,_,optConsumerList.getOrElse(Iterable.empty[(String, ConsumerType)]), reassignPartitionOperation))),format.raw/*29.213*/("""
    """),format.raw/*30.5*/("""</div>
</div>
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,topic:String,errorOrTopicIdentity:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],optConsumerList:Option[Iterable[scala.Tuple2[String, ConsumerType]]],reassignPartitionOperation:ReassignPartitionOperation,af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,errorOrTopicIdentity,optConsumerList,reassignPartitionOperation)(af,messages,menus)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],Option[Iterable[scala.Tuple2[String, ConsumerType]]],ReassignPartitionOperation) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,errorOrTopicIdentity,optConsumerList,reassignPartitionOperation) => (af,messages,menus) => apply(cluster,topic,errorOrTopicIdentity,optConsumerList,reassignPartitionOperation)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object topicView extends topicView_Scope0.topicView_Scope1.topicView
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/topicView.scala.html
                  HASH: 6536a65a5037ffc123752c9501226c66655f8195
                  MATRIX: 934->234|1367->591|1382->598|1463->602|1495->608|1509->613|1743->825|1786->588|1815->827|1844->830|2031->1007|2072->1009|2100->1010|2395->1277|2422->1282|2479->1312|2508->1332|2713->1515|2745->1520|2790->1535
                  LINES: 25->8|34->15|34->15|36->15|37->16|37->16|38->17|40->13|42->18|44->20|47->23|47->23|48->24|51->27|51->27|53->29|53->29|53->29|54->30|56->32
                  -- GENERATED --
              */
          