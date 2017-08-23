
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmpsoares/Downloads/kafka-manager-1.3.3.13/conf/routes
// @DATE:Tue Aug 22 17:45:36 WEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:67
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:67
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vassets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:22
  class ReversePreferredReplicaElection(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def preferredReplicaElection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PreferredReplicaElection.preferredReplicaElection",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/leader"})
        }
      """
    )
  
    // @LINE:23
    def handleRunElection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PreferredReplicaElection.handleRunElection",
      """
        function(c) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/leader"})
        }
      """
    )
  
  }

  // @LINE:73
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:76
  class ReverseApiHealth(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def ping: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiHealth.ping",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/health"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseReassignPartitions(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def confirmMultipleAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.confirmMultipleAssignments",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/assignments/confirm"})
        }
      """
    )
  
    // @LINE:29
    def handleGenerateMultipleAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.handleGenerateMultipleAssignments",
      """
        function(c) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/assignments/generate"})
        }
      """
    )
  
    // @LINE:27
    def handleGenerateAssignment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.handleGenerateAssignment",
      """
        function(c,t) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/assignment/generate" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("t", t)])})
        }
      """
    )
  
    // @LINE:32
    def runMultipleAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.runMultipleAssignments",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/assignments/run"})
        }
      """
    )
  
    // @LINE:25
    def handleOperation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.handleOperation",
      """
        function(c,t) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/assignment" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("t", t)])})
        }
      """
    )
  
    // @LINE:24
    def reassignPartitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.reassignPartitions",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/assignment"})
        }
      """
    )
  
    // @LINE:33
    def handleRunMultipleAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.handleRunMultipleAssignments",
      """
        function(c) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/assignments/run"})
        }
      """
    )
  
    // @LINE:47
    def handleManualAssignment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.handleManualAssignment",
      """
        function(c,t) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + "/assignments/manual"})
        }
      """
    )
  
    // @LINE:46
    def manualAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.manualAssignments",
      """
        function(c,t) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + "/assignments/manual"})
        }
      """
    )
  
    // @LINE:26
    def confirmAssignment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.confirmAssignment",
      """
        function(c,t) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/assignment/confirm" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("t", t)])})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseTopic(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def topics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.topics",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics"})
        }
      """
    )
  
    // @LINE:14
    def topic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.topic",
      """
        function(c,t,force) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + _qS([(force == null ? null : (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("force", force))])})
        }
      """
    )
  
    // @LINE:38
    def createTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.createTopic",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/createTopic"})
        }
      """
    )
  
    // @LINE:43
    def handleAddPartitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.handleAddPartitions",
      """
        function(c,t) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + "/addPartitions"})
        }
      """
    )
  
    // @LINE:41
    def handleDeleteTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.handleDeleteTopic",
      """
        function(c,t) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/delete" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("t", t)])})
        }
      """
    )
  
    // @LINE:44
    def updateConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.updateConfig",
      """
        function(c,t) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + "/updateConfig"})
        }
      """
    )
  
    // @LINE:42
    def addPartitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.addPartitions",
      """
        function(c,t) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + "/addPartitions"})
        }
      """
    )
  
    // @LINE:12
    def addPartitionsToMultipleTopics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.addPartitionsToMultipleTopics",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/addPartitions"})
        }
      """
    )
  
    // @LINE:13
    def handleAddPartitionsToMultipleTopics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.handleAddPartitionsToMultipleTopics",
      """
        function(c) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/addPartitions"})
        }
      """
    )
  
    // @LINE:39
    def handleCreateTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.handleCreateTopic",
      """
        function(c) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/create"})
        }
      """
    )
  
    // @LINE:45
    def handleUpdateConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.handleUpdateConfig",
      """
        function(c,t) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + "/updateConfig"})
        }
      """
    )
  
    // @LINE:40
    def confirmDeleteTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.confirmDeleteTopic",
      """
        function(c,t) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + "/confirm_delete"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseConsumer(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def consumers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Consumer.consumers",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/consumers"})
        }
      """
    )
  
    // @LINE:20
    def consumer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Consumer.consumer",
      """
        function(c,g,ct) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/consumers/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("g", encodeURIComponent(g)) + "/type/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ct", encodeURIComponent(ct))})
        }
      """
    )
  
    // @LINE:21
    def consumerAndTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Consumer.consumerAndTopic",
      """
        function(c,g,t,ct) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/consumers/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("g", encodeURIComponent(g)) + "/topic/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + "/type/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ct", encodeURIComponent(ct))})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseLogkafka(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def handleCreateLogkafka: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.handleCreateLogkafka",
      """
        function(c) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/logkafkas/create"})
        }
      """
    )
  
    // @LINE:53
    def handleDisableConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.handleDisableConfig",
      """
        function(c,h,l) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/logkafkas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("h", encodeURIComponent(h)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("l", encodeURIComponent(l)) + "/disableConfig"})
        }
      """
    )
  
    // @LINE:54
    def handleEnableConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.handleEnableConfig",
      """
        function(c,h,l) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/logkafkas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("h", encodeURIComponent(h)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("l", encodeURIComponent(l)) + "/enableConfig"})
        }
      """
    )
  
    // @LINE:48
    def createLogkafka: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.createLogkafka",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/createLogkafka"})
        }
      """
    )
  
    // @LINE:15
    def logkafkas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.logkafkas",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/logkafkas"})
        }
      """
    )
  
    // @LINE:51
    def updateConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.updateConfig",
      """
        function(c,h,l) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/logkafkas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("h", encodeURIComponent(h)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("l", encodeURIComponent(l)) + "/updateConfig"})
        }
      """
    )
  
    // @LINE:50
    def handleDeleteLogkafka: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.handleDeleteLogkafka",
      """
        function(c,h,l) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/logkafkas/delete" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("h", h), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("l", l)])})
        }
      """
    )
  
    // @LINE:52
    def handleUpdateConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.handleUpdateConfig",
      """
        function(c,h,l) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/logkafkas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("h", encodeURIComponent(h)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("l", encodeURIComponent(l)) + "/updateConfig"})
        }
      """
    )
  
    // @LINE:16
    def logkafka: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.logkafka",
      """
        function(c,h,l) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/logkafkas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("h", encodeURIComponent(h)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("l", encodeURIComponent(l))})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseCluster(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def addCluster: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.addCluster",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addCluster"})
        }
      """
    )
  
    // @LINE:17
    def brokers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.brokers",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/brokers"})
        }
      """
    )
  
    // @LINE:36
    def handleAddCluster: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.handleAddCluster",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters"})
        }
      """
    )
  
    // @LINE:37
    def handleUpdateCluster: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.handleUpdateCluster",
      """
        function(c) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c))})
        }
      """
    )
  
    // @LINE:18
    def broker: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.broker",
      """
        function(c,b) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/brokers/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("b", b)})
        }
      """
    )
  
    // @LINE:10
    def cluster: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.cluster",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c))})
        }
      """
    )
  
    // @LINE:35
    def updateCluster: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.updateCluster",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateCluster" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("c", c)])})
        }
      """
    )
  
  }


}