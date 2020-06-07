package puc.es.pm.ramenapp.utils;

public class Logger {
    private static final String FORMAT = "[%s]: %s";

    private String prefix;

    public Logger(String prefix) {
        this.prefix = prefix;
    }

    public void log(String message) {
        System.out.println(String.format(FORMAT, prefix, message));
    }
}
