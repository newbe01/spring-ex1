package com.example.spring1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Lombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        Lombok lombok = new Lombok();
        lombok.setName("name");

        System.out.println("lombok = " + lombok);
    }

}
