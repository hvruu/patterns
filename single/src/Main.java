public class Main {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("123");
        ProgramLogger.getProgramLogger().addLogInfo("321");
        ProgramLogger.getProgramLogger().addLogInfo("5436");
        ProgramLogger.getProgramLogger().addLogInfo("4385");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}