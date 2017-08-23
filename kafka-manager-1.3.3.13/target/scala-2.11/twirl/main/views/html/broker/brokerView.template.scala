
package views.html.broker

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object brokerView_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object brokerView_Scope1 {
import scalaz.{\/}

class brokerView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,Int,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.BVView],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, brokerId: Int, errorOrBrokerView: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.BVView
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.clusterMenu(cluster,"Brokers","",menus.clusterMenus(cluster)(
        errorOrBrokerView.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.133*/("""
""")))};def /*14.2*/brokerScripts/*14.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.19*/("""
    """),format.raw/*15.5*/("""<script ype="text/javascript">
        $(document).ready(function() """),format.raw/*16.38*/("""{"""),format.raw/*16.39*/("""
            """),format.raw/*17.13*/("""$('#broker-table').DataTable(
                    """),format.raw/*18.21*/("""{"""),format.raw/*18.22*/("""
                        """),format.raw/*19.25*/(""""lengthMenu": [[-1, 50, 25, 10], ["All", 50, 25, 10]]
                    """),format.raw/*20.21*/("""}"""),format.raw/*20.22*/("""
            """),format.raw/*21.13*/(""");
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/(""" """),format.raw/*22.11*/(""");
    </script>
""")))};
Seq[Any](format.raw/*7.111*/("""

"""),format.raw/*12.2*/("""

"""),format.raw/*24.2*/("""

"""),_display_(/*26.2*/main(
    "Broker View",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Broker View",cluster,brokerId.toString)),
    scripts=brokerScripts)/*30.27*/ {_display_(Seq[Any](format.raw/*30.29*/("""
"""),format.raw/*31.1*/("""<div class="col-md-12 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Broker Id """),_display_(/*34.170*/brokerId),format.raw/*34.178*/("""</h3>
        </div>
    """),_display_(/*36.6*/errorOrBrokerView/*36.23*/.fold[Html](views.html.errors.onApiError(_), views.html.broker.brokerViewContent(cluster, brokerId, _))),format.raw/*36.126*/("""
    """),format.raw/*37.5*/("""</div>
</div>
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,brokerId:Int,errorOrBrokerView:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.BVView],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,brokerId,errorOrBrokerView)(af,messages,menus)

  def f:((String,Int,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.BVView]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,brokerId,errorOrBrokerView) => (af,messages,menus) => apply(cluster,brokerId,errorOrBrokerView)(af,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object brokerView extends brokerView_Scope0.brokerView_Scope1.brokerView
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/broker/brokerView.scala.html
                  HASH: 6322e3061ce560d6f15701950b765c8044bd19d0
                  MATRIX: 751->135|1054->363|1068->370|1148->374|1180->380|1194->385|1427->596|1452->601|1474->614|1555->618|1587->623|1683->691|1712->692|1753->705|1831->755|1860->756|1913->781|2015->855|2044->856|2085->869|2123->880|2152->881|2181->882|2239->360|2268->598|2297->900|2326->903|2553->1121|2593->1123|2621->1124|2926->1401|2956->1409|3008->1435|3034->1452|3159->1555|3191->1560|3236->1575
                  LINES: 23->6|28->9|28->9|30->9|31->10|31->10|32->11|33->14|33->14|35->14|36->15|37->16|37->16|38->17|39->18|39->18|40->19|41->20|41->20|42->21|43->22|43->22|43->22|46->7|48->12|50->24|52->26|56->30|56->30|57->31|60->34|60->34|62->36|62->36|62->36|63->37|65->39
                  -- GENERATED --
              */
          