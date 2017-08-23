
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object reassignPartitions_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object reassignPartitions_Scope1 {
import scalaz.{\/}
import b3.vertical.fieldConstructor

class reassignPartitions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.ReassignPartitions]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(cluster:String, errorOrStatus: kafka.manager.ApiError \/ Option[kafka.manager.model.ActorModel.ReassignPartitions]
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/theMenu/*10.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.13*/("""
"""),_display_(/*11.2*/views/*11.7*/.html.navigation.clusterMenu(cluster,"Reassign Partitions","",menus.clusterMenus(cluster)(
    errorOrStatus.toOption.flatten.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*12.133*/("""
""")))};def /*15.2*/renderView/*15.12*/(c: String, viewOption: Option[kafka.manager.model.ActorModel.ReassignPartitions]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.98*/("""
"""),_display_(/*16.2*/viewOption/*16.12*/.fold/*16.17*/ {_display_(Seq[Any](format.raw/*16.19*/("""
"""),format.raw/*17.1*/("""<div class="row">
    <div class="alert alert-warning" role="alert">
        No data found for any recent reassign partitions command.
    </div>
</div>
""")))}/*22.2*/ { repar =>_display_(Seq[Any](format.raw/*22.13*/("""
"""),format.raw/*23.1*/("""<div class="row">
    <div class="panel panel-default">
        <div class="panel-heading">Status</div>
        <table class="table">
            <tbody>
            <tr>
                <td>Submitted:</td>
                <td>"""),_display_(/*30.22*/repar/*30.27*/.startTime),format.raw/*30.37*/("""</td>
            <tr>
                <td>Completed:</td>
                <td>"""),_display_(/*33.22*/repar/*33.27*/.endTime.map(_.toString()).getOrElse("pending")),format.raw/*33.74*/("""</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<div class="row">
    <div class="panel panel-default">
        <div class="panel-heading">Request Data</div>
        <table class="table">
            <thead>
            <tr><th>Topic</th><th>Partition</th><th>Replica Assignment</th></tr>
            </thead>
            <tbody>
            """),_display_(/*47.14*/for((kafka.common.TopicAndPartition(topic,partNum),assignment) <- repar.partitionsToBeReassigned.toList.sortBy(_._1.topic) ) yield /*47.138*/ {_display_(Seq[Any](format.raw/*47.140*/("""
            """),format.raw/*48.13*/("""<tr>
                <td><a href=""""),_display_(/*49.31*/routes/*49.37*/.Topic.topic(cluster,topic)),format.raw/*49.64*/("""">"""),_display_(/*49.67*/topic),format.raw/*49.72*/("""</a></td>
                <td>"""),_display_(/*50.22*/partNum),format.raw/*50.29*/("""</td>
                <td>"""),_display_(/*51.22*/assignment/*51.32*/.mkString("(",",",")")),format.raw/*51.54*/("""</td>
            </tr>
            """)))}),format.raw/*53.14*/("""
            """),format.raw/*54.13*/("""</tbody>
        </table>
    </div>
</div>
""")))}),format.raw/*58.2*/("""
""")))};
Seq[Any](format.raw/*8.111*/("""

"""),format.raw/*13.2*/("""

"""),format.raw/*59.2*/("""

"""),_display_(/*61.2*/main(
    "Reassign Partitions",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Reassign Partitions",cluster)))/*64.132*/ {_display_(Seq[Any](format.raw/*64.134*/("""
"""),format.raw/*65.1*/("""<div class="col-md-6 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading"><h3>Reassign Partitions</h3></div>
        <div class="col-md-12">
            """),_display_(/*69.14*/errorOrStatus/*69.27*/.fold[Html](views.html.errors.onApiError(_), renderView(cluster, _))),format.raw/*69.95*/("""
        """),format.raw/*70.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*73.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrStatus:$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.ReassignPartitions]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrStatus)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.ReassignPartitions]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrStatus) => (af,messages,menus) => apply(cluster,errorOrStatus)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object reassignPartitions extends reassignPartitions_Scope0.reassignPartitions_Scope1.reassignPartitions
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/reassignPartitions.scala.html
                  HASH: 38ed858ffd99e98614b4ea3b76f972f16c1a131c
                  MATRIX: 820->172|1125->401|1140->408|1221->412|1249->414|1262->419|1507->642|1532->647|1551->657|1714->743|1742->745|1761->755|1775->760|1815->762|1843->763|2015->917|2064->928|2092->929|2347->1157|2361->1162|2392->1172|2499->1252|2513->1257|2581->1304|2983->1679|3124->1803|3165->1805|3206->1818|3268->1853|3283->1859|3331->1886|3361->1889|3387->1894|3445->1925|3473->1932|3527->1959|3546->1969|3589->1991|3657->2028|3698->2041|3773->2086|3815->398|3844->644|3873->2088|3902->2091|4096->2275|4137->2277|4165->2278|4378->2464|4400->2477|4489->2545|4525->2554|4581->2580
                  LINES: 24->7|29->10|29->10|31->10|32->11|32->11|33->12|34->15|34->15|36->15|37->16|37->16|37->16|37->16|38->17|43->22|43->22|44->23|51->30|51->30|51->30|54->33|54->33|54->33|68->47|68->47|68->47|69->48|70->49|70->49|70->49|70->49|70->49|71->50|71->50|72->51|72->51|72->51|74->53|75->54|79->58|81->8|83->13|85->59|87->61|90->64|90->64|91->65|95->69|95->69|95->69|96->70|99->73
                  -- GENERATED --
              */
          