
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object confirmMultipleAssignments_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object confirmMultipleAssignments_Scope1 {
import scalaz.{\/}
import b3.vertical.fieldConstructor

class confirmMultipleAssignments extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateMultipleAssignments], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(cluster: String,
  errorOrForm: kafka.manager.ApiError \/ (Form[models.form.GenerateMultipleAssignments], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*11.2*/theMenu/*11.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.13*/("""
    """),_display_(/*12.6*/views/*12.11*/.html.navigation.clusterMenu(cluster,"Topic","Confirm Assignments",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*13.115*/("""
""")))};def /*16.2*/checkboxWithLink/*16.18*/(field: play.api.data.Field, topic: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.65*/("""
    """),_display_(/*17.6*/b3/*17.8*/.inputFormGroup(field, withFeedback = false, withLabelFor = false, b3.Args.withDefault(Seq(), 'disabled -> false))/*17.122*/ { fieldInfo =>_display_(Seq[Any](format.raw/*17.137*/("""
    """),format.raw/*18.5*/("""<div class="checkbox">
        <label for=""""),_display_(/*19.22*/fieldInfo/*19.31*/.id),format.raw/*19.34*/("""">
            <input type="checkbox" id=""""),_display_(/*20.41*/fieldInfo/*20.50*/.id),format.raw/*20.53*/("""" name=""""),_display_(/*20.62*/fieldInfo/*20.71*/.name),format.raw/*20.76*/("""" value="true" """),_display_(/*20.92*/if(fieldInfo.value == Some("true"))/*20.127*/{_display_(Seq[Any](format.raw/*20.128*/("""checked""")))}),format.raw/*20.136*/(""" """),_display_(/*20.138*/toHtmlArgs(fieldInfo.innerArgsMap)),format.raw/*20.172*/(""">
            <a href=""""),_display_(/*21.23*/routes/*21.29*/.Topic.topic(cluster,topic)),format.raw/*21.56*/("""">"""),_display_(/*21.59*/topic),format.raw/*21.64*/("""</a>
        </label>
    </div>
    """)))}),format.raw/*24.6*/("""
""")))};def /*27.2*/renderForm/*27.12*/(confirmForm: Form[models.form.GenerateMultipleAssignments]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*27.76*/("""
    """),format.raw/*28.5*/("""<h4>Choose topics and brokers for reassignments:</h4>
    """),_display_(/*29.6*/b3/*29.8*/.form(routes.ReassignPartitions.handleGenerateMultipleAssignments(cluster))/*29.83*/ {_display_(Seq[Any](format.raw/*29.85*/("""
        """),format.raw/*30.9*/("""<table class="table">
            <thead>
            <tr><th>Topics</th><th>Brokers</th></tr>
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
                <td>
                    <button type="button" class="btn btn-default" onClick="checkBoxSelect('brokers',true);">
                        <b>Select All</b>
                    </button>
                    <button type="button" class="btn btn-default" onClick="checkBoxSelect('brokers',false);">
                        <b>Select None</b>
                    </button>
                    """),_display_(/*55.22*/helper/*55.28*/.repeat(confirmForm("brokers"), min = 1)/*55.68*/ { brokerSelectForm =>_display_(Seq[Any](format.raw/*55.90*/("""
                        """),_display_(/*56.26*/b3/*56.28*/.hidden(brokerSelectForm("id").name,brokerSelectForm("id").value.getOrElse(-1))),format.raw/*56.107*/("""
                        """),_display_(/*57.26*/b3/*57.28*/.hidden(brokerSelectForm("host").name,brokerSelectForm("host").value.getOrElse(""))),format.raw/*57.111*/("""
                        """),_display_(/*58.26*/b3/*58.28*/.checkbox(brokerSelectForm("selected"), '_text -> s"${brokerSelectForm("id").value.getOrElse(-1)} - ${brokerSelectForm("host").value.getOrElse("")}")),format.raw/*58.177*/("""
                    """)))}),format.raw/*59.22*/("""
                """),format.raw/*60.17*/("""</td>
            </tr>
            </tbody>
        </table>
        """),_display_(/*64.10*/b3/*64.12*/.submit('class -> "btn btn-primary btn-block")/*64.58*/{_display_(Seq[Any](format.raw/*64.59*/(""" """),format.raw/*64.60*/("""Generate Partition Assignments """)))}),format.raw/*64.92*/("""
        """),format.raw/*65.9*/("""<a href=""""),_display_(/*65.19*/routes/*65.25*/.Topic.topics(cluster)),format.raw/*65.47*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
    """)))}),format.raw/*66.6*/("""
""")))};
Seq[Any](format.raw/*9.111*/("""

"""),format.raw/*14.2*/("""

"""),format.raw/*25.2*/("""

"""),format.raw/*67.2*/("""

"""),_display_(/*69.2*/main(
  "Confirm Multiple Assignment",
  menu = theMenu,
  breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Topics",cluster)))/*72.117*/ {_display_(Seq[Any](format.raw/*72.119*/("""
"""),format.raw/*73.1*/("""<div class="col-md-12 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Confirm Assignments</h3></div>
        <div class="panel-body">
            """),_display_(/*77.14*/errorOrForm/*77.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*77.87*/("""
        """),format.raw/*78.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*81.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateMultipleAssignments], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrForm)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateMultipleAssignments], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrForm) => (af,messages,menus) => apply(cluster,errorOrForm)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object confirmMultipleAssignments extends confirmMultipleAssignments_Scope0.confirmMultipleAssignments_Scope1.confirmMultipleAssignments
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/confirmMultipleAssignments.scala.html
                  HASH: dc9de1320af5c60cd50a00cb6b3570ad23fc6fd0
                  MATRIX: 888->172|1220->428|1235->435|1316->439|1348->445|1362->450|1594->660|1619->665|1644->681|1768->728|1800->734|1810->736|1934->850|1988->865|2020->870|2091->914|2109->923|2133->926|2203->969|2221->978|2245->981|2281->990|2299->999|2325->1004|2368->1020|2413->1055|2453->1056|2493->1064|2523->1066|2579->1100|2630->1124|2645->1130|2693->1157|2723->1160|2749->1165|2817->1203|2842->1208|2861->1218|3002->1282|3034->1287|3119->1346|3129->1348|3213->1423|3253->1425|3289->1434|3873->1991|3888->1997|3936->2036|3995->2057|4048->2083|4059->2085|4162->2166|4215->2192|4326->2281|4379->2303|4424->2320|4863->2732|4878->2738|4927->2778|4987->2800|5040->2826|5051->2828|5152->2907|5205->2933|5216->2935|5321->3018|5374->3044|5385->3046|5556->3195|5609->3217|5654->3234|5752->3305|5763->3307|5818->3353|5857->3354|5886->3355|5949->3387|5985->3396|6022->3406|6037->3412|6080->3434|6180->3504|6222->425|6251->662|6280->1205|6309->3506|6338->3509|6521->3682|6562->3684|6590->3685|6947->4015|6967->4026|7050->4088|7086->4097|7142->4123
                  LINES: 24->7|30->11|30->11|32->11|33->12|33->12|34->13|35->16|35->16|37->16|38->17|38->17|38->17|38->17|39->18|40->19|40->19|40->19|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|42->21|42->21|42->21|42->21|42->21|45->24|46->27|46->27|48->27|49->28|50->29|50->29|50->29|50->29|51->30|64->43|64->43|64->43|64->43|65->44|65->44|65->44|66->45|66->45|67->46|68->47|76->55|76->55|76->55|76->55|77->56|77->56|77->56|78->57|78->57|78->57|79->58|79->58|79->58|80->59|81->60|85->64|85->64|85->64|85->64|85->64|85->64|86->65|86->65|86->65|86->65|87->66|89->9|91->14|93->25|95->67|97->69|100->72|100->72|101->73|105->77|105->77|105->77|106->78|109->81
                  -- GENERATED --
              */
          