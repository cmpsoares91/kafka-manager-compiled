
package views.html.broker

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object brokerList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object brokerList_Scope1 {
import kafka.manager.model.ActorModel.BrokerIdentity
import scalaz.{\/}

class brokerList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, kafka.manager.BrokerListExtended],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(cluster:String, errorOrBrokers: kafka.manager.ApiError \/ kafka.manager.BrokerListExtended
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/theMenu/*10.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.13*/("""
    """),_display_(/*11.6*/views/*11.11*/.html.navigation.clusterMenu(cluster,"Brokers","",menus.clusterMenus(cluster)(
        errorOrBrokers.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*12.130*/("""

""")))};def /*16.2*/renderBrokerMetrics/*16.21*/(bl: kafka.manager.BrokerListExtended):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.63*/("""
    """),_display_(/*17.6*/if(bl.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*17.96*/ {_display_(Seq[Any](format.raw/*17.98*/("""
        """),_display_(/*18.10*/views/*18.15*/.html.common.brokerMetrics(bl.combinedMetric)),format.raw/*18.60*/("""
    """)))}/*19.7*/else/*19.12*/{_display_(Seq[Any](format.raw/*19.13*/("""
        """),format.raw/*20.9*/("""<div class="alert alert-info" role="alert">
            Please enable JMX polling <a href=""""),_display_(/*21.49*/routes/*21.55*/.Cluster.updateCluster(cluster)),format.raw/*21.86*/("""" class="alert-link">here</a>.
        </div>
    """)))}),format.raw/*23.6*/("""
""")))};
Seq[Any](format.raw/*8.111*/("""

"""),format.raw/*14.2*/("""
        
"""),format.raw/*24.2*/("""

"""),_display_(/*26.2*/main(
    "Broker List",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Brokers",cluster)))/*29.120*/ {_display_(Seq[Any](format.raw/*29.122*/("""
    """),format.raw/*30.5*/("""<div class="col-md-7 un-pad-me">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3>
                    <button type="button" class="btn btn-link" onclick="goBack()">
                        <span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span>
                    </button>Brokers
                </h3>
            </div>
            """),_display_(/*39.14*/errorOrBrokers/*39.28*/.fold( views.html.errors.onApiError(_), views.html.broker.brokerListContent(cluster,_) )),format.raw/*39.116*/("""
        """),format.raw/*40.9*/("""</div>
    </div>
    <div class="col-md-5 un-pad-me">
        <div class="panel panel-default">
            <div class="panel-heading"><h3>Combined Metrics</h3></div>
            """),_display_(/*45.14*/errorOrBrokers/*45.28*/.fold( views.html.errors.onApiError(_), bl => renderBrokerMetrics(bl))),format.raw/*45.98*/("""
        """),format.raw/*46.9*/("""</div>
    </div>

""")))}),format.raw/*49.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrBrokers:$bslash$div[kafka.manager.ApiError, kafka.manager.BrokerListExtended],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrBrokers)(af,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, kafka.manager.BrokerListExtended]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrBrokers) => (af,messages,menus) => apply(cluster,errorOrBrokers)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object brokerList extends brokerList_Scope0.brokerList_Scope1.brokerList
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/broker/brokerList.scala.html
                  HASH: f52c0ec75462b84eb82c8c46fd357240775f5a32
                  MATRIX: 795->189|1076->394|1091->401|1172->405|1204->411|1218->416|1448->624|1474->638|1502->657|1621->699|1653->705|1752->795|1792->797|1829->807|1843->812|1909->857|1933->864|1946->869|1985->870|2021->879|2140->971|2155->977|2207->1008|2288->1059|2330->391|2359->627|2396->1061|2425->1064|2599->1228|2640->1230|2672->1235|3105->1641|3128->1655|3238->1743|3274->1752|3482->1933|3505->1947|3596->2017|3632->2026|3682->2046
                  LINES: 24->7|29->10|29->10|31->10|32->11|32->11|33->12|35->16|35->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|42->21|42->21|42->21|44->23|46->8|48->14|50->24|52->26|55->29|55->29|56->30|65->39|65->39|65->39|66->40|71->45|71->45|71->45|72->46|75->49
                  -- GENERATED --
              */
          