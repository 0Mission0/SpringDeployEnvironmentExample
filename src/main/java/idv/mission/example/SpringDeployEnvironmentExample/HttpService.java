package idv.mission.example.SpringDeployEnvironmentExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HttpService {

    @Value("${url}")
    private String url;

    public void connect() {
        System.out.println("connect to " + url);
    }

}
