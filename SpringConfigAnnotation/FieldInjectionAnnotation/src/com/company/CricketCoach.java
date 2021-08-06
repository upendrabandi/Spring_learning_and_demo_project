package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{
    @Autowired
    FortuneService fortuneService;

    @Override
    public String getDailyWorkOut() {
        return "cricket coach daily workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
