
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object preferredReplicaElection_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object preferredReplicaElection_Scope1 {
import scalaz.{\/}
import b3.vertical.fieldConstructor

class preferredReplicaElection extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.PreferredReplicaElection]],Form[models.form.PreferredReplicaElectionOperation],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(cluster:String,
errorOrStatus: kafka.manager.ApiError \/ Option[kafka.manager.model.ActorModel.PreferredReplicaElection],
operationForm: Form[models.form.PreferredReplicaElectionOperation]
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*12.2*/theMenu/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
"""),_display_(/*13.2*/views/*13.7*/.html.navigation.clusterMenu(cluster,"Preferred Replica Election","",menus.clusterMenus(cluster)(
    errorOrStatus.toOption.flatten.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*14.133*/("""
""")))};def /*17.2*/renderView/*17.12*/(c: String, viewOption: Option[kafka.manager.model.ActorModel.PreferredReplicaElection]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.104*/("""
"""),_display_(/*18.2*/viewOption/*18.12*/.fold/*18.17*/ {_display_(Seq[Any](format.raw/*18.19*/("""
"""),format.raw/*19.1*/("""<div class="row">
    <div class="alert alert-warning" role="alert">
        No data found for any recent preferred replica election command.
    </div>
</div>
""")))}/*24.2*/ { pre =>_display_(Seq[Any](format.raw/*24.11*/("""
"""),format.raw/*25.1*/("""<div class="row">
    <div class="panel panel-default">
        <div class="panel-heading">Last Request Info</div>
        <table class="table">
            <tbody>
            <tr>
                <td>Submitted:</td>
                <td>"""),_display_(/*32.22*/pre/*32.25*/.startTime),format.raw/*32.35*/("""</td>
            <tr>
                <td>Completed:</td>
                <td>"""),_display_(/*35.22*/pre/*35.25*/.endTime.map(_.toString()).getOrElse("pending")),format.raw/*35.72*/("""</td>
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
            <tr><th>Topic</th><th>Partition</th></tr>
            </thead>
            <tbody>
            """),_display_(/*49.14*/for(kafka.common.TopicAndPartition(topic,partNum) <- pre.topicAndPartition.toList.sortBy(_.topic) ) yield /*49.113*/ {_display_(Seq[Any](format.raw/*49.115*/("""
            """),format.raw/*50.13*/("""<tr>
                <td><a href=""""),_display_(/*51.31*/routes/*51.37*/.Topic.topic(cluster,topic)),format.raw/*51.64*/("""">"""),_display_(/*51.67*/topic),format.raw/*51.72*/("""</a></td>
                <td>"""),_display_(/*52.22*/partNum),format.raw/*52.29*/("""</td>
            </tr>
            """)))}),format.raw/*54.14*/("""
            """),format.raw/*55.13*/("""</tbody>
        </table>
    </div>
</div>
""")))}),format.raw/*59.2*/("""
""")))};
Seq[Any](format.raw/*10.111*/("""

"""),format.raw/*15.2*/("""

"""),format.raw/*60.2*/("""

"""),_display_(/*62.2*/main(
    "Preferred Replica Election",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Preferred Replica Election",cluster)))/*65.139*/ {_display_(Seq[Any](format.raw/*65.141*/("""
"""),format.raw/*66.1*/("""<div class="col-md-6 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading"><h3>Preferred Replica Election</h3></div>
        <div class="col-md-12">
            """),_display_(/*70.14*/features/*70.22*/.app(features.KMPreferredReplicaElectionFeature)/*70.70*/ {_display_(Seq[Any](format.raw/*70.72*/("""
                """),format.raw/*71.17*/("""<div class="row">
                    """),_display_(/*72.22*/b3/*72.24*/.form(routes.PreferredReplicaElection.handleRunElection(cluster))/*72.89*/ {_display_(Seq[Any](format.raw/*72.91*/("""
                    """),format.raw/*73.21*/("""<fieldset>
                        <input type="hidden" name="operation" value="run">
                        """),_display_(/*75.26*/b3/*75.28*/.submit('class -> "btn btn-primary")/*75.64*/{_display_(Seq[Any](format.raw/*75.65*/(""" """),format.raw/*75.66*/("""Run Preferred Replica Election """)))}),format.raw/*75.98*/("""
                    """),format.raw/*76.21*/("""</fieldset>
                    """)))}),format.raw/*77.22*/("""
                """),format.raw/*78.17*/("""</div>
            """)))}),format.raw/*79.14*/("""

            """),_display_(/*81.14*/errorOrStatus/*81.27*/.fold[Html](views.html.errors.onApiError(_), renderView(cluster, _))),format.raw/*81.95*/("""
        """),format.raw/*82.9*/("""</div>
    </div>
</div>

    """)))}),format.raw/*86.6*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrStatus:$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.PreferredReplicaElection]],operationForm:Form[models.form.PreferredReplicaElectionOperation],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrStatus,operationForm)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.PreferredReplicaElection]],Form[models.form.PreferredReplicaElectionOperation]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrStatus,operationForm) => (af,messages,menus) => apply(cluster,errorOrStatus,operationForm)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object preferredReplicaElection extends preferredReplicaElection_Scope0.preferredReplicaElection_Scope1.preferredReplicaElection
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/preferredReplicaElection.scala.html
                  HASH: 768e5b35704817319860238b099fe034d0a6acf5
                  MATRIX: 896->172|1275->475|1290->482|1371->486|1399->488|1412->493|1664->723|1689->728|1708->738|1878->830|1906->832|1925->842|1939->847|1979->849|2007->850|2186->1011|2233->1020|2261->1021|2527->1260|2539->1263|2570->1273|2677->1353|2689->1356|2757->1403|3132->1751|3248->1850|3289->1852|3330->1865|3392->1900|3407->1906|3455->1933|3485->1936|3511->1941|3569->1972|3597->1979|3665->2016|3706->2029|3781->2074|3824->472|3853->725|3882->2076|3911->2079|4119->2277|4160->2279|4188->2280|4408->2473|4425->2481|4482->2529|4522->2531|4567->2548|4633->2587|4644->2589|4718->2654|4758->2656|4807->2677|4945->2788|4956->2790|5001->2826|5040->2827|5069->2828|5132->2860|5181->2881|5245->2914|5290->2931|5341->2951|5383->2966|5405->2979|5494->3047|5530->3056|5591->3087
                  LINES: 24->7|31->12|31->12|33->12|34->13|34->13|35->14|36->17|36->17|38->17|39->18|39->18|39->18|39->18|40->19|45->24|45->24|46->25|53->32|53->32|53->32|56->35|56->35|56->35|70->49|70->49|70->49|71->50|72->51|72->51|72->51|72->51|72->51|73->52|73->52|75->54|76->55|80->59|82->10|84->15|86->60|88->62|91->65|91->65|92->66|96->70|96->70|96->70|96->70|97->71|98->72|98->72|98->72|98->72|99->73|101->75|101->75|101->75|101->75|101->75|101->75|102->76|103->77|104->78|105->79|107->81|107->81|107->81|108->82|112->86
                  -- GENERATED --
              */
          