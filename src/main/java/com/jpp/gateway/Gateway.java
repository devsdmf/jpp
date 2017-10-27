
package com.jpp.gateway;

public interface Gateway extends Statuses {

    public Gateway configure(Configuration config);

    public boolean isConfigured();

    public void setEnabled(boolean enabled);

    public boolean isEnabled();
}
