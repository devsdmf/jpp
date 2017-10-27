
package com.jpp.gateway;

public interface Statuses {
    
    public int getDefaultOrderStatus();

    public int getSuccessfulOrderStatus();

    public int getRejectedOrderStatus();

    public int getCancelledOrderStatus();
}
