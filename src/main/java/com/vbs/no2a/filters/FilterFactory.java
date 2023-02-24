package com.vbs.no2a.filters;

public class FilterFactory
{
    // Example input:
    // prop = 30
    // prop >= 30
    // haha > 10
    // haha < 10
    // you may get error like
    // haha << 30
    static public NO2Filter createFilter(String input){

        if(input.contains("=")){
            String[] list = input.split("=");
            EqualFilter equal = new EqualFilter(list[0] , list[1]);
        }else if(input.contains(">") && input.contains("=")){
            String[] list = input.split(">=");
            GreaterOrEqualFilter greaterequal = new GreaterOrEqualFilter(list[0] , list[1]);
        }else if(input.contains(">") && !input.contains("=")){
            String[] list = input.split(">");
            GreaterFilter greater = new GreaterFilter(list[0],list[1]);
        }else if(input.contains("<") && input.contains("=")){
            String[] list = input.split("<=");
            LessOrEqualFilter lessequal= new LessOrEqualFilter(list[0],list[1]);
        }else if(input.contains("<") && !input.contains("=")){
            String[] list = input.split("<");
            LessFilter less = new LessFilter(list[0],list[1]);
        }else{
            System.out.println("please enter a right query or press -h for more help");
        }
        return new EqualFilter();
    }

}
