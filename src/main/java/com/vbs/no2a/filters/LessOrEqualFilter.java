package com.vbs.no2a.filters;

import org.dizitart.no2.objects.ObjectFilter;

import static org.dizitart.no2.objects.filters.ObjectFilters.lte;

public class LessOrEqualFilter extends NO2Filter  {
    public LessOrEqualFilter(String prop, Object value) {
        this.Property = prop;
        this.Value = value;
    }


    @Override
    public void apply() {
        ObjectFilter objectFilter = lte(Property, Value);
    }
}
