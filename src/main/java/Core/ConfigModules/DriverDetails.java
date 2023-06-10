package Core.ConfigModules;

public class DriverDetails {

    private String downloadDir;
    private long timeout;
    private String appURL;
    private String browserWindowSize;

    public String getDownloadDir() {
        return downloadDir;
    }

    public void setDownloadDir(String downloadDir) {
        this.downloadDir = downloadDir;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public String getAppURL() {
        return appURL;
    }

    public void setAppURL(String appURL) {
        this.appURL = appURL;
    }

    public String getBrowserWindowSize() {
        return browserWindowSize;
    }

    public void setBrowserWindowSize(String browserWindowSize) {
        this.browserWindowSize = browserWindowSize;
    }
}
