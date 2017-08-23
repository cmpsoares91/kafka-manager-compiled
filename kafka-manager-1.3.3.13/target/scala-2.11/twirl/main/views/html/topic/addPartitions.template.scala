
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addPartitions_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object addPartitions_Scope1 {
import scalaz.{\/}

class addPartitions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddTopicPartitions], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, topic: String, errorOrForm: kafka.manager.ApiError \/ (Form[models.form.AddTopicPartitions], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import controllers.routes
def /*13.2*/theMenu/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),_display_(/*14.6*/views/*14.11*/.html.navigation.clusterMenu(cluster,"Topic","Add Partitions",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*15.115*/("""
""")))};def /*18.2*/renderForm/*18.12*/(addTopicPartitionsForm: Form[models.form.AddTopicPartitions]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.78*/("""
    """),_display_(/*19.6*/b3/*19.8*/.form(routes.Topic.handleAddPartitions(cluster, topic))/*19.63*/ {_display_(Seq[Any](format.raw/*19.65*/("""
        """),format.raw/*20.9*/("""<table class="table">
            <thead>
            <tr><th>Add Partitions</th><th>Brokers</th></tr>
            </thead>
            <tbody>
                <tr>
                <td>
                """),_display_(/*27.18*/b3/*27.20*/.text(addTopicPartitionsForm("topic"), '_label -> "Topic", 'placeholder -> "", 'autofocus -> true )),format.raw/*27.119*/("""
                """),_display_(/*28.18*/b3/*28.20*/.text(addTopicPartitionsForm("partitions"), '_label -> "Partitions", 'placeholder -> "8")),format.raw/*28.109*/("""
                """),_display_(/*29.18*/b3/*29.20*/.hidden(addTopicPartitionsForm("readVersion").name,addTopicPartitionsForm("readVersion").value.getOrElse(-1))),format.raw/*29.129*/("""
                """),format.raw/*30.17*/("""</td>
                <td>
                    <button type="button" class="btn btn-default" onClick="checkBoxSelect('brokers',true);">
                        <b>Select All</b>
                    </button>
                    <button type="button" class="btn btn-default" onClick="checkBoxSelect('brokers',false);">
                        <b>Select None</b>
                    </button>
                    """),_display_(/*38.22*/helper/*38.28*/.repeat(addTopicPartitionsForm("brokers"), min = 1)/*38.79*/ { brokerSelectForm =>_display_(Seq[Any](format.raw/*38.101*/("""
                        """),_display_(/*39.26*/b3/*39.28*/.hidden(brokerSelectForm("id").name,brokerSelectForm("id").value.getOrElse(-1))),format.raw/*39.107*/("""
                        """),_display_(/*40.26*/b3/*40.28*/.hidden(brokerSelectForm("host").name,brokerSelectForm("host").value.getOrElse(""))),format.raw/*40.111*/("""
                        """),_display_(/*41.26*/b3/*41.28*/.checkbox(brokerSelectForm("selected"), '_text -> s"${brokerSelectForm("id").value.getOrElse(-1)} - ${brokerSelectForm("host").value.getOrElse("")}")),format.raw/*41.177*/("""
                    """)))}),format.raw/*42.22*/("""
                """),format.raw/*43.17*/("""</td>
            </tr>
            </tbody>
        </table>
        """),_display_(/*47.10*/b3/*47.12*/.submit('class -> "submit-button btn btn-primary")/*47.62*/{_display_(Seq[Any](format.raw/*47.63*/(""" """),format.raw/*47.64*/("""Add Partitions """)))}),format.raw/*47.80*/("""
        """),format.raw/*48.9*/("""<a href=""""),_display_(/*48.19*/routes/*48.25*/.Topic.topic(cluster,topic)),format.raw/*48.52*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
    """)))}),format.raw/*49.6*/("""
""")))};
Seq[Any](format.raw/*7.111*/("""

"""),format.raw/*12.1*/("""
"""),format.raw/*16.2*/("""
        
"""),format.raw/*50.2*/("""

"""),_display_(/*52.2*/main(
    "Add Partitions",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndClusterAndTopic("Topic View",cluster,topic,"Add Partitions")))/*55.159*/ {_display_(Seq[Any](format.raw/*55.161*/("""
    """),format.raw/*56.5*/("""<div class="col-md-6 un-pad-me">
        <div class="panel panel-default">
            <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Add Partitions</h3></div>
            <div class="panel-body">
                """),_display_(/*60.18*/errorOrForm/*60.29*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*60.91*/("""
            """),format.raw/*61.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*64.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,topic:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddTopicPartitions], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,errorOrForm)(af,messages,menus)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddTopicPartitions], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,errorOrForm) => (af,messages,menus) => apply(cluster,topic,errorOrForm)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object addPartitions extends addPartitions_Scope0.addPartitions_Scope1.addPartitions
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/addPartitions.scala.html
                  HASH: 4e41941fce63e7297a7f3912e7114e144f0f61c1
                  MATRIX: 811->135|1224->477|1239->484|1320->488|1352->494|1366->499|1593->704|1618->717|1637->727|1780->793|1812->799|1822->801|1886->856|1926->858|1962->867|2192->1070|2203->1072|2324->1171|2369->1189|2380->1191|2491->1280|2536->1298|2547->1300|2678->1409|2723->1426|3162->1838|3177->1844|3237->1895|3298->1917|3351->1943|3362->1945|3463->2024|3516->2050|3527->2052|3632->2135|3685->2161|3696->2163|3867->2312|3920->2334|3965->2351|4063->2422|4074->2424|4133->2474|4172->2475|4201->2476|4248->2492|4284->2501|4321->2511|4336->2517|4384->2544|4484->2614|4526->392|4555->475|4583->706|4620->2616|4649->2619|4865->2825|4906->2827|4938->2832|5305->3172|5325->3183|5408->3245|5449->3258|5513->3292
                  LINES: 23->6|30->13|30->13|32->13|33->14|33->14|34->15|35->18|35->18|37->18|38->19|38->19|38->19|38->19|39->20|46->27|46->27|46->27|47->28|47->28|47->28|48->29|48->29|48->29|49->30|57->38|57->38|57->38|57->38|58->39|58->39|58->39|59->40|59->40|59->40|60->41|60->41|60->41|61->42|62->43|66->47|66->47|66->47|66->47|66->47|66->47|67->48|67->48|67->48|67->48|68->49|70->7|72->12|73->16|75->50|77->52|80->55|80->55|81->56|85->60|85->60|85->60|86->61|89->64
                  -- GENERATED --
              */
          