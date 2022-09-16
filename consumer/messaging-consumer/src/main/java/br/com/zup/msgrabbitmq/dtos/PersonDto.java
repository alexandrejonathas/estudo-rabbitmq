package br.com.zup.msgrabbitmq.dtos;

import java.io.Serializable;

public class PersonDto implements Serializable {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
}
