
package com.jpp.gateway.adapter;

import com.jpp.gateway.Configuration;
import com.jpp.gateway.Gateway;
import com.jpp.method.Method;

public abstract class AbstractAdapter implements Gateway {

    protected Configuration $config;

    protected Boolean enabled = Boolean.TRUE;

    protected Boolean configured = Boolean.FALSE;

    private Method[] methods;

    protected int defaultOrderStatus;

    protected int successfulOrderStatus;

    protected int cancelledOrderStatus;

    public AbstractAdapter configure(Configuration config) {
        this.config = config;

        return this;
    }
}