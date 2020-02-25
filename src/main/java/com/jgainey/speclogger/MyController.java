package com.jgainey.speclogger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


//The called URL will look like https://<TRACKINGAPP-FQDN>/start?count=10000&word=KEYWORD

@Controller
public class MyController {

    @RequestMapping(method = RequestMethod.GET, value = "/start", produces = "application/json")
    public void blaston(@RequestParam(value = "sleeptime", defaultValue = "50") int sleeptime,
                        @RequestParam(value = "count", defaultValue = "100") int count,
                        @RequestParam(value = "word", defaultValue = "YODACOUNTER") String word){


        for(int i = 0 ; i< count ; i++){
            try {
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Utils.logInfo(word+","+ i + ",");
        }

    }
}
