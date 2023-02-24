package com.vbs.no2a.filters;

import org.dizitart.no2.objects.ObjectFilter;

import static org.dizitart.no2.objects.filters.ObjectFilters.lt;

public class LessFilter extends NO2Filter {
    public LessFilter() {
    }

    public LessFilter(String prop, Object value) {
        this.Property = prop;
        this.Value = value;
    }


    @Override
    public void apply() {
        ObjectFilter objectFilter = lt(Property, Value);
    }
}
