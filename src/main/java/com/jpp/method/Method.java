
package com.jpp.method;

import com.jpp.gateway.Gateway;

public class Method {

    private String id;

    private String name;

    private Type type;

    private Boolean enabled = Boolean.TRUE;

    private Gateway adapter;

    public Method(String id, String name, Type type, Gateway adapter) {
        this.setId(id);
        this.setName(name);
        this.setType(type);

        this.adapter = adapter;
    }

    public Method(String id, String name, Type type, Gateway adapter, Boolean enabled) {
        this.setId(id);
        this.setName(name);
        this.setType(type);
        this.setEnabled(enabled);

        this.adapter = adapter;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isType(Type typeToCheck) {
        return (this.type == typeToCheck);
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public Gateway getAdapter() {
        return this.adapter;
    }

    public String toString() {
        return this.id;
    }
}
