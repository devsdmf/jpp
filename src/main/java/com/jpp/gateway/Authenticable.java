
package com.jpp.gateway;

public interface Authenticable {

    public Gateway setCredentials(Credentials credentials);

    public Credentials getCredentials();
}
