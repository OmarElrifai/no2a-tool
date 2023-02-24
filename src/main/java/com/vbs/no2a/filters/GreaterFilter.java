package com.vbs.no2a.filters;

import org.dizitart.no2.objects.ObjectFilter;

import static org.dizitart.no2.objects.filters.ObjectFilters.gt;

public class GreaterFilter extends NO2Filter{
    public  GreaterFilter(){

    }

    public GreaterFilter(String prop, Object value) {
        this.Property = prop;
        this.Value = value;
    }


    @Override
    public void apply() {
        ObjectFilter objectFilter = gt(Property, Value);
    }
}
