
package views.html.cluster

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addCluster_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class addCluster extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[kafka.manager.model.ClusterConfig],play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(addClusterForm: Form[kafka.manager.model.ClusterConfig])(implicit messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor
import controllers.routes
def /*10.2*/theMenu/*10.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.13*/("""
    """),_display_(/*11.6*/views/*11.11*/.html.navigation.defaultMenu(views.html.navigation.menuNav("Cluster","Add Cluster",menus.indexMenu))),format.raw/*11.111*/("""
""")))};def /*14.2*/checkboxWithLink/*14.18*/(field: play.api.data.Field):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.50*/("""
"""),_display_(/*15.2*/b3/*15.4*/.inputFormGroup(field, withFeedback = false, withLabelFor = false, b3.Args.withDefault(Seq(), 'disabled -> false))/*15.118*/ { fieldInfo =>_display_(Seq[Any](format.raw/*15.133*/("""
"""),format.raw/*16.1*/("""<div class="checkbox">
    <label for=""""),_display_(/*17.18*/fieldInfo/*17.27*/.id),format.raw/*17.30*/("""">
        <input type="checkbox" id=""""),_display_(/*18.37*/fieldInfo/*18.46*/.id),format.raw/*18.49*/("""" name=""""),_display_(/*18.58*/fieldInfo/*18.67*/.name),format.raw/*18.72*/("""" value="true" """),_display_(/*18.88*/if(fieldInfo.value == Some("true"))/*18.123*/{_display_(Seq[Any](format.raw/*18.124*/("""checked""")))}),format.raw/*18.132*/(""" """),_display_(/*18.134*/toHtmlArgs(fieldInfo.innerArgsMap)),format.raw/*18.168*/(""">
        Display Broker and Topic Size (only works after applying <a href="https://issues.apache.org/jira/browse/KAFKA-1614">this patch</a>)
    </label>
</div>
""")))}),format.raw/*22.2*/("""
""")))};def /*25.2*/drawForm/*25.10*/(form : Form[kafka.manager.model.ClusterConfig]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*25.62*/("""
    """),_display_(/*26.6*/b3/*26.8*/.form(routes.Cluster.handleAddCluster)/*26.46*/ {_display_(Seq[Any](format.raw/*26.48*/("""
    """),format.raw/*27.5*/("""<fieldset>
        """),_display_(/*28.10*/b3/*28.12*/.text(form("name"), '_label -> "Cluster Name", 'placeholder -> "", 'autofocus -> true )),format.raw/*28.99*/("""
        """),_display_(/*29.10*/b3/*29.12*/.text(form("zkHosts"), '_label -> "Cluster Zookeeper Hosts", 'placeholder -> "zk1:2181,zk2:2181,zk3:2181/NAMESPACE")),format.raw/*29.128*/("""
        """),_display_(/*30.10*/b3/*30.12*/.select( form("kafkaVersion"), options = kafka.manager.model.KafkaVersion.formSelectList, '_label -> "Kafka Version" )),format.raw/*30.130*/("""
        """),_display_(/*31.10*/b3/*31.12*/.checkbox(form("jmxEnabled"), '_text -> "Enable JMX Polling (Set JMX_PORT env variable before starting kafka server)")),format.raw/*31.130*/("""
        """),_display_(/*32.10*/b3/*32.12*/.text(form("jmxUser"), '_label -> "JMX Auth Username")),format.raw/*32.66*/("""
        """),_display_(/*33.10*/b3/*33.12*/.text(form("jmxPass"), '_label -> "JMX Auth Password")),format.raw/*33.66*/("""
        """),_display_(/*34.10*/b3/*34.12*/.checkbox(form("jmxSsl"), '_text -> "JMX with SSL")),format.raw/*34.63*/("""
        """),_display_(/*35.10*/b3/*35.12*/.checkbox(form("logkafkaEnabled"), '_text -> "Enable Logkafka")),format.raw/*35.75*/("""
        """),_display_(/*36.10*/b3/*36.12*/.checkbox(form("pollConsumers"), '_text -> "Poll consumer information (Not recommended for large # of consumers)")),format.raw/*36.126*/("""
        """),_display_(/*37.10*/b3/*37.12*/.checkbox(form("filterConsumers"), '_text -> "Filter out inactive consumers")),format.raw/*37.89*/("""
        """),_display_(/*38.10*/b3/*38.12*/.checkbox(form("activeOffsetCacheEnabled"), '_text -> "Enable Active OffsetCache (Not recommended for large # of consumers)")),format.raw/*38.137*/("""
        """),_display_(/*39.10*/checkboxWithLink(form("displaySizeEnabled"))),format.raw/*39.54*/("""
        """),_display_(/*40.10*/b3/*40.12*/.number(form("tuning.brokerViewUpdatePeriodSeconds"), '_label -> "brokerViewUpdatePeriodSeconds")),format.raw/*40.109*/("""
        """),_display_(/*41.10*/b3/*41.12*/.number(form("tuning.clusterManagerThreadPoolSize"), '_label -> "clusterManagerThreadPoolSize")),format.raw/*41.107*/("""
        """),_display_(/*42.10*/b3/*42.12*/.number(form("tuning.clusterManagerThreadPoolQueueSize"), '_label -> "clusterManagerThreadPoolQueueSize")),format.raw/*42.117*/("""
        """),_display_(/*43.10*/b3/*43.12*/.number(form("tuning.kafkaCommandThreadPoolSize"), '_label -> "kafkaCommandThreadPoolSize")),format.raw/*43.103*/("""
        """),_display_(/*44.10*/b3/*44.12*/.number(form("tuning.kafkaCommandThreadPoolQueueSize"), '_label -> "kafkaCommandThreadPoolQueueSize")),format.raw/*44.113*/("""
        """),_display_(/*45.10*/b3/*45.12*/.number(form("tuning.logkafkaCommandThreadPoolSize"), '_label -> "logkafkaCommandThreadPoolSize")),format.raw/*45.109*/("""
        """),_display_(/*46.10*/b3/*46.12*/.number(form("tuning.logkafkaCommandThreadPoolQueueSize"), '_label -> "logkafkaCommandThreadPoolQueueSize")),format.raw/*46.119*/("""
        """),_display_(/*47.10*/b3/*47.12*/.number(form("tuning.logkafkaUpdatePeriodSeconds"), '_label -> "logkafkaUpdatePeriodSeconds")),format.raw/*47.105*/("""
        """),_display_(/*48.10*/b3/*48.12*/.number(form("tuning.partitionOffsetCacheTimeoutSecs"), '_label -> "partitionOffsetCacheTimeoutSecs")),format.raw/*48.113*/("""
        """),_display_(/*49.10*/b3/*49.12*/.number(form("tuning.brokerViewThreadPoolSize"), '_label -> "brokerViewThreadPoolSize")),format.raw/*49.99*/("""
        """),_display_(/*50.10*/b3/*50.12*/.number(form("tuning.brokerViewThreadPoolQueueSize"), '_label -> "brokerViewThreadPoolQueueSize")),format.raw/*50.109*/("""
        """),_display_(/*51.10*/b3/*51.12*/.number(form("tuning.offsetCacheThreadPoolSize"), '_label -> "offsetCacheThreadPoolSize")),format.raw/*51.101*/("""
        """),_display_(/*52.10*/b3/*52.12*/.number(form("tuning.offsetCacheThreadPoolQueueSize"), '_label -> "offsetCacheThreadPoolQueueSize")),format.raw/*52.111*/("""
        """),_display_(/*53.10*/b3/*53.12*/.number(form("tuning.kafkaAdminClientThreadPoolSize"), '_label -> "kafkaAdminClientThreadPoolSize")),format.raw/*53.111*/("""
        """),_display_(/*54.10*/b3/*54.12*/.number(form("tuning.kafkaAdminClientThreadPoolQueueSize"), '_label -> "kafkaAdminClientThreadPoolQueueSize")),format.raw/*54.121*/("""
        """),_display_(/*55.10*/b3/*55.12*/.select( form("securityProtocol"), options = kafka.manager.model.SecurityProtocol.formSelectList, '_label -> "Security Protocol" )),format.raw/*55.142*/("""
        """),_display_(/*56.10*/b3/*56.12*/.submit('class -> "submit-button btn btn-primary")/*56.62*/{_display_(Seq[Any](format.raw/*56.63*/(""" """),format.raw/*56.64*/("""Save """)))}),format.raw/*56.70*/("""
        """),format.raw/*57.9*/("""<a href=""""),_display_(/*57.19*/routes/*57.25*/.Application.index()),format.raw/*57.45*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
    </fieldset>
    """)))}),format.raw/*59.6*/("""
""")))};
Seq[Any](format.raw/*5.134*/("""

"""),format.raw/*9.1*/("""
"""),format.raw/*12.2*/("""

"""),format.raw/*23.2*/("""

"""),format.raw/*60.2*/("""

"""),_display_(/*62.2*/main("Add Cluster", menu = theMenu, breadcrumbs = views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withView("Add Cluster")))/*62.141*/ {_display_(Seq[Any](format.raw/*62.143*/("""
    """),format.raw/*63.5*/("""<div class="col-md-6 un-pad-me">
        <div class="panel panel-default">
            <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Add Cluster</h3></div>
            <div class="panel-body">
                """),_display_(/*67.18*/drawForm(addClusterForm)),format.raw/*67.42*/("""
            """),format.raw/*68.13*/("""</div>
        </div>
        """),_display_(/*70.10*/configReferences()),format.raw/*70.28*/("""
    """),format.raw/*71.5*/("""</div>
""")))}),format.raw/*72.2*/("""

"""))
      }
    }
  }

  def render(addClusterForm:Form[kafka.manager.model.ClusterConfig],messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(addClusterForm)(messages,menus)

  def f:((Form[kafka.manager.model.ClusterConfig]) => (play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (addClusterForm) => (messages,menus) => apply(addClusterForm)(messages,menus)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object addCluster extends addCluster_Scope0.addCluster
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/cluster/addCluster.scala.html
                  HASH: ab999e8729144ae74b25b0ca60fa692ef9bdf3d7
                  MATRIX: 734->115|1006->315|1021->322|1102->326|1134->332|1148->337|1270->437|1295->442|1320->458|1429->490|1457->492|1467->494|1591->608|1645->623|1673->624|1740->664|1758->673|1782->676|1848->715|1866->724|1890->727|1926->736|1944->745|1970->750|2013->766|2058->801|2098->802|2138->810|2168->812|2224->846|2417->1009|2442->1014|2459->1022|2588->1074|2620->1080|2630->1082|2677->1120|2717->1122|2749->1127|2796->1147|2807->1149|2915->1236|2952->1246|2963->1248|3101->1364|3138->1374|3149->1376|3289->1494|3326->1504|3337->1506|3477->1624|3514->1634|3525->1636|3600->1690|3637->1700|3648->1702|3723->1756|3760->1766|3771->1768|3843->1819|3880->1829|3891->1831|3975->1894|4012->1904|4023->1906|4159->2020|4196->2030|4207->2032|4305->2109|4342->2119|4353->2121|4500->2246|4537->2256|4602->2300|4639->2310|4650->2312|4769->2409|4806->2419|4817->2421|4934->2516|4971->2526|4982->2528|5109->2633|5146->2643|5157->2645|5270->2736|5307->2746|5318->2748|5441->2849|5478->2859|5489->2861|5608->2958|5645->2968|5656->2970|5785->3077|5822->3087|5833->3089|5948->3182|5985->3192|5996->3194|6119->3295|6156->3305|6167->3307|6275->3394|6312->3404|6323->3406|6442->3503|6479->3513|6490->3515|6601->3604|6638->3614|6649->3616|6770->3715|6807->3725|6818->3727|6939->3826|6976->3836|6987->3838|7118->3947|7155->3957|7166->3959|7318->4089|7355->4099|7366->4101|7425->4151|7464->4152|7493->4153|7530->4159|7566->4168|7603->4178|7618->4184|7659->4204|7775->4290|7817->247|7845->313|7873->439|7902->1011|7931->4292|7960->4295|8109->4434|8150->4436|8182->4441|8546->4778|8591->4802|8632->4815|8690->4846|8729->4864|8761->4869|8799->4877
                  LINES: 23->5|28->10|28->10|30->10|31->11|31->11|31->11|32->14|32->14|34->14|35->15|35->15|35->15|35->15|36->16|37->17|37->17|37->17|38->18|38->18|38->18|38->18|38->18|38->18|38->18|38->18|38->18|38->18|38->18|38->18|42->22|43->25|43->25|45->25|46->26|46->26|46->26|46->26|47->27|48->28|48->28|48->28|49->29|49->29|49->29|50->30|50->30|50->30|51->31|51->31|51->31|52->32|52->32|52->32|53->33|53->33|53->33|54->34|54->34|54->34|55->35|55->35|55->35|56->36|56->36|56->36|57->37|57->37|57->37|58->38|58->38|58->38|59->39|59->39|60->40|60->40|60->40|61->41|61->41|61->41|62->42|62->42|62->42|63->43|63->43|63->43|64->44|64->44|64->44|65->45|65->45|65->45|66->46|66->46|66->46|67->47|67->47|67->47|68->48|68->48|68->48|69->49|69->49|69->49|70->50|70->50|70->50|71->51|71->51|71->51|72->52|72->52|72->52|73->53|73->53|73->53|74->54|74->54|74->54|75->55|75->55|75->55|76->56|76->56|76->56|76->56|76->56|76->56|77->57|77->57|77->57|77->57|79->59|81->5|83->9|84->12|86->23|88->60|90->62|90->62|90->62|91->63|95->67|95->67|96->68|98->70|98->70|99->71|100->72
                  -- GENERATED --
              */
          