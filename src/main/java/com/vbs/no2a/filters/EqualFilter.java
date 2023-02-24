package com.vbs.no2a.filters;

import org.dizitart.no2.objects.ObjectFilter;

import static org.dizitart.no2.objects.filters.ObjectFilters.eq;

public class EqualFilter extends NO2Filter {
    public EqualFilter() {
    }

    public EqualFilter(String prop, Object value) {
        this.Property = prop;
        this.Value = value;
    }


    @Override
    public void apply() {
        ObjectFilter objectFilter = eq(Property, Value);
    }
}
