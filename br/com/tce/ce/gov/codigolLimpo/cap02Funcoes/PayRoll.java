package br.com.tce.ce.gov.codigolLimpo.cap02Funcoes;

public class PayRoll {
    public Money claculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.type){
            case COMMISSIONED:
                return calculateComissionedPay(e);
            case HOURLY:
                return claculateHourlyPay(e);
            case SALARIED:
                return claculateSalariedPay(e)
            default:
                throw new InvalidaEmployeeType(e.type);
        }
    }
}
