
package views.html.logkafka

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logkafkaList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object logkafkaList_Scope1 {
import scalaz.{\/}

class logkafkaList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.LogkafkaListExtended, kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, errorOrLogkafkas: kafka.manager.ApiError \/ (kafka.manager.LogkafkaListExtended, kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.clusterMenu(cluster,"Logkafka","List",menus.clusterMenus(cluster)(
        errorOrLogkafkas.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.120*/("""
""")))};def /*14.2*/logkafkaScripts/*14.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.21*/("""
    """),format.raw/*15.5*/("""<script ype="text/javascript">
    $(document).ready(function() """),format.raw/*16.34*/("""{"""),format.raw/*16.35*/("""
        """),format.raw/*17.9*/("""$('#logkafkas-table').DataTable(
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
    "Logkafka List",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Logkafkas",cluster)),
    scripts=logkafkaScripts)/*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""
    """),format.raw/*31.5*/("""<div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading"><h3>Logkafkas</h3></div>
            """),_display_(/*34.14*/errorOrLogkafkas/*34.30*/.fold( 
                views.html.errors.onApiError(_),
                tl => views.html.logkafka.logkafkaListContent(cluster,tl._1.list.map(t => (t, tl._1.deleteSet(t._1)))))),format.raw/*36.120*/("""
        """),format.raw/*37.9*/("""</div>
    </div>
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrLogkafkas:$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.LogkafkaListExtended, kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrLogkafkas)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.LogkafkaListExtended, kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrLogkafkas) => (af,messages,menus) => apply(cluster,errorOrLogkafkas)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object logkafkaList extends logkafkaList_Scope0.logkafkaList_Scope1.logkafkaList
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/logkafka/logkafkaList.scala.html
                  HASH: 09e52cc7651d89dc942b770467cb69c6c6780c2b
                  MATRIX: 802->135|1124->382|1138->389|1218->393|1250->399|1264->404|1489->607|1514->612|1538->627|1619->631|1651->636|1743->700|1772->701|1808->710|1885->759|1914->760|1963->781|2061->851|2090->852|2126->861|2160->868|2188->869|2216->870|2274->379|2303->609|2332->888|2361->891|2567->1088|2607->1090|2639->1095|2809->1238|2834->1254|3032->1430|3068->1439|3117->1458
                  LINES: 23->6|28->9|28->9|30->9|31->10|31->10|32->11|33->14|33->14|35->14|36->15|37->16|37->16|38->17|39->18|39->18|40->19|41->20|41->20|42->21|43->22|43->22|43->22|46->7|48->12|50->24|52->26|56->30|56->30|57->31|60->34|60->34|62->36|63->37|65->39
                  -- GENERATED --
              */
          