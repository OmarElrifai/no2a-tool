package com.vbs.no2a.Commands;

import com.vbs.no2a.Interfaces.ICommand;
import org.apache.commons.cli.Option;

public class ListD {


    public static class identifier implements ICommand{
        @Override
        public void execute(Option opt) {
          System.out.println(opt.getValue());
        }
    }

    public static class identifierV implements ICommand{
        @Override
        public void execute(Option opt) {
            System.out.println(opt.getValue());
        }
    }

    public static class Operator implements ICommand{
        @Override
        public void execute(Option opt) {
            System.out.println(opt.getValue());
        }
    }

    public static class opV implements ICommand{
        @Override
        public void execute(Option opt) {
            System.out.println(opt.getValue());
        }
    }

}
