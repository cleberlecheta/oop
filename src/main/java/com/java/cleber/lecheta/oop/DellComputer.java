package com.java.cleber.lecheta.oop;

import com.java.cleber.lecheta.oop.emmaus.ComputerTypeEnum;
import com.java.cleber.lecheta.oop.emmaus.CpuTypeEnum;
import com.java.cleber.lecheta.oop.emmaus.MemoryTypeEnum;

/**
 * Abstract class work as a default model to heritage, can't be directly instantiate
 * The methods in here must be override in the concrete subclass
 */
public abstract class DellComputer implements Computer {

    protected String topLine;
    protected String modelNumber;
    protected Boolean hasBuiltinScreen;

    private CpuTypeEnum cpu;
    private MemoryTypeEnum memory;
    private ComputerTypeEnum format;

    /** A println were added here to keep track whenever the super constructor is called */
    public DellComputer() {
        System.out.println("I love my computer it makes me feel alright?");
    }

    public DellComputer(ComputerTypeEnum format, CpuTypeEnum cpu, MemoryTypeEnum memory) {
        this.format = format;
        this.cpu = cpu;
        this.memory = memory;
        setHasBuiltinScreen();
    }

    @Override
    /** Each computer must define it's cpu */
    public CpuTypeEnum getCpu() {
        return cpu;
    }

    @Override
    public MemoryTypeEnum getMemory() {
        return memory;
    }

    @Override
    public ComputerTypeEnum getFormat() {
        return format;
    }

    public Boolean hasBuiltinScreen() {
        return hasBuiltinScreen;
    }

    private  void setHasBuiltinScreen() {
        if (this.getFormat() == ComputerTypeEnum.Desktop) {
            this.hasBuiltinScreen = false;
        }
        this.hasBuiltinScreen = true;
    }

    /** Define if this computer model is owners favorite type */
    public abstract Boolean isFavorite();

    @Override
    public String toString() {
        return getFormat() + " " + topLine + " " + modelNumber;
    }
}
