package com.riz.log;

import com.riz.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RizSlf4JLogging {

    public Person printPersonWithSlf4J() {
        Person person = new Person();
        person.setAge(10);
        person.setName("Sunny");

        log.trace("trace: name: " + person.getName() + " age: " + person.getAge());
        log.debug("debug: name: " + person.getName() + " age: " + person.getAge());
        log.info("info: name: " + person.getName() + " age: " + person.getAge());
        log.warn("warn: name: " + person.getName() + " age: " + person.getAge());
        log.error("error: name: " + person.getName() + " age: " + person.getAge());

        return person;
    }
}
