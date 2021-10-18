package main.java.com.tattookot.patterns.youtube.singleton;

public class ProgramLogger {
    private static ProgramLogger logger;
    private static String logFile = "This is log file \n\n";

    public static synchronized ProgramLogger getProgramLogger(){
        if(logger == null){
            logger = new ProgramLogger();
        }
        return logger;
    }

    private ProgramLogger(){

    }

    public void addLogInfo(String info){
        logFile += info + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
