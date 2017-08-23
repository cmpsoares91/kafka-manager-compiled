
package views.html.common

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object resultsOfCommand_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object resultsOfCommand_Scope1 {
import scalaz.{\/}

class resultsOfCommand extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Html,IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],$bslash$div[IndexedSeq[kafka.manager.ApiError], Unit],String,models.FollowLink,models.FollowLink,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(theMenu: Html,
  crumbs: IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],
  errorOrSuccess: IndexedSeq[kafka.manager.ApiError] \/ Unit,
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
            """),_display_(/*25.14*/errorOrSuccess/*25.28*/.fold( errs => errs.map(views.html.errors.onApiError(_, Some(errorLink))) , b => link(successLink))),format.raw/*25.127*/("""
        """),format.raw/*26.9*/("""</div>
    </div>
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(theMenu:Html,crumbs:IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],errorOrSuccess:$bslash$div[IndexedSeq[kafka.manager.ApiError], Unit],actionTitle:String,successLink:models.FollowLink,errorLink:models.FollowLink,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(theMenu,crumbs,errorOrSuccess,actionTitle,successLink,errorLink)(messages)

  def f:((Html,IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],$bslash$div[IndexedSeq[kafka.manager.ApiError], Unit],String,models.FollowLink,models.FollowLink) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (theMenu,crumbs,errorOrSuccess,actionTitle,successLink,errorLink) => (messages) => apply(theMenu,crumbs,errorOrSuccess,actionTitle,successLink,errorLink)(messages)

  def ref: this.type = this

}


}
}

/**/
object resultsOfCommand extends resultsOfCommand_Scope0.resultsOfCommand_Scope1.resultsOfCommand
              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 17:45:38 WEST 2017
                  SOURCE: /home/cmpsoares/Downloads/kafka-manager-1.3.3.13/app/views/common/resultsOfCommand.scala.html
                  HASH: 8b7d93c79ac30bb48f3edf9903878ca41a9b6691
                  MATRIX: 793->135|1153->419|1165->423|1270->451|1302->456|1453->580|1472->590|1497->594|1527->597|1546->607|1573->613|1630->416|1659->630|1688->633|1787->723|1827->725|1860->731|2006->850|2038->861|2090->886|2113->900|2234->999|2270->1008|2319->1027
                  LINES: 23->6|32->13|32->13|34->13|35->14|37->16|37->16|37->16|37->16|37->16|37->16|40->11|42->18|44->20|44->20|44->20|46->22|48->24|48->24|49->25|49->25|49->25|50->26|52->28
                  -- GENERATED --
              */
          