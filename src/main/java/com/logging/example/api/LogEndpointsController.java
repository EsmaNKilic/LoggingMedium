package com.logging.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/log")
public class LogEndpointsController {
	 
	 @GetMapping
	    public String getDetails() {
		 
		 log.info("get details method started");
		 
		 return internalLogDetail();
	    }
	 

	 private String internalLogDetail() {
		 
		 try {
			 log.debug("internalLogDetail method started");
			 
			 Thread.sleep(1000); // 1 ms bekleyip öyle cevap versin. 
			 
			 return "API Mesajı";
			 
	     }catch (InterruptedException e) { 
	    // "sleep" üzerine gelirseniz hata "interruptedException" fırlattığını görürüz. Değiştirdik.
	    	 
	    	 log.error("error : {}", e);
	     }
		 
		return null;
	 }
}
