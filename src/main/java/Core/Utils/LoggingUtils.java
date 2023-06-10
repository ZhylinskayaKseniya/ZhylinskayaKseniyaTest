package Core.Utils;

import Core.Enums.TestState;
import com.epam.ta.reportportal.log4j.appender.ReportPortalLog4j2Appender;
import com.google.common.io.BaseEncoding;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class LoggingUtils {
    private static final Logger LOGGER = LogManager.getLogger(ReportPortalLog4j2Appender.class);

    public static void log(TestState state, File file, String message) {
        if (state.equals(TestState.NORMAL)) {
            LOGGER.info("RP_MESSAGE#FILE#" + file + "#" + message);
        } else {
            LOGGER.error("RP_MESSAGE#FILE#" + file + "#" + message);
        }
    }

    public static void log(byte[] bytes, String message) {
        LOGGER.info("RP_MESSAGE#BASE64#" + BaseEncoding.base64().encode(bytes) + "#" + message);
    }

    public static void log(String message) {
        LOGGER.info(message);
    }

    public static void log(Level logLevel, String message) {
        LOGGER.log(logLevel, message);
    }
}
