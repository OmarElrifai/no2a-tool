package com.vbs.no2a.Commands;

import com.vbs.no2a.Interfaces.ICommand;
import org.apache.commons.cli.Option;

public class ListC implements ICommand {



    @Override
    public void execute(Option opt) {

                System.out.println("Collection: "+ opt.getValue());

    }
}
