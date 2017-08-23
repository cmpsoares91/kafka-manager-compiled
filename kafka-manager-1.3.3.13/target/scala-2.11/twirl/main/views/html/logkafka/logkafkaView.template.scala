
package views.html.logkafka

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logkafkaView_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object logkafkaView_Scope1 {
import scalaz.{\/}

class logkafkaView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.model.ActorModel.LogkafkaIdentity, kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String,
  logkafka_id: String,
  log_path: String,
  errorOrLogkafkaIdentity: kafka.manager.ApiError \/ (kafka.manager.model.ActorModel.LogkafkaIdentity, kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*12.2*/theMenu/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),_display_(/*13.6*/views/*13.11*/.html.navigation.clusterMenu(cluster,"Logkafka","",menus.clusterMenus(cluster)(
        errorOrLogkafkaIdentity.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*14.127*/("""
""")))};
Seq[Any](format.raw/*10.111*/("""

"""),format.raw/*15.2*/("""

"""),_display_(/*17.2*/main(
    "Logkafka View",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Logkafka View",cluster,logkafka_id)))/*20.143*/ {_display_(Seq[Any](format.raw/*20.145*/("""
"""),format.raw/*21.1*/("""<div class="col-md-12 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>"""),_display_(/*24.160*/logkafka_id),format.raw/*24.171*/("""<br/>"""),_display_(/*24.177*/log_path),format.raw/*24.185*/("""</h3>
        </div>
        """),_display_(/*26.10*/errorOrLogkafkaIdentity/*26.33*/.fold(views.html.errors.onApiError(_), t => views.html.logkafka.logkafkaViewContent(cluster,logkafka_id,log_path,t._1))),format.raw/*26.152*/("""
    """),format.raw/*27.5*/("""</div>
</div>
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,logkafka_id:String,log_path:String,errorOrLogkafkaIdentity:$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.model.ActorModel.LogkafkaIdentity, kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,logkafka_id,log_path,errorOrLogkafkaIdentity)(af,messages,menus)

  def f:((String,String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.model.ActorModel.LogkafkaIdentity, kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,logkafka_id,log_path,errorOrLogkafkaIdentity) => (af,messages,menus) => apply(cluster,logkafka_id,log_path,errorOrLogkafkaIdentity)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object logkafkaView extends logkafkaView_Scope0.logkafkaView_Scope1.logkafkaView
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/logkafka/logkafkaView.scala.html
                  HASH: 6e09cba3b3f3b84266d603e065656ed7ee221da5
                  MATRIX: 829->135|1217->447|1232->454|1313->458|1345->464|1359->469|1587->675|1630->444|1659->677|1688->680|1887->869|1928->871|1956->872|2251->1139|2284->1150|2318->1156|2348->1164|2405->1194|2437->1217|2578->1336|2610->1341|2655->1356
                  LINES: 23->6|31->12|31->12|33->12|34->13|34->13|35->14|37->10|39->15|41->17|44->20|44->20|45->21|48->24|48->24|48->24|48->24|50->26|50->26|50->26|51->27|53->29
                  -- GENERATED --
              */
          