package learn.java.cleber.lecheta.oop;

import learn.java.cleber.lecheta.pc.emmaus.ComputerTypeEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class NotebookInspiron14Test {

    static DellComputer inspironNotebook;

    @BeforeAll
    static void init() {
        inspironNotebook = new NotebookInspiron14();
        System.out.println("TESTED COMPUTER");
        System.out.println("--------------------------------------");
    }

    //Tests for: Computer Interface

    @Test
    void architecture() {
        assertNotNull(inspironNotebook.architecture,
                "Computer Interface must have a pre defined architecture");
        assertEquals(inspironNotebook.architecture, "x86_x64");
        System.out.println("architecture: " + inspironNotebook.architecture);
    }

    @Test
    void getFormat() {
        ComputerTypeEnum expected = ComputerTypeEnum.Notebook;
        assertNotNull(inspironNotebook.getFormat(), "Computer Interface demands format to be implemented");
        assertEquals(expected, inspironNotebook.getFormat(), "this computer must match Notebook format");
        System.out.println("format: " + inspironNotebook.getFormat().toString());
    }

    @Test
    void getCpu() {
        String expected = "CORE_i7 Intel x64 - 8th Gen";
        assertNotNull(inspironNotebook.getCpu(), "Computer interface demands to have a cpu");
        assertEquals(expected, inspironNotebook.getCpu().toString(), "cpu must match model's cpu");
        System.out.println("cpu: " + inspironNotebook.getCpu().toString());
    }

    @Test
    void getMemory() {
        String expected = "16MB/GB of DDR4 1600 MHz";
        assertNotNull(inspironNotebook.getMemory(), "Computer interface demands to have memory");
        assertEquals(expected, inspironNotebook.getMemory().toString());
        System.out.println("memory: " + inspironNotebook.getMemory().toString());
    }

    //Tests for: Dell Computer

    @Test
    void vendorName() {
        String expected = "Notebook Inspiron 14 5000";
        assertNotNull(inspironNotebook.baseLine,
                "DellComputer must specify the baseline as part of vendor name");
        assertNotNull(inspironNotebook.modelNumber,
                "DellComputer must specify the model number as part of vendor name");
        assertEquals(expected, inspironNotebook.toString(), "description must be exact site vendor model");
        System.out.println("vendor name: " + inspironNotebook.toString());
    }

    @Test
    void builtinScreen() {
        assertNotNull(inspironNotebook.hasBuiltinScreen);
        assertTrue(inspironNotebook.hasBuiltinScreen, "notebook must have a built-in screen");
        System.out.println("built-in screen: " + inspironNotebook.hasBuiltinScreen);
    }


}
