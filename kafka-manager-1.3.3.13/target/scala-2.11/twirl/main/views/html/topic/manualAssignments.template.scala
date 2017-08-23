
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object manualAssignments_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object manualAssignments_Scope1 {
import scalaz.{\/}
import b3.vertical.fieldConstructor
import kafka.manager.model.ActorModel._
import kafka.manager.{BrokerListExtended}
import kafka.manager.utils._
import helper._
import models.form._

class manualAssignments extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template10[String,String,List[scala.Tuple2[String, List[scala.Tuple2[Int, List[Int]]]]],BrokerListExtended,Map[Int, BVView],Seq[FormError],features.ApplicationFeatures,kafka.manager.features.ClusterFeatures,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*14.2*/(cluster: String,
  topic: String,
  assignForm: List[(String, List[(Int,List[Int])])],
  brokers: BrokerListExtended,
  brokersViews: Map[Int, BVView],
  formErrors: Seq[FormError]
)(implicit af: features.ApplicationFeatures, 
cf: kafka.manager.features.ClusterFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*23.2*/theMenu/*23.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.13*/("""
"""),_display_(/*24.2*/views/*24.7*/.html.navigation.clusterMenu(cluster,"Topic","Manual Partition Assignments",menus.clusterMenus(cluster))),format.raw/*24.111*/("""
""")))};def /*29.2*/toColor/*29.9*/(brokerId: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*29.28*/("""
  """),format.raw/*30.3*/("""#"""),_display_(/*30.5*/color(brokerId)),format.raw/*30.20*/("""
""")))};def /*32.2*/reverseColor/*32.14*/(originalColor: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.41*/("""
  """),format.raw/*33.3*/("""#"""),_display_(/*33.5*/originalColor/*33.18*/.map({x => if(x == '#') x else "%X".format(0xf - Integer.parseInt(x.toString,16)).head})),format.raw/*33.106*/("""
""")))};def /*35.2*/replicaSelection/*35.18*/(topicIdx: Int, assignIdx: Int, brokerIndex: Int, brokerId: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*35.86*/("""
    """),_display_(/*36.6*/if(brokers.list.filter({broker => broker.id == brokerId}).size > 0)/*36.73*/ {_display_(Seq[Any](format.raw/*36.75*/("""
    """),format.raw/*37.5*/("""<span style="background-color: """),_display_(/*37.37*/toColor(brokerId)),format.raw/*37.54*/(""" """),format.raw/*37.55*/(""";">
      <select onchange="this.parentNode.setAttribute('style', 
        this.options[this.selectedIndex].getAttribute('style'))"
        name="topics["""),_display_(/*40.23*/topicIdx),format.raw/*40.31*/("""].assignments["""),_display_(/*40.46*/assignIdx),format.raw/*40.55*/("""].brokers["""),_display_(/*40.66*/brokerIndex),format.raw/*40.77*/("""]">
        """),_display_(/*41.10*/brokers/*41.17*/.list.map/*41.26*/ { case broker =>_display_(Seq[Any](format.raw/*41.43*/("""
        """),format.raw/*42.9*/("""<option style="background-color: """),_display_(/*42.43*/toColor(broker.id)),format.raw/*42.61*/("""; color: """),_display_(/*42.71*/reverseColor(color(broker.id))),format.raw/*42.101*/(""";"
        value=""""),_display_(/*43.17*/broker/*43.23*/.id),format.raw/*43.26*/("""" """),_display_(/*43.29*/if(broker.id == brokerId)/*43.54*/{_display_(Seq[Any](format.raw/*43.55*/("""selected""")))}),format.raw/*43.64*/(""">Broker """),_display_(/*43.73*/broker/*43.79*/.id),format.raw/*43.82*/("""</option>
        """)))}),format.raw/*44.10*/("""
      """),format.raw/*45.7*/("""</select>
      &nbsp;&nbsp;&nbsp;</span>
    """)))}/*47.7*/else/*47.12*/{_display_(Seq[Any](format.raw/*47.13*/("""
        """),format.raw/*48.9*/("""<small style="color:red">Broker Down!</small>
        <script>window.onload = function() """),format.raw/*49.44*/("""{"""),format.raw/*49.45*/("""disableSubmission()"""),format.raw/*49.64*/("""}"""),format.raw/*49.65*/("""</script>
    """)))}),format.raw/*50.6*/("""
""")))};def /*53.2*/topHeading/*53.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*53.16*/("""
"""),format.raw/*54.1*/("""<div class="panel-heading">
    <div class="row">
        <h3>
            <div class="col-md-8">
                <button type="button" class="btn btn-link" onclick="goBack()">
                    <span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span>
                </button>
                Manual Partition Assignments
            </div>
            <div class="btn-group-vertical col-md-4" role="group" aria-label="...">
                <button class="btn btn-primary " type="submit">
                    <span class="glyphicon glyphicon-floppy-disk"></span>
                    Save Partition Assignment
                </button>
            </div>
        </h3>
    </div>
</div>
""")))};def /*74.2*/middleHeading/*74.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*74.19*/("""
"""),format.raw/*75.1*/("""<div class="panel-body btn-group-xs sub-heading">
    <input type="text" placeholder="Type to filter topics"
           id="cell-selector" onkeyup="selectBySubname('#cell-selector', 'assignment-cell', 'block')"/>
</div>
""")))};def /*81.2*/mainBody/*81.10*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*81.14*/("""
"""),format.raw/*82.1*/("""<div class="panel-body assignment-pane">
    """),_display_(/*83.6*/assignForm/*83.16*/.zipWithIndex.map/*83.33*/ { case (partitionAssignment, topicIdx) =>_display_(Seq[Any](format.raw/*83.75*/("""
    """),format.raw/*84.5*/("""<div class="assignment-cell" name=""""),_display_(/*84.41*/partitionAssignment/*84.60*/._1),format.raw/*84.63*/("""">
        <h4>
            <input type="text" class="borderless" style="display:none"
                   name='topics["""),_display_(/*87.34*/topicIdx),format.raw/*87.42*/("""].topic'
                   value='"""),_display_(/*88.28*/partitionAssignment/*88.47*/._1),format.raw/*88.50*/("""' readonly/>
            """),_display_(/*89.14*/partitionAssignment/*89.33*/._1),format.raw/*89.36*/("""
        """),format.raw/*90.9*/("""</h4>
        """),_display_(/*91.10*/partitionAssignment/*91.29*/._2.zipWithIndex.map/*91.49*/ { case (assignment, assgnIndex) =>_display_(Seq[Any](format.raw/*91.84*/("""
            """),format.raw/*92.13*/("""<div class="partition-cell">
                <table>
                    """),_display_(/*94.22*/assignment/*94.32*/._2.zipWithIndex.map/*94.52*/ { case (broker, brokerIndex) =>_display_(Seq[Any](format.raw/*94.84*/("""
                        """),_display_(/*95.26*/if(brokerIndex == 0)/*95.46*/ {_display_(Seq[Any](format.raw/*95.48*/("""
                        """),format.raw/*96.25*/("""<tr>
                            <th>Partition
                                <input type="number" class="borderless"
                                       name='topics["""),_display_(/*99.54*/topicIdx),format.raw/*99.62*/("""].assignments["""),_display_(/*99.77*/assgnIndex),format.raw/*99.87*/("""].partition'
                                       value='"""),_display_(/*100.48*/assignment/*100.58*/._1),format.raw/*100.61*/("""'
                                       readonly>
                            </th>
                        </tr>
                        """)))}),format.raw/*104.26*/("""
                        """),format.raw/*105.25*/("""<tr><td>
                            Replica """),_display_(/*106.38*/brokerIndex),format.raw/*106.49*/(""": """),_display_(/*106.52*/replicaSelection(topicIdx, assgnIndex, brokerIndex, broker)),format.raw/*106.111*/("""
                        """),format.raw/*107.25*/("""</td></tr>
                    """)))}),format.raw/*108.22*/("""
                """),format.raw/*109.17*/("""</table>
            </div>
        """)))}),format.raw/*111.10*/("""
    """),format.raw/*112.5*/("""</div>
    """)))}),format.raw/*113.6*/("""
"""),format.raw/*114.1*/("""</div>

""")))};def /*118.2*/partitionsAssignmentsPane/*118.27*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*118.31*/("""
"""),format.raw/*119.1*/("""<div class="panel panel-default">
    """),_display_(/*120.6*/topHeading),format.raw/*120.16*/("""
    """),_display_(/*121.6*/middleHeading),format.raw/*121.19*/("""
    """),_display_(/*122.6*/mainBody),format.raw/*122.14*/("""
"""),format.raw/*123.1*/("""</div>
""")))};def /*126.2*/brokersInfoPane/*126.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*126.21*/("""
    """),format.raw/*127.5*/("""<input type="text" placeholder="Type to filter metrics"
           id="selectMetrics" onkeyup="selectBySubname('#selectMetrics', 'metric-row', '')"/>
    """),_display_(/*129.6*/brokersViews/*129.18*/.map/*129.22*/ { case (idx, bv) =>_display_(Seq[Any](format.raw/*129.42*/("""
        """),format.raw/*130.9*/("""<div class="panel panel-default">
            <div class="panel-heading">
                <h4>Broker """),_display_(/*132.29*/idx),format.raw/*132.32*/("""</h4>
            </div>
            """),_display_(/*134.14*/views/*134.19*/.html.common.expandedBrokerMetrics(bv.metrics)),format.raw/*134.65*/("""
        """),format.raw/*135.9*/("""</div>
    """)))}),format.raw/*136.6*/("""
""")))};def /*26.2*/color/*26.7*/(brokerId: Int) = {{
  java.security.MessageDigest.getInstance("MD5").digest("" + brokerId).map("%02X".format(_)).mkString.substring(0,6)
}};
Seq[Any](format.raw/*21.110*/("""

"""),format.raw/*25.2*/("""
"""),format.raw/*28.2*/("""
"""),format.raw/*31.2*/("""
"""),format.raw/*34.2*/("""
"""),format.raw/*51.2*/("""

"""),format.raw/*72.2*/("""

"""),format.raw/*79.2*/("""

"""),format.raw/*116.2*/("""

"""),format.raw/*124.2*/("""

"""),format.raw/*137.2*/("""

"""),_display_(/*139.2*/main(
  "Manual Multiple Assignment",
  menu = theMenu,
  breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Topics",cluster)))/*142.117*/ {_display_(Seq[Any](format.raw/*142.119*/("""
"""),format.raw/*143.1*/("""<div class="row">
    <div class="col-md-8">
        """),_display_(/*145.10*/if(true)/*145.18*/ {_display_(Seq[Any](format.raw/*145.20*/("""
            """),_display_(/*146.14*/helper/*146.20*/.form(action = routes.ReassignPartitions.handleManualAssignment(cluster, topic))/*146.100*/ {_display_(Seq[Any](format.raw/*146.102*/("""
                """),_display_(/*147.18*/partitionsAssignmentsPane),format.raw/*147.43*/("""
            """)))}),format.raw/*148.14*/("""
        """)))}/*149.11*/else/*149.16*/{_display_(Seq[Any](format.raw/*149.17*/("""
            """),_display_(/*150.14*/assignForm/*150.24*/.toString),format.raw/*150.33*/("""
            """),format.raw/*151.13*/("""<br/><br/><br/><br/><br/>
            """),_display_(/*152.14*/formErrors/*152.24*/.toString),format.raw/*152.33*/("""
        """)))}),format.raw/*153.10*/("""
    """),format.raw/*154.5*/("""</div>
    <div class="col-md-4">
        """),_display_(/*156.10*/if(brokers != null)/*156.29*/ {_display_(Seq[Any](format.raw/*156.31*/("""
            """),_display_(/*157.14*/brokersInfoPane),format.raw/*157.29*/("""
        """)))}),format.raw/*158.10*/("""
    """),format.raw/*159.5*/("""</div>
</div>
""")))}),format.raw/*161.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,topic:String,assignForm:List[scala.Tuple2[String, List[scala.Tuple2[Int, List[Int]]]]],brokers:BrokerListExtended,brokersViews:Map[Int, BVView],formErrors:Seq[FormError],af:features.ApplicationFeatures,cf:kafka.manager.features.ClusterFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,assignForm,brokers,brokersViews,formErrors)(af,cf,messages,menus)

  def f:((String,String,List[scala.Tuple2[String, List[scala.Tuple2[Int, List[Int]]]]],BrokerListExtended,Map[Int, BVView],Seq[FormError]) => (features.ApplicationFeatures,kafka.manager.features.ClusterFeatures,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,assignForm,brokers,brokersViews,formErrors) => (af,cf,messages,menus) => apply(cluster,topic,assignForm,brokers,brokersViews,formErrors)(af,cf,messages,menus)

  def ref: this.type = this

}


}
}

/**/
object manualAssignments extends manualAssignments_Scope0.manualAssignments_Scope1.manualAssignments
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/manualAssignments.scala.html
                  HASH: 0d126036b68c6171db7ce80182c4cc8f9769cf6c
                  MATRIX: 1038->327|1454->667|1469->674|1550->678|1578->680|1591->685|1717->789|1742->939|1757->946|1853->965|1883->968|1911->970|1947->985|1972->989|1993->1001|2097->1028|2127->1031|2155->1033|2177->1046|2287->1134|2312->1138|2337->1154|2482->1222|2514->1228|2590->1295|2630->1297|2662->1302|2721->1334|2759->1351|2788->1352|2969->1506|2998->1514|3040->1529|3070->1538|3108->1549|3140->1560|3180->1573|3196->1580|3214->1589|3269->1606|3305->1615|3366->1649|3405->1667|3442->1677|3494->1707|3540->1726|3555->1732|3579->1735|3609->1738|3643->1763|3682->1764|3722->1773|3758->1782|3773->1788|3797->1791|3847->1810|3881->1817|3946->1865|3959->1870|3998->1871|4034->1880|4151->1969|4180->1970|4227->1989|4256->1990|4301->2005|4326->2010|4345->2020|4426->2024|4454->2025|5182->2733|5204->2746|5285->2750|5313->2751|5557->2975|5574->2983|5655->2987|5683->2988|5755->3034|5774->3044|5800->3061|5880->3103|5912->3108|5975->3144|6003->3163|6027->3166|6174->3286|6203->3294|6266->3330|6294->3349|6318->3352|6371->3378|6399->3397|6423->3400|6459->3409|6501->3424|6529->3443|6558->3463|6631->3498|6672->3511|6773->3585|6792->3595|6821->3615|6891->3647|6944->3673|6973->3693|7013->3695|7066->3720|7265->3892|7294->3900|7336->3915|7367->3925|7455->3985|7475->3995|7500->3998|7672->4138|7726->4163|7800->4209|7833->4220|7864->4223|7946->4282|8000->4307|8064->4339|8110->4356|8179->4393|8212->4398|8255->4410|8284->4411|8317->4423|8352->4448|8434->4452|8463->4453|8529->4492|8561->4502|8594->4508|8629->4521|8662->4527|8692->4535|8721->4536|8753->4547|8778->4562|8860->4566|8893->4571|9075->4726|9097->4738|9111->4742|9170->4762|9207->4771|9337->4873|9362->4876|9428->4914|9443->4919|9511->4965|9548->4974|9591->4986|9616->793|9629->798|9800->664|9829->791|9857->937|9885->987|9913->1136|9941->2007|9970->2730|9999->2972|10029->4420|10059->4544|10089->4988|10119->4991|10302->5163|10344->5165|10373->5166|10455->5220|10473->5228|10514->5230|10556->5244|10572->5250|10663->5330|10705->5332|10751->5350|10798->5375|10844->5389|10874->5400|10888->5405|10928->5406|10970->5420|10990->5430|11021->5439|11063->5452|11130->5491|11150->5501|11181->5510|11223->5520|11256->5525|11327->5568|11356->5587|11397->5589|11439->5603|11476->5618|11518->5628|11551->5633|11597->5648
                  LINES: 29->14|40->23|40->23|42->23|43->24|43->24|43->24|44->29|44->29|46->29|47->30|47->30|47->30|48->32|48->32|50->32|51->33|51->33|51->33|51->33|52->35|52->35|54->35|55->36|55->36|55->36|56->37|56->37|56->37|56->37|59->40|59->40|59->40|59->40|59->40|59->40|60->41|60->41|60->41|60->41|61->42|61->42|61->42|61->42|61->42|62->43|62->43|62->43|62->43|62->43|62->43|62->43|62->43|62->43|62->43|63->44|64->45|66->47|66->47|66->47|67->48|68->49|68->49|68->49|68->49|69->50|70->53|70->53|72->53|73->54|91->74|91->74|93->74|94->75|98->81|98->81|100->81|101->82|102->83|102->83|102->83|102->83|103->84|103->84|103->84|103->84|106->87|106->87|107->88|107->88|107->88|108->89|108->89|108->89|109->90|110->91|110->91|110->91|110->91|111->92|113->94|113->94|113->94|113->94|114->95|114->95|114->95|115->96|118->99|118->99|118->99|118->99|119->100|119->100|119->100|123->104|124->105|125->106|125->106|125->106|125->106|126->107|127->108|128->109|130->111|131->112|132->113|133->114|135->118|135->118|137->118|138->119|139->120|139->120|140->121|140->121|141->122|141->122|142->123|143->126|143->126|145->126|146->127|148->129|148->129|148->129|148->129|149->130|151->132|151->132|153->134|153->134|153->134|154->135|155->136|156->26|156->26|159->21|161->25|162->28|163->31|164->34|165->51|167->72|169->79|171->116|173->124|175->137|177->139|180->142|180->142|181->143|183->145|183->145|183->145|184->146|184->146|184->146|184->146|185->147|185->147|186->148|187->149|187->149|187->149|188->150|188->150|188->150|189->151|190->152|190->152|190->152|191->153|192->154|194->156|194->156|194->156|195->157|195->157|196->158|197->159|199->161
                  -- GENERATED --
              */
          