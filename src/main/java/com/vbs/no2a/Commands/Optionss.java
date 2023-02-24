package com.vbs.no2a.Commands;

import org.apache.commons.cli.*;

public class Optionss {
    public CommandLine cmd;
    public Options options;
    private static Option db;
    private static Option Export;
    private static Option Import;
    private static Option Recover;
    private static Option ListC;
    private static Option Identifier;
    private static Option IdentifierValue;
    private static Option operator1;
    private static Option op1V;

    public Optionss(String args[]) {

        Options options = new Options();
        Option db = Option.builder()
                .longOpt("db")
                .hasArg(true)
                .argName("dbName")
                .desc("Nitrite db")
                .build();
        Option Export = Option.builder()
                .longOpt("exp")
                .hasArg(false)
                .desc("Exported db file")
                .build();
        Option Import = Option.builder()
                .longOpt("imp")
                .hasArg(false)
                .desc("Imported db file")
                .build();
        Option Recover = Option.builder()
                .longOpt("rcvr")
                .hasArg(false)
                .desc("recovered db file")
                .build();
        Option ListCollections = Option.builder()
                .longOpt("ListC")
                .argName("ListCollection")
                .hasArg()
                .desc("List collections of db file")
                .build();
        Option Identifier = Option.builder()
                .longOpt("identifier")
                .argName("identifier")
                .hasArg()
                .desc("identifier")
                .build();
        Option IdentifierValue = Option.builder()
                .longOpt("identifierV")
                .argName("identifierV")
                .hasArg()
                .desc("identifierV")
                .build();
        Option op = Option.builder()
                .longOpt("op")
                .argName("operator1")
                .hasArg()
                .desc("operator1")
                .build();
        Option opV = Option.builder()
                .longOpt("opV")
                .argName("op1V")
                .hasArg()
                .desc("op1V")
                .build();
        Option help = Option.builder()
                .longOpt("help")
                .argName("help")
                .hasArg()
                .desc("help")
                .build();
//
        options.addOption(db)
                .addOption(Export)
                .addOption(Import)
                .addOption(Recover)
                .addOption(ListCollections)
                .addOption(Identifier)
                .addOption(IdentifierValue)
                .addOption(op)
                .addOption(opV);



        this.cmd = handler(args , options);
        this.options = options;
        this.db = db;
        this.Export = Export;
        this.Import = Import;
        this.ListC = ListCollections;
        this.Identifier = Identifier;
        this.IdentifierValue = IdentifierValue;
        this.operator1 = op;
        this.op1V = opV;
        this.Recover = Recover;
    }

    public CommandLine handler(String[] args, Options opt){
        try {
            CommandLineParser parser = new DefaultParser();
            CommandLine cmd1 = parser.parse(opt,args);
            return cmd1;
        } catch (ParseException e){
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("-help", opt);
            return null;
        }

    }
    public static Option getDb() {
        return db;
    }

    public static Option getExport() {
        return Export;
    }

    public static Option getImport() {
        return Import;
    }

    public static Option getRecover() {
        return Recover;
    }

    public static Option getListC() {
        return ListC;
    }

    public static Option getIdentifier() {
        return Identifier;
    }

    public static Option getIdentifierValue() {
        return IdentifierValue;
    }

    public static Option getOperator1() {
        return operator1;
    }

    public static Option getOp1V() {
        return op1V;
    }

}
