package br.com.tce.ce.gov.codigolLimpo.cap04;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class QuebraDeIntimidade {
    /*
    * O nome classe que escuta o reporter
    *
    */
    private String m_classNome;

    /*
     * A propriedade do reporta
     *
     */
    private List<Properties> m_proProperties = new ArrayList<Properties>();


    public void addProperty(Properties prop){
        m_proProperties.add(prop);
    }

}
