package Core.Utils;

import Core.Enums.TestState;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.OutputType;

public class ScreenshotUtils {

    public static void makeScreenshot(TestState state, String msg) {
        var screenshot = Selenide.screenshot(OutputType.FILE);
        LoggingUtils.log(state, screenshot, msg);
    }

    public static void makeScreenshot(String msg) {
        makeScreenshot(TestState.NORMAL, msg);
    }

    public static void makeScreenshot() {
        makeScreenshot(TestState.NORMAL, "");
    }
}
