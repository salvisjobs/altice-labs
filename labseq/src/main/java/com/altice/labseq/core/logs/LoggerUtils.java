package com.altice.labseq.core.logs;

import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;

public class LoggerUtils {

    private LoggerUtils() {}

    public static void info(Logger logger, LogEvent event, LogType type, String message, Object... args) {
        handleLog(logger, event, LogLevel.INFO, type, message, args);
    }

    public static void error(Logger logger, LogEvent event, LogType type, String message, Object... args) {
        handleLog(logger, event, LogLevel.ERROR, type, message, args);
    }

    private static void handleLog(Logger logger, LogEvent event, LogLevel level, LogType type, String message,
                                  Object... args) {

        ThreadContext.put("log.event", event.name());
        ThreadContext.put("log.type", type.name());
        if (level == LogLevel.INFO) {
            logger.info(message, args);
        }
        if (level == LogLevel.ERROR) {
            logger.error(message, args);
        }
        ThreadContext.clearAll();
    }

}

enum LogLevel {
    INFO,
    ERROR,
}
