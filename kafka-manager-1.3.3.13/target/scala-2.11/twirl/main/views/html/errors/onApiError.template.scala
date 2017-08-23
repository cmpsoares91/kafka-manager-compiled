
package views.html.errors

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object onApiError_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class onApiError extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[kafka.manager.ApiError,Option[FollowLink],play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(apiError: kafka.manager.ApiError, urlOption: Option[FollowLink] = None):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.74*/("""

"""),format.raw/*7.1*/("""<div class="alert alert-danger" role="alert">
    <strong>Yikes!</strong> """),_display_(/*8.30*/apiError/*8.38*/.msg),format.raw/*8.42*/("""
    """),_display_(/*9.6*/urlOption/*9.15*/.map/*9.19*/ { link =>_display_(Seq[Any](format.raw/*9.29*/("""
    """),format.raw/*10.5*/("""<a href=""""),_display_(/*10.15*/link/*10.19*/.url),format.raw/*10.23*/("""">"""),_display_(/*10.26*/link/*10.30*/.title),format.raw/*10.36*/("""</a>
    """)))}),format.raw/*11.6*/("""
"""),format.raw/*12.1*/("""</div>
"""))
      }
    }
  }

  def render(apiError:kafka.manager.ApiError,urlOption:Option[FollowLink]): play.twirl.api.HtmlFormat.Appendable = apply(apiError,urlOption)

  def f:((kafka.manager.ApiError,Option[FollowLink]) => play.twirl.api.HtmlFormat.Appendable) = (apiError,urlOption) => apply(apiError,urlOption)

  def ref: this.type = this

}


}

/*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
object onApiError extends onApiError_Scope0.onApiError
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:36 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/errors/onApiError.scala.html
                  HASH: 9ae212298b976193d61d881b64afc81bdbbafd10
                  MATRIX: 688->115|855->187|883->189|984->264|1000->272|1024->276|1055->282|1072->291|1084->295|1131->305|1163->310|1200->320|1213->324|1238->328|1268->331|1281->335|1308->341|1348->351|1376->352
                  LINES: 23->5|28->5|30->7|31->8|31->8|31->8|32->9|32->9|32->9|32->9|33->10|33->10|33->10|33->10|33->10|33->10|33->10|34->11|35->12
                  -- GENERATED --
              */
          