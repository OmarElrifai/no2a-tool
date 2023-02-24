package com.vbs.no2a.invoker;

import com.vbs.no2a.Commands.*;
import com.vbs.no2a.Interfaces.ICommand;
import org.apache.commons.cli.*;

import static com.vbs.no2a.Commands.Optionss.*;

public class Invoker {
    CommandLine cmd;
    Options opt;
    public Invoker(CommandLine cmd ,Options opt) {
        this.opt = opt;
        this.cmd = cmd;
    }

    ICommand Export = new Export();
    ICommand Import = new Importt();
    ICommand Recover = new Recover();
    ICommand ListC = new ListC();
    ListD listD = new ListD();
    ICommand Identifier = new ListD.identifier();
    ICommand IdentifierV = new ListD.identifierV();
    ICommand Operator = new ListD.Operator();
    ICommand opV = new ListD.opV();
//    ICommand Help = new Help();
    public void setExecute(Optionss ts) {

    for (Option o: cmd.getOptions()) {
        if(getDb().equals(o)){
            System.out.println("db: " + o.getValue());
        }else if (getExport().equals(o)) {

            Export.execute(o);

        } else if (getImport().equals(o)) {

            Import.execute(o);

        } else if (getRecover().equals(o)) {

            Recover.execute(o);

        } else if (getListC().equals(o)) {

            ListC.execute(o);

        } else if (getIdentifier().equals(o)) {

            Identifier.execute(o);

        } else if (getIdentifierValue().equals(o)) {

            IdentifierV.execute(o);

        } else if (getOperator1().equals(o)) {

            Operator.execute(o);

        } else if (getOp1V().equals(o)) {

            opV.execute(o);

        } else {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("-help", opt);
        }
    }





    }


}
