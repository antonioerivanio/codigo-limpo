package br.com.tce.ce.gov.codigolLimpo.cap02;

public class EmployeeFactoryImpl extends EmployeeFactory {

    @Override
    public Employee makeEmployee(EmployeeRecord r) throws IvalidEmployeeType {
        switch (r.type){
            case COMMISSIONED:
                return calculateComissionedPay(r);
            case HOURLY:
                return claculateHourlyPay(r);
            case SALARIED:
                return claculateSalariedPay(r)
            default:
                throw new InvalidaEmployeeType(r.type);
        }
    }
}
