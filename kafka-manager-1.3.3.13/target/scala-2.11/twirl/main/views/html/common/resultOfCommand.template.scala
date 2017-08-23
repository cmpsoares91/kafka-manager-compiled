
package views.html.common

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object resultOfCommand_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object resultOfCommand_Scope1 {
import scalaz.{\/}

class resultOfCommand extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Html,IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],$bslash$div[kafka.manager.ApiError, Any],String,models.FollowLink,models.FollowLink,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(theMenu: Html,
  crumbs: IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],
  errorOrSuccess: kafka.manager.ApiError \/ Any,
  actionTitle: String,
  successLink: models.FollowLink,
  errorLink: models.FollowLink)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*13.2*/link/*13.6*/(followLink: FollowLink):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.34*/("""
    """),format.raw/*14.5*/("""<div class="alert alert-success" role="alert">Done!</div>
    <div class="alert alert-info" role="alert">
        <a href=""""),_display_(/*16.19*/followLink/*16.29*/.url),format.raw/*16.33*/("""">"""),_display_(/*16.36*/followLink/*16.46*/.title),format.raw/*16.52*/("""</a>
    </div>
""")))};
Seq[Any](format.raw/*11.75*/("""

"""),format.raw/*18.2*/("""

"""),_display_(/*20.2*/main(actionTitle, menu = theMenu, breadcrumbs = views.html.navigation.breadCrumbs(crumbs))/*20.92*/ {_display_(Seq[Any](format.raw/*20.94*/("""

    """),format.raw/*22.5*/("""<div class="col-md-6 un-pad-me">
        <div class="panel panel-default">
            <div class="panel-heading"><h3>"""),_display_(/*24.45*/actionTitle),format.raw/*24.56*/("""</h3></div>
            """),_display_(/*25.14*/errorOrSuccess/*25.28*/.fold( a => views.html.errors.onApiError(a, Some(errorLink)) , b => link(successLink))),format.raw/*25.114*/("""
        """),format.raw/*26.9*/("""</div>
    </div>

""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(theMenu:Html,crumbs:IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],errorOrSuccess:$bslash$div[kafka.manager.ApiError, Any],actionTitle:String,successLink:models.FollowLink,errorLink:models.FollowLink,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(theMenu,crumbs,errorOrSuccess,actionTitle,successLink,errorLink)(messages)

  def f:((Html,IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],$bslash$div[kafka.manager.ApiError, Any],String,models.FollowLink,models.FollowLink) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (theMenu,crumbs,errorOrSuccess,actionTitle,successLink,errorLink) => (messages) => apply(theMenu,crumbs,errorOrSuccess,actionTitle,successLink,errorLink)(messages)

  def ref: this.type = this

}


}
}

/**/
object resultOfCommand extends resultOfCommand_Scope0.resultOfCommand_Scope1.resultOfCommand
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/common/resultOfCommand.scala.html
                  HASH: 0b259c1c93327ebfd019fec50413d208cd46eb66
                  MATRIX: 777->135|1124->406|1136->410|1241->438|1273->443|1424->567|1443->577|1468->581|1498->584|1517->594|1544->600|1601->403|1630->617|1659->620|1758->710|1798->712|1831->718|1977->837|2009->848|2061->873|2084->887|2192->973|2228->982|2278->1002
                  LINES: 23->6|32->13|32->13|34->13|35->14|37->16|37->16|37->16|37->16|37->16|37->16|40->11|42->18|44->20|44->20|44->20|46->22|48->24|48->24|49->25|49->25|49->25|50->26|53->29
                  -- GENERATED --
              */
          