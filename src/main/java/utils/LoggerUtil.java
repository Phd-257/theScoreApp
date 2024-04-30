package utils;

import java.util.logging.Logger;

public class LoggerUtil {
    private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());

    public static void info(String message) {
        logger.info(message);
    }

}
