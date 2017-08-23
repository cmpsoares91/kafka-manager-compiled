
package views.html.cluster

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object clusterViewContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class clusterViewContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,kafka.manager.model.ActorModel.CMView,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster: String, clusterView: kafka.manager.model.ActorModel.CMView)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.114*/("""

"""),format.raw/*7.1*/("""<div class="panel panel-default">
    <div class="panel-heading"><h3>Cluster Information</h3></div>
    <table class="table">
        <tbody>
        <tr>
            <td><b>Zookeepers</b></td><td>"""),_display_(/*12.44*/clusterView/*12.55*/.clusterContext.config.curatorConfig.zkConnect.replace(","," ")),format.raw/*12.118*/("""</td>
        </tr>
        <tr>
            <td><b>Version</b></td><td>"""),_display_(/*15.41*/clusterView/*15.52*/.clusterContext.config.version.toString),format.raw/*15.91*/("""</td>
        </tr>
        </tbody>
    </table>
</div>
<div class="panel panel-default">
    <div class="panel-heading"><h3>Cluster Summary</h3></div>
    <table class="table">
        <tbody>
        <tr>
            <td><b>Topics</b></td><td><a href=""""),_display_(/*25.49*/routes/*25.55*/.Topic.topics(cluster)),format.raw/*25.77*/("""">"""),_display_(/*25.80*/clusterView/*25.91*/.topicsCount),format.raw/*25.103*/("""</a></td>
            <td><b>Brokers</b></td><td><a href=""""),_display_(/*26.50*/routes/*26.56*/.Cluster.brokers(cluster)),format.raw/*26.81*/("""">"""),_display_(/*26.84*/clusterView/*26.95*/.brokersCount),format.raw/*26.108*/("""</a></td>
        </tr>
        </tbody>
    </table>
</div>
"""))
      }
    }
  }

  def render(cluster:String,clusterView:kafka.manager.model.ActorModel.CMView,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,clusterView)(messages)

  def f:((String,kafka.manager.model.ActorModel.CMView) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,clusterView) => (messages) => apply(cluster,clusterView)(messages)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object clusterViewContent extends clusterViewContent_Scope0.clusterViewContent
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/cluster/clusterViewContent.scala.html
                  HASH: a4c33168b0ba09438b13892f75b80467796f058d
                  MATRIX: 731->115|939->227|967->229|1192->427|1212->438|1297->501|1397->574|1417->585|1477->624|1760->880|1775->886|1818->908|1848->911|1868->922|1902->934|1988->993|2003->999|2049->1024|2079->1027|2099->1038|2134->1051
                  LINES: 23->5|28->5|30->7|35->12|35->12|35->12|38->15|38->15|38->15|48->25|48->25|48->25|48->25|48->25|48->25|49->26|49->26|49->26|49->26|49->26|49->26
                  -- GENERATED --
              */
          