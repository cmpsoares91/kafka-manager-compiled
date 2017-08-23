
package views.html.cluster

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateCluster_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object updateCluster_Scope1 {
import scalaz.{\/}

class updateCluster extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, Form[models.form.ClusterOperation]],RequestHeader,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(clusterName: String, errorOrForm: kafka.manager.ApiError \/ Form[models.form.ClusterOperation]
)(implicit request: RequestHeader, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor
import controllers.routes
def /*12.2*/theMenu/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),_display_(/*13.6*/views/*13.11*/.html.navigation.defaultMenu(views.html.navigation.menuNav("Cluster","Update Cluster",menus.indexMenu))),format.raw/*13.114*/("""
""")))};def /*16.2*/checkboxWithLink/*16.18*/(field: play.api.data.Field):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.50*/("""
"""),_display_(/*17.2*/b3/*17.4*/.inputFormGroup(field, withFeedback = false, withLabelFor = false, b3.Args.withDefault(Seq(), 'disabled -> false))/*17.118*/ { fieldInfo =>_display_(Seq[Any](format.raw/*17.133*/("""
"""),format.raw/*18.1*/("""<div class="checkbox">
    <label for=""""),_display_(/*19.18*/fieldInfo/*19.27*/.id),format.raw/*19.30*/("""">
        <input type="checkbox" id=""""),_display_(/*20.37*/fieldInfo/*20.46*/.id),format.raw/*20.49*/("""" name=""""),_display_(/*20.58*/fieldInfo/*20.67*/.name),format.raw/*20.72*/("""" value="true" """),_display_(/*20.88*/if(fieldInfo.value == Some("true"))/*20.123*/{_display_(Seq[Any](format.raw/*20.124*/("""checked""")))}),format.raw/*20.132*/(""" """),_display_(/*20.134*/toHtmlArgs(fieldInfo.innerArgsMap)),format.raw/*20.168*/(""">
        Display Broker and Topic Size (only works after applying <a href="https://issues.apache.org/jira/browse/KAFKA-1614">this patch</a>)
    </label>
</div>
""")))}),format.raw/*24.2*/("""
""")))};def /*27.2*/drawForm/*27.10*/(form : Form[models.form.ClusterOperation]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*27.57*/("""
    """),_display_(/*28.6*/b3/*28.8*/.form(routes.Cluster.handleUpdateCluster(clusterName))/*28.62*/ {_display_(Seq[Any](format.raw/*28.64*/("""
    """),format.raw/*29.5*/("""<fieldset>
        <input type="hidden" name="operation" value="Update">
        <input type="hidden" name="name" value=""""),_display_(/*31.50*/clusterName),format.raw/*31.61*/("""">
        """),_display_(/*32.10*/b3/*32.12*/.text(form("zkHosts"), '_label -> "Cluster Zookeeper Hosts", 'placeholder -> "zk1:2181,zk2:2181,zk3:2181/NAMESPACE", 'autoFocus -> true)),format.raw/*32.148*/("""
        """),_display_(/*33.10*/b3/*33.12*/.select( form("kafkaVersion"), options = kafka.manager.model.KafkaVersion.formSelectList, '_label -> "Kafka Version" )),format.raw/*33.130*/("""
        """),_display_(/*34.10*/b3/*34.12*/.checkbox(form("jmxEnabled"), '_text -> "Enable JMX Polling (Set JMX_PORT env variable before starting kafka server)")),format.raw/*34.130*/("""
        """),_display_(/*35.10*/b3/*35.12*/.text(form("jmxUser"), '_label -> "JMX Auth Username")),format.raw/*35.66*/("""
        """),_display_(/*36.10*/b3/*36.12*/.text(form("jmxPass"), '_label -> "JMX Auth Password")),format.raw/*36.66*/("""
        """),_display_(/*37.10*/b3/*37.12*/.checkbox(form("jmxSsl"), '_text -> "JMX with SSL")),format.raw/*37.63*/("""
        """),_display_(/*38.10*/b3/*38.12*/.checkbox(form("pollConsumers"), '_text -> "Poll consumer information (Not recommended for large # of consumers)")),format.raw/*38.126*/("""
        """),_display_(/*39.10*/b3/*39.12*/.checkbox(form("filterConsumers"), '_text -> "Filter out inactive consumers")),format.raw/*39.89*/("""
        """),_display_(/*40.10*/b3/*40.12*/.checkbox(form("logkafkaEnabled"), '_text -> "Enable Logkafka")),format.raw/*40.75*/("""
        """),_display_(/*41.10*/b3/*41.12*/.checkbox(form("activeOffsetCacheEnabled"), '_text -> "Enable Active OffsetCache (Not recommended for large # of consumers)")),format.raw/*41.137*/("""
        """),_display_(/*42.10*/checkboxWithLink(form("displaySizeEnabled"))),format.raw/*42.54*/("""
        """),_display_(/*43.10*/b3/*43.12*/.number(form("tuning.brokerViewUpdatePeriodSeconds"), '_label -> "brokerViewUpdatePeriodSeconds")),format.raw/*43.109*/("""
        """),_display_(/*44.10*/b3/*44.12*/.number(form("tuning.clusterManagerThreadPoolSize"), '_label -> "clusterManagerThreadPoolSize")),format.raw/*44.107*/("""
        """),_display_(/*45.10*/b3/*45.12*/.number(form("tuning.clusterManagerThreadPoolQueueSize"), '_label -> "clusterManagerThreadPoolQueueSize")),format.raw/*45.117*/("""
        """),_display_(/*46.10*/b3/*46.12*/.number(form("tuning.kafkaCommandThreadPoolSize"), '_label -> "kafkaCommandThreadPoolSize")),format.raw/*46.103*/("""
        """),_display_(/*47.10*/b3/*47.12*/.number(form("tuning.kafkaCommandThreadPoolQueueSize"), '_label -> "kafkaCommandThreadPoolQueueSize")),format.raw/*47.113*/("""
        """),_display_(/*48.10*/b3/*48.12*/.number(form("tuning.logkafkaCommandThreadPoolSize"), '_label -> "logkafkaCommandThreadPoolSize")),format.raw/*48.109*/("""
        """),_display_(/*49.10*/b3/*49.12*/.number(form("tuning.logkafkaCommandThreadPoolQueueSize"), '_label -> "logkafkaCommandThreadPoolQueueSize")),format.raw/*49.119*/("""
        """),_display_(/*50.10*/b3/*50.12*/.number(form("tuning.logkafkaUpdatePeriodSeconds"), '_label -> "logkafkaUpdatePeriodSeconds")),format.raw/*50.105*/("""
        """),_display_(/*51.10*/b3/*51.12*/.number(form("tuning.partitionOffsetCacheTimeoutSecs"), '_label -> "partitionOffsetCacheTimeoutSecs")),format.raw/*51.113*/("""
        """),_display_(/*52.10*/b3/*52.12*/.number(form("tuning.brokerViewThreadPoolSize"), '_label -> "brokerViewThreadPoolSize")),format.raw/*52.99*/("""
        """),_display_(/*53.10*/b3/*53.12*/.number(form("tuning.brokerViewThreadPoolQueueSize"), '_label -> "brokerViewThreadPoolQueueSize")),format.raw/*53.109*/("""
        """),_display_(/*54.10*/b3/*54.12*/.number(form("tuning.offsetCacheThreadPoolSize"), '_label -> "offsetCacheThreadPoolSize")),format.raw/*54.101*/("""
        """),_display_(/*55.10*/b3/*55.12*/.number(form("tuning.offsetCacheThreadPoolQueueSize"), '_label -> "offsetCacheThreadPoolQueueSize")),format.raw/*55.111*/("""
        """),_display_(/*56.10*/b3/*56.12*/.number(form("tuning.kafkaAdminClientThreadPoolSize"), '_label -> "kafkaAdminClientThreadPoolSize")),format.raw/*56.111*/("""
        """),_display_(/*57.10*/b3/*57.12*/.number(form("tuning.kafkaAdminClientThreadPoolQueueSize"), '_label -> "kafkaAdminClientThreadPoolQueueSize")),format.raw/*57.121*/("""
        """),_display_(/*58.10*/b3/*58.12*/.select( form("securityProtocol"), options = kafka.manager.model.SecurityProtocol.formSelectList, '_label -> "Security Protocol" )),format.raw/*58.142*/("""
        """),_display_(/*59.10*/b3/*59.12*/.submit('class -> "submit-button btn btn-primary btn")/*59.66*/{_display_(Seq[Any](format.raw/*59.67*/(""" """),format.raw/*59.68*/("""Save """)))}),format.raw/*59.74*/("""
        """),format.raw/*60.9*/("""<a href=""""),_display_(/*60.19*/routes/*60.25*/.Application.index()),format.raw/*60.45*/("""" class="cancel-button btn btn-default" role="button">Cancel</a>
    </fieldset>
    """)))}),format.raw/*62.6*/("""
""")))};
Seq[Any](format.raw/*7.101*/("""

"""),format.raw/*11.1*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*25.2*/("""

"""),format.raw/*63.2*/("""

"""),_display_(/*65.2*/main(
    "Update Cluster",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Update Cluster",clusterName)))/*68.131*/ {_display_(Seq[Any](format.raw/*68.133*/("""

"""),format.raw/*70.1*/("""<div class="col-md-6 un-pad-me">
    <div class="panel panel-default">
        <div class="panel-heading"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span></button>Update Cluster</h3></div>
        <div class="panel-body">
            """),_display_(/*74.14*/errorOrForm/*74.25*/.fold(views.html.errors.onApiError(_), drawForm(_))),format.raw/*74.76*/("""
        """),format.raw/*75.9*/("""</div>
    </div>
    """),_display_(/*77.6*/configReferences()),format.raw/*77.24*/("""
"""),format.raw/*78.1*/("""</div>

""")))}),format.raw/*80.2*/("""
"""))
      }
    }
  }

  def render(clusterName:String,errorOrForm:$bslash$div[kafka.manager.ApiError, Form[models.form.ClusterOperation]],request:RequestHeader,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(clusterName,errorOrForm)(request,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, Form[models.form.ClusterOperation]]) => (RequestHeader,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (clusterName,errorOrForm) => (request,messages,menus) => apply(clusterName,errorOrForm)(request,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object updateCluster extends updateCluster_Scope0.updateCluster_Scope1.updateCluster
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/cluster/updateCluster.scala.html
                  HASH: bb5256eeddde9e80cbd2b17127a0a2678cf692fa
                  MATRIX: 739->135|1075->399|1090->406|1171->410|1203->416|1217->421|1342->524|1367->529|1392->545|1501->577|1529->579|1539->581|1663->695|1717->710|1745->711|1812->751|1830->760|1854->763|1920->802|1938->811|1962->814|1998->823|2016->832|2042->837|2085->853|2130->888|2170->889|2210->897|2240->899|2296->933|2489->1096|2514->1101|2531->1109|2655->1156|2687->1162|2697->1164|2760->1218|2800->1220|2832->1225|2981->1347|3013->1358|3052->1370|3063->1372|3221->1508|3258->1518|3269->1520|3409->1638|3446->1648|3457->1650|3597->1768|3634->1778|3645->1780|3720->1834|3757->1844|3768->1846|3843->1900|3880->1910|3891->1912|3963->1963|4000->1973|4011->1975|4147->2089|4184->2099|4195->2101|4293->2178|4330->2188|4341->2190|4425->2253|4462->2263|4473->2265|4620->2390|4657->2400|4722->2444|4759->2454|4770->2456|4889->2553|4926->2563|4937->2565|5054->2660|5091->2670|5102->2672|5229->2777|5266->2787|5277->2789|5390->2880|5427->2890|5438->2892|5561->2993|5598->3003|5609->3005|5728->3102|5765->3112|5776->3114|5905->3221|5942->3231|5953->3233|6068->3326|6105->3336|6116->3338|6239->3439|6276->3449|6287->3451|6395->3538|6432->3548|6443->3550|6562->3647|6599->3657|6610->3659|6721->3748|6758->3758|6769->3760|6890->3859|6927->3869|6938->3871|7059->3970|7096->3980|7107->3982|7238->4091|7275->4101|7286->4103|7438->4233|7475->4243|7486->4245|7549->4299|7588->4300|7617->4301|7654->4307|7690->4316|7727->4326|7742->4332|7783->4352|7899->4438|7941->331|7970->397|7998->526|8027->1098|8056->4440|8085->4443|8273->4621|8314->4623|8343->4625|8694->4949|8714->4960|8786->5011|8822->5020|8871->5043|8910->5061|8938->5062|8977->5071
                  LINES: 23->6|29->12|29->12|31->12|32->13|32->13|32->13|33->16|33->16|35->16|36->17|36->17|36->17|36->17|37->18|38->19|38->19|38->19|39->20|39->20|39->20|39->20|39->20|39->20|39->20|39->20|39->20|39->20|39->20|39->20|43->24|44->27|44->27|46->27|47->28|47->28|47->28|47->28|48->29|50->31|50->31|51->32|51->32|51->32|52->33|52->33|52->33|53->34|53->34|53->34|54->35|54->35|54->35|55->36|55->36|55->36|56->37|56->37|56->37|57->38|57->38|57->38|58->39|58->39|58->39|59->40|59->40|59->40|60->41|60->41|60->41|61->42|61->42|62->43|62->43|62->43|63->44|63->44|63->44|64->45|64->45|64->45|65->46|65->46|65->46|66->47|66->47|66->47|67->48|67->48|67->48|68->49|68->49|68->49|69->50|69->50|69->50|70->51|70->51|70->51|71->52|71->52|71->52|72->53|72->53|72->53|73->54|73->54|73->54|74->55|74->55|74->55|75->56|75->56|75->56|76->57|76->57|76->57|77->58|77->58|77->58|78->59|78->59|78->59|78->59|78->59|78->59|79->60|79->60|79->60|79->60|81->62|83->7|85->11|86->14|88->25|90->63|92->65|95->68|95->68|97->70|101->74|101->74|101->74|102->75|104->77|104->77|105->78|107->80
                  -- GENERATED --
              */
          