package com.java.cleber.lecheta.oop;

import com.java.cleber.lecheta.pc.emmaus.ComputerTypeEnum;
import com.java.cleber.lecheta.pc.Cpu;
import com.java.cleber.lecheta.pc.Memory;

/**
 * Interfaces forces classes to have some common methods and/or attributes
 */
public interface Computer {

    /**
     * all attributes in a interface are final, and so cannot be changed
     * https://pt.wikipedia.org/wiki/X8
     */
    String architecture = "x86_x64";

    /**
     * all classes that inherit from Computer will have to implement the interface methods
     */
    ComputerTypeEnum getFormat();

    /**
     * all methods in a interface must be public
     */
    Cpu getCpu();

    Memory getMemory();

}
