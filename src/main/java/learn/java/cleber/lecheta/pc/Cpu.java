package learn.java.cleber.lecheta.pc;

import learn.java.cleber.lecheta.pc.emmaus.CpuGenEnum;
import learn.java.cleber.lecheta.pc.emmaus.CpuTypeEnum;

/**
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
