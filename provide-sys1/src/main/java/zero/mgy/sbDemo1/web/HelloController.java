package zero.mgy.sbDemo1.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    private DiscoveryClient client;
    @GetMapping("hello")
    public String index() {
        System.out.println("------"+ client.getServices());
        return "Hello World";
    }

}
