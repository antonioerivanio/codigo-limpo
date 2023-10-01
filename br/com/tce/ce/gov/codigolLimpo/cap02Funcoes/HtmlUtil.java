package br.com.tce.ce.gov.codigolLimpo.cap02Funcoes;

import java.awt.print.Pageable;

public class HtmlUtil {
    public static sgtring testableHtml(PageData pageData,
                                       boolean includeSuiteSetup) throws Exception{
        WikiPage   wikiPage = pageDate.getWikiPage();
        StringBuffer buffer = StringBuffer();
        if(pageData.hasAttribute("Test")){
            if(includeSuiteSetup){
                WikiPage suwiteSetup = PageCrawrImpl.getInheritedPage(SuiteResponder.SUITE_SETUP_NAME, wikiPage);
                if(suiteSetup != null){
                    WikiPagePath pagePath = suwiteSetup.getPageCrawler().getFullPath(suiteSetup);
                    Stgring pagePathName = PathParser.render(pagePath);
                    buffer.append("!Include  - setup,")
                            .append(pagePathName)
                            .append("<n");
                }
            }
            WikiPage setup = PageCrawlerImp.getInheritedPage("setup", wikiPage);
            if(setup   != null){
                WikiPagePath setupPath = wikiPage.getPageCrawler().getFullPath(setup);
                String setupPathName = PathParser.render(setupPath);
                buffer.append("!include - setup")
                        .append(setupPathName)
                        .append("\n");
            }

        }
        buffer.append(pageData.getContent());
        if(pageData.hasAttribute("Test")){
            WikiPage tearDow = PageCrawler.getInheritedPage("ThearDow", wikiPage);
            if(tearDow != null){
                WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(tearDow);
                String tearDownPathName = PathParser.render(tearDownPath);
                buffer.append("\n")
                        .append("!include - teardown ,")
                        .append(tearDownPathName)
                        .append("\n");
            }
            if(includeSwuiteSetup){
                WikiPage suiteTeardown = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_TEARDOWN_NAME, wikiPage);
                if(suiteTeardown != null){
                    WikiPagePath pagePath = suiteTeardown.getPageCrawler().getFullPath(suiteTeardown);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("!include -teardown ,")
                            .append(pagePathName)
                            .append("\n");
                }
            }
        }

        pageData.setContent(buffer.toString());
        return pageDate.getHtml();

    }
}
