
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmpsoares/Downloads/kafka-manager-1.3.3.13/conf/routes
// @DATE:Tue Aug 22 17:45:36 WEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  Application_7: controllers.Application,
  // @LINE:10
  Cluster_1: controllers.Cluster,
  // @LINE:11
  Topic_0: controllers.Topic,
  // @LINE:15
  Logkafka_2: controllers.Logkafka,
  // @LINE:19
  Consumer_3: controllers.Consumer,
  // @LINE:22
  PreferredReplicaElection_10: controllers.PreferredReplicaElection,
  // @LINE:24
  ReassignPartitions_4: controllers.ReassignPartitions,
  // @LINE:55
  KafkaStateCheck_9: controllers.api.KafkaStateCheck,
  // @LINE:67
  Assets_5: controllers.Assets,
  // @LINE:73
  WebJarAssets_6: controllers.WebJarAssets,
  // @LINE:76
  ApiHealth_8: controllers.ApiHealth,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    Application_7: controllers.Application,
    // @LINE:10
    Cluster_1: controllers.Cluster,
    // @LINE:11
    Topic_0: controllers.Topic,
    // @LINE:15
    Logkafka_2: controllers.Logkafka,
    // @LINE:19
    Consumer_3: controllers.Consumer,
    // @LINE:22
    PreferredReplicaElection_10: controllers.PreferredReplicaElection,
    // @LINE:24
    ReassignPartitions_4: controllers.ReassignPartitions,
    // @LINE:55
    KafkaStateCheck_9: controllers.api.KafkaStateCheck,
    // @LINE:67
    Assets_5: controllers.Assets,
    // @LINE:73
    WebJarAssets_6: controllers.WebJarAssets,
    // @LINE:76
    ApiHealth_8: controllers.ApiHealth
  ) = this(errorHandler, Application_7, Cluster_1, Topic_0, Logkafka_2, Consumer_3, PreferredReplicaElection_10, ReassignPartitions_4, KafkaStateCheck_9, Assets_5, WebJarAssets_6, ApiHealth_8, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_7, Cluster_1, Topic_0, Logkafka_2, Consumer_3, PreferredReplicaElection_10, ReassignPartitions_4, KafkaStateCheck_9, Assets_5, WebJarAssets_6, ApiHealth_8, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>""", """controllers.Cluster.cluster(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics""", """controllers.Topic.topics(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/addPartitions""", """controllers.Topic.addPartitionsToMultipleTopics(c:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/addPartitions""", """controllers.Topic.handleAddPartitionsToMultipleTopics(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/$t<[^/]+>""", """controllers.Topic.topic(c:String, t:String, force:Boolean ?= false)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/logkafkas""", """controllers.Logkafka.logkafkas(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/logkafkas/$h<[^/]+>/$l<[^/]+>""", """controllers.Logkafka.logkafka(c:String, h:String, l:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/brokers""", """controllers.Cluster.brokers(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/brokers/$b<[^/]+>""", """controllers.Cluster.broker(c:String, b:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/consumers""", """controllers.Consumer.consumers(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/consumers/$g<[^/]+>/type/$ct<[^/]+>""", """controllers.Consumer.consumer(c:String, g:String, ct:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/consumers/$g<[^/]+>/topic/$t<[^/]+>/type/$ct<[^/]+>""", """controllers.Consumer.consumerAndTopic(c:String, g:String, t:String, ct:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/leader""", """controllers.PreferredReplicaElection.preferredReplicaElection(c:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/leader""", """controllers.PreferredReplicaElection.handleRunElection(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/assignment""", """controllers.ReassignPartitions.reassignPartitions(c:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/assignment""", """controllers.ReassignPartitions.handleOperation(c:String, t:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/assignment/confirm""", """controllers.ReassignPartitions.confirmAssignment(c:String, t:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/assignment/generate""", """controllers.ReassignPartitions.handleGenerateAssignment(c:String, t:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/assignments/confirm""", """controllers.ReassignPartitions.confirmMultipleAssignments(c:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/assignments/generate""", """controllers.ReassignPartitions.handleGenerateMultipleAssignments(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/assignments/run""", """controllers.ReassignPartitions.runMultipleAssignments(c:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/assignments/run""", """controllers.ReassignPartitions.handleRunMultipleAssignments(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCluster""", """controllers.Cluster.addCluster"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateCluster""", """controllers.Cluster.updateCluster(c:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters""", """controllers.Cluster.handleAddCluster"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>""", """controllers.Cluster.handleUpdateCluster(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/createTopic""", """controllers.Topic.createTopic(c:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/create""", """controllers.Topic.handleCreateTopic(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/$t<[^/]+>/confirm_delete""", """controllers.Topic.confirmDeleteTopic(c:String, t:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/delete""", """controllers.Topic.handleDeleteTopic(c:String, t:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/$t<[^/]+>/addPartitions""", """controllers.Topic.addPartitions(c:String, t:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/$t<[^/]+>/addPartitions""", """controllers.Topic.handleAddPartitions(c:String, t:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/$t<[^/]+>/updateConfig""", """controllers.Topic.updateConfig(c:String, t:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/$t<[^/]+>/updateConfig""", """controllers.Topic.handleUpdateConfig(c:String, t:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/$t<[^/]+>/assignments/manual""", """controllers.ReassignPartitions.manualAssignments(c:String, t:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/topics/$t<[^/]+>/assignments/manual""", """controllers.ReassignPartitions.handleManualAssignment(c:String, t:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/createLogkafka""", """controllers.Logkafka.createLogkafka(c:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/logkafkas/create""", """controllers.Logkafka.handleCreateLogkafka(c:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/logkafkas/delete""", """controllers.Logkafka.handleDeleteLogkafka(c:String, h:String, l:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/logkafkas/$h<[^/]+>/$l<[^/]+>/updateConfig""", """controllers.Logkafka.updateConfig(c:String, h:String, l:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/logkafkas/$h<[^/]+>/$l<[^/]+>/updateConfig""", """controllers.Logkafka.handleUpdateConfig(c:String, h:String, l:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/logkafkas/$h<[^/]+>/$l<[^/]+>/disableConfig""", """controllers.Logkafka.handleDisableConfig(c:String, h:String, l:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clusters/$c<[^/]+>/logkafkas/$h<[^/]+>/$l<[^/]+>/enableConfig""", """controllers.Logkafka.handleEnableConfig(c:String, h:String, l:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status/$c<[^/]+>/brokers""", """controllers.api.KafkaStateCheck.brokers(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status/$c<[^/]+>/brokers/extended""", """controllers.api.KafkaStateCheck.brokersExtended(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status/$c<[^/]+>/topics""", """controllers.api.KafkaStateCheck.topics(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status/$c<[^/]+>/topicIdentities""", """controllers.api.KafkaStateCheck.topicIdentities(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status/clusters""", """controllers.api.KafkaStateCheck.clusters"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status/$c<[^/]+>/$t<[^/]+>/underReplicatedPartitions""", """controllers.api.KafkaStateCheck.underReplicatedPartitions(c:String, t:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status/$c<[^/]+>/$t<[^/]+>/unavailablePartitions""", """controllers.api.KafkaStateCheck.unavailablePartitions(c:String, t:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status/$cluster<[^/]+>/$consumer<[^/]+>/$topic<[^/]+>/$consumerType<[^/]+>/topicSummary""", """controllers.api.KafkaStateCheck.topicSummaryAction(cluster:String, consumer:String, topic:String, consumerType:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status/$cluster<[^/]+>/$consumer<[^/]+>/$consumerType<[^/]+>/groupSummary""", """controllers.api.KafkaStateCheck.groupSummaryAction(cluster:String, consumer:String, consumerType:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status/$cluster<[^/]+>/consumersSummary""", """controllers.api.KafkaStateCheck.consumersSummaryAction(cluster:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vassets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/health""", """controllers.ApiHealth.ping"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_7.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Cluster_cluster1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Cluster_cluster1_invoker = createInvoker(
    Cluster_1.cluster(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Cluster",
      "cluster",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Topic_topics2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics")))
  )
  private[this] lazy val controllers_Topic_topics2_invoker = createInvoker(
    Topic_0.topics(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "topics",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Topic_addPartitionsToMultipleTopics3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/addPartitions")))
  )
  private[this] lazy val controllers_Topic_addPartitionsToMultipleTopics3_invoker = createInvoker(
    Topic_0.addPartitionsToMultipleTopics(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "addPartitionsToMultipleTopics",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/addPartitions"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Topic_handleAddPartitionsToMultipleTopics4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/addPartitions")))
  )
  private[this] lazy val controllers_Topic_handleAddPartitionsToMultipleTopics4_invoker = createInvoker(
    Topic_0.handleAddPartitionsToMultipleTopics(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "handleAddPartitionsToMultipleTopics",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/addPartitions"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Topic_topic5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/"), DynamicPart("t", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Topic_topic5_invoker = createInvoker(
    Topic_0.topic(fakeValue[String], fakeValue[String], fakeValue[Boolean]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "topic",
      Seq(classOf[String], classOf[String], classOf[Boolean]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/$t<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Logkafka_logkafkas6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/logkafkas")))
  )
  private[this] lazy val controllers_Logkafka_logkafkas6_invoker = createInvoker(
    Logkafka_2.logkafkas(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Logkafka",
      "logkafkas",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/logkafkas"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Logkafka_logkafka7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/logkafkas/"), DynamicPart("h", """[^/]+""",true), StaticPart("/"), DynamicPart("l", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Logkafka_logkafka7_invoker = createInvoker(
    Logkafka_2.logkafka(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Logkafka",
      "logkafka",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/logkafkas/$h<[^/]+>/$l<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Cluster_brokers8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/brokers")))
  )
  private[this] lazy val controllers_Cluster_brokers8_invoker = createInvoker(
    Cluster_1.brokers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Cluster",
      "brokers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/brokers"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Cluster_broker9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/brokers/"), DynamicPart("b", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Cluster_broker9_invoker = createInvoker(
    Cluster_1.broker(fakeValue[String], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Cluster",
      "broker",
      Seq(classOf[String], classOf[Int]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/brokers/$b<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Consumer_consumers10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/consumers")))
  )
  private[this] lazy val controllers_Consumer_consumers10_invoker = createInvoker(
    Consumer_3.consumers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Consumer",
      "consumers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/consumers"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Consumer_consumer11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/consumers/"), DynamicPart("g", """[^/]+""",true), StaticPart("/type/"), DynamicPart("ct", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Consumer_consumer11_invoker = createInvoker(
    Consumer_3.consumer(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Consumer",
      "consumer",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/consumers/$g<[^/]+>/type/$ct<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Consumer_consumerAndTopic12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/consumers/"), DynamicPart("g", """[^/]+""",true), StaticPart("/topic/"), DynamicPart("t", """[^/]+""",true), StaticPart("/type/"), DynamicPart("ct", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Consumer_consumerAndTopic12_invoker = createInvoker(
    Consumer_3.consumerAndTopic(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Consumer",
      "consumerAndTopic",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/consumers/$g<[^/]+>/topic/$t<[^/]+>/type/$ct<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PreferredReplicaElection_preferredReplicaElection13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/leader")))
  )
  private[this] lazy val controllers_PreferredReplicaElection_preferredReplicaElection13_invoker = createInvoker(
    PreferredReplicaElection_10.preferredReplicaElection(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PreferredReplicaElection",
      "preferredReplicaElection",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/leader"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_PreferredReplicaElection_handleRunElection14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/leader")))
  )
  private[this] lazy val controllers_PreferredReplicaElection_handleRunElection14_invoker = createInvoker(
    PreferredReplicaElection_10.handleRunElection(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PreferredReplicaElection",
      "handleRunElection",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/leader"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ReassignPartitions_reassignPartitions15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/assignment")))
  )
  private[this] lazy val controllers_ReassignPartitions_reassignPartitions15_invoker = createInvoker(
    ReassignPartitions_4.reassignPartitions(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReassignPartitions",
      "reassignPartitions",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/assignment"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ReassignPartitions_handleOperation16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/assignment")))
  )
  private[this] lazy val controllers_ReassignPartitions_handleOperation16_invoker = createInvoker(
    ReassignPartitions_4.handleOperation(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReassignPartitions",
      "handleOperation",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/assignment"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ReassignPartitions_confirmAssignment17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/assignment/confirm")))
  )
  private[this] lazy val controllers_ReassignPartitions_confirmAssignment17_invoker = createInvoker(
    ReassignPartitions_4.confirmAssignment(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReassignPartitions",
      "confirmAssignment",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/assignment/confirm"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ReassignPartitions_handleGenerateAssignment18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/assignment/generate")))
  )
  private[this] lazy val controllers_ReassignPartitions_handleGenerateAssignment18_invoker = createInvoker(
    ReassignPartitions_4.handleGenerateAssignment(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReassignPartitions",
      "handleGenerateAssignment",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/assignment/generate"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ReassignPartitions_confirmMultipleAssignments19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/assignments/confirm")))
  )
  private[this] lazy val controllers_ReassignPartitions_confirmMultipleAssignments19_invoker = createInvoker(
    ReassignPartitions_4.confirmMultipleAssignments(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReassignPartitions",
      "confirmMultipleAssignments",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/assignments/confirm"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ReassignPartitions_handleGenerateMultipleAssignments20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/assignments/generate")))
  )
  private[this] lazy val controllers_ReassignPartitions_handleGenerateMultipleAssignments20_invoker = createInvoker(
    ReassignPartitions_4.handleGenerateMultipleAssignments(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReassignPartitions",
      "handleGenerateMultipleAssignments",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/assignments/generate"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ReassignPartitions_runMultipleAssignments21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/assignments/run")))
  )
  private[this] lazy val controllers_ReassignPartitions_runMultipleAssignments21_invoker = createInvoker(
    ReassignPartitions_4.runMultipleAssignments(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReassignPartitions",
      "runMultipleAssignments",
      Seq(classOf[String]),
      "GET",
      """GET   /clusters/:c/assignments/manual                      controllers.ReassignPartitions.manualMultipleAssignments(c:String)
POST  /clusters/:c/assignments/manual                      controllers.ReassignPartitions.handleManualAssignment(c:String)""",
      this.prefix + """clusters/$c<[^/]+>/assignments/run"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ReassignPartitions_handleRunMultipleAssignments22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/assignments/run")))
  )
  private[this] lazy val controllers_ReassignPartitions_handleRunMultipleAssignments22_invoker = createInvoker(
    ReassignPartitions_4.handleRunMultipleAssignments(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReassignPartitions",
      "handleRunMultipleAssignments",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/assignments/run"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Cluster_addCluster23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCluster")))
  )
  private[this] lazy val controllers_Cluster_addCluster23_invoker = createInvoker(
    Cluster_1.addCluster,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Cluster",
      "addCluster",
      Nil,
      "GET",
      """""",
      this.prefix + """addCluster"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Cluster_updateCluster24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateCluster")))
  )
  private[this] lazy val controllers_Cluster_updateCluster24_invoker = createInvoker(
    Cluster_1.updateCluster(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Cluster",
      "updateCluster",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """updateCluster"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Cluster_handleAddCluster25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters")))
  )
  private[this] lazy val controllers_Cluster_handleAddCluster25_invoker = createInvoker(
    Cluster_1.handleAddCluster,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Cluster",
      "handleAddCluster",
      Nil,
      "POST",
      """""",
      this.prefix + """clusters"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Cluster_handleUpdateCluster26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Cluster_handleUpdateCluster26_invoker = createInvoker(
    Cluster_1.handleUpdateCluster(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Cluster",
      "handleUpdateCluster",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Topic_createTopic27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/createTopic")))
  )
  private[this] lazy val controllers_Topic_createTopic27_invoker = createInvoker(
    Topic_0.createTopic(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "createTopic",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/createTopic"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Topic_handleCreateTopic28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/create")))
  )
  private[this] lazy val controllers_Topic_handleCreateTopic28_invoker = createInvoker(
    Topic_0.handleCreateTopic(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "handleCreateTopic",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/create"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Topic_confirmDeleteTopic29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/"), DynamicPart("t", """[^/]+""",true), StaticPart("/confirm_delete")))
  )
  private[this] lazy val controllers_Topic_confirmDeleteTopic29_invoker = createInvoker(
    Topic_0.confirmDeleteTopic(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "confirmDeleteTopic",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/$t<[^/]+>/confirm_delete"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Topic_handleDeleteTopic30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/delete")))
  )
  private[this] lazy val controllers_Topic_handleDeleteTopic30_invoker = createInvoker(
    Topic_0.handleDeleteTopic(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "handleDeleteTopic",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/delete"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Topic_addPartitions31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/"), DynamicPart("t", """[^/]+""",true), StaticPart("/addPartitions")))
  )
  private[this] lazy val controllers_Topic_addPartitions31_invoker = createInvoker(
    Topic_0.addPartitions(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "addPartitions",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/$t<[^/]+>/addPartitions"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Topic_handleAddPartitions32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/"), DynamicPart("t", """[^/]+""",true), StaticPart("/addPartitions")))
  )
  private[this] lazy val controllers_Topic_handleAddPartitions32_invoker = createInvoker(
    Topic_0.handleAddPartitions(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "handleAddPartitions",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/$t<[^/]+>/addPartitions"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Topic_updateConfig33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/"), DynamicPart("t", """[^/]+""",true), StaticPart("/updateConfig")))
  )
  private[this] lazy val controllers_Topic_updateConfig33_invoker = createInvoker(
    Topic_0.updateConfig(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "updateConfig",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/$t<[^/]+>/updateConfig"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Topic_handleUpdateConfig34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/"), DynamicPart("t", """[^/]+""",true), StaticPart("/updateConfig")))
  )
  private[this] lazy val controllers_Topic_handleUpdateConfig34_invoker = createInvoker(
    Topic_0.handleUpdateConfig(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Topic",
      "handleUpdateConfig",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/$t<[^/]+>/updateConfig"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ReassignPartitions_manualAssignments35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/"), DynamicPart("t", """[^/]+""",true), StaticPart("/assignments/manual")))
  )
  private[this] lazy val controllers_ReassignPartitions_manualAssignments35_invoker = createInvoker(
    ReassignPartitions_4.manualAssignments(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReassignPartitions",
      "manualAssignments",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/$t<[^/]+>/assignments/manual"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ReassignPartitions_handleManualAssignment36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics/"), DynamicPart("t", """[^/]+""",true), StaticPart("/assignments/manual")))
  )
  private[this] lazy val controllers_ReassignPartitions_handleManualAssignment36_invoker = createInvoker(
    ReassignPartitions_4.handleManualAssignment(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReassignPartitions",
      "handleManualAssignment",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/topics/$t<[^/]+>/assignments/manual"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Logkafka_createLogkafka37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/createLogkafka")))
  )
  private[this] lazy val controllers_Logkafka_createLogkafka37_invoker = createInvoker(
    Logkafka_2.createLogkafka(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Logkafka",
      "createLogkafka",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/createLogkafka"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Logkafka_handleCreateLogkafka38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/logkafkas/create")))
  )
  private[this] lazy val controllers_Logkafka_handleCreateLogkafka38_invoker = createInvoker(
    Logkafka_2.handleCreateLogkafka(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Logkafka",
      "handleCreateLogkafka",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/logkafkas/create"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Logkafka_handleDeleteLogkafka39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/logkafkas/delete")))
  )
  private[this] lazy val controllers_Logkafka_handleDeleteLogkafka39_invoker = createInvoker(
    Logkafka_2.handleDeleteLogkafka(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Logkafka",
      "handleDeleteLogkafka",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/logkafkas/delete"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Logkafka_updateConfig40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/logkafkas/"), DynamicPart("h", """[^/]+""",true), StaticPart("/"), DynamicPart("l", """[^/]+""",true), StaticPart("/updateConfig")))
  )
  private[this] lazy val controllers_Logkafka_updateConfig40_invoker = createInvoker(
    Logkafka_2.updateConfig(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Logkafka",
      "updateConfig",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """clusters/$c<[^/]+>/logkafkas/$h<[^/]+>/$l<[^/]+>/updateConfig"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Logkafka_handleUpdateConfig41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/logkafkas/"), DynamicPart("h", """[^/]+""",true), StaticPart("/"), DynamicPart("l", """[^/]+""",true), StaticPart("/updateConfig")))
  )
  private[this] lazy val controllers_Logkafka_handleUpdateConfig41_invoker = createInvoker(
    Logkafka_2.handleUpdateConfig(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Logkafka",
      "handleUpdateConfig",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/logkafkas/$h<[^/]+>/$l<[^/]+>/updateConfig"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Logkafka_handleDisableConfig42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/logkafkas/"), DynamicPart("h", """[^/]+""",true), StaticPart("/"), DynamicPart("l", """[^/]+""",true), StaticPart("/disableConfig")))
  )
  private[this] lazy val controllers_Logkafka_handleDisableConfig42_invoker = createInvoker(
    Logkafka_2.handleDisableConfig(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Logkafka",
      "handleDisableConfig",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/logkafkas/$h<[^/]+>/$l<[^/]+>/disableConfig"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Logkafka_handleEnableConfig43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clusters/"), DynamicPart("c", """[^/]+""",true), StaticPart("/logkafkas/"), DynamicPart("h", """[^/]+""",true), StaticPart("/"), DynamicPart("l", """[^/]+""",true), StaticPart("/enableConfig")))
  )
  private[this] lazy val controllers_Logkafka_handleEnableConfig43_invoker = createInvoker(
    Logkafka_2.handleEnableConfig(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Logkafka",
      "handleEnableConfig",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """clusters/$c<[^/]+>/logkafkas/$h<[^/]+>/$l<[^/]+>/enableConfig"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_api_KafkaStateCheck_brokers44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status/"), DynamicPart("c", """[^/]+""",true), StaticPart("/brokers")))
  )
  private[this] lazy val controllers_api_KafkaStateCheck_brokers44_invoker = createInvoker(
    KafkaStateCheck_9.brokers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.KafkaStateCheck",
      "brokers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/status/$c<[^/]+>/brokers"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_api_KafkaStateCheck_brokersExtended45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status/"), DynamicPart("c", """[^/]+""",true), StaticPart("/brokers/extended")))
  )
  private[this] lazy val controllers_api_KafkaStateCheck_brokersExtended45_invoker = createInvoker(
    KafkaStateCheck_9.brokersExtended(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.KafkaStateCheck",
      "brokersExtended",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/status/$c<[^/]+>/brokers/extended"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_api_KafkaStateCheck_topics46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topics")))
  )
  private[this] lazy val controllers_api_KafkaStateCheck_topics46_invoker = createInvoker(
    KafkaStateCheck_9.topics(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.KafkaStateCheck",
      "topics",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/status/$c<[^/]+>/topics"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_api_KafkaStateCheck_topicIdentities47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status/"), DynamicPart("c", """[^/]+""",true), StaticPart("/topicIdentities")))
  )
  private[this] lazy val controllers_api_KafkaStateCheck_topicIdentities47_invoker = createInvoker(
    KafkaStateCheck_9.topicIdentities(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.KafkaStateCheck",
      "topicIdentities",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/status/$c<[^/]+>/topicIdentities"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_api_KafkaStateCheck_clusters48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status/clusters")))
  )
  private[this] lazy val controllers_api_KafkaStateCheck_clusters48_invoker = createInvoker(
    KafkaStateCheck_9.clusters,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.KafkaStateCheck",
      "clusters",
      Nil,
      "GET",
      """""",
      this.prefix + """api/status/clusters"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_api_KafkaStateCheck_underReplicatedPartitions49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status/"), DynamicPart("c", """[^/]+""",true), StaticPart("/"), DynamicPart("t", """[^/]+""",true), StaticPart("/underReplicatedPartitions")))
  )
  private[this] lazy val controllers_api_KafkaStateCheck_underReplicatedPartitions49_invoker = createInvoker(
    KafkaStateCheck_9.underReplicatedPartitions(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.KafkaStateCheck",
      "underReplicatedPartitions",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/status/$c<[^/]+>/$t<[^/]+>/underReplicatedPartitions"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_api_KafkaStateCheck_unavailablePartitions50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status/"), DynamicPart("c", """[^/]+""",true), StaticPart("/"), DynamicPart("t", """[^/]+""",true), StaticPart("/unavailablePartitions")))
  )
  private[this] lazy val controllers_api_KafkaStateCheck_unavailablePartitions50_invoker = createInvoker(
    KafkaStateCheck_9.unavailablePartitions(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.KafkaStateCheck",
      "unavailablePartitions",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/status/$c<[^/]+>/$t<[^/]+>/unavailablePartitions"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_api_KafkaStateCheck_topicSummaryAction51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status/"), DynamicPart("cluster", """[^/]+""",true), StaticPart("/"), DynamicPart("consumer", """[^/]+""",true), StaticPart("/"), DynamicPart("topic", """[^/]+""",true), StaticPart("/"), DynamicPart("consumerType", """[^/]+""",true), StaticPart("/topicSummary")))
  )
  private[this] lazy val controllers_api_KafkaStateCheck_topicSummaryAction51_invoker = createInvoker(
    KafkaStateCheck_9.topicSummaryAction(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.KafkaStateCheck",
      "topicSummaryAction",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/status/$cluster<[^/]+>/$consumer<[^/]+>/$topic<[^/]+>/$consumerType<[^/]+>/topicSummary"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_api_KafkaStateCheck_groupSummaryAction52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status/"), DynamicPart("cluster", """[^/]+""",true), StaticPart("/"), DynamicPart("consumer", """[^/]+""",true), StaticPart("/"), DynamicPart("consumerType", """[^/]+""",true), StaticPart("/groupSummary")))
  )
  private[this] lazy val controllers_api_KafkaStateCheck_groupSummaryAction52_invoker = createInvoker(
    KafkaStateCheck_9.groupSummaryAction(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.KafkaStateCheck",
      "groupSummaryAction",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/status/$cluster<[^/]+>/$consumer<[^/]+>/$consumerType<[^/]+>/groupSummary"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_api_KafkaStateCheck_consumersSummaryAction53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status/"), DynamicPart("cluster", """[^/]+""",true), StaticPart("/consumersSummary")))
  )
  private[this] lazy val controllers_api_KafkaStateCheck_consumersSummaryAction53_invoker = createInvoker(
    KafkaStateCheck_9.consumersSummaryAction(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.KafkaStateCheck",
      "consumersSummaryAction",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/status/$cluster<[^/]+>/consumersSummary"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_Assets_versioned54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vassets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned54_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Versioned Assets""",
      this.prefix + """vassets/$file<.+>"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_Assets_at55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at55_invoker = createInvoker(
    Assets_5.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Unversioned Assets""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_WebJarAssets_at56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at56_invoker = createInvoker(
    WebJarAssets_6.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """ WebJars""",
      this.prefix + """webjars/$file<.+>"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_ApiHealth_ping57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/health")))
  )
  private[this] lazy val controllers_ApiHealth_ping57_invoker = createInvoker(
    ApiHealth_8.ping,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHealth",
      "ping",
      Nil,
      "GET",
      """ Ping / Health Check""",
      this.prefix + """api/health"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_7.index)
      }
  
    // @LINE:10
    case controllers_Cluster_cluster1_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Cluster_cluster1_invoker.call(Cluster_1.cluster(c))
      }
  
    // @LINE:11
    case controllers_Topic_topics2_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Topic_topics2_invoker.call(Topic_0.topics(c))
      }
  
    // @LINE:12
    case controllers_Topic_addPartitionsToMultipleTopics3_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Topic_addPartitionsToMultipleTopics3_invoker.call(Topic_0.addPartitionsToMultipleTopics(c))
      }
  
    // @LINE:13
    case controllers_Topic_handleAddPartitionsToMultipleTopics4_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Topic_handleAddPartitionsToMultipleTopics4_invoker.call(Topic_0.handleAddPartitionsToMultipleTopics(c))
      }
  
    // @LINE:14
    case controllers_Topic_topic5_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("t", None), params.fromQuery[Boolean]("force", Some(false))) { (c, t, force) =>
        controllers_Topic_topic5_invoker.call(Topic_0.topic(c, t, force))
      }
  
    // @LINE:15
    case controllers_Logkafka_logkafkas6_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Logkafka_logkafkas6_invoker.call(Logkafka_2.logkafkas(c))
      }
  
    // @LINE:16
    case controllers_Logkafka_logkafka7_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("h", None), params.fromPath[String]("l", None)) { (c, h, l) =>
        controllers_Logkafka_logkafka7_invoker.call(Logkafka_2.logkafka(c, h, l))
      }
  
    // @LINE:17
    case controllers_Cluster_brokers8_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Cluster_brokers8_invoker.call(Cluster_1.brokers(c))
      }
  
    // @LINE:18
    case controllers_Cluster_broker9_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[Int]("b", None)) { (c, b) =>
        controllers_Cluster_broker9_invoker.call(Cluster_1.broker(c, b))
      }
  
    // @LINE:19
    case controllers_Consumer_consumers10_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Consumer_consumers10_invoker.call(Consumer_3.consumers(c))
      }
  
    // @LINE:20
    case controllers_Consumer_consumer11_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("g", None), params.fromPath[String]("ct", None)) { (c, g, ct) =>
        controllers_Consumer_consumer11_invoker.call(Consumer_3.consumer(c, g, ct))
      }
  
    // @LINE:21
    case controllers_Consumer_consumerAndTopic12_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("g", None), params.fromPath[String]("t", None), params.fromPath[String]("ct", None)) { (c, g, t, ct) =>
        controllers_Consumer_consumerAndTopic12_invoker.call(Consumer_3.consumerAndTopic(c, g, t, ct))
      }
  
    // @LINE:22
    case controllers_PreferredReplicaElection_preferredReplicaElection13_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_PreferredReplicaElection_preferredReplicaElection13_invoker.call(PreferredReplicaElection_10.preferredReplicaElection(c))
      }
  
    // @LINE:23
    case controllers_PreferredReplicaElection_handleRunElection14_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_PreferredReplicaElection_handleRunElection14_invoker.call(PreferredReplicaElection_10.handleRunElection(c))
      }
  
    // @LINE:24
    case controllers_ReassignPartitions_reassignPartitions15_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_ReassignPartitions_reassignPartitions15_invoker.call(ReassignPartitions_4.reassignPartitions(c))
      }
  
    // @LINE:25
    case controllers_ReassignPartitions_handleOperation16_route(params) =>
      call(params.fromPath[String]("c", None), params.fromQuery[String]("t", None)) { (c, t) =>
        controllers_ReassignPartitions_handleOperation16_invoker.call(ReassignPartitions_4.handleOperation(c, t))
      }
  
    // @LINE:26
    case controllers_ReassignPartitions_confirmAssignment17_route(params) =>
      call(params.fromPath[String]("c", None), params.fromQuery[String]("t", None)) { (c, t) =>
        controllers_ReassignPartitions_confirmAssignment17_invoker.call(ReassignPartitions_4.confirmAssignment(c, t))
      }
  
    // @LINE:27
    case controllers_ReassignPartitions_handleGenerateAssignment18_route(params) =>
      call(params.fromPath[String]("c", None), params.fromQuery[String]("t", None)) { (c, t) =>
        controllers_ReassignPartitions_handleGenerateAssignment18_invoker.call(ReassignPartitions_4.handleGenerateAssignment(c, t))
      }
  
    // @LINE:28
    case controllers_ReassignPartitions_confirmMultipleAssignments19_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_ReassignPartitions_confirmMultipleAssignments19_invoker.call(ReassignPartitions_4.confirmMultipleAssignments(c))
      }
  
    // @LINE:29
    case controllers_ReassignPartitions_handleGenerateMultipleAssignments20_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_ReassignPartitions_handleGenerateMultipleAssignments20_invoker.call(ReassignPartitions_4.handleGenerateMultipleAssignments(c))
      }
  
    // @LINE:32
    case controllers_ReassignPartitions_runMultipleAssignments21_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_ReassignPartitions_runMultipleAssignments21_invoker.call(ReassignPartitions_4.runMultipleAssignments(c))
      }
  
    // @LINE:33
    case controllers_ReassignPartitions_handleRunMultipleAssignments22_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_ReassignPartitions_handleRunMultipleAssignments22_invoker.call(ReassignPartitions_4.handleRunMultipleAssignments(c))
      }
  
    // @LINE:34
    case controllers_Cluster_addCluster23_route(params) =>
      call { 
        controllers_Cluster_addCluster23_invoker.call(Cluster_1.addCluster)
      }
  
    // @LINE:35
    case controllers_Cluster_updateCluster24_route(params) =>
      call(params.fromQuery[String]("c", None)) { (c) =>
        controllers_Cluster_updateCluster24_invoker.call(Cluster_1.updateCluster(c))
      }
  
    // @LINE:36
    case controllers_Cluster_handleAddCluster25_route(params) =>
      call { 
        controllers_Cluster_handleAddCluster25_invoker.call(Cluster_1.handleAddCluster)
      }
  
    // @LINE:37
    case controllers_Cluster_handleUpdateCluster26_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Cluster_handleUpdateCluster26_invoker.call(Cluster_1.handleUpdateCluster(c))
      }
  
    // @LINE:38
    case controllers_Topic_createTopic27_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Topic_createTopic27_invoker.call(Topic_0.createTopic(c))
      }
  
    // @LINE:39
    case controllers_Topic_handleCreateTopic28_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Topic_handleCreateTopic28_invoker.call(Topic_0.handleCreateTopic(c))
      }
  
    // @LINE:40
    case controllers_Topic_confirmDeleteTopic29_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("t", None)) { (c, t) =>
        controllers_Topic_confirmDeleteTopic29_invoker.call(Topic_0.confirmDeleteTopic(c, t))
      }
  
    // @LINE:41
    case controllers_Topic_handleDeleteTopic30_route(params) =>
      call(params.fromPath[String]("c", None), params.fromQuery[String]("t", None)) { (c, t) =>
        controllers_Topic_handleDeleteTopic30_invoker.call(Topic_0.handleDeleteTopic(c, t))
      }
  
    // @LINE:42
    case controllers_Topic_addPartitions31_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("t", None)) { (c, t) =>
        controllers_Topic_addPartitions31_invoker.call(Topic_0.addPartitions(c, t))
      }
  
    // @LINE:43
    case controllers_Topic_handleAddPartitions32_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("t", None)) { (c, t) =>
        controllers_Topic_handleAddPartitions32_invoker.call(Topic_0.handleAddPartitions(c, t))
      }
  
    // @LINE:44
    case controllers_Topic_updateConfig33_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("t", None)) { (c, t) =>
        controllers_Topic_updateConfig33_invoker.call(Topic_0.updateConfig(c, t))
      }
  
    // @LINE:45
    case controllers_Topic_handleUpdateConfig34_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("t", None)) { (c, t) =>
        controllers_Topic_handleUpdateConfig34_invoker.call(Topic_0.handleUpdateConfig(c, t))
      }
  
    // @LINE:46
    case controllers_ReassignPartitions_manualAssignments35_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("t", None)) { (c, t) =>
        controllers_ReassignPartitions_manualAssignments35_invoker.call(ReassignPartitions_4.manualAssignments(c, t))
      }
  
    // @LINE:47
    case controllers_ReassignPartitions_handleManualAssignment36_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("t", None)) { (c, t) =>
        controllers_ReassignPartitions_handleManualAssignment36_invoker.call(ReassignPartitions_4.handleManualAssignment(c, t))
      }
  
    // @LINE:48
    case controllers_Logkafka_createLogkafka37_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Logkafka_createLogkafka37_invoker.call(Logkafka_2.createLogkafka(c))
      }
  
    // @LINE:49
    case controllers_Logkafka_handleCreateLogkafka38_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_Logkafka_handleCreateLogkafka38_invoker.call(Logkafka_2.handleCreateLogkafka(c))
      }
  
    // @LINE:50
    case controllers_Logkafka_handleDeleteLogkafka39_route(params) =>
      call(params.fromPath[String]("c", None), params.fromQuery[String]("h", None), params.fromQuery[String]("l", None)) { (c, h, l) =>
        controllers_Logkafka_handleDeleteLogkafka39_invoker.call(Logkafka_2.handleDeleteLogkafka(c, h, l))
      }
  
    // @LINE:51
    case controllers_Logkafka_updateConfig40_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("h", None), params.fromPath[String]("l", None)) { (c, h, l) =>
        controllers_Logkafka_updateConfig40_invoker.call(Logkafka_2.updateConfig(c, h, l))
      }
  
    // @LINE:52
    case controllers_Logkafka_handleUpdateConfig41_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("h", None), params.fromPath[String]("l", None)) { (c, h, l) =>
        controllers_Logkafka_handleUpdateConfig41_invoker.call(Logkafka_2.handleUpdateConfig(c, h, l))
      }
  
    // @LINE:53
    case controllers_Logkafka_handleDisableConfig42_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("h", None), params.fromPath[String]("l", None)) { (c, h, l) =>
        controllers_Logkafka_handleDisableConfig42_invoker.call(Logkafka_2.handleDisableConfig(c, h, l))
      }
  
    // @LINE:54
    case controllers_Logkafka_handleEnableConfig43_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("h", None), params.fromPath[String]("l", None)) { (c, h, l) =>
        controllers_Logkafka_handleEnableConfig43_invoker.call(Logkafka_2.handleEnableConfig(c, h, l))
      }
  
    // @LINE:55
    case controllers_api_KafkaStateCheck_brokers44_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_api_KafkaStateCheck_brokers44_invoker.call(KafkaStateCheck_9.brokers(c))
      }
  
    // @LINE:56
    case controllers_api_KafkaStateCheck_brokersExtended45_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_api_KafkaStateCheck_brokersExtended45_invoker.call(KafkaStateCheck_9.brokersExtended(c))
      }
  
    // @LINE:57
    case controllers_api_KafkaStateCheck_topics46_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_api_KafkaStateCheck_topics46_invoker.call(KafkaStateCheck_9.topics(c))
      }
  
    // @LINE:58
    case controllers_api_KafkaStateCheck_topicIdentities47_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_api_KafkaStateCheck_topicIdentities47_invoker.call(KafkaStateCheck_9.topicIdentities(c))
      }
  
    // @LINE:59
    case controllers_api_KafkaStateCheck_clusters48_route(params) =>
      call { 
        controllers_api_KafkaStateCheck_clusters48_invoker.call(KafkaStateCheck_9.clusters)
      }
  
    // @LINE:60
    case controllers_api_KafkaStateCheck_underReplicatedPartitions49_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("t", None)) { (c, t) =>
        controllers_api_KafkaStateCheck_underReplicatedPartitions49_invoker.call(KafkaStateCheck_9.underReplicatedPartitions(c, t))
      }
  
    // @LINE:61
    case controllers_api_KafkaStateCheck_unavailablePartitions50_route(params) =>
      call(params.fromPath[String]("c", None), params.fromPath[String]("t", None)) { (c, t) =>
        controllers_api_KafkaStateCheck_unavailablePartitions50_invoker.call(KafkaStateCheck_9.unavailablePartitions(c, t))
      }
  
    // @LINE:62
    case controllers_api_KafkaStateCheck_topicSummaryAction51_route(params) =>
      call(params.fromPath[String]("cluster", None), params.fromPath[String]("consumer", None), params.fromPath[String]("topic", None), params.fromPath[String]("consumerType", None)) { (cluster, consumer, topic, consumerType) =>
        controllers_api_KafkaStateCheck_topicSummaryAction51_invoker.call(KafkaStateCheck_9.topicSummaryAction(cluster, consumer, topic, consumerType))
      }
  
    // @LINE:63
    case controllers_api_KafkaStateCheck_groupSummaryAction52_route(params) =>
      call(params.fromPath[String]("cluster", None), params.fromPath[String]("consumer", None), params.fromPath[String]("consumerType", None)) { (cluster, consumer, consumerType) =>
        controllers_api_KafkaStateCheck_groupSummaryAction52_invoker.call(KafkaStateCheck_9.groupSummaryAction(cluster, consumer, consumerType))
      }
  
    // @LINE:64
    case controllers_api_KafkaStateCheck_consumersSummaryAction53_route(params) =>
      call(params.fromPath[String]("cluster", None)) { (cluster) =>
        controllers_api_KafkaStateCheck_consumersSummaryAction53_invoker.call(KafkaStateCheck_9.consumersSummaryAction(cluster))
      }
  
    // @LINE:67
    case controllers_Assets_versioned54_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned54_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:70
    case controllers_Assets_at55_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at55_invoker.call(Assets_5.at(path, file))
      }
  
    // @LINE:73
    case controllers_WebJarAssets_at56_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at56_invoker.call(WebJarAssets_6.at(file))
      }
  
    // @LINE:76
    case controllers_ApiHealth_ping57_route(params) =>
      call { 
        controllers_ApiHealth_ping57_invoker.call(ApiHealth_8.ping)
      }
  }
}