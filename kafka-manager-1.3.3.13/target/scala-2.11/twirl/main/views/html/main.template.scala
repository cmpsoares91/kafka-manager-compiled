
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,Html,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(title: String, menu: Html, breadcrumbs: Html = Html(""), scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.100*/("""

"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(/*10.13*/title),format.raw/*10.18*/("""</title>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.versioned("images/favicon.png")),format.raw/*11.100*/("""">
    <link rel='stylesheet' href='"""),_display_(/*12.35*/routes/*12.41*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*12.103*/("""'>
    <script>
        """),_display_(/*14.10*/Html(org.webjars.RequireJS.getSetupJavaScript(routes.WebJarAssets.at("").url))),format.raw/*14.88*/("""
    """),format.raw/*15.5*/("""</script>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/index.min.css")),format.raw/*16.102*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("dataTables/stylesheets/dataTables.bootstrap.css")),format.raw/*17.124*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*18.50*/routes/*18.56*/.Assets.versioned("chartist/stylesheets/chartist.min.css")),format.raw/*18.114*/("""">
    <!--
    <script data-main=""""),_display_(/*20.25*/routes/*20.31*/.Assets.versioned("javascripts/index.js")),format.raw/*20.72*/("""" src=""""),_display_(/*20.80*/routes/*20.86*/.WebJarAssets.at(WebJarAssets.locate("require.min.js"))),format.raw/*20.141*/(""""></script>
    -->
    <script src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("chartist/javascripts/chartist.min.js")),format.raw/*22.82*/(""""></script>
</head>
<body role="document">

"""),_display_(/*26.2*/menu),format.raw/*26.6*/("""

"""),format.raw/*28.1*/("""<div class="container" role="main">
"""),_display_(/*29.2*/breadcrumbs),format.raw/*29.13*/("""
"""),_display_(/*30.2*/content),format.raw/*30.9*/("""
"""),format.raw/*31.1*/("""</div>

<script src=""""),_display_(/*33.15*/routes/*33.21*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*33.75*/(""""></script>
<script src=""""),_display_(/*34.15*/routes/*34.21*/.WebJarAssets.at(WebJarAssets.locate("js/bootstrap.min.js"))),format.raw/*34.81*/(""""></script>
<script src=""""),_display_(/*35.15*/routes/*35.21*/.Assets.versioned("dataTables/javascripts/jquery.dataTables.min.js")),format.raw/*35.89*/(""""></script>
<script src=""""),_display_(/*36.15*/routes/*36.21*/.Assets.versioned("dataTables/javascripts/dataTables.bootstrap.js")),format.raw/*36.88*/(""""></script>

<script>
    function goBack() """),format.raw/*39.23*/("""{"""),format.raw/*39.24*/("""
        """),format.raw/*40.9*/("""window.history.back()
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""

    """),format.raw/*43.5*/("""function checkBoxSelect(idPrefix, booleanValue, display) """),format.raw/*43.62*/("""{"""),format.raw/*43.63*/("""
        """),format.raw/*44.9*/("""$("[id^="+idPrefix+"]").prop("checked",booleanValue);
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/("""

    """),format.raw/*47.5*/("""function selectBySubname(selectId, selectClass, display) """),format.raw/*47.62*/("""{"""),format.raw/*47.63*/("""
        """),format.raw/*48.9*/("""var subname = $(selectId).val().toLowerCase();
        $('.' + selectClass).not("[name*='" + subname + "']").css("display", "none");
        $("[class='"+selectClass+"'][name*='"+subname+"']").css("display", display);
        if (subname == "") """),format.raw/*51.28*/("""{"""),format.raw/*51.29*/("""
            """),format.raw/*52.13*/("""$('.' + selectClass).css("display", display);
        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/("""
    """),format.raw/*54.5*/("""}"""),format.raw/*54.6*/("""

    """),format.raw/*56.5*/("""function disableSubmission() """),format.raw/*56.34*/("""{"""),format.raw/*56.35*/("""
        """),format.raw/*57.9*/("""$('[type=submit]').prop('disabled', true);
        $('[type=submit]').removeAttr('type');
    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/("""
"""),format.raw/*60.1*/("""</script>
"""),_display_(/*61.2*/scripts),format.raw/*61.9*/("""
"""),format.raw/*62.1*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,menu:Html,breadcrumbs:Html,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,menu,breadcrumbs,scripts)(content)

  def f:((String,Html,Html,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,menu,breadcrumbs,scripts) => (content) => apply(title,menu,breadcrumbs,scripts)(content)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/main.scala.html
                  HASH: 481399bca02603792ad7c5e043bd42216a5c1507
                  MATRIX: 654->115|848->213|876->215|945->257|971->262|1061->325|1076->331|1137->370|1201->407|1216->413|1300->475|1352->500|1451->578|1483->583|1569->642|1584->648|1652->694|1731->746|1746->752|1836->820|1915->872|1930->878|2010->936|2073->972|2088->978|2150->1019|2185->1027|2200->1033|2277->1088|2342->1126|2357->1132|2435->1189|2506->1234|2530->1238|2559->1240|2622->1277|2654->1288|2682->1290|2709->1297|2737->1298|2786->1320|2801->1326|2876->1380|2929->1406|2944->1412|3025->1472|3078->1498|3093->1504|3182->1572|3235->1598|3250->1604|3338->1671|3410->1715|3439->1716|3475->1725|3528->1751|3556->1752|3589->1758|3674->1815|3703->1816|3739->1825|3824->1883|3852->1884|3885->1890|3970->1947|3999->1948|4035->1957|4308->2202|4337->2203|4378->2216|4459->2270|4488->2271|4520->2276|4548->2277|4581->2283|4638->2312|4667->2313|4703->2322|4824->2416|4852->2417|4880->2418|4917->2429|4944->2436|4972->2437
                  LINES: 23->5|28->5|30->7|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|37->14|37->14|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|43->20|43->20|43->20|43->20|43->20|43->20|45->22|45->22|45->22|49->26|49->26|51->28|52->29|52->29|53->30|53->30|54->31|56->33|56->33|56->33|57->34|57->34|57->34|58->35|58->35|58->35|59->36|59->36|59->36|62->39|62->39|63->40|64->41|64->41|66->43|66->43|66->43|67->44|68->45|68->45|70->47|70->47|70->47|71->48|74->51|74->51|75->52|76->53|76->53|77->54|77->54|79->56|79->56|79->56|80->57|82->59|82->59|83->60|84->61|84->61|85->62
                  -- GENERATED --
              */
          