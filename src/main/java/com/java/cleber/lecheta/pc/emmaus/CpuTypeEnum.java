package com.java.cleber.lecheta.pc.emmaus;

public enum CpuTypeEnum {
    Pentium("Intel x86"),
    CORE_i3("Intel x64"),
    CORE_i5("Intel x64"),
    CORE_i7("Intel x64"),
    CORE_i9("Intel x64");

    CpuTypeEnum(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private String manufacturer;

    public String getKey() {
        return name();
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public String toString() {
        return this.getKey() + " " + this.getManufacturer();
    }
}