
package views.html.cluster

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object clusterView_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object clusterView_Scope1 {
import scalaz.{\/}

class clusterView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.CMView],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, errorOrClusterView: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.CMView
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.clusterMenu(cluster,"Cluster","Summary",menus.clusterMenus(cluster)(
        errorOrClusterView.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.134*/("""
""")))};
Seq[Any](format.raw/*7.111*/("""

"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/main(
    "Kafka Manager",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Summary",cluster)))/*17.120*/ {_display_(Seq[Any](format.raw/*17.122*/("""
"""),format.raw/*18.1*/("""<div class="col-md-6 un-pad-me">
    """),_display_(/*19.6*/errorOrClusterView/*19.24*/.fold(views.html.errors.onApiError(_),views.html.cluster.clusterViewContent(cluster,_))),format.raw/*19.111*/("""
"""),format.raw/*20.1*/("""</div>
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrClusterView:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.CMView],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrClusterView)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.CMView]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrClusterView) => (af,messages,menus) => apply(cluster,errorOrClusterView)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object clusterView extends clusterView_Scope0.clusterView_Scope1.clusterView
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/cluster/clusterView.scala.html
                  HASH: bed3c03c894fd7ff0e80c4fd58445ad9ba9d383e
                  MATRIX: 751->135|1041->350|1055->357|1135->361|1167->367|1181->372|1422->591|1464->347|1493->593|1522->596|1698->762|1739->764|1767->765|1831->803|1858->821|1967->908|1995->909|2033->917
                  LINES: 23->6|28->9|28->9|30->9|31->10|31->10|32->11|34->7|36->12|38->14|41->17|41->17|42->18|43->19|43->19|43->19|44->20|45->21
                  -- GENERATED --
              */
          