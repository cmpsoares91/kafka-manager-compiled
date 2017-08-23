
package views.html.consumer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object consumerList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object consumerList_Scope1 {
import scalaz.{\/}

class consumerList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, kafka.manager.ConsumerListExtended],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, errorOrConsumers: kafka.manager.ApiError \/ kafka.manager.ConsumerListExtended
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.clusterMenu(cluster,"Consumer","List",menus.clusterMenus(cluster)(
        errorOrConsumers.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.132*/("""
""")))};def /*14.2*/consumerScripts/*14.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.21*/("""
    """),format.raw/*15.5*/("""<script ype="text/javascript">
    $(document).ready(function() """),format.raw/*16.34*/("""{"""),format.raw/*16.35*/("""
        """),format.raw/*17.9*/("""$('#consumer-table').DataTable(
                """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/("""
                    """),format.raw/*19.21*/(""""lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]]
                """),format.raw/*20.17*/("""}"""),format.raw/*20.18*/("""
        """),format.raw/*21.9*/(""");
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""" """),format.raw/*22.7*/(""");
    </script>
""")))};
Seq[Any](format.raw/*7.111*/("""

"""),format.raw/*12.2*/("""

"""),format.raw/*24.2*/("""

"""),_display_(/*26.2*/main(
    "Consumer List",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Consumers",cluster)),
    scripts=consumerScripts)/*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""
    """),format.raw/*31.5*/("""<div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading"><h3>Consumers</h3></div>
            """),_display_(/*34.14*/errorOrConsumers/*34.30*/.fold(
                views.html.errors.onApiError(_),
                cl => views.html.consumer.consumerListContent(cluster,cl.list,cl.clusterContext))),format.raw/*36.98*/("""
        """),format.raw/*37.9*/("""</div>
    </div>
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrConsumers:$bslash$div[kafka.manager.ApiError, kafka.manager.ConsumerListExtended],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrConsumers)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, kafka.manager.ConsumerListExtended]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrConsumers) => (af,messages,menus) => apply(cluster,errorOrConsumers)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object consumerList extends consumerList_Scope0.consumerList_Scope1.consumerList
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/consumer/consumerList.scala.html
                  HASH: 230a9db2bf22f7c81a4085d434203a053f0e5192
                  MATRIX: 752->135|1036->344|1050->351|1130->355|1162->361|1176->366|1413->581|1438->586|1462->601|1543->605|1575->610|1667->674|1696->675|1732->684|1808->732|1837->733|1886->754|1984->824|2013->825|2049->834|2083->841|2111->842|2139->843|2197->341|2226->583|2255->861|2284->864|2490->1061|2530->1063|2562->1068|2732->1211|2757->1227|2931->1380|2967->1389|3016->1408
                  LINES: 23->6|28->9|28->9|30->9|31->10|31->10|32->11|33->14|33->14|35->14|36->15|37->16|37->16|38->17|39->18|39->18|40->19|41->20|41->20|42->21|43->22|43->22|43->22|46->7|48->12|50->24|52->26|56->30|56->30|57->31|60->34|60->34|62->36|63->37|65->39
                  -- GENERATED --
              */
          