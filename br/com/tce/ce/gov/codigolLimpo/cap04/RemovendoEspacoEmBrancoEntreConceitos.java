package br.com.tce.ce.gov.codigolLimpo.cap04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemovendoEspacoEmBrancoEntreConceitos {extends ParentWidget {
    public static final String REGEXP = "''',+?'''";
    private static final Pattern pattern = Pattern.compile("''',+?'''",
            Pattern.MULTILINE + Pattern.DOTALL);
    public EspacamentoVerticalEntreConceitos(ParentWidget parent, String text) throws Exception {
        super(parent);
        Matcher match = pattern.matcher(text);
        match.find();
        addChildWidgets(match.group(1));
    }
    public String render() throws Exception {
        StringBuffer html = new StringBuffer("<br>");
        html.append(childHtml()).append("<br>");
        return html.toString() ;
    }
}
