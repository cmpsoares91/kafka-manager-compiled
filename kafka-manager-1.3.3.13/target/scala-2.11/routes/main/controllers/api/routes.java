
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmpsoares/Downloads/kafka-manager-1.3.3.13/conf/routes
// @DATE:Tue Aug 22 17:45:36 WEST 2017

package controllers.api;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.api.ReverseKafkaStateCheck KafkaStateCheck = new controllers.api.ReverseKafkaStateCheck(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.api.javascript.ReverseKafkaStateCheck KafkaStateCheck = new controllers.api.javascript.ReverseKafkaStateCheck(RoutesPrefix.byNamePrefix());
  }

}
