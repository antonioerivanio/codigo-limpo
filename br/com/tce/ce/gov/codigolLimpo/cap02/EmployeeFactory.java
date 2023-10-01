package br.com.tce.ce.gov.codigolLimpo.cap02;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws IvalidEmployeeType;
}
