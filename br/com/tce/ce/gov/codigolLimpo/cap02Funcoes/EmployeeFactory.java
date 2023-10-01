package br.com.tce.ce.gov.codigolLimpo.cap02Funcoes;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws IvalidEmployeeType;
}
