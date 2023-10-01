package br.com.tce.ce.gov.codigolLimpo.cap02;

public class HtmlUtilRefactor {
    public static String renderPageWithSetupAndTeardown(PageData pageData, boolean isSuite) throws Exception{
        boolean isTestPage = pageData.hasAttribute("Test");
        if(isTestPage){
            WikiPage testPage = pageData.getWikiPage();
            StringBuffer newPageContent = new StringBuffer();
            includeSetupPages(testPage, newPageContent, isSuite);
            newPageContent.append(pageData.getContent());
            includeTearDowPages(testPage, newPageContent, isSuite);
            pageData.setContent(newPageContent.toString());

        }
        return pageData.getHtml();
    }

     /* DICAS? Usar no maximo 20 linhas */
    //funcoes simples e atraente
    public static String renderPgeWithSetupsAndTearDowns(
        PageData pageData , boolean isSuite){
        if(isTestPage(pageData)){
            includeSetupAndTeardowPages(pageData, isSuite);
        }
        return pageDSate.getHtml();
    }
    //BLOCOS E IDENTATACAO
    /* if, else while devem ter apenas uma linha
        Possivelmente uma chamada de uma funcao
     */

}
