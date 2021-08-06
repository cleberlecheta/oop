package com.java.cleber.lecheta.oop;

import com.java.cleber.lecheta.pc.Cpu;
import com.java.cleber.lecheta.pc.Memory;
import com.java.cleber.lecheta.pc.emmaus.ComputerTypeEnum;
import com.java.cleber.lecheta.pc.emmaus.CpuGenEnum;
import com.java.cleber.lecheta.pc.emmaus.CpuTypeEnum;
import com.java.cleber.lecheta.pc.emmaus.MemoryTypeEnum;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class NotebookXps13 extends DellComputer {

    private Cpu cpu;
    private Memory memory;

    public NotebookXps13() {
        super(ComputerTypeEnum.Notebook, "XPS", "13");
        this.cpu = new Cpu(CpuTypeEnum.CORE_i7, CpuGenEnum.ELEVEN);
        this.memory = new Memory(MemoryTypeEnum.DDR4, 16);
    }

    @Override
    public Cpu getCpu() {
        return this.cpu;
    }

    @Override
    public Memory getMemory() {
        return this.memory;
    }

}
