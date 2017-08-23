
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createTopic_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object createTopic_Scope1 {
import scalaz.{\/}

class createTopic extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateTopic], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, errorOrForm: kafka.manager.ApiError \/ (Form[models.form.CreateTopic], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import controllers.routes
def /*13.2*/theMenu/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),_display_(/*14.6*/views/*14.11*/.html.navigation.clusterMenu(cluster,"Topic","Create",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*15.115*/("""
""")))};def /*18.2*/renderForm/*18.12*/(createTopicForm: Form[models.form.CreateTopic]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.64*/("""
"""),format.raw/*19.1*/("""<div class="panel-body">
    """),_display_(/*20.6*/b3/*20.8*/.form(routes.Topic.handleCreateTopic(cluster))/*20.54*/ {_display_(Seq[Any](format.raw/*20.56*/("""
    """),format.raw/*21.5*/("""<table class="table">
        <tbody>
        <tr>
            <td>
                """),_display_(/*25.18*/b3/*25.20*/.text(createTopicForm("topic"), '_label -> "Topic", 'placeholder -> "", 'autofocus -> true )),format.raw/*25.112*/("""
                """),_display_(/*26.18*/b3/*26.20*/.text(createTopicForm("partitions"), '_label -> "Partitions", 'placeholder -> "8")),format.raw/*26.102*/("""
                """),_display_(/*27.18*/b3/*27.20*/.text(createTopicForm("replication"), '_label -> "Replication Factor", 'placeholder -> "3")),format.raw/*27.111*/("""
                """),_display_(/*28.18*/b3/*28.20*/.submit('class -> "submit-button btn btn-primary")/*28.70*/{_display_(Seq[Any](format.raw/*28.71*/(""" """),format.raw/*28.72*/("""Create """)))}),format.raw/*28.80*/("""
                """),format.raw/*29.17*/("""<a href=""""),_display_(/*29.27*/routes/*29.33*/.Topic.topics(cluster)),format.raw/*29.55*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
            </td>
            <td>
                """),_display_(/*32.18*/helper/*32.24*/.repeat(createTopicForm("configs"), min = 1)/*32.68*/ { configsForm =>_display_(Seq[Any](format.raw/*32.85*/("""
                    """),_display_(/*33.22*/b3/*33.24*/.hidden(configsForm("name").name, configsForm("name").value.getOrElse(""))),format.raw/*33.98*/("""
                    """),_display_(/*34.22*/b3/*34.24*/.text(configsForm("value"), '_label -> configsForm("name").value.getOrElse(""))),format.raw/*34.103*/("""
                """)))}),format.raw/*35.18*/("""
            """),format.raw/*36.13*/("""</td>
        </tr>
        </tbody>
    </table>
    """)))}),format.raw/*40.6*/("""
"""),format.raw/*41.1*/("""</div>
""")))};
Seq[Any](format.raw/*7.111*/("""

"""),format.raw/*12.1*/("""
"""),format.raw/*16.2*/("""
        
"""),format.raw/*42.2*/("""

"""),_display_(/*44.2*/main(
    "Create Topic",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Create Topic",cluster)))/*47.125*/ {_display_(Seq[Any](format.raw/*47.127*/("""
    """),format.raw/*48.5*/("""<div class="col-md-6 un-pad-me">
        <div class="panel panel-default">
            <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Create Topic</h3></div>
            """),_display_(/*51.14*/errorOrForm/*51.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*51.87*/("""
        """),format.raw/*52.9*/("""</div>
    </div>
""")))}),format.raw/*54.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateTopic], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrForm)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateTopic], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrForm) => (af,messages,menus) => apply(cluster,errorOrForm)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object createTopic extends createTopic_Scope0.createTopic_Scope1.createTopic
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/createTopic.scala.html
                  HASH: 7061ad6eceec28c6aeddb7f49ef32860f5b2f16c
                  MATRIX: 791->135|1182->455|1197->462|1278->466|1310->472|1324->477|1543->674|1568->687|1587->697|1716->749|1744->750|1800->780|1810->782|1865->828|1905->830|1937->835|2049->920|2060->922|2174->1014|2219->1032|2230->1034|2334->1116|2379->1134|2390->1136|2503->1227|2548->1245|2559->1247|2618->1297|2657->1298|2686->1299|2725->1307|2770->1324|2807->1334|2822->1340|2865->1362|3009->1479|3024->1485|3077->1529|3132->1546|3181->1568|3192->1570|3287->1644|3336->1666|3347->1668|3448->1747|3497->1765|3538->1778|3623->1833|3651->1834|3699->370|3728->453|3756->676|3793->1842|3822->1845|4002->2015|4043->2017|4075->2022|4399->2319|4419->2330|4502->2392|4538->2401|4587->2420
                  LINES: 23->6|30->13|30->13|32->13|33->14|33->14|34->15|35->18|35->18|37->18|38->19|39->20|39->20|39->20|39->20|40->21|44->25|44->25|44->25|45->26|45->26|45->26|46->27|46->27|46->27|47->28|47->28|47->28|47->28|47->28|47->28|48->29|48->29|48->29|48->29|51->32|51->32|51->32|51->32|52->33|52->33|52->33|53->34|53->34|53->34|54->35|55->36|59->40|60->41|62->7|64->12|65->16|67->42|69->44|72->47|72->47|73->48|76->51|76->51|76->51|77->52|79->54
                  -- GENERATED --
              */
          