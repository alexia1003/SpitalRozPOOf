package SpitalRoz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    private static final String LOG_FILE_PATH = "application.log";

    public static void log(String message) {
        System.out.println(message);
        writeToFile(message);
    }

    private static void writeToFile(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true))) {
            String log = "[" + LocalDateTime.now() + "] " + message;
            writer.write(log);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
