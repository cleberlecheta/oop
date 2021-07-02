package com.java.cleber.lecheta.oop;

import com.java.cleber.lecheta.oop.emmaus.ComputerTypeEnum;
import com.java.cleber.lecheta.oop.emmaus.CpuTypeEnum;
import com.java.cleber.lecheta.oop.emmaus.MemoryTypeEnum;

/** Interfaces forces classes to have some common methods and/or attributes */
public interface Computer {

    /** all attributes in a interface are final, and so cannot be changed
     * {@link https://pt.wikipedia.org/wiki/X86} */
    public String architecture = "x86_x64";

    /** all classes that inherit from Computer will have to implement the interface methods */
    public ComputerTypeEnum getFormat();

    /** all methods in a interface must be public */
    public CpuTypeEnum getCpu();

    public MemoryTypeEnum getMemory();

}
