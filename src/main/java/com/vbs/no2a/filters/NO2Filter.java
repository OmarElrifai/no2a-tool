package com.vbs.no2a.filters;

import com.vbs.no2a.Interfaces.Command;
import org.dizitart.no2.objects.ObjectFilter;

public abstract class NO2Filter implements Command {

    protected String Property;
    protected Object Value;
    protected ObjectFilter FilterObject;

    public String getProperty() {
        return Property;
    }

    public void setProperty(String property) {
        Property = property;
    }

    public Object getValue() {
        return Value;
    }

    public void setValue(Object value) {
        Value = value;
    }

    public ObjectFilter getFilterObject() {
        return FilterObject;
    }

    @Override
    public void apply() {
    }

    @Override
    public void cancel() {
        this.FilterObject = null;
        this.Property = null;
        this.Value = null;
    }
}
