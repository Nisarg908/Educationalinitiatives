package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerUtil {
    private static final String LOG_FILE = "app.log";

    public static void log(String message) {
        try (PrintWriter out = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            out.println(LocalDateTime.now() + ": " + message);
        } catch (IOException e) {
            System.out.println("Error writing to log file.");
        }
    }
}
