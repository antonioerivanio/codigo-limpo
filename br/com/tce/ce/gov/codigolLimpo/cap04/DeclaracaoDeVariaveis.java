package br.com.tce.ce.gov.codigolLimpo.cap04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/***
 * Devem-se declarar as variaveis o mais proximo posiveo de onde
 * ser'ao usads. Variaveis locais devem ficar no topo de cada funcao
 */
public class DeclaracaoDeVariaveis {
    private static void readPreferencias(){
        InputStream is = null;
        try{
            is = new FileInputStream(getPreferenciaFile());
            setPreferencias(new Properties(getPreferencias()));
            getPreferencias().load(is);
        }catch (IOException e){
            try{
                if(is != null){
                    is.close();
                }
            }catch (IOException e1){

            }
        }
    }

    public int countTestCase(){
        int count = 0;
        for (Test each : tests)
            count += each.countTestCases();
        return count;
    }
}
