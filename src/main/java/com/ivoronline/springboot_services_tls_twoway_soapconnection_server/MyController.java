package com.ivoronline.springboot_services_tls_twoway_soapconnection_server;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //===============================================================================
  // ECHO
  //===============================================================================
  @RequestMapping("Echo")
  String echo(@RequestBody String requestSOAP) {
    return requestSOAP;
  }

}

