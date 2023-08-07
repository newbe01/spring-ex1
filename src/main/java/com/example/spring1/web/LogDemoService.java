package com.example.spring1.web;

import com.example.spring1.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LogDemoService {

//    private final ObjectProvider<MyLogger> myLoggerProvider;
    private final MyLogger myLogger;

    public void logic(String id) {

//        MyLogger myLogger = myLoggerProvider.getObject();
        myLogger.log("service id = " + id);

    }

}
