package osrc.jsmo.model;

import lombok.Builder;

import java.net.URL;
@Builder
public class TCPConfiguration {
    private URL url;
    private boolean ackIsRequired;

    public Integer getPort() {
        return url.getPort();
    }
}
