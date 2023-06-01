package exceptions.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingTest {
    private static Logger logger = Logger.getLogger(LoggingTest.class.getName());
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("files/log.txt");
        logger.addHandler(fileHandler);

        try {
            throw new Exception("Ndodhi gabimi");
        }catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage());
        }
    }
}
