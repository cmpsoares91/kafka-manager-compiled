
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object topicViewContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object topicViewContent_Scope1 {
import b3.vertical.fieldConstructor
import kafka.manager.model.ActorModel.ConsumerType
import models.form.ReassignPartitionOperation
import models.form.ReassignPartitionOperation._

class topicViewContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,kafka.manager.model.ActorModel.TopicIdentity,Iterable[scala.Tuple2[String, ConsumerType]],ReassignPartitionOperation,features.ApplicationFeatures,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(cluster:String
, topic: String
, topicIdentity: kafka.manager.model.ActorModel.TopicIdentity
, consumerList: Iterable[(String, ConsumerType)]
, reassignPartitionOperation: ReassignPartitionOperation
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*16.2*/getUnderReplicatedLevel/*16.25*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.46*/("""
    """),_display_(/*17.6*/percentage/*17.16*/ match/*17.22*/ {/*18.9*/case i if i > 50 =>/*18.28*/ {_display_(Seq[Any](format.raw/*18.30*/("""danger""")))}/*19.9*/case i if i > 0 =>/*19.27*/ {_display_(Seq[Any](format.raw/*19.29*/("""warning""")))}/*20.9*/case i =>/*20.18*/ {}}),format.raw/*21.6*/("""
""")))};def /*24.2*/getPreferredReplicasLevel/*24.27*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*24.48*/("""
    """),_display_(/*25.6*/percentage/*25.16*/ match/*25.22*/ {/*26.9*/case i if i > 50 && i<=75 =>/*26.37*/ {_display_(Seq[Any](format.raw/*26.39*/("""warning""")))}/*27.9*/case i if i <=  50 =>/*27.30*/ {_display_(Seq[Any](format.raw/*27.32*/("""danger""")))}/*28.9*/case i =>/*28.18*/ {}}),format.raw/*29.6*/("""
""")))};def /*32.2*/getBrokersSkewedLevel/*32.23*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.44*/("""
    """),_display_(/*33.6*/percentage/*33.16*/ match/*33.22*/ {/*34.9*/case i if i > 0 && i <= 33 =>/*34.38*/ {_display_(Seq[Any](format.raw/*34.40*/("""warning""")))}/*35.9*/case i if i >= 34 =>/*35.29*/ {_display_(Seq[Any](format.raw/*35.31*/("""danger""")))}/*36.9*/case i =>/*36.18*/ {}}),format.raw/*37.6*/("""
""")))};def /*40.2*/getBrokersLeaderSkewedLevel/*40.29*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*40.50*/("""
    """),_display_(/*41.6*/percentage/*41.16*/ match/*41.22*/ {/*42.9*/case i if i > 0 && i <= 33 =>/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""warning""")))}/*43.9*/case i if i >= 34 =>/*43.29*/ {_display_(Seq[Any](format.raw/*43.31*/("""danger""")))}/*44.9*/case i =>/*44.18*/ {}}),format.raw/*45.6*/("""
""")))};def /*48.2*/getBrokersSpreadLevel/*48.23*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*48.44*/("""
    """),_display_(/*49.6*/percentage/*49.16*/ match/*49.22*/ {/*50.9*/case i if i > 50 && i<=75 =>/*50.37*/ {_display_(Seq[Any](format.raw/*50.39*/("""warning""")))}/*51.9*/case i if i <=  50 =>/*51.30*/ {_display_(Seq[Any](format.raw/*51.32*/("""danger""")))}/*52.9*/case i =>/*52.18*/ {}}),format.raw/*53.6*/("""
""")))};def /*56.2*/getPartitionLeaderLevel/*56.25*/(leader: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*56.42*/("""
    """),_display_(/*57.6*/leader/*57.12*/ match/*57.18*/ {/*58.9*/case i if i < 0 =>/*58.27*/ {_display_(Seq[Any](format.raw/*58.29*/("""danger""")))}/*59.9*/case i =>/*59.18*/ {}}),format.raw/*60.6*/("""
""")))};def /*63.2*/getIsUnderReplicatedLevel/*63.27*/(underReplicated: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*63.57*/("""
    """),_display_(/*64.6*/underReplicated/*64.21*/ match/*64.27*/ {/*65.9*/case true =>/*65.21*/ {_display_(Seq[Any](format.raw/*65.23*/("""warning""")))}/*66.9*/case false =>/*66.22*/ {}}),format.raw/*67.6*/("""
""")))};def /*70.2*/getIsPreferredLeaderLevel/*70.27*/(preferredReplica: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*70.58*/("""
    """),_display_(/*71.6*/preferredReplica/*71.22*/ match/*71.28*/ {/*72.9*/case false =>/*72.22*/ {_display_(Seq[Any](format.raw/*72.24*/("""warning""")))}/*73.9*/case true =>/*73.21*/ {}}),format.raw/*74.6*/("""
""")))};def /*77.2*/getBrokerIsSkewedLevel/*77.24*/(isSkewed: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*77.47*/("""
    """),_display_(/*78.6*/isSkewed/*78.14*/ match/*78.20*/ {/*79.9*/case true =>/*79.21*/ {_display_(Seq[Any](format.raw/*79.23*/("""warning""")))}/*80.9*/case false =>/*80.22*/ {}}),format.raw/*81.6*/("""
""")))};def /*84.2*/renderTopicMetrics/*84.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*84.24*/("""
    """),_display_(/*85.6*/if(topicIdentity.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*85.107*/ {_display_(Seq[Any](format.raw/*85.109*/("""
        """),_display_(/*86.10*/views/*86.15*/.html.common.brokerMetrics(topicIdentity.metrics)),format.raw/*86.64*/("""
    """)))}/*87.7*/else/*87.12*/{_display_(Seq[Any](format.raw/*87.13*/("""
        """),format.raw/*88.9*/("""<div class="alert alert-info" role="alert">
            Please enable JMX polling <a href=""""),_display_(/*89.49*/routes/*89.55*/.Cluster.updateCluster(cluster)),format.raw/*89.86*/("""" class="alert-link">here</a>.
        </div>
    """)))}),format.raw/*91.6*/("""
""")))};def /*94.2*/renderConsumerList/*94.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*94.24*/("""
    """),_display_(/*95.6*/if(topicIdentity.clusterContext.config.pollConsumers)/*95.59*/{_display_(Seq[Any](format.raw/*95.60*/("""
        """),format.raw/*96.9*/("""<table class="table">
            <tbody>
            """),_display_(/*98.14*/for((c:String, ct: ConsumerType) <- consumerList) yield /*98.63*/ {_display_(Seq[Any](format.raw/*98.65*/("""
                """),format.raw/*99.17*/("""<tr>
                    <td><a href=""""),_display_(/*100.35*/routes/*100.41*/.Consumer.consumerAndTopic(cluster,c,topic, ct.toString)),format.raw/*100.97*/("""">"""),_display_(/*100.100*/c),format.raw/*100.101*/("""</a></td>
                    <td>"""),_display_(/*101.26*/ct/*101.28*/.toString),format.raw/*101.37*/("""</td>
                </tr>
            """)))}),format.raw/*103.14*/("""
            """),format.raw/*104.13*/("""</tbody>
        </table>
    """)))}/*106.7*/else/*106.12*/{_display_(Seq[Any](format.raw/*106.13*/("""
        """),format.raw/*107.9*/("""<div class="alert alert-info" role="alert">
            Please enable consumer polling <a href=""""),_display_(/*108.54*/routes/*108.60*/.Cluster.updateCluster(cluster)),format.raw/*108.91*/("""" class="alert-link">here</a>.
        </div>
    """)))}),format.raw/*110.6*/("""
""")))};
Seq[Any](format.raw/*14.79*/("""

"""),format.raw/*22.2*/("""

"""),format.raw/*30.2*/("""

"""),format.raw/*38.2*/("""

"""),format.raw/*46.2*/("""

"""),format.raw/*54.2*/("""

"""),format.raw/*61.2*/("""

"""),format.raw/*68.2*/("""

"""),format.raw/*75.2*/("""

"""),format.raw/*82.2*/("""

"""),format.raw/*92.2*/("""

"""),format.raw/*111.2*/("""


"""),format.raw/*114.1*/("""<div class="row">
    <div class="col-md-5">
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Topic Summary</h4></div>
            <table class="table">
                <tbody>
                <tr>
                    <td>Replication</td>
                    <td>"""),_display_(/*122.26*/topicIdentity/*122.39*/.replicationFactor),format.raw/*122.57*/("""</td>
                <tr>
                    <td>Number of Partitions</td>
                    <td>"""),_display_(/*125.26*/topicIdentity/*125.39*/.partitions),format.raw/*125.50*/("""</td>
                </tr>
                <tr>
                    <td><span title="Represents the theoretical size of the topic">Sum of partition offsets</span></td>
                    <td>"""),_display_(/*129.26*/topicIdentity/*129.39*/.summedTopicOffsets),format.raw/*129.58*/("""</td>
                </tr>
                <tr>
                    <td>Total number of Brokers</td>
                    <td>"""),_display_(/*133.26*/topicIdentity/*133.39*/.numBrokers),format.raw/*133.50*/("""</td>
                </tr>
                <tr>
                    <td>Number of Brokers for Topic</td>
                    <td>"""),_display_(/*137.26*/topicIdentity/*137.39*/.topicBrokers),format.raw/*137.52*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of replicas leader being preferred (first in the list of replicas)">Preferred Replicas %</td>
                    <td class=""""),_display_(/*141.33*/getPreferredReplicasLevel(topicIdentity.preferredReplicasPercentage)),format.raw/*141.101*/("""">
                        """),_display_(/*142.26*/topicIdentity/*142.39*/.preferredReplicasPercentage),format.raw/*142.67*/("""
                    """),format.raw/*143.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of brokers having more partitions than the average">Brokers Skewed %</span></td>
                    <td class=""""),_display_(/*147.33*/getBrokersSkewedLevel(topicIdentity.brokersSkewPercentage)),format.raw/*147.91*/("""">
                        """),_display_(/*148.26*/topicIdentity/*148.39*/.brokersSkewPercentage),format.raw/*148.61*/("""
                    """),format.raw/*149.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of brokers having more partitions as leader than the average">Brokers Leader Skewed %</span></td>
                    <td class=""""),_display_(/*153.33*/getBrokersLeaderSkewedLevel(topicIdentity.brokersLeaderSkewPercentage)),format.raw/*153.103*/("""">
                        """),_display_(/*154.26*/topicIdentity/*154.39*/.brokersLeaderSkewPercentage),format.raw/*154.67*/("""
                    """),format.raw/*155.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of cluster brokers having partitions from the topic">Brokers Spread %</span></td>
                    <td class=""""),_display_(/*159.33*/getBrokersSpreadLevel(topicIdentity.brokersSpreadPercentage)),format.raw/*159.93*/("""">
                        """),_display_(/*160.26*/topicIdentity/*160.39*/.brokersSpreadPercentage),format.raw/*160.63*/("""
                    """),format.raw/*161.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of partitions having a missing replica">Under-replicated %</span></td>
                    <td class=""""),_display_(/*165.33*/getUnderReplicatedLevel(topicIdentity.underReplicatedPercentage)),format.raw/*165.97*/("""">
                        """),_display_(/*166.26*/topicIdentity/*166.39*/.underReplicatedPercentage),format.raw/*166.65*/("""
                    """),format.raw/*167.21*/("""</td>
                </tr>
                """),_display_(/*169.18*/if(topicIdentity.clusterContext.config.jmxEnabled && topicIdentity.clusterContext.config.displaySizeEnabled)/*169.126*/{_display_(Seq[Any](format.raw/*169.127*/("""
                """),format.raw/*170.17*/("""<tr>
                    <td>Leader Size</td>
                    <td>"""),_display_(/*172.26*/topicIdentity/*172.39*/.size),format.raw/*172.44*/("""</td>
                </tr>
                """)))}),format.raw/*174.18*/("""
                """),format.raw/*175.17*/("""</tbody>
            </table>
            """),_display_(/*177.14*/if(!topicIdentity.config.isEmpty)/*177.47*/ {_display_(Seq[Any](format.raw/*177.49*/("""
            """),format.raw/*178.13*/("""<table class="table">
                <thead>
                <th>Config</th><th>Value</th>
                </thead>
                <tbody>
                """),_display_(/*183.18*/for( (k,v) <- topicIdentity.config) yield /*183.53*/ {_display_(Seq[Any](format.raw/*183.55*/("""
                """),format.raw/*184.17*/("""<tr>
                    <td>"""),_display_(/*185.26*/k),format.raw/*185.27*/("""</td>
                    <td>"""),_display_(/*186.26*/v),format.raw/*186.27*/("""</td>
                </tr>
                """)))}),format.raw/*188.18*/("""
                """),format.raw/*189.17*/("""</tbody>
            </table>
            """)))}),format.raw/*191.14*/("""
        """),format.raw/*192.9*/("""</div>
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Metrics</h4></div>
            """),_display_(/*195.14*/renderTopicMetrics),format.raw/*195.32*/("""
        """),format.raw/*196.9*/("""</div>
    </div>
    <div class="col-md-7">
        """),_display_(/*199.10*/features/*199.18*/.app(features.KMTopicManagerFeature)/*199.54*/ {_display_(Seq[Any](format.raw/*199.56*/("""
        """),format.raw/*200.9*/("""<div class="panel panel-default">
            <div class="panel-heading"><h4>Operations</h4></div>
            <table class="table">
                <tbody>
                <tr>
                    """),_display_(/*205.22*/if(topicIdentity.clusterContext.clusterFeatures.features(kafka.manager.features.KMDeleteTopicFeature))/*205.124*/ {_display_(Seq[Any](format.raw/*205.126*/("""
                    """),format.raw/*206.21*/("""<td>
                        <a href=""""),_display_(/*207.35*/routes/*207.41*/.Topic.confirmDeleteTopic(cluster,topic)),format.raw/*207.81*/("""" class='btn btn-primary btn-block'>Delete Topic</a>
                    </td>
                    """)))}),format.raw/*209.22*/("""
                    """),_display_(/*210.22*/features/*210.30*/.app(features.KMReassignPartitionsFeature)/*210.72*/ {_display_(Seq[Any](format.raw/*210.74*/("""
                    """),format.raw/*211.21*/("""<td>
                        """),_display_(/*212.26*/b3/*212.28*/.form(routes.ReassignPartitions.handleOperation(cluster,topic))/*212.91*/ {_display_(Seq[Any](format.raw/*212.93*/("""
                            """),_display_(/*213.30*/reassignPartitionOperation/*213.56*/ match/*213.62*/ {/*214.33*/case ForceRunAssignment =>/*214.59*/ {_display_(Seq[Any](format.raw/*214.61*/("""
                                    """),format.raw/*215.37*/("""<fieldset>
                                        <input type="hidden" name="operation" value="force">
                                        <input type="hidden" name="brokers" value=""""),_display_(/*217.85*/Seq()),format.raw/*217.90*/("""">
                                        """),_display_(/*218.42*/b3/*218.44*/.submit('class -> "btn btn-primary btn-block")/*218.90*/{_display_(Seq[Any](format.raw/*218.91*/(""" """),format.raw/*218.92*/("""Force Reassign Partitions """)))}),format.raw/*218.119*/("""
                                    """),format.raw/*219.37*/("""</fieldset>
                                """)))}/*221.33*/case _ =>/*221.42*/ {_display_(Seq[Any](format.raw/*221.44*/("""
                                    """),format.raw/*222.37*/("""<fieldset>
                                        <input type="hidden" name="operation" value="run">
                                        <input type="hidden" name="brokers" value=""""),_display_(/*224.85*/Seq()),format.raw/*224.90*/("""">
                                        """),_display_(/*225.42*/b3/*225.44*/.submit('class -> "btn btn-primary btn-block")/*225.90*/{_display_(Seq[Any](format.raw/*225.91*/(""" """),format.raw/*225.92*/("""Reassign Partitions """)))}),format.raw/*225.113*/("""
                                    """),format.raw/*226.37*/("""</fieldset>
                                """)))}}),format.raw/*228.30*/("""
                        """)))}),format.raw/*229.26*/("""
                    """),format.raw/*230.21*/("""</td>
                    <td>
                        <a href=""""),_display_(/*232.35*/routes/*232.41*/.ReassignPartitions.confirmAssignment(cluster,topic)),format.raw/*232.93*/("""" class="submit-button btn btn-primary" role="button">Generate Partition Assignments</a>
                    </td>
                    """)))}),format.raw/*234.22*/("""
                """),format.raw/*235.17*/("""</tr>
                <tr>
                    <td>
                        <a href=""""),_display_(/*238.35*/routes/*238.41*/.Topic.addPartitions(cluster,topic)),format.raw/*238.76*/("""" class="submit-button btn btn-primary" role="button">Add Partitions</a>
                    </td>
                    <td>
                        <a href=""""),_display_(/*241.35*/routes/*241.41*/.Topic.updateConfig(cluster,topic)),format.raw/*241.75*/("""" class="submit-button btn btn-primary" role="button">Update Config</a>
                    </td>
                    """),_display_(/*243.22*/features/*243.30*/.app(features.KMReassignPartitionsFeature)/*243.72*/ {_display_(Seq[Any](format.raw/*243.74*/("""
                    """),format.raw/*244.21*/("""<td>
                        <a href=""""),_display_(/*245.35*/routes/*245.41*/.ReassignPartitions.manualAssignments(cluster, topic)),format.raw/*245.94*/("""" class="submit-button btn btn-primary" role="button">Manual Partition Assignments</a>
                    </td>
                    """)))}),format.raw/*247.22*/("""
                """),format.raw/*248.17*/("""</tr>
                </tbody>
            </table>
        </div>
        """)))}),format.raw/*252.10*/("""
        """),format.raw/*253.9*/("""<div class="panel panel-default">
            <div class="panel-heading"><h4>Partitions by Broker</h4></div>
            <table class="table" style="table-layout: fixed; width: 100%">
                <thead>
                <tr><th>Broker</th><th># of Partitions</th><th># as Leader</th><th>Partitions</th><th><span title="Broker has more partitions than the average">Skewed?</span></th><th><span title="Broker has more partitions as leaders than the average">Leader Skewed?</span></th></tr>
                </thead>
                <tbody>
                """),_display_(/*260.18*/for(btp <- topicIdentity.partitionsByBroker) yield /*260.62*/ {_display_(Seq[Any](format.raw/*260.64*/("""
                """),format.raw/*261.17*/("""<tr>
                    <td><a href=""""),_display_(/*262.35*/routes/*262.41*/.Cluster.broker(cluster,btp.id)),format.raw/*262.72*/("""">"""),_display_(/*262.75*/btp/*262.78*/.id),format.raw/*262.81*/("""</a></td>
                    <td>"""),_display_(/*263.26*/btp/*263.29*/.partitions.size),format.raw/*263.45*/("""</td>
                    <td>"""),_display_(/*264.26*/btp/*264.29*/.leaders.size),format.raw/*264.42*/("""</td>
                    <td style="word-wrap: break-word">"""),_display_(/*265.56*/btp/*265.59*/.partitions.mkString("(",",",")")),format.raw/*265.92*/("""</td>
                    <td class=""""),_display_(/*266.33*/getBrokerIsSkewedLevel(btp.isSkewed)),format.raw/*266.69*/("""">
                        """),_display_(/*267.26*/btp/*267.29*/.isSkewed),format.raw/*267.38*/("""
                    """),format.raw/*268.21*/("""</td>
                    <td class=""""),_display_(/*269.33*/getBrokerIsSkewedLevel(btp.isLeaderSkewed)),format.raw/*269.75*/("""">
                        """),_display_(/*270.26*/btp/*270.29*/.isLeaderSkewed),format.raw/*270.44*/("""
                    """),format.raw/*271.21*/("""</td>
                </tr>
                """)))}),format.raw/*273.18*/("""
                """),format.raw/*274.17*/("""</tbody>
            </table>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Consumers consuming from this topic</h4></div>
            """),_display_(/*279.14*/renderConsumerList),format.raw/*279.32*/("""
        """),format.raw/*280.9*/("""</div>
    </div>
</div>
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Partition Information</h4></div>
            <table class="table">
                <thead>
                <tr>
                    <th>Partition</th>
                    <th>Latest Offset</th>
                    <th>Leader</th>
                    <th>Replicas</th>
                    <th>In Sync Replicas</th>
                    <th>Preferred Leader?</th>
                    <th>Under Replicated?</th>
                    """),_display_(/*297.22*/if(topicIdentity.clusterContext.config.jmxEnabled && topicIdentity.clusterContext.config.displaySizeEnabled)/*297.130*/{_display_(Seq[Any](format.raw/*297.131*/("""
                    """),format.raw/*298.21*/("""<th>Leader Size</th>
                    """)))}),format.raw/*299.22*/("""
                """),format.raw/*300.17*/("""</tr>
                </thead>
                <tbody>
                """),_display_(/*303.18*/for((_,tpi) <- topicIdentity.partitionsIdentity.toIndexedSeq.sortBy(_._2.partNum)) yield /*303.100*/ {_display_(Seq[Any](format.raw/*303.102*/("""
                """),format.raw/*304.17*/("""<tr>
                    <td>"""),_display_(/*305.26*/tpi/*305.29*/.partNum),format.raw/*305.37*/("""</td>
                    <td>"""),_display_(/*306.26*/tpi/*306.29*/.latestOffset.getOrElse(" ")),format.raw/*306.57*/("""</td>
                    <td class=""""),_display_(/*307.33*/getPartitionLeaderLevel(tpi.leader)),format.raw/*307.68*/("""">
                        <a href=""""),_display_(/*308.35*/routes/*308.41*/.Cluster.broker(cluster,tpi.leader)),format.raw/*308.76*/("""">"""),_display_(/*308.79*/tpi/*308.82*/.leader),format.raw/*308.89*/("""</a>
                    </td>
                    <td style="word-wrap: break-word">"""),_display_(/*310.56*/tpi/*310.59*/.replicas.mkString("(", ",", ")")),format.raw/*310.92*/("""</td>
                    <td style="word-wrap: break-word">"""),_display_(/*311.56*/tpi/*311.59*/.isr.mkString("(", ",", ")")),format.raw/*311.87*/("""</td>
                    <td class=""""),_display_(/*312.33*/getIsPreferredLeaderLevel(tpi.isPreferredLeader)),format.raw/*312.81*/("""">
                        """),_display_(/*313.26*/tpi/*313.29*/.isPreferredLeader),format.raw/*313.47*/("""
                    """),format.raw/*314.21*/("""</td>
                    <td class=""""),_display_(/*315.33*/getIsUnderReplicatedLevel(tpi.isUnderReplicated)),format.raw/*315.81*/("""">
                        """),_display_(/*316.26*/tpi/*316.29*/.isUnderReplicated),format.raw/*316.47*/("""
                    """),format.raw/*317.21*/("""</td>
                    """),_display_(/*318.22*/if(topicIdentity.clusterContext.config.jmxEnabled && topicIdentity.clusterContext.config.displaySizeEnabled)/*318.130*/{_display_(Seq[Any](format.raw/*318.131*/("""
                    """),format.raw/*319.21*/("""<td>"""),_display_(/*319.26*/tpi/*319.29*/.size),format.raw/*319.34*/("""</td>
                    """)))}),format.raw/*320.22*/("""
                """),format.raw/*321.17*/("""</tr>
                """)))}),format.raw/*322.18*/("""
                """),format.raw/*323.17*/("""</tbody>
            </table>
        </div>
    </div>
</div>
"""))
      }
    }
  }

  def render(cluster:String,topic:String,topicIdentity:kafka.manager.model.ActorModel.TopicIdentity,consumerList:Iterable[scala.Tuple2[String, ConsumerType]],reassignPartitionOperation:ReassignPartitionOperation,af:features.ApplicationFeatures,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,topicIdentity,consumerList,reassignPartitionOperation)(af,messages)

  def f:((String,String,kafka.manager.model.ActorModel.TopicIdentity,Iterable[scala.Tuple2[String, ConsumerType]],ReassignPartitionOperation) => (features.ApplicationFeatures,play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,topicIdentity,consumerList,reassignPartitionOperation) => (af,messages) => apply(cluster,topic,topicIdentity,consumerList,reassignPartitionOperation)(af,messages)

  def ref: this.type = this

}


}
}

/**/
object topicViewContent extends topicViewContent_Scope0.topicViewContent_Scope1.topicViewContent
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:37 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/topic/topicViewContent.scala.html
                  HASH: 240ae9979619cb511b1b1c09d8ae320334a12743
                  MATRIX: 951->300|1308->581|1340->604|1438->625|1470->631|1489->641|1504->647|1514->658|1542->677|1582->679|1607->695|1634->713|1674->715|1700->732|1718->741|1742->750|1767->755|1801->780|1899->801|1931->807|1950->817|1965->823|1975->834|2012->862|2052->864|2078->881|2108->902|2148->904|2173->920|2191->929|2215->938|2240->943|2270->964|2368->985|2400->991|2419->1001|2434->1007|2444->1018|2482->1047|2522->1049|2548->1066|2577->1086|2617->1088|2642->1104|2660->1113|2684->1122|2709->1127|2745->1154|2843->1175|2875->1181|2894->1191|2909->1197|2919->1208|2957->1237|2997->1239|3023->1256|3052->1276|3092->1278|3117->1294|3135->1303|3159->1312|3184->1317|3214->1338|3312->1359|3344->1365|3363->1375|3378->1381|3388->1392|3425->1420|3465->1422|3491->1439|3521->1460|3561->1462|3586->1478|3604->1487|3628->1496|3653->1501|3685->1524|3779->1541|3811->1547|3826->1553|3841->1559|3851->1570|3878->1588|3918->1590|3943->1606|3961->1615|3985->1624|4010->1629|4044->1654|4151->1684|4183->1690|4207->1705|4222->1711|4232->1722|4253->1734|4293->1736|4319->1753|4341->1766|4365->1775|4390->1780|4424->1805|4532->1836|4564->1842|4589->1858|4604->1864|4614->1875|4636->1888|4676->1890|4702->1907|4723->1919|4747->1928|4772->1933|4803->1955|4903->1978|4935->1984|4952->1992|4967->1998|4977->2009|4998->2021|5038->2023|5064->2040|5086->2053|5110->2062|5135->2067|5162->2085|5243->2089|5275->2095|5386->2196|5427->2198|5464->2208|5478->2213|5548->2262|5572->2269|5585->2274|5624->2275|5660->2284|5779->2376|5794->2382|5846->2413|5927->2464|5952->2469|5979->2487|6060->2491|6092->2497|6154->2550|6193->2551|6229->2560|6311->2615|6376->2664|6416->2666|6461->2683|6528->2722|6544->2728|6622->2784|6654->2787|6678->2788|6741->2823|6753->2825|6784->2834|6857->2875|6899->2888|6949->2920|6963->2925|7003->2926|7040->2935|7165->3032|7181->3038|7234->3069|7316->3120|7358->578|7387->752|7416->940|7445->1124|7474->1314|7503->1498|7532->1626|7561->1777|7590->1930|7619->2064|7648->2466|7678->3122|7709->3125|8037->3425|8060->3438|8100->3456|8230->3558|8253->3571|8286->3582|8508->3776|8531->3789|8572->3808|8727->3935|8750->3948|8783->3959|8942->4090|8965->4103|9000->4116|9251->4339|9342->4407|9398->4435|9421->4448|9471->4476|9521->4497|9759->4707|9839->4765|9895->4793|9918->4806|9962->4828|10012->4849|10267->5076|10360->5146|10416->5174|10439->5187|10489->5215|10539->5236|10778->5447|10860->5507|10916->5535|10939->5548|10985->5572|11035->5593|11263->5793|11349->5857|11405->5885|11428->5898|11476->5924|11526->5945|11599->5990|11718->6098|11759->6099|11805->6116|11904->6187|11927->6200|11954->6205|12031->6250|12077->6267|12148->6310|12191->6343|12232->6345|12274->6358|12460->6516|12512->6551|12553->6553|12599->6570|12657->6600|12680->6601|12739->6632|12762->6633|12839->6678|12885->6695|12960->6738|12997->6747|13149->6871|13189->6889|13226->6898|13308->6952|13326->6960|13372->6996|13413->6998|13450->7007|13677->7206|13790->7308|13832->7310|13882->7331|13949->7370|13965->7376|14027->7416|14159->7516|14209->7538|14227->7546|14279->7588|14320->7590|14370->7611|14428->7641|14440->7643|14513->7706|14554->7708|14612->7738|14648->7764|14664->7770|14676->7805|14712->7831|14753->7833|14819->7870|15035->8058|15062->8063|15134->8107|15146->8109|15202->8155|15242->8156|15272->8157|15332->8184|15398->8221|15463->8299|15482->8308|15523->8310|15589->8347|15803->8533|15830->8538|15902->8582|15914->8584|15970->8630|16010->8631|16040->8632|16094->8653|16160->8690|16238->8765|16296->8791|16346->8812|16439->8877|16455->8883|16529->8935|16697->9071|16743->9088|16857->9174|16873->9180|16930->9215|17116->9373|17132->9379|17188->9413|17335->9532|17353->9540|17405->9582|17446->9584|17496->9605|17563->9644|17579->9650|17654->9703|17820->9837|17866->9854|17974->9930|18011->9939|18597->10497|18658->10541|18699->10543|18745->10560|18812->10599|18828->10605|18881->10636|18912->10639|18925->10642|18950->10645|19013->10680|19026->10683|19064->10699|19123->10730|19136->10733|19171->10746|19260->10807|19273->10810|19328->10843|19394->10881|19452->10917|19508->10945|19521->10948|19552->10957|19602->10978|19668->11016|19732->11058|19788->11086|19801->11089|19838->11104|19888->11125|19965->11170|20011->11187|20229->11377|20269->11395|20306->11404|20919->11989|21038->12097|21079->12098|21129->12119|21203->12161|21249->12178|21349->12250|21449->12332|21491->12334|21537->12351|21595->12381|21608->12384|21638->12392|21697->12423|21710->12426|21760->12454|21826->12492|21883->12527|21948->12564|21964->12570|22021->12605|22052->12608|22065->12611|22094->12618|22208->12704|22221->12707|22276->12740|22365->12801|22378->12804|22428->12832|22494->12870|22564->12918|22620->12946|22633->12949|22673->12967|22723->12988|22789->13026|22859->13074|22915->13102|22928->13105|22968->13123|23018->13144|23073->13171|23192->13279|23233->13280|23283->13301|23316->13306|23329->13309|23356->13314|23415->13341|23461->13358|23516->13381|23562->13398
                  LINES: 26->9|35->16|35->16|37->16|38->17|38->17|38->17|38->18|38->18|38->18|38->19|38->19|38->19|38->20|38->20|38->21|39->24|39->24|41->24|42->25|42->25|42->25|42->26|42->26|42->26|42->27|42->27|42->27|42->28|42->28|42->29|43->32|43->32|45->32|46->33|46->33|46->33|46->34|46->34|46->34|46->35|46->35|46->35|46->36|46->36|46->37|47->40|47->40|49->40|50->41|50->41|50->41|50->42|50->42|50->42|50->43|50->43|50->43|50->44|50->44|50->45|51->48|51->48|53->48|54->49|54->49|54->49|54->50|54->50|54->50|54->51|54->51|54->51|54->52|54->52|54->53|55->56|55->56|57->56|58->57|58->57|58->57|58->58|58->58|58->58|58->59|58->59|58->60|59->63|59->63|61->63|62->64|62->64|62->64|62->65|62->65|62->65|62->66|62->66|62->67|63->70|63->70|65->70|66->71|66->71|66->71|66->72|66->72|66->72|66->73|66->73|66->74|67->77|67->77|69->77|70->78|70->78|70->78|70->79|70->79|70->79|70->80|70->80|70->81|71->84|71->84|73->84|74->85|74->85|74->85|75->86|75->86|75->86|76->87|76->87|76->87|77->88|78->89|78->89|78->89|80->91|81->94|81->94|83->94|84->95|84->95|84->95|85->96|87->98|87->98|87->98|88->99|89->100|89->100|89->100|89->100|89->100|90->101|90->101|90->101|92->103|93->104|95->106|95->106|95->106|96->107|97->108|97->108|97->108|99->110|101->14|103->22|105->30|107->38|109->46|111->54|113->61|115->68|117->75|119->82|121->92|123->111|126->114|134->122|134->122|134->122|137->125|137->125|137->125|141->129|141->129|141->129|145->133|145->133|145->133|149->137|149->137|149->137|153->141|153->141|154->142|154->142|154->142|155->143|159->147|159->147|160->148|160->148|160->148|161->149|165->153|165->153|166->154|166->154|166->154|167->155|171->159|171->159|172->160|172->160|172->160|173->161|177->165|177->165|178->166|178->166|178->166|179->167|181->169|181->169|181->169|182->170|184->172|184->172|184->172|186->174|187->175|189->177|189->177|189->177|190->178|195->183|195->183|195->183|196->184|197->185|197->185|198->186|198->186|200->188|201->189|203->191|204->192|207->195|207->195|208->196|211->199|211->199|211->199|211->199|212->200|217->205|217->205|217->205|218->206|219->207|219->207|219->207|221->209|222->210|222->210|222->210|222->210|223->211|224->212|224->212|224->212|224->212|225->213|225->213|225->213|225->214|225->214|225->214|226->215|228->217|228->217|229->218|229->218|229->218|229->218|229->218|229->218|230->219|231->221|231->221|231->221|232->222|234->224|234->224|235->225|235->225|235->225|235->225|235->225|235->225|236->226|237->228|238->229|239->230|241->232|241->232|241->232|243->234|244->235|247->238|247->238|247->238|250->241|250->241|250->241|252->243|252->243|252->243|252->243|253->244|254->245|254->245|254->245|256->247|257->248|261->252|262->253|269->260|269->260|269->260|270->261|271->262|271->262|271->262|271->262|271->262|271->262|272->263|272->263|272->263|273->264|273->264|273->264|274->265|274->265|274->265|275->266|275->266|276->267|276->267|276->267|277->268|278->269|278->269|279->270|279->270|279->270|280->271|282->273|283->274|288->279|288->279|289->280|306->297|306->297|306->297|307->298|308->299|309->300|312->303|312->303|312->303|313->304|314->305|314->305|314->305|315->306|315->306|315->306|316->307|316->307|317->308|317->308|317->308|317->308|317->308|317->308|319->310|319->310|319->310|320->311|320->311|320->311|321->312|321->312|322->313|322->313|322->313|323->314|324->315|324->315|325->316|325->316|325->316|326->317|327->318|327->318|327->318|328->319|328->319|328->319|328->319|329->320|330->321|331->322|332->323
                  -- GENERATED --
              */
          