package com.java.cleber.lecheta.oop.emmaus;

public enum MemoryTypeEnum {
    _8MB("FPM-(Fast page mode RAM)", 1990),
    _32MB("EDO RAM (Extended data operations read-only memory)", 1994),
    _128MB("SDRAM (Single dynamic RAM)", 1996),
    _256MB("RDRAM (Rambus RAM)", 1998),
    _1GB("DDR (Double Data Rate)", 2000),
    _4GB("DDR2", 2003),
    _8GB("DDR3", 2007),
    _16GB("DDR4", 2012);

    MemoryTypeEnum(String ramType, int launchYear) {
        this.ram = ramType;
        this.year = launchYear;
    }

    private String ram;
    private int year;

    public String getKey() {
        return name();
    }
    public String getRam() {
        return this.ram;
    }
    public int getYear() { return this.year; }

    public String toString() {
        return this.getKey() + " total amount of memory, type: " + this.getRam();
    }
}