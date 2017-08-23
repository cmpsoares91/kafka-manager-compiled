
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmpsoares/Downloads/kafka-manager-1.3.3.13/conf/routes
// @DATE:Tue Aug 22 17:45:36 WEST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers {

  // @LINE:67
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:67
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "vassets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:22
  class ReversePreferredReplicaElection(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def preferredReplicaElection(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/leader")
    }
  
    // @LINE:23
    def handleRunElection(c:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/leader")
    }
  
  }

  // @LINE:73
  class ReverseWebJarAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def at(file:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:76
  class ReverseApiHealth(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def ping(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/health")
    }
  
  }

  // @LINE:24
  class ReverseReassignPartitions(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def confirmMultipleAssignments(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/assignments/confirm")
    }
  
    // @LINE:29
    def handleGenerateMultipleAssignments(c:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/assignments/generate")
    }
  
    // @LINE:27
    def handleGenerateAssignment(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/assignment/generate" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("t", t)))))
    }
  
    // @LINE:32
    def runMultipleAssignments(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/assignments/run")
    }
  
    // @LINE:25
    def handleOperation(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/assignment" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("t", t)))))
    }
  
    // @LINE:24
    def reassignPartitions(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/assignment")
    }
  
    // @LINE:33
    def handleRunMultipleAssignments(c:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/assignments/run")
    }
  
    // @LINE:47
    def handleManualAssignment(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + "/assignments/manual")
    }
  
    // @LINE:46
    def manualAssignments(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + "/assignments/manual")
    }
  
    // @LINE:26
    def confirmAssignment(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/assignment/confirm" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("t", t)))))
    }
  
  }

  // @LINE:11
  class ReverseTopic(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def topics(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics")
    }
  
    // @LINE:14
    def topic(c:String, t:String, force:Boolean = false): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + queryString(List(if(force == false) None else Some(implicitly[QueryStringBindable[Boolean]].unbind("force", force)))))
    }
  
    // @LINE:38
    def createTopic(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/createTopic")
    }
  
    // @LINE:43
    def handleAddPartitions(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + "/addPartitions")
    }
  
    // @LINE:41
    def handleDeleteTopic(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/delete" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("t", t)))))
    }
  
    // @LINE:44
    def updateConfig(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + "/updateConfig")
    }
  
    // @LINE:42
    def addPartitions(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + "/addPartitions")
    }
  
    // @LINE:12
    def addPartitionsToMultipleTopics(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/addPartitions")
    }
  
    // @LINE:13
    def handleAddPartitionsToMultipleTopics(c:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/addPartitions")
    }
  
    // @LINE:39
    def handleCreateTopic(c:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/create")
    }
  
    // @LINE:45
    def handleUpdateConfig(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + "/updateConfig")
    }
  
    // @LINE:40
    def confirmDeleteTopic(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + "/confirm_delete")
    }
  
  }

  // @LINE:19
  class ReverseConsumer(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def consumers(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/consumers")
    }
  
    // @LINE:20
    def consumer(c:String, g:String, ct:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/consumers/" + implicitly[PathBindable[String]].unbind("g", dynamicString(g)) + "/type/" + implicitly[PathBindable[String]].unbind("ct", dynamicString(ct)))
    }
  
    // @LINE:21
    def consumerAndTopic(c:String, g:String, t:String, ct:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/consumers/" + implicitly[PathBindable[String]].unbind("g", dynamicString(g)) + "/topic/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + "/type/" + implicitly[PathBindable[String]].unbind("ct", dynamicString(ct)))
    }
  
  }

  // @LINE:15
  class ReverseLogkafka(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def handleCreateLogkafka(c:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/logkafkas/create")
    }
  
    // @LINE:53
    def handleDisableConfig(c:String, h:String, l:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/logkafkas/" + implicitly[PathBindable[String]].unbind("h", dynamicString(h)) + "/" + implicitly[PathBindable[String]].unbind("l", dynamicString(l)) + "/disableConfig")
    }
  
    // @LINE:54
    def handleEnableConfig(c:String, h:String, l:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/logkafkas/" + implicitly[PathBindable[String]].unbind("h", dynamicString(h)) + "/" + implicitly[PathBindable[String]].unbind("l", dynamicString(l)) + "/enableConfig")
    }
  
    // @LINE:48
    def createLogkafka(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/createLogkafka")
    }
  
    // @LINE:15
    def logkafkas(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/logkafkas")
    }
  
    // @LINE:51
    def updateConfig(c:String, h:String, l:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/logkafkas/" + implicitly[PathBindable[String]].unbind("h", dynamicString(h)) + "/" + implicitly[PathBindable[String]].unbind("l", dynamicString(l)) + "/updateConfig")
    }
  
    // @LINE:50
    def handleDeleteLogkafka(c:String, h:String, l:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/logkafkas/delete" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("h", h)), Some(implicitly[QueryStringBindable[String]].unbind("l", l)))))
    }
  
    // @LINE:52
    def handleUpdateConfig(c:String, h:String, l:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/logkafkas/" + implicitly[PathBindable[String]].unbind("h", dynamicString(h)) + "/" + implicitly[PathBindable[String]].unbind("l", dynamicString(l)) + "/updateConfig")
    }
  
    // @LINE:16
    def logkafka(c:String, h:String, l:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/logkafkas/" + implicitly[PathBindable[String]].unbind("h", dynamicString(h)) + "/" + implicitly[PathBindable[String]].unbind("l", dynamicString(l)))
    }
  
  }

  // @LINE:9
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseCluster(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def addCluster(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addCluster")
    }
  
    // @LINE:17
    def brokers(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/brokers")
    }
  
    // @LINE:36
    def handleAddCluster(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters")
    }
  
    // @LINE:37
    def handleUpdateCluster(c:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)))
    }
  
    // @LINE:18
    def broker(c:String, b:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/brokers/" + implicitly[PathBindable[Int]].unbind("b", b))
    }
  
    // @LINE:10
    def cluster(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)))
    }
  
    // @LINE:35
    def updateCluster(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "updateCluster" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("c", c)))))
    }
  
  }


}