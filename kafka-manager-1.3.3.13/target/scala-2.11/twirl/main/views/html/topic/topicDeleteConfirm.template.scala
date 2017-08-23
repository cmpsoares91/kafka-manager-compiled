
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object topicDeleteConfirm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object topicDeleteConfirm_Scope1 {
import b3.vertical.fieldConstructor
import scalaz.{\/}
import kafka.manager.model.ActorModel.ConsumerType

class topicDeleteConfirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],Option[Iterable[scala.Tuple2[String, ConsumerType]]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(cluster:String,
  topic: String,
  errorOrTopicIdentity: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.TopicIdentity,
  optConsumerList: Option[Iterable[(String, ConsumerType)]]
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*14.2*/theMenu/*14.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.13*/("""
    """),_display_(/*15.6*/views/*15.11*/.html.navigation.clusterMenu(cluster,"Topic","",menus.clusterMenus(cluster)(
        errorOrTopicIdentity.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*16.136*/("""
""")))};
Seq[Any](format.raw/*12.111*/("""

"""),format.raw/*17.2*/("""

"""),_display_(/*19.2*/main(
    "Topic Delete Confirm",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Topic Delete Confirm",cluster,topic)))/*22.144*/ {_display_(Seq[Any](format.raw/*22.146*/("""
"""),format.raw/*23.1*/("""<div class="col-md-12 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>"""),_display_(/*26.160*/topic),format.raw/*26.165*/("""</h3>
        </div>
        <h3>Are you sure you want to delete """),_display_(/*28.46*/topic),format.raw/*28.51*/("""?</h3></br></br>
        <div class="row">
            <div class="col-md-3"><button type="button" class="btn btn-primary btn-block" onclick="goBack()">No</button></div>
            <div class="col-md-2">
                """),_display_(/*32.18*/b3/*32.20*/.form(routes.Topic.handleDeleteTopic(cluster, topic))/*32.73*/ {_display_(Seq[Any](format.raw/*32.75*/("""
                    """),format.raw/*33.21*/("""<fieldset>
                        """),_display_(/*34.26*/b3/*34.28*/.hidden("topic",topic)),format.raw/*34.50*/("""
                        """),_display_(/*35.26*/b3/*35.28*/.submit('class -> "btn btn-primary btn-block")/*35.74*/{_display_(Seq[Any](format.raw/*35.75*/(""" """),format.raw/*35.76*/("""Delete Topic """)))}),format.raw/*35.90*/("""
                    """),format.raw/*36.21*/("""</fieldset>
                """)))}),format.raw/*37.18*/("""
            """),format.raw/*38.13*/("""</div>
        </div>
    </div>
</div>
""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,topic:String,errorOrTopicIdentity:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],optConsumerList:Option[Iterable[scala.Tuple2[String, ConsumerType]]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,errorOrTopicIdentity,optConsumerList)(af,messages,menus)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],Option[Iterable[scala.Tuple2[String, ConsumerType]]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,errorOrTopicIdentity,optConsumerList) => (af,messages,menus) => apply(cluster,topic,errorOrTopicIdentity,optConsumerList)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object topicDeleteConfirm extends topicDeleteConfirm_Scope0.topicDeleteConfirm_Scope1.topicDeleteConfirm
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/topicDeleteConfirm.scala.html
                  HASH: 3f20a3a5c28abb49816cc74cfe15dbd4b5179f60
                  MATRIX: 924->224|1303->527|1318->534|1399->538|1431->544|1445->549|1679->761|1722->524|1751->763|1780->766|1987->963|2028->965|2056->966|2351->1233|2378->1238|2471->1304|2497->1309|2746->1531|2757->1533|2819->1586|2859->1588|2908->1609|2971->1645|2982->1647|3025->1669|3078->1695|3089->1697|3144->1743|3183->1744|3212->1745|3257->1759|3306->1780|3366->1809|3407->1822|3478->1863
                  LINES: 25->8|33->14|33->14|35->14|36->15|36->15|37->16|39->12|41->17|43->19|46->22|46->22|47->23|50->26|50->26|52->28|52->28|56->32|56->32|56->32|56->32|57->33|58->34|58->34|58->34|59->35|59->35|59->35|59->35|59->35|59->35|60->36|61->37|62->38|66->42
                  -- GENERATED --
              */
          