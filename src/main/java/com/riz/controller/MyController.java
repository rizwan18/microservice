package com.riz.controller;

import com.riz.bean.Person;
import com.riz.log.RizSlf4JLogging;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j
@RestController
public class MyController implements ErrorController {

    @Autowired
    private RizSlf4JLogging logging;

    @RequestMapping(value = "/info", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getResponse() {
        log.debug("application endpoint load ");
        Person person = logging.printPersonWithSlf4J();
        ResponseEntity responseEntity = new ResponseEntity(person, HttpStatus.OK);
        log.info("about to response {}", responseEntity);
        return responseEntity;
    }

    @RequestMapping(value = "/error")
    public String error() {
        return "Error Handling";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
