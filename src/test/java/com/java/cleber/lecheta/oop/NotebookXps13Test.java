package com.java.cleber.lecheta.oop;

import com.java.cleber.lecheta.pc.emmaus.ComputerTypeEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class NotebookXps13Test {

    static DellComputer xpsNotebook;

    @BeforeAll
    static void init() {
        xpsNotebook = new NotebookXps13();
        System.out.println("TESTED COMPUTER");
        System.out.println("--------------------------------------");
    }

    //Tests for: Computer Interface

    @Test
    void architecture() {
        assertNotNull(xpsNotebook.architecture,
                "Computer Interface must have a pre defined architecture");
        assertEquals(xpsNotebook.architecture, "x86_x64");
        System.out.println("architecture: " + xpsNotebook.architecture);
    }

    @Test
    void getFormat() {
        ComputerTypeEnum expected = ComputerTypeEnum.Notebook;
        assertNotNull(xpsNotebook.getFormat(), "Computer Interface demands format to be implemented");
        assertEquals(expected, xpsNotebook.getFormat(), "this computer must match Notebook format");
        System.out.println("format: " + xpsNotebook.getFormat().toString());
    }

    @Test
    void getCpu() {
        String expected = "CORE_i7 Intel x64 - 11th Gen";
        assertNotNull(xpsNotebook.getCpu(), "Computer interface demands to have a cpu");
        assertEquals(expected, xpsNotebook.getCpu().toString(), "cpu must match model's cpu");
        System.out.println("cpu: " + xpsNotebook.getCpu().toString());
    }

    @Test
    void getMemory() {
        String expected = "16MB/GB of DDR4 1600 MHz";
        assertNotNull(xpsNotebook.getMemory(), "Computer interface demands to have memory");
        assertEquals(expected, xpsNotebook.getMemory().toString());
        System.out.println("memory: " + xpsNotebook.getMemory().toString());
    }

    //Tests for: Dell Computer

    @Test
    void vendorName() {
        String expected = "Notebook XPS 13";
        assertNotNull(xpsNotebook.baseLine,
                "DellComputer must specify the baseline as part of vendor name");
        assertNotNull(xpsNotebook.modelNumber,
                "DellComputer must specify the model number as part of vendor name");
        assertEquals(expected, xpsNotebook.toString(), "description must be exact site vendor model");
        System.out.println("vendor name: " + xpsNotebook.toString());
    }

    @Test
    void builtinScreen() {
        assertNotNull(xpsNotebook.hasBuiltinScreen);
        assertTrue(xpsNotebook.hasBuiltinScreen, "notebook must have a built-in screen");
        System.out.println("built-in screen: " + xpsNotebook.hasBuiltinScreen);
    }


}
