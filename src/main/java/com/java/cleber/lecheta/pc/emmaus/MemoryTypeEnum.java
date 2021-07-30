package com.java.cleber.lecheta.pc.emmaus;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public enum MemoryTypeEnum {
    FPM("Fast page mode RAM 25Mhz", 1990),
    EDO_RAM("Extended data operations read-only memory 40Mhz", 1994),
    SDRAM("Single dynamic RAM 133Mhz", 1996),
    RDRAM("Rambus RAM 400Mhz", 1998),
    DDR("(Double Data Rate) 266 MHz", 2000),
    DDR2("533 MHz", 2003),
    DDR3("800 MHz", 2007),
    DDR4("1600 MHz", 2012);

    private final String description;
    private final int year;
    MemoryTypeEnum(String description, int launchYear) {
        this.description = description;
        this.year = launchYear;
    }

    public String getKey() {
        return name();
    }

    public String getDescription() {
        return this.description;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.getDescription();
    }
}