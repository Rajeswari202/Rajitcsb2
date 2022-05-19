package flipkart.com.controller;

import org.springframework.web.bind.annotation.GetMapping;



import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageApi {
    
	@GetMapping(value = "/mymessage")
     String Message() {
	     return "my first spring program";
}

}
