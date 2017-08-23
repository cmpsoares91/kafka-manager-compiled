
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object topicList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object topicList_Scope1 {
import scalaz.{\/}

class topicList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, kafka.manager.TopicListExtended],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, errorOrTopics: kafka.manager.ApiError \/ kafka.manager.TopicListExtended
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.clusterMenu(cluster,"Topic","List",menus.clusterMenus(cluster)(
        errorOrTopics.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.129*/("""
""")))};def /*14.2*/topicScripts/*14.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.18*/("""
    """),_display_(/*15.6*/if(errorOrTopics.fold(err=>false,tl=>tl.list.headOption.map(opt => opt._2.map(ti => ti.clusterContext.config.displaySizeEnabled).getOrElse(false)).getOrElse(false)))/*15.171*/{_display_(Seq[Any](format.raw/*15.172*/("""
        """),format.raw/*16.9*/("""<script src="https://cdn.datatables.net/plug-ins/1.10.10/sorting/file-size.js"></script>
        <script ype="text/javascript">
        $(document).ready(function() """),format.raw/*18.38*/("""{"""),format.raw/*18.39*/("""
            """),format.raw/*19.13*/("""$('#topics-table').DataTable( """),format.raw/*19.43*/("""{"""),format.raw/*19.44*/("""
                """),format.raw/*20.17*/("""columnDefs: [
                    """),format.raw/*21.21*/("""{"""),format.raw/*21.22*/(""" """),format.raw/*21.23*/("""type: 'file-size', targets: 7 """),format.raw/*21.53*/("""}"""),format.raw/*21.54*/("""
                """),format.raw/*22.17*/("""],
                "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]]
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/(""" """),format.raw/*24.15*/(""");
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""" """),format.raw/*25.11*/(""");
        </script>
    """)))}/*27.7*/else/*27.12*/{_display_(Seq[Any](format.raw/*27.13*/("""
        """),format.raw/*28.9*/("""<script ype="text/javascript">
        $(document).ready(function() """),format.raw/*29.38*/("""{"""),format.raw/*29.39*/("""
            """),format.raw/*30.13*/("""$('#topics-table').DataTable(
                    """),format.raw/*31.21*/("""{"""),format.raw/*31.22*/("""
                        """),format.raw/*32.25*/(""""lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]]
                    """),format.raw/*33.21*/("""}"""),format.raw/*33.22*/("""
            """),format.raw/*34.13*/(""");
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/(""" """),format.raw/*35.11*/(""");
        </script>
    """)))}),format.raw/*37.6*/("""
""")))};
Seq[Any](format.raw/*7.111*/("""

"""),format.raw/*12.2*/("""

"""),format.raw/*38.2*/("""

"""),_display_(/*40.2*/main(
    "Topic List",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Topics",cluster)),
    scripts=topicScripts)/*44.26*/ {_display_(Seq[Any](format.raw/*44.28*/("""
    """),format.raw/*45.5*/("""<div class="col-md-12">
        """),_display_(/*46.10*/features/*46.18*/.app(features.KMTopicManagerFeature)/*46.54*/ {_display_(Seq[Any](format.raw/*46.56*/("""
        """),format.raw/*47.9*/("""<div class="panel panel-default">
            <div class="panel-heading"><h4>Operations</h4></div>
            <table class="table">
                <tr>
                    """),_display_(/*51.22*/features/*51.30*/.app(features.KMReassignPartitionsFeature)/*51.72*/ {_display_(Seq[Any](format.raw/*51.74*/("""
                    """),format.raw/*52.21*/("""<td>
                        <a href=""""),_display_(/*53.35*/routes/*53.41*/.ReassignPartitions.confirmMultipleAssignments(cluster)),format.raw/*53.96*/("""" class="submit-button btn btn-primary" role="button">Generate Partition Assignments</a>
                    </td>
                    <td>
                        <a href=""""),_display_(/*56.35*/routes/*56.41*/.ReassignPartitions.runMultipleAssignments(cluster)),format.raw/*56.92*/("""" class="submit-button btn btn-primary" role="button">Run Partition Assignments</a>
                    </td>
                    """)))}),format.raw/*58.22*/("""
                    """),format.raw/*59.21*/("""<td>
                        <a href=""""),_display_(/*60.35*/routes/*60.41*/.Topic.addPartitionsToMultipleTopics(cluster)),format.raw/*60.86*/("""" class="submit-button btn btn-primary" role="button">Add Partitions</a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
        """)))}),format.raw/*66.10*/("""
    """),format.raw/*67.5*/("""</div>
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading"><h3>Topics</h3></div>
            """),_display_(/*71.14*/errorOrTopics/*71.27*/.fold( 
                views.html.errors.onApiError(_),
                tl => views.html.topic.topicListContent(
                        cluster,tl.list.map(t => (t, tl.deleteSet(t._1))),
                        tl.underReassignments,
                        tl.list.headOption.map(opt => opt._2.map(ti => ti.clusterContext.config.pollConsumers).getOrElse(false)).getOrElse(false),
                        tl.list.headOption.map(opt => opt._2.map(ti => ti.clusterContext.config.displaySizeEnabled).getOrElse(false)).getOrElse(false)))),format.raw/*77.153*/("""
        """),format.raw/*78.9*/("""</div>
    </div>
""")))}),format.raw/*80.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrTopics:$bslash$div[kafka.manager.ApiError, kafka.manager.TopicListExtended],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrTopics)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, kafka.manager.TopicListExtended]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrTopics) => (af,messages,menus) => apply(cluster,errorOrTopics)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object topicList extends topicList_Scope0.topicList_Scope1.topicList
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/topicList.scala.html
                  HASH: 5eb3acb41080f23818a3f76c0448c5ff1b420283
                  MATRIX: 737->135|1015->338|1029->345|1109->349|1141->355|1155->360|1386->569|1411->574|1432->586|1513->590|1545->596|1720->761|1760->762|1796->771|1989->936|2018->937|2059->950|2117->980|2146->981|2191->998|2253->1032|2282->1033|2311->1034|2369->1064|2398->1065|2443->1082|2556->1167|2585->1168|2614->1169|2652->1180|2681->1181|2710->1182|2754->1209|2767->1214|2806->1215|2842->1224|2938->1292|2967->1293|3008->1306|3086->1356|3115->1357|3168->1382|3270->1456|3299->1457|3340->1470|3378->1481|3407->1482|3436->1483|3492->1509|3534->335|3563->571|3592->1511|3621->1514|3818->1702|3858->1704|3890->1709|3950->1742|3967->1750|4012->1786|4052->1788|4088->1797|4290->1972|4307->1980|4358->2022|4398->2024|4447->2045|4513->2084|4528->2090|4604->2145|4805->2319|4820->2325|4892->2376|5054->2507|5103->2528|5169->2567|5184->2573|5250->2618|5472->2809|5504->2814|5682->2965|5704->2978|6261->3513|6297->3522|6346->3541
                  LINES: 23->6|28->9|28->9|30->9|31->10|31->10|32->11|33->14|33->14|35->14|36->15|36->15|36->15|37->16|39->18|39->18|40->19|40->19|40->19|41->20|42->21|42->21|42->21|42->21|42->21|43->22|45->24|45->24|45->24|46->25|46->25|46->25|48->27|48->27|48->27|49->28|50->29|50->29|51->30|52->31|52->31|53->32|54->33|54->33|55->34|56->35|56->35|56->35|58->37|60->7|62->12|64->38|66->40|70->44|70->44|71->45|72->46|72->46|72->46|72->46|73->47|77->51|77->51|77->51|77->51|78->52|79->53|79->53|79->53|82->56|82->56|82->56|84->58|85->59|86->60|86->60|86->60|92->66|93->67|97->71|97->71|103->77|104->78|106->80
                  -- GENERATED --
              */
          