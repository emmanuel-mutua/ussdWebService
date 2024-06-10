package com.example.ussdWebService.controller;

import com.example.ussdWebService.service.UssdRoutingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

//RestController = Controller (Handle req and res) + ResponseBody ( return type of a method be writted direct to http response body)

@RestController
@CrossOrigin("*") //any domain can access
@RequiredArgsConstructor
public class UssdController {
    /**
     * @param text: This shows the user input. It is an empty string in the first notification of a session. After that, it concatenates all the user input within the session with a * until the session ends
     * @param sessionId: A unique value generated when the session starts and sent every time a mobile subscriber response has been received.
     * @param serviceCode: This is the USSD code assigned to your application
     * @param phoneNumber: The number of mobile subscribers interacting with your ussd application.
     * @throws IOException
     * @return
     **/

    private final UssdRoutingService ussdRoutingService;
    @PostMapping(path = "ussd")
    public String ussdIngress(@RequestParam String sessionId, @RequestParam String serviceCode,
                              @RequestParam String phoneNumber, @RequestParam String text)  {
        // forward to the service layer
        return ussdRoutingService.menuLevelRouter(sessionId, serviceCode, phoneNumber, text);
    }

}
