package learn.java.cleber.lecheta.oop;

import learn.java.cleber.lecheta.pc.emmaus.ComputerTypeEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class DesktopOptiPlexMicro3080Test {

    static DellComputer optiPlexDesktop;

    @BeforeAll
    static void init() {
        optiPlexDesktop = new DesktopOptiPlexMicro3080();
        System.out.println("TESTED COMPUTER");
        System.out.println("--------------------------------------");
    }

    //Tests for: Computer Interface

    @Test
    void architecture() {
        assertNotNull(optiPlexDesktop.architecture,
                "Computer Interface must have a pre defined architecture");
        assertEquals(optiPlexDesktop.architecture, "x86_x64");
        System.out.println("architecture: " + optiPlexDesktop.architecture);
    }

    @Test
    void getFormat() {
        ComputerTypeEnum expected = ComputerTypeEnum.Desktop;
        assertNotNull(optiPlexDesktop.getFormat(), "Computer Interface demands format to be implemented");
        assertEquals(expected, optiPlexDesktop.getFormat(), "this computer must match Notebook format");
        System.out.println("format: " + optiPlexDesktop.getFormat().toString());
    }

    @Test
    void getCpu() {
        String expected = "CORE_i3 Intel x64 - 10th Gen";
        assertNotNull(optiPlexDesktop.getCpu(), "Computer interface demands to have a cpu");
        assertEquals(expected, optiPlexDesktop.getCpu().toString(), "cpu must match model's cpu");
        System.out.println("cpu: " + optiPlexDesktop.getCpu().toString());
    }

    @Test
    void getMemory() {
        String expected = "8MB/GB of DDR4 1600 MHz";
        assertNotNull(optiPlexDesktop.getMemory(), "Computer interface demands to have memory");
        assertEquals(expected, optiPlexDesktop.getMemory().toString());
        System.out.println("memory: " + optiPlexDesktop.getMemory().toString());
    }

    //Tests for: Dell Computer

    @Test
    void vendorName() {
        String expected = "Desktop OptiPlex Micro 3080";
        assertNotNull(optiPlexDesktop.baseLine,
                "DellComputer must specify the baseline as part of vendor name");
        assertNotNull(optiPlexDesktop.modelNumber,
                "DellComputer must specify the model number as part of vendor name");
        assertEquals(expected, optiPlexDesktop.toString(), "description must be exact site vendor model");
        System.out.println("vendor name: " + optiPlexDesktop.toString());
    }

    @Test
    void builtinScreen() {
        assertNotNull(optiPlexDesktop.hasBuiltinScreen);
        assertFalse(optiPlexDesktop.hasBuiltinScreen, "desktop is sold without a built-in screen");
        System.out.println("built-in screen: " + optiPlexDesktop.hasBuiltinScreen);
    }

}
