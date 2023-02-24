package com.vbs.no2a.filters;

import com.vbs.no2a.Interfaces.Command;
import org.dizitart.no2.objects.ObjectFilter;

import static org.dizitart.no2.objects.filters.ObjectFilters.gte;

public class GreaterOrEqualFilter extends NO2Filter implements Command {
    public GreaterOrEqualFilter() {
    }

    public GreaterOrEqualFilter(String prop, Object value) {
        this.Property = prop;
        this.Value = value;
    }


    @Override
    public void apply() {
        ObjectFilter objectFilter = gte(Property, Value);
    }
}
