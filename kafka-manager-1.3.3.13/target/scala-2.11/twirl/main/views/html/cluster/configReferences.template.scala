
package views.html.cluster

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object configReferences_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class configReferences extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""<div class="panel panel-info">
    <div class="panel-heading">References</div>
    <ol>
        <li><a href="https://kafka.apache.org/08/quickstart.html">Kafka Quickstart</a></li>
        <li><a href="https://github.com/Qihoo360/logkafka">LogKafka</a></li>
    </ol>
</div>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object configReferences extends configReferences_Scope0.configReferences
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/cluster/configReferences.scala.html
                  HASH: 136530648840b776986f93020ff004dbd9940d13
                  MATRIX: 748->115
                  LINES: 28->6
                  -- GENERATED --
              */
          