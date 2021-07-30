package com.java.cleber.lecheta.oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class NotebookInspiron14Test {

    DellComputer inspironNotebook;

    @BeforeEach
    public void init() {
        this.inspironNotebook = new NotebookInspiron14();
    }

    @Test
    void produceRightVendorName() {
        String expected = "Notebook Inspiron 14 5000";
        assertEquals(expected, inspironNotebook.toString(), "description must be exact site vendor model");
    }

    @Test
    void hasCoreComponents() {
        assertNotNull(inspironNotebook.getCpu(), "must have cpu");
        assertNotNull(inspironNotebook.getMemory(), "must have memory");
    }

    @Test
    void hasConfiguredComponents() {
        String expectedCpu = "CORE_i7 Intel x64 - 8th Gen";
        assertEquals(expectedCpu, inspironNotebook.getCpu().toString(), "cpu must match the configuration");
        String expectedMemory = "16MB/GB of DDR4 1600 MHz";
        assertEquals(expectedMemory, inspironNotebook.getMemory().toString(), "memory must match the configuration");
    }

}
