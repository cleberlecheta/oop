package com.java.cleber.lecheta.oop;

import com.java.cleber.lecheta.pc.emmaus.ComputerTypeEnum;
import com.java.cleber.lecheta.pc.emmaus.CpuGenEnum;
import com.java.cleber.lecheta.pc.emmaus.CpuTypeEnum;
import com.java.cleber.lecheta.pc.emmaus.MemoryTypeEnum;
import com.java.cleber.lecheta.pc.Cpu;
import com.java.cleber.lecheta.pc.Memory;

public class NotebookInspiron14 extends DellComputer {

    private Cpu cpu;
    private Memory memory;

    public NotebookInspiron14() {
        super(ComputerTypeEnum.Notebook);
        this.baseLine = "Inspiron";
        this.modelNumber = "14 5000";
        this.cpu = new Cpu(CpuTypeEnum.CORE_i7, CpuGenEnum.EIGHT);
        this.memory = new Memory(MemoryTypeEnum.DDR4, 16);
    }

    @Override
    public Boolean isFavorite() {
        return null;
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
