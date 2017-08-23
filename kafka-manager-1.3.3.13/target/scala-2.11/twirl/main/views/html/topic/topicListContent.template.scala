
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object topicListContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class topicListContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.TopicIdentity]], Boolean]],IndexedSeq[String],Boolean,Boolean,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster: String,
  topics: IndexedSeq[((String, Option[kafka.manager.model.ActorModel.TopicIdentity]),Boolean)],
  topicsUnderReassignment: IndexedSeq[String],
  pollConsumers: Boolean,
  displayTopicSize: Boolean
)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*12.2*/getDeletedLevel/*12.17*/(deleted: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.39*/("""
    """),_display_(/*13.6*/deleted/*13.13*/ match/*13.19*/ {/*14.9*/case true =>/*14.21*/ {_display_(Seq[Any](format.raw/*14.23*/("""danger""")))}/*15.9*/case i =>/*15.18*/ {}}),format.raw/*16.6*/("""
""")))};def /*19.2*/getBrokersSpreadLevel/*19.23*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.44*/("""
    """),_display_(/*20.6*/percentage/*20.16*/ match/*20.22*/ {/*21.9*/case i if i > 50 && i <= 75 =>/*21.39*/ {_display_(Seq[Any](format.raw/*21.41*/("""warning""")))}/*22.9*/case i if i <= 50 =>/*22.29*/ {_display_(Seq[Any](format.raw/*22.31*/("""danger""")))}/*23.9*/case i =>/*23.18*/ {}}),format.raw/*24.6*/("""
""")))};def /*27.2*/getBrokersSkewLevel/*27.21*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*27.42*/("""
    """),_display_(/*28.6*/percentage/*28.16*/ match/*28.22*/ {/*29.9*/case i if i > 0 && i <= 33 =>/*29.38*/ {_display_(Seq[Any](format.raw/*29.40*/("""warning""")))}/*30.9*/case i if i >= 34 =>/*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""danger""")))}/*31.9*/case i =>/*31.18*/ {}}),format.raw/*32.6*/("""
""")))};def /*35.2*/getBrokersLeaderSkewLevel/*35.27*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*35.48*/("""
    """),_display_(/*36.6*/percentage/*36.16*/ match/*36.22*/ {/*37.9*/case i if i > 0 && i <= 33 =>/*37.38*/ {_display_(Seq[Any](format.raw/*37.40*/("""warning""")))}/*38.9*/case i if i >= 34 =>/*38.29*/ {_display_(Seq[Any](format.raw/*38.31*/("""danger""")))}/*39.9*/case i =>/*39.18*/ {}}),format.raw/*40.6*/("""
""")))};def /*43.2*/getUnderReplicatedLevel/*43.25*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*43.46*/("""
    """),_display_(/*44.6*/percentage/*44.16*/ match/*44.22*/ {/*45.9*/case i if i > 0 && i <= 33 =>/*45.38*/ {_display_(Seq[Any](format.raw/*45.40*/("""warning""")))}/*46.9*/case i if i >= 34 =>/*46.29*/ {_display_(Seq[Any](format.raw/*46.31*/("""danger""")))}/*47.9*/case i =>/*47.18*/ {}}),format.raw/*48.6*/("""
""")))};def /*51.2*/getReassignmentStatus/*51.23*/(topic: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*51.42*/("""
    """),_display_(/*52.6*/if(topicsUnderReassignment.contains(topic))/*52.49*/ {_display_(Seq[Any](format.raw/*52.51*/("""glow-red""")))}/*52.61*/else/*52.66*/{}),format.raw/*52.68*/("""
""")))};
Seq[Any](format.raw/*10.45*/("""

"""),format.raw/*17.2*/("""

"""),format.raw/*25.2*/("""

"""),format.raw/*33.2*/("""

"""),format.raw/*41.2*/("""

"""),format.raw/*49.2*/("""

"""),format.raw/*53.2*/("""

"""),format.raw/*55.1*/("""<table class="table" id="topics-table">
    <thead>
    <tr><th>Topic</th>
        <th># Partitions</th>
        <th># Brokers</th>
        <th><span title="Percentage of cluster brokers having partitions from the topic">Brokers Spread %</span></th>
        <th><span title="Percentage of brokers having more partitions than the average">Brokers Skew %</span></th>
        <th><span title="Percentage of brokers having more partitions as leader than the average">Brokers Leader Skew %</span></th>
        <th># Replicas</th>
        <th><span title="Percentage of partitions having a missing replica">Under Replicated %</span></th>
        """),_display_(/*65.10*/if(displayTopicSize)/*65.30*/{_display_(Seq[Any](format.raw/*65.31*/("""
        """),format.raw/*66.9*/("""<th>Leader Size</th>
        """)))}),format.raw/*67.10*/("""
        """),_display_(/*68.10*/if(pollConsumers)/*68.27*/{_display_(Seq[Any](format.raw/*68.28*/("""
        """),format.raw/*69.9*/("""<th>Producer Message/Sec</th>
        <th>Summed Recent Offsets</th>
        """)))}),format.raw/*71.10*/("""
    """),format.raw/*72.5*/("""</tr>
    </thead>
    <tbody>
    """),_display_(/*75.6*/for( ((topic, topicIdentity), deleted) <- topics) yield /*75.55*/ {_display_(Seq[Any](format.raw/*75.57*/("""
      """),format.raw/*76.7*/("""<tr class=""""),_display_(/*76.19*/getReassignmentStatus(topic)),format.raw/*76.47*/("""">
          <td class=""""),_display_(/*77.23*/getDeletedLevel(deleted)),format.raw/*77.47*/(""""><a href=""""),_display_(/*77.59*/routes/*77.65*/.Topic.topic(cluster,topic)),format.raw/*77.92*/("""">"""),_display_(/*77.95*/topic),format.raw/*77.100*/("""</a></td>
          """),_display_(/*78.12*/topicIdentity/*78.25*/.map/*78.29*/{ ti =>_display_(Seq[Any](format.raw/*78.36*/(""" """),format.raw/*78.37*/("""<td>"""),_display_(/*78.42*/ti/*78.44*/.partitions),format.raw/*78.55*/("""</td>""")))}/*78.61*/.getOrElse/*78.71*/{_display_(Seq[Any](format.raw/*78.72*/("""<td> </td>""")))}),format.raw/*78.83*/("""
          """),_display_(/*79.12*/topicIdentity/*79.25*/.map/*79.29*/{ ti =>_display_(Seq[Any](format.raw/*79.36*/(""" """),format.raw/*79.37*/("""<td>"""),_display_(/*79.42*/ti/*79.44*/.topicBrokers),format.raw/*79.57*/("""</td>""")))}/*79.63*/.getOrElse/*79.73*/{_display_(Seq[Any](format.raw/*79.74*/("""<td> </td>""")))}),format.raw/*79.85*/("""
          """),_display_(/*80.12*/topicIdentity/*80.25*/.map/*80.29*/{ ti =>_display_(Seq[Any](format.raw/*80.36*/(""" """),format.raw/*80.37*/("""<td class=""""),_display_(/*80.49*/getBrokersSpreadLevel(ti.brokersSpreadPercentage)),format.raw/*80.98*/("""">"""),_display_(/*80.101*/ti/*80.103*/.brokersSpreadPercentage),format.raw/*80.127*/("""</td>""")))}/*80.133*/.getOrElse/*80.143*/{_display_(Seq[Any](format.raw/*80.144*/("""<td> </td>""")))}),format.raw/*80.155*/("""
          """),_display_(/*81.12*/topicIdentity/*81.25*/.map/*81.29*/{ ti =>_display_(Seq[Any](format.raw/*81.36*/(""" """),format.raw/*81.37*/("""<td class=""""),_display_(/*81.49*/getBrokersSkewLevel(ti.brokersSkewPercentage)),format.raw/*81.94*/("""">"""),_display_(/*81.97*/ti/*81.99*/.brokersSkewPercentage),format.raw/*81.121*/("""</td>""")))}/*81.127*/.getOrElse/*81.137*/{_display_(Seq[Any](format.raw/*81.138*/("""<td> </td>""")))}),format.raw/*81.149*/("""
          """),_display_(/*82.12*/topicIdentity/*82.25*/.map/*82.29*/{ ti =>_display_(Seq[Any](format.raw/*82.36*/(""" """),format.raw/*82.37*/("""<td class=""""),_display_(/*82.49*/getBrokersLeaderSkewLevel(ti.brokersLeaderSkewPercentage)),format.raw/*82.106*/("""">"""),_display_(/*82.109*/ti/*82.111*/.brokersLeaderSkewPercentage),format.raw/*82.139*/("""</td>""")))}/*82.145*/.getOrElse/*82.155*/{_display_(Seq[Any](format.raw/*82.156*/("""<td> </td>""")))}),format.raw/*82.167*/("""
          """),_display_(/*83.12*/topicIdentity/*83.25*/.map/*83.29*/{ ti =>_display_(Seq[Any](format.raw/*83.36*/(""" """),format.raw/*83.37*/("""<td>"""),_display_(/*83.42*/ti/*83.44*/.replicationFactor),format.raw/*83.62*/("""</td>""")))}/*83.68*/.getOrElse/*83.78*/{_display_(Seq[Any](format.raw/*83.79*/("""<td> </td>""")))}),format.raw/*83.90*/("""
          """),_display_(/*84.12*/topicIdentity/*84.25*/.map/*84.29*/{ ti =>_display_(Seq[Any](format.raw/*84.36*/(""" """),format.raw/*84.37*/("""<td class=""""),_display_(/*84.49*/getUnderReplicatedLevel(ti.underReplicatedPercentage)),format.raw/*84.102*/("""">"""),_display_(/*84.105*/ti/*84.107*/.underReplicatedPercentage),format.raw/*84.133*/("""</td>""")))}/*84.139*/.getOrElse/*84.149*/{_display_(Seq[Any](format.raw/*84.150*/("""<td> </td>""")))}),format.raw/*84.161*/("""
          """),_display_(/*85.12*/if(displayTopicSize)/*85.32*/{_display_(Seq[Any](format.raw/*85.33*/("""
          """),_display_(/*86.12*/topicIdentity/*86.25*/.map/*86.29*/{ ti =>_display_(Seq[Any](format.raw/*86.36*/(""" """),format.raw/*86.37*/("""<td>"""),_display_(/*86.42*/ti/*86.44*/.size),format.raw/*86.49*/("""</td>""")))}/*86.55*/.getOrElse/*86.65*/{_display_(Seq[Any](format.raw/*86.66*/("""<td> </td>""")))}),format.raw/*86.77*/("""
          """)))}),format.raw/*87.12*/("""
          """),_display_(/*88.12*/if(pollConsumers)/*88.29*/{_display_(Seq[Any](format.raw/*88.30*/("""
          """),_display_(/*89.12*/topicIdentity/*89.25*/.map/*89.29*/{ ti =>_display_(Seq[Any](format.raw/*89.36*/(""" """),format.raw/*89.37*/("""<td>"""),_display_(/*89.42*/ti/*89.44*/.producerRate),format.raw/*89.57*/("""</td>""")))}/*89.63*/.getOrElse/*89.73*/{_display_(Seq[Any](format.raw/*89.74*/("""<td> </td>""")))}),format.raw/*89.85*/("""
          """),_display_(/*90.12*/topicIdentity/*90.25*/.map/*90.29*/{ ti =>_display_(Seq[Any](format.raw/*90.36*/(""" """),format.raw/*90.37*/("""<td>"""),_display_(/*90.42*/ti/*90.44*/.summedTopicOffsets),format.raw/*90.63*/("""</td>""")))}/*90.69*/.getOrElse/*90.79*/{_display_(Seq[Any](format.raw/*90.80*/("""<td> </td>""")))}),format.raw/*90.91*/("""
          """)))}),format.raw/*91.12*/("""
      """),format.raw/*92.7*/("""</tr>
    """)))}),format.raw/*93.6*/("""
    """),format.raw/*94.5*/("""</tbody>
</table>
"""))
      }
    }
  }

  def render(cluster:String,topics:IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.TopicIdentity]], Boolean]],topicsUnderReassignment:IndexedSeq[String],pollConsumers:Boolean,displayTopicSize:Boolean,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topics,topicsUnderReassignment,pollConsumers,displayTopicSize)(messages)

  def f:((String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.TopicIdentity]], Boolean]],IndexedSeq[String],Boolean,Boolean) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topics,topicsUnderReassignment,pollConsumers,displayTopicSize) => (messages) => apply(cluster,topics,topicsUnderReassignment,pollConsumers,displayTopicSize)(messages)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object topicListContent extends topicListContent_Scope0.topicListContent
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/topicListContent.scala.html
                  HASH: 76a2cc335375698a4cf63a8a64ba99743c256720
                  MATRIX: 832->115|1170->377|1194->392|1293->414|1325->420|1341->427|1356->433|1366->444|1387->456|1427->458|1452->474|1470->483|1494->492|1519->497|1549->518|1647->539|1679->545|1698->555|1713->561|1723->572|1762->602|1802->604|1828->621|1857->641|1897->643|1922->659|1940->668|1964->677|1989->682|2017->701|2115->722|2147->728|2166->738|2181->744|2191->755|2229->784|2269->786|2295->803|2324->823|2364->825|2389->841|2407->850|2431->859|2456->864|2490->889|2588->910|2620->916|2639->926|2654->932|2664->943|2702->972|2742->974|2768->991|2797->1011|2837->1013|2862->1029|2880->1038|2904->1047|2929->1052|2961->1075|3059->1096|3091->1102|3110->1112|3125->1118|3135->1129|3173->1158|3213->1160|3239->1177|3268->1197|3308->1199|3333->1215|3351->1224|3375->1233|3400->1238|3430->1259|3526->1278|3558->1284|3610->1327|3650->1329|3678->1339|3691->1344|3714->1346|3756->374|3785->494|3814->679|3843->861|3872->1049|3901->1235|3930->1348|3959->1350|4627->1991|4656->2011|4695->2012|4731->2021|4792->2051|4829->2061|4855->2078|4894->2079|4930->2088|5039->2166|5071->2171|5133->2207|5198->2256|5238->2258|5272->2265|5311->2277|5360->2305|5412->2330|5457->2354|5496->2366|5511->2372|5559->2399|5589->2402|5616->2407|5664->2428|5686->2441|5699->2445|5744->2452|5773->2453|5805->2458|5816->2460|5848->2471|5873->2477|5892->2487|5931->2488|5973->2499|6012->2511|6034->2524|6047->2528|6092->2535|6121->2536|6153->2541|6164->2543|6198->2556|6223->2562|6242->2572|6281->2573|6323->2584|6362->2596|6384->2609|6397->2613|6442->2620|6471->2621|6510->2633|6580->2682|6611->2685|6623->2687|6669->2711|6695->2717|6715->2727|6755->2728|6798->2739|6837->2751|6859->2764|6872->2768|6917->2775|6946->2776|6985->2788|7051->2833|7081->2836|7092->2838|7136->2860|7162->2866|7182->2876|7222->2877|7265->2888|7304->2900|7326->2913|7339->2917|7384->2924|7413->2925|7452->2937|7531->2994|7562->2997|7574->2999|7624->3027|7650->3033|7670->3043|7710->3044|7753->3055|7792->3067|7814->3080|7827->3084|7872->3091|7901->3092|7933->3097|7944->3099|7983->3117|8008->3123|8027->3133|8066->3134|8108->3145|8147->3157|8169->3170|8182->3174|8227->3181|8256->3182|8295->3194|8370->3247|8401->3250|8413->3252|8461->3278|8487->3284|8507->3294|8547->3295|8590->3306|8629->3318|8658->3338|8697->3339|8736->3351|8758->3364|8771->3368|8816->3375|8845->3376|8877->3381|8888->3383|8914->3388|8939->3394|8958->3404|8997->3405|9039->3416|9082->3428|9121->3440|9147->3457|9186->3458|9225->3470|9247->3483|9260->3487|9305->3494|9334->3495|9366->3500|9377->3502|9411->3515|9436->3521|9455->3531|9494->3532|9536->3543|9575->3555|9597->3568|9610->3572|9655->3579|9684->3580|9716->3585|9727->3587|9767->3606|9792->3612|9811->3622|9850->3623|9892->3634|9935->3646|9969->3653|10010->3664|10042->3669
                  LINES: 23->5|32->12|32->12|34->12|35->13|35->13|35->13|35->14|35->14|35->14|35->15|35->15|35->16|36->19|36->19|38->19|39->20|39->20|39->20|39->21|39->21|39->21|39->22|39->22|39->22|39->23|39->23|39->24|40->27|40->27|42->27|43->28|43->28|43->28|43->29|43->29|43->29|43->30|43->30|43->30|43->31|43->31|43->32|44->35|44->35|46->35|47->36|47->36|47->36|47->37|47->37|47->37|47->38|47->38|47->38|47->39|47->39|47->40|48->43|48->43|50->43|51->44|51->44|51->44|51->45|51->45|51->45|51->46|51->46|51->46|51->47|51->47|51->48|52->51|52->51|54->51|55->52|55->52|55->52|55->52|55->52|55->52|57->10|59->17|61->25|63->33|65->41|67->49|69->53|71->55|81->65|81->65|81->65|82->66|83->67|84->68|84->68|84->68|85->69|87->71|88->72|91->75|91->75|91->75|92->76|92->76|92->76|93->77|93->77|93->77|93->77|93->77|93->77|93->77|94->78|94->78|94->78|94->78|94->78|94->78|94->78|94->78|94->78|94->78|94->78|94->78|95->79|95->79|95->79|95->79|95->79|95->79|95->79|95->79|95->79|95->79|95->79|95->79|96->80|96->80|96->80|96->80|96->80|96->80|96->80|96->80|96->80|96->80|96->80|96->80|96->80|96->80|97->81|97->81|97->81|97->81|97->81|97->81|97->81|97->81|97->81|97->81|97->81|97->81|97->81|97->81|98->82|98->82|98->82|98->82|98->82|98->82|98->82|98->82|98->82|98->82|98->82|98->82|98->82|98->82|99->83|99->83|99->83|99->83|99->83|99->83|99->83|99->83|99->83|99->83|99->83|99->83|100->84|100->84|100->84|100->84|100->84|100->84|100->84|100->84|100->84|100->84|100->84|100->84|100->84|100->84|101->85|101->85|101->85|102->86|102->86|102->86|102->86|102->86|102->86|102->86|102->86|102->86|102->86|102->86|102->86|103->87|104->88|104->88|104->88|105->89|105->89|105->89|105->89|105->89|105->89|105->89|105->89|105->89|105->89|105->89|105->89|106->90|106->90|106->90|106->90|106->90|106->90|106->90|106->90|106->90|106->90|106->90|106->90|107->91|108->92|109->93|110->94
                  -- GENERATED --
              */
          