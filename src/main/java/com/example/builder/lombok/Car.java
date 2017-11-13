package com.example.builder.lombok;

import lombok.Data;

/**
 * pros: minimal data class
 * cons: non fluent interface idiom
 * cons: mutable
 * cons: another ide plugin like xtend ...
*/
public @Data class Car {
    private int power;
    private int torque;
    private int gears;
    private String color;
}
