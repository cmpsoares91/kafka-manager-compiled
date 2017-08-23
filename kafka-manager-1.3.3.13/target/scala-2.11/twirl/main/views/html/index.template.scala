
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object index_Scope1 {
import scalaz.{\/}

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.KMClusterList],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(errorOrClusters: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.KMClusterList
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.111*/("""

"""),_display_(/*9.2*/main(
    "Kafka Manager",
    views.html.navigation.defaultMenu(views.html.navigation.menuNav("Cluster","List",menus.indexMenu)),
    views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withView("Clusters")))/*12.91*/ {_display_(Seq[Any](format.raw/*12.93*/("""
"""),format.raw/*13.1*/("""<div class="col-md-6 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading"><h3>Clusters</h3></div>
        """),_display_(/*16.10*/errorOrClusters/*16.25*/.fold(views.html.errors.onApiError(_), cl => {
            views.html.cluster.clusterList(cl.active)
        })),format.raw/*18.11*/("""
        """),_display_(/*19.10*/errorOrClusters/*19.25*/.fold( _ => Html(""), cl => {
            views.html.cluster.pendingClusterList(cl.pending)
        })),format.raw/*21.11*/("""
    """),format.raw/*22.5*/("""</div>
</div>
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(errorOrClusters:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.KMClusterList],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(errorOrClusters)(af,messages,menus)

  def f:(($bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.KMClusterList]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (errorOrClusters) => (af,messages,menus) => apply(errorOrClusters)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/index.scala.html
                  HASH: 2bb3af495754b29e2e12d87e6f78e88e2ca2cb56
                  MATRIX: 725->135|1020->334|1048->337|1278->558|1318->560|1346->561|1512->700|1536->715|1668->826|1705->836|1729->851|1852->953|1884->958|1929->973
                  LINES: 23->6|29->7|31->9|34->12|34->12|35->13|38->16|38->16|40->18|41->19|41->19|43->21|44->22|46->24
                  -- GENERATED --
              */
          