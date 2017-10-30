
package com.jpp.gateway;

public interface Installments {

    public int getMaxInstallmentsNumber();

    public double getInstallmentsInterestRate();

    public int getMaxInstallmentsWithoutInterest();

    public double getMinimumInstallmentValue();

    public double getInstallmentValue(double totalValue, int installments);

    public double[] getInstallmentsValues(double totalValue, int maxInstallments);
}
