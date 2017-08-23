
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmpsoares/Downloads/kafka-manager-1.3.3.13/conf/routes
// @DATE:Tue Aug 22 17:45:36 WEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:55
package controllers.api.javascript {
  import ReverseRouteContext.empty

  // @LINE:55
  class ReverseKafkaStateCheck(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def topics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.topics",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topics"})
        }
      """
    )
  
    // @LINE:61
    def unavailablePartitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.unavailablePartitions",
      """
        function(c,t) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + "/unavailablePartitions"})
        }
      """
    )
  
    // @LINE:58
    def topicIdentities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.topicIdentities",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/topicIdentities"})
        }
      """
    )
  
    // @LINE:55
    def brokers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.brokers",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/brokers"})
        }
      """
    )
  
    // @LINE:64
    def consumersSummaryAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.consumersSummaryAction",
      """
        function(cluster) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cluster", encodeURIComponent(cluster)) + "/consumersSummary"})
        }
      """
    )
  
    // @LINE:60
    def underReplicatedPartitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.underReplicatedPartitions",
      """
        function(c,t) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("t", encodeURIComponent(t)) + "/underReplicatedPartitions"})
        }
      """
    )
  
    // @LINE:56
    def brokersExtended: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.brokersExtended",
      """
        function(c) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c)) + "/brokers/extended"})
        }
      """
    )
  
    // @LINE:62
    def topicSummaryAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.topicSummaryAction",
      """
        function(cluster,consumer,topic,consumerType) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cluster", encodeURIComponent(cluster)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("consumer", encodeURIComponent(consumer)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("topic", encodeURIComponent(topic)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("consumerType", encodeURIComponent(consumerType)) + "/topicSummary"})
        }
      """
    )
  
    // @LINE:63
    def groupSummaryAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.groupSummaryAction",
      """
        function(cluster,consumer,consumerType) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cluster", encodeURIComponent(cluster)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("consumer", encodeURIComponent(consumer)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("consumerType", encodeURIComponent(consumerType)) + "/groupSummary"})
        }
      """
    )
  
    // @LINE:59
    def clusters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.clusters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/clusters"})
        }
      """
    )
  
  }


}