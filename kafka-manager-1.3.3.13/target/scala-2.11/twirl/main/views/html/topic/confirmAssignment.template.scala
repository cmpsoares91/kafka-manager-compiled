
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object confirmAssignment_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object confirmAssignment_Scope1 {
import scalaz.{\/}
import b3.vertical.fieldConstructor

class confirmAssignment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateAssignment], kafka.manager.model.ClusterContext]],$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.GeneratedPartitionAssignments],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(cluster: String,
  topic: String,
  errorOrForm: kafka.manager.ApiError \/ (Form[models.form.GenerateAssignment], kafka.manager.model.ClusterContext),
  errorOrCurrentAssignments: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.GeneratedPartitionAssignments
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*13.2*/theMenu/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),_display_(/*14.6*/views/*14.11*/.html.navigation.clusterMenu(cluster,"Topic","Confirm Assignment",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*15.115*/("""
""")))};def /*18.2*/renderForm/*18.12*/(confirmForm: Form[models.form.GenerateAssignment]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.67*/("""
    """),format.raw/*19.5*/("""<h4>Choose brokers to reassign topic """),_display_(/*19.43*/topic),format.raw/*19.48*/(""" """),format.raw/*19.49*/("""to:</h4>
    """),_display_(/*20.6*/b3/*20.8*/.form(routes.ReassignPartitions.handleGenerateAssignment(cluster,topic))/*20.80*/ {_display_(Seq[Any](format.raw/*20.82*/("""
        """),format.raw/*21.9*/("""<table class="table">
            <thead>
            <tr><th>Brokers</th></tr>
            </thead>
            <tbody>
            <tr>
                <td>
                <button type="button" class="btn btn-default" onClick="checkBoxSelect('brokers',true);">
                    <b>Select All</b>
                </button>
                <button type="button" class="btn btn-default" onClick="checkBoxSelect('brokers',false);">
                    <b>Select None</b>
                </button>
                """),_display_(/*34.18*/helper/*34.24*/.repeat(confirmForm("brokers"), min = 1)/*34.64*/ { brokerSelectForm =>_display_(Seq[Any](format.raw/*34.86*/("""
                    """),_display_(/*35.22*/b3/*35.24*/.hidden(brokerSelectForm("id").name,brokerSelectForm("id").value.getOrElse(-1))),format.raw/*35.103*/("""
                    """),_display_(/*36.22*/b3/*36.24*/.hidden(brokerSelectForm("host").name,brokerSelectForm("host").value.getOrElse(""))),format.raw/*36.107*/("""
                    """),_display_(/*37.22*/b3/*37.24*/.checkbox(brokerSelectForm("selected"), '_text -> s"${brokerSelectForm("id").value.getOrElse(-1)} - ${brokerSelectForm("host").value.getOrElse("")}")),format.raw/*37.173*/("""
                """)))}),format.raw/*38.18*/("""
                """),format.raw/*39.17*/("""</td>
            </tr>
            </tbody>
        </table>
        """),_display_(/*43.10*/b3/*43.12*/.submit('class -> "btn btn-primary btn-block")/*43.58*/{_display_(Seq[Any](format.raw/*43.59*/(""" """),format.raw/*43.60*/("""Generate Partition Assignments """)))}),format.raw/*43.92*/("""
        """),format.raw/*44.9*/("""<a href=""""),_display_(/*44.19*/routes/*44.25*/.Topic.topic(cluster,topic)),format.raw/*44.52*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
    """)))}),format.raw/*45.6*/("""
""")))};def /*48.2*/renderAssignments/*48.19*/(gpa: kafka.manager.model.ActorModel.GeneratedPartitionAssignments):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*48.90*/("""
    """),format.raw/*49.5*/("""<h4>Current Assignments</h4>
    <table class="table">
        <thead>
        <tr><th>Partition</th><th>Replicas</th></tr>
        </thead>
        """),_display_(/*54.10*/for((partNum, replicas) <- gpa.assignments.toList.sortBy(_._1) ) yield /*54.74*/ {_display_(Seq[Any](format.raw/*54.76*/("""
        """),format.raw/*55.9*/("""<tr>
            <td>"""),_display_(/*56.18*/partNum),format.raw/*56.25*/("""</td>
            <td style="word-wrap: break-word">"""),_display_(/*57.48*/replicas/*57.56*/.mkString("(", ",", ")")),format.raw/*57.80*/("""</td>
        </tr>
        """)))}),format.raw/*59.10*/("""
    """),format.raw/*60.5*/("""</table>
""")))};
Seq[Any](format.raw/*11.111*/("""

"""),format.raw/*16.2*/("""

"""),format.raw/*46.2*/("""
        
"""),format.raw/*61.2*/("""

"""),_display_(/*63.2*/main(
  "Confirm Assignment",
  menu = theMenu,
  breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Topic View",cluster,topic)))/*66.132*/ {_display_(Seq[Any](format.raw/*66.134*/("""
"""),format.raw/*67.1*/("""<div class="col-md-6 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Confirm Assignment</h3></div>
        <div class="panel-body">
            """),_display_(/*71.14*/errorOrForm/*71.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*71.87*/("""
        """),format.raw/*72.9*/("""</div>
    </div>
</div>
<div class="col-md-6 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-body">
            """),_display_(/*78.14*/errorOrCurrentAssignments/*78.39*/.fold( views.html.errors.onApiError(_), t => renderAssignments(t))),format.raw/*78.105*/("""
        """),format.raw/*79.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*82.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,topic:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateAssignment], kafka.manager.model.ClusterContext]],errorOrCurrentAssignments:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.GeneratedPartitionAssignments],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,errorOrForm,errorOrCurrentAssignments)(af,messages,menus)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateAssignment], kafka.manager.model.ClusterContext]],$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.GeneratedPartitionAssignments]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,errorOrForm,errorOrCurrentAssignments) => (af,messages,menus) => apply(cluster,topic,errorOrForm,errorOrCurrentAssignments)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object confirmAssignment extends confirmAssignment_Scope0.confirmAssignment_Scope1.confirmAssignment
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/confirmAssignment.scala.html
                  HASH: 70f56a6bba7a2aaede0feac18741d8756c01b494
                  MATRIX: 957->172|1414->553|1429->560|1510->564|1542->570|1556->575|1787->784|1812->789|1831->799|1963->854|1995->859|2060->897|2086->902|2115->903|2155->917|2165->919|2246->991|2286->993|2322->1002|2865->1518|2880->1524|2929->1564|2989->1586|3038->1608|3049->1610|3150->1689|3199->1711|3210->1713|3315->1796|3364->1818|3375->1820|3546->1969|3595->1987|3640->2004|3738->2075|3749->2077|3804->2123|3843->2124|3872->2125|3935->2157|3971->2166|4008->2176|4023->2182|4071->2209|4171->2279|4196->2292|4222->2309|4370->2380|4402->2385|4579->2535|4659->2599|4699->2601|4735->2610|4784->2632|4812->2639|4892->2692|4909->2700|4954->2724|5014->2753|5046->2758|5097->550|5126->786|5155->2281|5192->2768|5221->2771|5410->2950|5451->2952|5479->2953|5834->3281|5854->3292|5937->3354|5973->3363|6142->3505|6176->3530|6264->3596|6300->3605|6356->3631
                  LINES: 24->7|32->13|32->13|34->13|35->14|35->14|36->15|37->18|37->18|39->18|40->19|40->19|40->19|40->19|41->20|41->20|41->20|41->20|42->21|55->34|55->34|55->34|55->34|56->35|56->35|56->35|57->36|57->36|57->36|58->37|58->37|58->37|59->38|60->39|64->43|64->43|64->43|64->43|64->43|64->43|65->44|65->44|65->44|65->44|66->45|67->48|67->48|69->48|70->49|75->54|75->54|75->54|76->55|77->56|77->56|78->57|78->57|78->57|80->59|81->60|83->11|85->16|87->46|89->61|91->63|94->66|94->66|95->67|99->71|99->71|99->71|100->72|106->78|106->78|106->78|107->79|110->82
                  -- GENERATED --
              */
          