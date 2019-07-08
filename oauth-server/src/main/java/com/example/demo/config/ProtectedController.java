/**
 * 
 */
package com.example.demo.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wahid
 *
 */
@Controller
public class ProtectedController {
	
	Logger log = LogManager.getLogger(ProtectedController.class);

	@GetMapping("/resource")
	public String resource() {
		log.info("hh");
		return "resource";
	}
	
	@GetMapping("/success")
	public String success() {
		log.info("success");
		return "success";
	}
	
	@GetMapping("/fail")
	public String fail() {
		log.info("fail");
		return "fail";
	}
}
