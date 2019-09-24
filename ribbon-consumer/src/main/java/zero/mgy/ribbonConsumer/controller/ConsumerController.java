package zero.mgy.ribbonConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zero.mgy.ribbonConsumer.service.ConsumerService;

@RestController
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;

    @GetMapping("/ribbon-consumer1")
    public String helloConsumer() {
        return consumerService.helloConsumer();
    }


}
