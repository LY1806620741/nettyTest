import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.net.ssl.SSLException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class HttpSnoopClientTest {
    @Test
    @DisplayName("探测http测试")
    void clienttest() throws InterruptedException, SSLException, URISyntaxException {
        HttpSnoopClient httpSnoopClient = new HttpSnoopClient();
        httpSnoopClient.init();
    }

}