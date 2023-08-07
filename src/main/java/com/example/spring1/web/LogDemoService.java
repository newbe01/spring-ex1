package com.example.spring1.web;

import com.example.spring1.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LogDemoService {

    private final MyLogger myLogger;

    public void logic(String id) {

        myLogger.log("service id = " + id);

    }

}
