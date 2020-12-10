package com.niosama.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/hello")
    public String index(){
//        List<InstanceInfo> instances = client.getInstancesById(registration.getServiceId());
//        if(!CollectionUtils.isEmpty(instances)){
//        }
//        InstanceInfo.InstanceStatus status = client.getInstanceRemoteStatus();
        return "Hello World";
    }

//    public ServiceInstance serviceInstance() {
//        client.getInstancesById(registration.getServiceId())
//        List<ServiceInstance> list = client.getInstancesById(registration.getServiceId());
//        if (list != null && list.size() > 0) {
//            for(ServiceInstance itm : list){
//                if(itm.getPort() == 2001)
//                    return itm;
//            }
//        }
//        return null;
//    }
}
