package com.java.cleber.lecheta.oop.emmaus;

public enum CpuTypeEnum {
    Pentium("7th Gen"),
    CORE_i3("8th Gen"),
    CORE_i5("9th Gen"),
    CORE_i7("10th Gen"),
    CORE_i9("11th Gen");

    CpuTypeEnum(String generation) {
        this.generation = generation;
    }

    private String generation;

    public String getKey() {
        return name();
    }
    public String getGeneration() {
        return this.generation;
    }

    public String toString() {
        return this.getKey() + " " + this.getGeneration();
    }
}