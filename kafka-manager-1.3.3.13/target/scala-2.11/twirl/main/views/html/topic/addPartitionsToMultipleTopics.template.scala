
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addPartitionsToMultipleTopics_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object addPartitionsToMultipleTopics_Scope1 {
import scalaz.{\/}

class addPartitionsToMultipleTopics extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddMultipleTopicsPartitions], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, errorOrForm: kafka.manager.ApiError \/ (Form[models.form.AddMultipleTopicsPartitions], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import controllers.routes
def /*13.2*/theMenu/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),_display_(/*14.6*/views/*14.11*/.html.navigation.clusterMenu(cluster,"Topics","Add Partitions to Topics",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*15.115*/("""
""")))};def /*18.2*/checkboxWithLink/*18.18*/(field: play.api.data.Field, topic: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.65*/("""
"""),_display_(/*19.2*/b3/*19.4*/.inputFormGroup(field, withFeedback = false, withLabelFor = false, b3.Args.withDefault(Seq(), 'disabled -> false))/*19.118*/ { fieldInfo =>_display_(Seq[Any](format.raw/*19.133*/("""
"""),format.raw/*20.1*/("""<div class="checkbox">
    <label for=""""),_display_(/*21.18*/fieldInfo/*21.27*/.id),format.raw/*21.30*/("""">
        <input type="checkbox" id=""""),_display_(/*22.37*/fieldInfo/*22.46*/.id),format.raw/*22.49*/("""" name=""""),_display_(/*22.58*/fieldInfo/*22.67*/.name),format.raw/*22.72*/("""" value="true" """),_display_(/*22.88*/if(fieldInfo.value == Some("true"))/*22.123*/{_display_(Seq[Any](format.raw/*22.124*/("""checked""")))}),format.raw/*22.132*/(""" """),_display_(/*22.134*/toHtmlArgs(fieldInfo.innerArgsMap)),format.raw/*22.168*/(""">
        <a href=""""),_display_(/*23.19*/routes/*23.25*/.Topic.topic(cluster,topic)),format.raw/*23.52*/("""">"""),_display_(/*23.55*/topic),format.raw/*23.60*/("""</a>
    </label>
</div>
""")))}),format.raw/*26.2*/("""
""")))};def /*29.2*/renderForm/*29.12*/(addMultipleTopicsPartitionsForm: Form[models.form.AddMultipleTopicsPartitions]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*29.96*/("""
"""),_display_(/*30.2*/b3/*30.4*/.form(routes.Topic.handleAddPartitionsToMultipleTopics(cluster))/*30.68*/ {_display_(Seq[Any](format.raw/*30.70*/("""
"""),format.raw/*31.1*/("""<table class="table">
    <thead>
    <tr><th>Add Partitions</th><th>Brokers</th></tr>
    </thead>
    <tbody>
    <tr>
        &#9888; Selected topics will have the same number of partitions after the operation.
    </tr>
    <tr>
        <td>
            """),_display_(/*41.14*/b3/*41.16*/.text(addMultipleTopicsPartitionsForm("partitions"), '_label -> "Partitions", 'placeholder -> "8")),format.raw/*41.114*/("""
            """),_display_(/*42.14*/helper/*42.20*/.repeat(addMultipleTopicsPartitionsForm("readVersions"), min = 1)/*42.85*/ { readVersionForm =>_display_(Seq[Any](format.raw/*42.106*/("""
            """),_display_(/*43.14*/b3/*43.16*/.hidden(readVersionForm("topic").name,readVersionForm("topic").value.getOrElse(""))),format.raw/*43.99*/("""
            """),_display_(/*44.14*/b3/*44.16*/.hidden(readVersionForm("version").name,readVersionForm("version").value.getOrElse(-1))),format.raw/*44.103*/("""
            """)))}),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""<button type="button" class="btn btn-default" onClick="checkBoxSelect('topics',true);">
                <b>Select All</b>
            </button>
            <button type="button" class="btn btn-default" onClick="checkBoxSelect('topics',false);">
                <b>Select None</b>
            </button>
            """),_display_(/*52.14*/helper/*52.20*/.repeat(addMultipleTopicsPartitionsForm("topics"), min = 1)/*52.79*/ { topicSelectForm =>_display_(Seq[Any](format.raw/*52.100*/("""
            """),_display_(/*53.14*/b3/*53.16*/.hidden(topicSelectForm("name").name,topicSelectForm("name").value.getOrElse(""))),format.raw/*53.97*/("""
            """),_display_(/*54.14*/checkboxWithLink(topicSelectForm("selected"),topicSelectForm("name").value.getOrElse(""))),format.raw/*54.103*/("""
            """)))}),format.raw/*55.14*/("""
        """),format.raw/*56.9*/("""</td>
        <td>
            <button type="button" class="btn btn-default" onClick="checkBoxSelect('brokers',true);">
                <b>Select All</b>
            </button>
            <button type="button" class="btn btn-default" onClick="checkBoxSelect('brokers',false);">
                <b>Select None</b>
            </button>
            """),_display_(/*64.14*/helper/*64.20*/.repeat(addMultipleTopicsPartitionsForm("brokers"), min = 1)/*64.80*/ { brokerSelectForm =>_display_(Seq[Any](format.raw/*64.102*/("""
            """),_display_(/*65.14*/b3/*65.16*/.hidden(brokerSelectForm("id").name,brokerSelectForm("id").value.getOrElse(-1))),format.raw/*65.95*/("""
            """),_display_(/*66.14*/b3/*66.16*/.hidden(brokerSelectForm("host").name,brokerSelectForm("host").value.getOrElse(""))),format.raw/*66.99*/("""
            """),_display_(/*67.14*/b3/*67.16*/.checkbox(brokerSelectForm("selected"), '_text -> s"${brokerSelectForm("id").value.getOrElse(-1)} - ${brokerSelectForm("host").value.getOrElse("")}")),format.raw/*67.165*/("""
            """)))}),format.raw/*68.14*/("""
        """),format.raw/*69.9*/("""</td>
    </tr>
    </tbody>
</table>
"""),_display_(/*73.2*/b3/*73.4*/.submit('class -> "submit-button btn btn-primary")/*73.54*/{_display_(Seq[Any](format.raw/*73.55*/(""" """),format.raw/*73.56*/("""Add Partitions """)))}),format.raw/*73.72*/("""
"""),format.raw/*74.1*/("""<a href=""""),_display_(/*74.11*/routes/*74.17*/.Topic.topics(cluster)),format.raw/*74.39*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
""")))}),format.raw/*75.2*/("""
""")))};
Seq[Any](format.raw/*7.111*/("""

"""),format.raw/*12.1*/("""
"""),format.raw/*16.2*/("""

"""),format.raw/*27.2*/("""

"""),format.raw/*76.2*/("""

"""),_display_(/*78.2*/main(
"Add Partitions to Multiple Topics",
menu = theMenu,
breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Topics",cluster)))/*81.115*/ {_display_(Seq[Any](format.raw/*81.117*/("""
"""),format.raw/*82.1*/("""<div class="col-md-6 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Add Partitions</h3></div>
        <div class="panel-body">
            """),_display_(/*86.14*/errorOrForm/*86.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*86.87*/("""
        """),format.raw/*87.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*90.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddMultipleTopicsPartitions], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrForm)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddMultipleTopicsPartitions], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrForm) => (af,messages,menus) => apply(cluster,errorOrForm)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object addPartitionsToMultipleTopics extends addPartitionsToMultipleTopics_Scope0.addPartitionsToMultipleTopics_Scope1.addPartitionsToMultipleTopics
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/addPartitionsToMultipleTopics.scala.html
                  HASH: ebd11a5728eb241ff157de43955b3b69f066c88a
                  MATRIX: 861->135|1268->471|1283->478|1364->482|1396->488|1410->493|1648->709|1673->714|1698->730|1822->777|1850->779|1860->781|1984->895|2038->910|2066->911|2133->951|2151->960|2175->963|2241->1002|2259->1011|2283->1014|2319->1023|2337->1032|2363->1037|2406->1053|2451->1088|2491->1089|2531->1097|2561->1099|2617->1133|2664->1153|2679->1159|2727->1186|2757->1189|2783->1194|2839->1220|2864->1225|2883->1235|3044->1319|3072->1321|3082->1323|3155->1387|3195->1389|3223->1390|3509->1649|3520->1651|3640->1749|3681->1763|3696->1769|3770->1834|3830->1855|3871->1869|3882->1871|3986->1954|4027->1968|4038->1970|4147->2057|4192->2071|4233->2084|4575->2399|4590->2405|4658->2464|4718->2485|4759->2499|4770->2501|4872->2582|4913->2596|5024->2685|5069->2699|5105->2708|5480->3056|5495->3062|5564->3122|5625->3144|5666->3158|5677->3160|5777->3239|5818->3253|5829->3255|5933->3338|5974->3352|5985->3354|6156->3503|6201->3517|6237->3526|6302->3565|6312->3567|6371->3617|6410->3618|6439->3619|6486->3635|6514->3636|6551->3646|6566->3652|6609->3674|6705->3740|6747->386|6776->469|6804->711|6833->1222|6862->3742|6891->3745|7074->3918|7115->3920|7143->3921|7494->4245|7514->4256|7597->4318|7633->4327|7689->4353
                  LINES: 23->6|30->13|30->13|32->13|33->14|33->14|34->15|35->18|35->18|37->18|38->19|38->19|38->19|38->19|39->20|40->21|40->21|40->21|41->22|41->22|41->22|41->22|41->22|41->22|41->22|41->22|41->22|41->22|41->22|41->22|42->23|42->23|42->23|42->23|42->23|45->26|46->29|46->29|48->29|49->30|49->30|49->30|49->30|50->31|60->41|60->41|60->41|61->42|61->42|61->42|61->42|62->43|62->43|62->43|63->44|63->44|63->44|64->45|65->46|71->52|71->52|71->52|71->52|72->53|72->53|72->53|73->54|73->54|74->55|75->56|83->64|83->64|83->64|83->64|84->65|84->65|84->65|85->66|85->66|85->66|86->67|86->67|86->67|87->68|88->69|92->73|92->73|92->73|92->73|92->73|92->73|93->74|93->74|93->74|93->74|94->75|96->7|98->12|99->16|101->27|103->76|105->78|108->81|108->81|109->82|113->86|113->86|113->86|114->87|117->90
                  -- GENERATED --
              */
          