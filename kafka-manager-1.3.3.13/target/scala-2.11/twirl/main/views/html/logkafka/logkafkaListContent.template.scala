
package views.html.logkafka

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logkafkaListContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class logkafkaListContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.LogkafkaIdentity]], Boolean]],play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster: String, logkafkas: IndexedSeq[((String, Option[kafka.manager.model.ActorModel.LogkafkaIdentity]),Boolean)]
)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor; var row_num = 0
def /*10.2*/getFilesizeStatus/*10.19*/(filesize: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.38*/("""
    """),_display_(/*11.6*/filesize/*11.14*/ match/*11.20*/ {/*12.9*/case i if i < 0 =>/*12.27*/ {_display_(Seq[Any](format.raw/*12.29*/("""warning""")))}/*13.9*/case i =>/*13.18*/ {}}),format.raw/*14.6*/("""
""")))};def /*17.2*/getLogkafkaStatus/*17.19*/(flag: Boolean, s1: String, s2: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.62*/("""
    """),_display_(/*18.6*/if(flag)/*18.14*/ {_display_(_display_(/*18.17*/s1))}/*18.21*/else/*18.26*/{_display_(_display_(/*18.28*/s2))}),format.raw/*18.31*/("""
""")))};def /*21.2*/getTime/*21.9*/(timestamp: Long):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.30*/("""
    """),_display_(/*22.6*/((new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")).format(timestamp*1000))),format.raw/*22.89*/("""
""")))};
Seq[Any](format.raw/*6.45*/("""

"""),format.raw/*9.1*/("""
"""),format.raw/*15.2*/("""

"""),format.raw/*19.2*/("""

"""),format.raw/*23.2*/("""

"""),format.raw/*25.1*/("""<table class="table" id="logkafkas-table">
    <thead>
        <tr><th>row</th><th>Logkafka Id</th><th>Log Path</th><th># Real Path</th><th># Last Rotate Time</th><th># File Inode</th><th># File Pos</th><th># File Size</th><th># Topic</th><th>Operations</th></tr>
    </thead>
    <tbody>
    """),_display_(/*30.6*/for( ((logkafka_id, logkafkaIdentity), deleted) <- logkafkas) yield /*30.67*/ {_display_(Seq[Any](format.raw/*30.69*/("""
        """),_display_(/*31.10*/logkafkaIdentity/*31.26*/.map/*31.30*/{ li =>_display_(Seq[Any](format.raw/*31.37*/("""
            """),_display_(/*32.14*/for( (log_path, im) <- li.identityMap) yield /*32.52*/ {_display_(Seq[Any](format.raw/*32.54*/("""
                """),_display_(/*33.18*/{row_num = row_num + 1}),format.raw/*33.41*/("""
                """),format.raw/*34.17*/("""<tr>
                <td class="""),_display_(/*35.28*/getLogkafkaStatus(li.active, "", "danger")),format.raw/*35.70*/(""">
                    <a href=""""),_display_(/*36.31*/routes/*36.37*/.Logkafka.logkafka(cluster, logkafka_id, log_path)),format.raw/*36.87*/("""">"""),_display_(/*36.90*/row_num),format.raw/*36.97*/("""</a>
                </td>

                <td> """),_display_(/*39.23*/logkafka_id),format.raw/*39.34*/(""" """),format.raw/*39.35*/("""</td>

                """),_display_(/*41.18*/im/*41.20*/._1.map/*41.27*/ { c =>_display_(Seq[Any](format.raw/*41.34*/("""
                    """),format.raw/*42.21*/("""<td>"""),_display_(/*42.26*/log_path),format.raw/*42.34*/("""</td>
                """)))}/*43.18*/.getOrElse/*43.28*/{_display_(Seq[Any](format.raw/*43.29*/("""<td> </td>""")))}),format.raw/*43.40*/("""

                """),_display_(/*45.18*/im/*45.20*/._2.map/*45.27*/ { c =>_display_(Seq[Any](format.raw/*45.34*/("""
                    """),_display_(/*46.22*/c/*46.23*/.get("realpath").map/*46.43*/ { d =>_display_(Seq[Any](format.raw/*46.50*/("""
                        """),format.raw/*47.25*/("""<td>"""),_display_(/*47.30*/d),format.raw/*47.31*/("""</td>
                    """)))}/*48.22*/.getOrElse/*48.32*/{_display_(Seq[Any](format.raw/*48.33*/("""<td class = "danger"> no corresponding file </td>""")))}),format.raw/*48.83*/("""
                """)))}/*49.18*/.getOrElse/*49.28*/{_display_(Seq[Any](format.raw/*49.29*/("""
                    """),format.raw/*50.21*/("""<td class = """),_display_(/*50.34*/getLogkafkaStatus(li.active, "warning", "danger")),format.raw/*50.83*/("""> 
                        """),_display_(/*51.26*/getLogkafkaStatus(li.active,"scanning for new file", "logkafka is inactive")),format.raw/*51.102*/(""" 
                    """),format.raw/*52.21*/("""</td>
                """)))}),format.raw/*53.18*/("""

                """),_display_(/*55.18*/im/*55.20*/._2.map/*55.27*/ { c =>_display_(Seq[Any](format.raw/*55.34*/("""
                    """),_display_(/*56.22*/c/*56.23*/.get("last_rotate_time_sec").map/*56.55*/ { d =>_display_(Seq[Any](format.raw/*56.62*/("""
                        """),format.raw/*57.25*/("""<td>"""),_display_(/*57.30*/getTime(d.toLong)),format.raw/*57.47*/("""</td>
                    """)))}/*58.22*/.getOrElse/*58.32*/{_display_(Seq[Any](format.raw/*58.33*/("""<td> </td>""")))}),format.raw/*58.44*/("""
                """)))}/*59.18*/.getOrElse/*59.28*/{_display_(Seq[Any](format.raw/*59.29*/("""<td> </td>""")))}),format.raw/*59.40*/("""

                """),_display_(/*61.18*/im/*61.20*/._2.map/*61.27*/ { c =>_display_(Seq[Any](format.raw/*61.34*/("""
                    """),_display_(/*62.22*/c/*62.23*/.get("inode").map/*62.40*/ { d =>_display_(Seq[Any](format.raw/*62.47*/("""
                        """),format.raw/*63.25*/("""<td>"""),_display_(/*63.30*/d),format.raw/*63.31*/("""</td>
                    """)))}/*64.22*/.getOrElse/*64.32*/{_display_(Seq[Any](format.raw/*64.33*/("""<td> </td>""")))}),format.raw/*64.44*/("""
                """)))}/*65.18*/.getOrElse/*65.28*/{_display_(Seq[Any](format.raw/*65.29*/("""<td> </td>""")))}),format.raw/*65.40*/("""

                """),_display_(/*67.18*/im/*67.20*/._2.map/*67.27*/ { c =>_display_(Seq[Any](format.raw/*67.34*/("""
                    """),_display_(/*68.22*/c/*68.23*/.get("filepos").map/*68.42*/ { d =>_display_(Seq[Any](format.raw/*68.49*/("""
                        """),format.raw/*69.25*/("""<td>"""),_display_(/*69.30*/d),format.raw/*69.31*/("""</td>
                    """)))}/*70.22*/.getOrElse/*70.32*/{_display_(Seq[Any](format.raw/*70.33*/("""<td> </td>""")))}),format.raw/*70.44*/("""
                """)))}/*71.18*/.getOrElse/*71.28*/{_display_(Seq[Any](format.raw/*71.29*/("""<td> </td>""")))}),format.raw/*71.40*/("""

                """),_display_(/*73.18*/im/*73.20*/._2.map/*73.27*/ { c =>_display_(Seq[Any](format.raw/*73.34*/("""
                    """),_display_(/*74.22*/c/*74.23*/.get("filesize").map/*74.43*/ { d =>_display_(Seq[Any](format.raw/*74.50*/("""
                        """),format.raw/*75.25*/("""<td class = """"),_display_(/*75.39*/getFilesizeStatus(d.toInt)),format.raw/*75.65*/("""">"""),_display_(/*75.68*/d),format.raw/*75.69*/("""</td>
                    """)))}/*76.22*/.getOrElse/*76.32*/{_display_(Seq[Any](format.raw/*76.33*/("""<td> </td>""")))}),format.raw/*76.44*/("""
                """)))}/*77.18*/.getOrElse/*77.28*/{_display_(Seq[Any](format.raw/*77.29*/("""<td> </td>""")))}),format.raw/*77.40*/("""

                """),_display_(/*79.18*/im/*79.20*/._1.map/*79.27*/ { c =>_display_(Seq[Any](format.raw/*79.34*/("""
                    """),_display_(/*80.22*/c/*80.23*/.get("topic").map/*80.40*/ { d =>_display_(Seq[Any](format.raw/*80.47*/("""
                        """),format.raw/*81.25*/("""<td>"""),_display_(/*81.30*/d),format.raw/*81.31*/("""</td>
                    """)))}/*82.22*/.getOrElse/*82.32*/{_display_(Seq[Any](format.raw/*82.33*/("""<td> </td>""")))}),format.raw/*82.44*/("""
                """)))}/*83.18*/.getOrElse/*83.28*/{_display_(Seq[Any](format.raw/*83.29*/("""<td> </td>""")))}),format.raw/*83.40*/("""

                """),format.raw/*85.17*/("""<td>
                    <div class="btn-group-horizontal" role="group" aria-label="...">
                        """),_display_(/*87.26*/im/*87.28*/._1.map/*87.35*/ { c =>_display_(Seq[Any](format.raw/*87.42*/("""
                            """),_display_(/*88.30*/c/*88.31*/.get("valid").map/*88.48*/ { enabled =>_display_(Seq[Any](format.raw/*88.61*/("""
                                """),_display_(/*89.34*/if(enabled.toBoolean)/*89.55*/ {_display_(Seq[Any](format.raw/*89.57*/("""
                                    """),format.raw/*90.37*/("""<a href=""""),_display_(/*90.47*/routes/*90.53*/.Logkafka.updateConfig(cluster, logkafka_id, log_path)),format.raw/*90.107*/("""" class="btn btn-default ops-button" role="button">Modify</a>
                                    """),_display_(/*91.38*/b3/*91.40*/.form(routes.Logkafka.handleDisableConfig(cluster, logkafka_id, log_path))/*91.114*/ {_display_(Seq[Any](format.raw/*91.116*/("""
                                        """),format.raw/*92.41*/("""<input type="hidden" name="name" value=""""),_display_(/*92.82*/cluster),format.raw/*92.89*/("""">
                                        """),_display_(/*93.42*/b3/*93.44*/.submit('class -> "btn btn-warning ops-button")/*93.91*/{_display_(Seq[Any](format.raw/*93.92*/(""" """),format.raw/*93.93*/("""Disable """)))}),format.raw/*93.102*/("""
                                    """)))}),format.raw/*94.38*/("""
                                """)))}/*95.35*/else/*95.40*/{_display_(Seq[Any](format.raw/*95.41*/("""
                                    """),_display_(/*96.38*/b3/*96.40*/.form(routes.Logkafka.handleEnableConfig(cluster, logkafka_id, log_path))/*96.113*/ {_display_(Seq[Any](format.raw/*96.115*/("""
                                        """),format.raw/*97.41*/("""<input type="hidden" name="name" value=""""),_display_(/*97.82*/cluster),format.raw/*97.89*/("""">
                                        """),_display_(/*98.42*/b3/*98.44*/.submit('class -> "btn btn-success ops-button")/*98.91*/{_display_(Seq[Any](format.raw/*98.92*/(""" """),format.raw/*98.93*/("""Enable """)))}),format.raw/*98.101*/("""
                                    """)))}),format.raw/*99.38*/("""
                                    """),_display_(/*100.38*/b3/*100.40*/.form(routes.Logkafka.handleDeleteLogkafka(cluster, logkafka_id, log_path))/*100.115*/ {_display_(Seq[Any](format.raw/*100.117*/("""
                                        """),format.raw/*101.41*/("""<input type="hidden" name="name" value=""""),_display_(/*101.82*/cluster),format.raw/*101.89*/("""">
                                        """),_display_(/*102.42*/b3/*102.44*/.submit('class -> "btn btn-danger ops-button")/*102.90*/{_display_(Seq[Any](format.raw/*102.91*/(""" """),format.raw/*102.92*/("""Delete """)))}),format.raw/*102.100*/("""
                                    """)))}),format.raw/*103.38*/("""
                                """)))}),format.raw/*104.34*/("""
                            """)))}/*105.30*/.getOrElse/*105.40*/{_display_(Seq[Any](format.raw/*105.41*/("""<td> </td>""")))}),format.raw/*105.52*/("""
                        """)))}/*106.26*/.getOrElse/*106.36*/{_display_(Seq[Any](format.raw/*106.37*/("""<td> </td>""")))}),format.raw/*106.48*/("""
                    """),format.raw/*107.21*/("""</div>
                </td>

                </tr>
            """)))}),format.raw/*111.14*/("""
        """)))}/*112.10*/.getOrElse/*112.20*/{}),format.raw/*112.22*/("""
    """)))}),format.raw/*113.6*/("""
    """),format.raw/*114.5*/("""</tbody>
</table>
"""))
      }
    }
  }

  def render(cluster:String,logkafkas:IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.LogkafkaIdentity]], Boolean]],messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,logkafkas)(messages)

  def f:((String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.LogkafkaIdentity]], Boolean]]) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,logkafkas) => (messages) => apply(cluster,logkafkas)(messages)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object logkafkaListContent extends logkafkaListContent_Scope0.logkafkaListContent
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/logkafka/logkafkaListContent.scala.html
                  HASH: 5171a8c9c7f1bec4bf993a9d928083fee07241ea
                  MATRIX: 809->115|1101->334|1127->351|1223->370|1255->376|1272->384|1287->390|1297->401|1324->419|1364->421|1390->438|1408->447|1432->456|1457->461|1483->478|1603->521|1635->527|1652->535|1683->538|1697->542|1710->547|1740->549|1766->552|1791->557|1806->564|1904->585|1936->591|2040->674|2081->276|2109->332|2137->458|2166->554|2195->676|2224->678|2544->972|2621->1033|2661->1035|2698->1045|2723->1061|2736->1065|2781->1072|2822->1086|2876->1124|2916->1126|2961->1144|3005->1167|3050->1184|3109->1216|3172->1258|3231->1290|3246->1296|3317->1346|3347->1349|3375->1356|3452->1406|3484->1417|3513->1418|3564->1442|3575->1444|3591->1451|3636->1458|3685->1479|3717->1484|3746->1492|3788->1515|3807->1525|3846->1526|3888->1537|3934->1556|3945->1558|3961->1565|4006->1572|4055->1594|4065->1595|4094->1615|4139->1622|4192->1647|4224->1652|4246->1653|4292->1680|4311->1690|4350->1691|4431->1741|4468->1759|4487->1769|4526->1770|4575->1791|4615->1804|4685->1853|4740->1881|4838->1957|4888->1979|4942->2002|4988->2021|4999->2023|5015->2030|5060->2037|5109->2059|5119->2060|5160->2092|5205->2099|5258->2124|5290->2129|5328->2146|5374->2173|5393->2183|5432->2184|5474->2195|5511->2213|5530->2223|5569->2224|5611->2235|5657->2254|5668->2256|5684->2263|5729->2270|5778->2292|5788->2293|5814->2310|5859->2317|5912->2342|5944->2347|5966->2348|6012->2375|6031->2385|6070->2386|6112->2397|6149->2415|6168->2425|6207->2426|6249->2437|6295->2456|6306->2458|6322->2465|6367->2472|6416->2494|6426->2495|6454->2514|6499->2521|6552->2546|6584->2551|6606->2552|6652->2579|6671->2589|6710->2590|6752->2601|6789->2619|6808->2629|6847->2630|6889->2641|6935->2660|6946->2662|6962->2669|7007->2676|7056->2698|7066->2699|7095->2719|7140->2726|7193->2751|7234->2765|7281->2791|7311->2794|7333->2795|7379->2822|7398->2832|7437->2833|7479->2844|7516->2862|7535->2872|7574->2873|7616->2884|7662->2903|7673->2905|7689->2912|7734->2919|7783->2941|7793->2942|7819->2959|7864->2966|7917->2991|7949->2996|7971->2997|8017->3024|8036->3034|8075->3035|8117->3046|8154->3064|8173->3074|8212->3075|8254->3086|8300->3104|8442->3219|8453->3221|8469->3228|8514->3235|8571->3265|8581->3266|8607->3283|8658->3296|8719->3330|8749->3351|8789->3353|8854->3390|8891->3400|8906->3406|8982->3460|9108->3559|9119->3561|9203->3635|9244->3637|9313->3678|9381->3719|9409->3726|9480->3770|9491->3772|9547->3819|9586->3820|9615->3821|9656->3830|9725->3868|9778->3903|9791->3908|9830->3909|9895->3947|9906->3949|9989->4022|10030->4024|10099->4065|10167->4106|10195->4113|10266->4157|10277->4159|10333->4206|10372->4207|10401->4208|10441->4216|10510->4254|10576->4292|10588->4294|10674->4369|10716->4371|10786->4412|10855->4453|10884->4460|10956->4504|10968->4506|11024->4552|11064->4553|11094->4554|11135->4562|11205->4600|11271->4634|11321->4664|11341->4674|11381->4675|11424->4686|11470->4712|11490->4722|11530->4723|11573->4734|11623->4755|11720->4820|11750->4830|11770->4840|11794->4842|11831->4848|11864->4853
                  LINES: 23->5|28->10|28->10|30->10|31->11|31->11|31->11|31->12|31->12|31->12|31->13|31->13|31->14|32->17|32->17|34->17|35->18|35->18|35->18|35->18|35->18|35->18|35->18|36->21|36->21|38->21|39->22|39->22|41->6|43->9|44->15|46->19|48->23|50->25|55->30|55->30|55->30|56->31|56->31|56->31|56->31|57->32|57->32|57->32|58->33|58->33|59->34|60->35|60->35|61->36|61->36|61->36|61->36|61->36|64->39|64->39|64->39|66->41|66->41|66->41|66->41|67->42|67->42|67->42|68->43|68->43|68->43|68->43|70->45|70->45|70->45|70->45|71->46|71->46|71->46|71->46|72->47|72->47|72->47|73->48|73->48|73->48|73->48|74->49|74->49|74->49|75->50|75->50|75->50|76->51|76->51|77->52|78->53|80->55|80->55|80->55|80->55|81->56|81->56|81->56|81->56|82->57|82->57|82->57|83->58|83->58|83->58|83->58|84->59|84->59|84->59|84->59|86->61|86->61|86->61|86->61|87->62|87->62|87->62|87->62|88->63|88->63|88->63|89->64|89->64|89->64|89->64|90->65|90->65|90->65|90->65|92->67|92->67|92->67|92->67|93->68|93->68|93->68|93->68|94->69|94->69|94->69|95->70|95->70|95->70|95->70|96->71|96->71|96->71|96->71|98->73|98->73|98->73|98->73|99->74|99->74|99->74|99->74|100->75|100->75|100->75|100->75|100->75|101->76|101->76|101->76|101->76|102->77|102->77|102->77|102->77|104->79|104->79|104->79|104->79|105->80|105->80|105->80|105->80|106->81|106->81|106->81|107->82|107->82|107->82|107->82|108->83|108->83|108->83|108->83|110->85|112->87|112->87|112->87|112->87|113->88|113->88|113->88|113->88|114->89|114->89|114->89|115->90|115->90|115->90|115->90|116->91|116->91|116->91|116->91|117->92|117->92|117->92|118->93|118->93|118->93|118->93|118->93|118->93|119->94|120->95|120->95|120->95|121->96|121->96|121->96|121->96|122->97|122->97|122->97|123->98|123->98|123->98|123->98|123->98|123->98|124->99|125->100|125->100|125->100|125->100|126->101|126->101|126->101|127->102|127->102|127->102|127->102|127->102|127->102|128->103|129->104|130->105|130->105|130->105|130->105|131->106|131->106|131->106|131->106|132->107|136->111|137->112|137->112|137->112|138->113|139->114
                  -- GENERATED --
              */
          