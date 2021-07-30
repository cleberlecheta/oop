package com.java.cleber.lecheta.pc;

import com.java.cleber.lecheta.pc.emmaus.CpuGenEnum;
import com.java.cleber.lecheta.pc.emmaus.CpuTypeEnum;

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
