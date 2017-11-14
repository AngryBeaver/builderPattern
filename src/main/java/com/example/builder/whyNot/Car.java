package com.example.builder.whyNot;


/**
 * Why should setter and getter be better ?
 * pros: absolute minimum
 * cons: non fluent interface idiom
 * cons: mutable
 */
public class Car {
    public int power;
    public int torque;
    public int gears;
    public String color;
}


/**
 * CleanCodeDeveloper YellowGrade: Information Hiding Principle
 * Remember setters exists so they not only set things, they validate, trigger events etc.
 * public is public forever we do not always have control over implementing
 * classes so adding validation, trigers etc at a later point will fail without refactoring.
 */
