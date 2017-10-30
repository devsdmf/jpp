
package com.jpp.gateway;

public interface Invoice {

    public double getInvoiceDiscountRate();

    public double calculateInvoiceDiscount(double totalValue);
}
