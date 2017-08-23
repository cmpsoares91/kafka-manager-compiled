
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmpsoares/Downloads/kafka-manager-1.3.3.13/conf/routes
// @DATE:Tue Aug 22 17:45:36 WEST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:55
package controllers.api {

  // @LINE:55
  class ReverseKafkaStateCheck(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def topics(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topics")
    }
  
    // @LINE:61
    def unavailablePartitions(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + "/unavailablePartitions")
    }
  
    // @LINE:58
    def topicIdentities(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/topicIdentities")
    }
  
    // @LINE:55
    def brokers(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/brokers")
    }
  
    // @LINE:64
    def consumersSummaryAction(cluster:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + implicitly[PathBindable[String]].unbind("cluster", dynamicString(cluster)) + "/consumersSummary")
    }
  
    // @LINE:60
    def underReplicatedPartitions(c:String, t:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/" + implicitly[PathBindable[String]].unbind("t", dynamicString(t)) + "/underReplicatedPartitions")
    }
  
    // @LINE:56
    def brokersExtended(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)) + "/brokers/extended")
    }
  
    // @LINE:62
    def topicSummaryAction(cluster:String, consumer:String, topic:String, consumerType:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + implicitly[PathBindable[String]].unbind("cluster", dynamicString(cluster)) + "/" + implicitly[PathBindable[String]].unbind("consumer", dynamicString(consumer)) + "/" + implicitly[PathBindable[String]].unbind("topic", dynamicString(topic)) + "/" + implicitly[PathBindable[String]].unbind("consumerType", dynamicString(consumerType)) + "/topicSummary")
    }
  
    // @LINE:63
    def groupSummaryAction(cluster:String, consumer:String, consumerType:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + implicitly[PathBindable[String]].unbind("cluster", dynamicString(cluster)) + "/" + implicitly[PathBindable[String]].unbind("consumer", dynamicString(consumer)) + "/" + implicitly[PathBindable[String]].unbind("consumerType", dynamicString(consumerType)) + "/groupSummary")
    }
  
    // @LINE:59
    def clusters(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/status/clusters")
    }
  
  }


}