
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object runMultipleAssignments_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object runMultipleAssignments_Scope1 {
import scalaz.{\/}
import b3.vertical.fieldConstructor

class runMultipleAssignments extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.RunMultipleAssignments], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(cluster: String,
  errorOrForm: kafka.manager.ApiError \/ (Form[models.form.RunMultipleAssignments], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*11.2*/theMenu/*11.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.13*/("""
    """),_display_(/*12.6*/views/*12.11*/.html.navigation.clusterMenu(cluster,"Topic","Confirm Assignments",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*13.115*/("""
""")))};def /*16.2*/checkboxWithLink/*16.18*/(field: play.api.data.Field, topic: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.65*/("""
"""),_display_(/*17.2*/b3/*17.4*/.inputFormGroup(field, withFeedback = false, withLabelFor = false, b3.Args.withDefault(Seq(), 'disabled -> false))/*17.118*/ { fieldInfo =>_display_(Seq[Any](format.raw/*17.133*/("""
"""),format.raw/*18.1*/("""<div class="checkbox">
    <label for=""""),_display_(/*19.18*/fieldInfo/*19.27*/.id),format.raw/*19.30*/("""">
        <input type="checkbox" id=""""),_display_(/*20.37*/fieldInfo/*20.46*/.id),format.raw/*20.49*/("""" name=""""),_display_(/*20.58*/fieldInfo/*20.67*/.name),format.raw/*20.72*/("""" value="true" """),_display_(/*20.88*/if(fieldInfo.value == Some("true"))/*20.123*/{_display_(Seq[Any](format.raw/*20.124*/("""checked""")))}),format.raw/*20.132*/(""" """),_display_(/*20.134*/toHtmlArgs(fieldInfo.innerArgsMap)),format.raw/*20.168*/(""">
        <a href=""""),_display_(/*21.19*/routes/*21.25*/.Topic.topic(cluster,topic)),format.raw/*21.52*/("""">"""),_display_(/*21.55*/topic),format.raw/*21.60*/("""</a>
    </label>
</div>
""")))}),format.raw/*24.2*/("""
""")))};def /*27.2*/renderForm/*27.12*/(confirmForm: Form[models.form.RunMultipleAssignments]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*27.71*/("""
    """),format.raw/*28.5*/("""<h4>Choose topics to reassign:</h4>
    """),_display_(/*29.6*/b3/*29.8*/.form(routes.ReassignPartitions.handleRunMultipleAssignments(cluster))/*29.78*/ {_display_(Seq[Any](format.raw/*29.80*/("""
        """),format.raw/*30.9*/("""<table class="table">
            <thead>
            <tr><th>Topics</th></tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <button type="button" class="btn btn-default" onClick="checkBoxSelect('topics',true);">
                        <b>Select All</b>
                    </button>
                    <button type="button" class="btn btn-default" onClick="checkBoxSelect('topics',false);">
                        <b>Select None</b>
                    </button>
                    """),_display_(/*43.22*/helper/*43.28*/.repeat(confirmForm("topics"), min = 1)/*43.67*/ { topicSelectForm =>_display_(Seq[Any](format.raw/*43.88*/("""
                        """),_display_(/*44.26*/b3/*44.28*/.hidden(topicSelectForm("name").name,topicSelectForm("name").value.getOrElse(""))),format.raw/*44.109*/("""
                        """),_display_(/*45.26*/checkboxWithLink(topicSelectForm("selected"),topicSelectForm("name").value.getOrElse(""))),format.raw/*45.115*/("""
                    """)))}),format.raw/*46.22*/("""
                """),format.raw/*47.17*/("""</td>
            </tr>
            </tbody>
        </table>
        """),_display_(/*51.10*/b3/*51.12*/.submit('class -> "btn btn-primary btn-block")/*51.58*/{_display_(Seq[Any](format.raw/*51.59*/(""" """),format.raw/*51.60*/("""Run Partition Assignments """)))}),format.raw/*51.87*/("""
        """),format.raw/*52.9*/("""<a href=""""),_display_(/*52.19*/routes/*52.25*/.Topic.topics(cluster)),format.raw/*52.47*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
    """)))}),format.raw/*53.6*/("""
""")))};
Seq[Any](format.raw/*9.111*/("""

"""),format.raw/*14.2*/("""

"""),format.raw/*25.2*/("""

"""),format.raw/*54.2*/("""

"""),_display_(/*56.2*/main(
  "Run Assignment",
  menu = theMenu,
  breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Topics",cluster)))/*59.117*/ {_display_(Seq[Any](format.raw/*59.119*/("""
"""),format.raw/*60.1*/("""<div class="col-md-6 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Run Assignments</h3></div>
        <div class="panel-body">
            """),_display_(/*64.14*/errorOrForm/*64.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*64.87*/("""
        """),format.raw/*65.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*68.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.RunMultipleAssignments], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrForm)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.RunMultipleAssignments], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrForm) => (af,messages,menus) => apply(cluster,errorOrForm)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object runMultipleAssignments extends runMultipleAssignments_Scope0.runMultipleAssignments_Scope1.runMultipleAssignments
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/runMultipleAssignments.scala.html
                  HASH: ddd4eb91be753cae9ad8b961c593fce8a9894965
                  MATRIX: 871->172|1198->423|1213->430|1294->434|1326->440|1340->445|1572->655|1597->660|1622->676|1746->723|1774->725|1784->727|1908->841|1962->856|1990->857|2057->897|2075->906|2099->909|2165->948|2183->957|2207->960|2243->969|2261->978|2287->983|2330->999|2375->1034|2415->1035|2455->1043|2485->1045|2541->1079|2588->1099|2603->1105|2651->1132|2681->1135|2707->1140|2763->1166|2788->1171|2807->1181|2943->1240|2975->1245|3042->1286|3052->1288|3131->1358|3171->1360|3207->1369|3775->1910|3790->1916|3838->1955|3897->1976|3950->2002|3961->2004|4064->2085|4117->2111|4228->2200|4281->2222|4326->2239|4424->2310|4435->2312|4490->2358|4529->2359|4558->2360|4616->2387|4652->2396|4689->2406|4704->2412|4747->2434|4847->2504|4889->420|4918->657|4947->1168|4976->2506|5005->2509|5175->2669|5216->2671|5244->2672|5596->2997|5616->3008|5699->3070|5735->3079|5791->3105
                  LINES: 24->7|30->11|30->11|32->11|33->12|33->12|34->13|35->16|35->16|37->16|38->17|38->17|38->17|38->17|39->18|40->19|40->19|40->19|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|42->21|42->21|42->21|42->21|42->21|45->24|46->27|46->27|48->27|49->28|50->29|50->29|50->29|50->29|51->30|64->43|64->43|64->43|64->43|65->44|65->44|65->44|66->45|66->45|67->46|68->47|72->51|72->51|72->51|72->51|72->51|72->51|73->52|73->52|73->52|73->52|74->53|76->9|78->14|80->25|82->54|84->56|87->59|87->59|88->60|92->64|92->64|92->64|93->65|96->68
                  -- GENERATED --
              */
          