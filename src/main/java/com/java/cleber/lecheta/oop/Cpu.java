package com.java.cleber.lecheta.oop;

import com.java.cleber.lecheta.oop.emmaus.CpuGenEnum;
import com.java.cleber.lecheta.oop.emmaus.CpuTypeEnum;

/**
 * oop - 07/2021
 *
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Cpu {
    private CpuTypeEnum type;
    private CpuGenEnum generation;

    public Cpu(CpuTypeEnum cpuTypeEnum, CpuGenEnum cpuGenEnum) {
        this.type = cpuTypeEnum;
        this.generation = cpuGenEnum;
    }

    @Override
    public String toString() {
        return type.toString() + " - " + generation.toString();
    }

}
