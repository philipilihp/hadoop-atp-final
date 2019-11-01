package de.philipilihp.hadoop.atp;

public class Entrypoint {

    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.err.println("Usage: <execution-type> <input-path> <output-path>");
            System.exit(-1);
        }

        String executionType = args[0].toLowerCase();
        String inputPath = args[1];
        String outputPath = args[2];

        TotalPointsCounter counter = new TotalPointsCounter();
        counter.run(inputPath, outputPath);
    }

}
