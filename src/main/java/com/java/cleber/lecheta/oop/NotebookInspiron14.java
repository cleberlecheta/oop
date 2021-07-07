package com.java.cleber.lecheta.oop;

import com.java.cleber.lecheta.oop.emmaus.ComputerTypeEnum;
import com.java.cleber.lecheta.oop.emmaus.CpuGenEnum;
import com.java.cleber.lecheta.oop.emmaus.CpuTypeEnum;
import com.java.cleber.lecheta.oop.emmaus.MemoryTypeEnum;

public class NotebookInspiron14 extends DellComputer {

    private Cpu cpu;
    private Memory memory;

    public NotebookInspiron14() {
        super(ComputerTypeEnum.Notebook);
        this.topLine = "Inspiron";
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
