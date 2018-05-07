package com.mybitauto;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Component
public class EurekaController {

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    @LoadBalanced
    private RestTemplate loadBalanced;

    @GetMapping("/getinfo")
    public String getInstainfo(){
        InstanceInfo info = eurekaClient.getNextServerFromEureka("client-01", false);

        String str = loadBalanced.getForObject("http://client-01/hello" , String.class);

        return  str;
    }


}
