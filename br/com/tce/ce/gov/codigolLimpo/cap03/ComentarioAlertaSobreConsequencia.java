package br.com.tce.ce.gov.codigolLimpo.cap03;

public class ComentarioAlertaSobreConsequencia {
    //N'ao execute a menos que voc"e tenha tempo disponivel
    public void testWithReallyBigFile(){
        writeLinesToFile(1000000000);
        response.setBody(testFile);
        response.readyToSend(this);
        String reponseString = output.toString();
        assertySubString("Content-length: 10000000000", reponseString);
        assertTrue(bytesSent > 100000000);
    }
}
