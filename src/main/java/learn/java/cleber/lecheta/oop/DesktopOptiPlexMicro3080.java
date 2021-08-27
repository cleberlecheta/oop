package learn.java.cleber.lecheta.oop;

import learn.java.cleber.lecheta.pc.Cpu;
import learn.java.cleber.lecheta.pc.Memory;
import learn.java.cleber.lecheta.pc.emmaus.ComputerTypeEnum;
import learn.java.cleber.lecheta.pc.emmaus.CpuGenEnum;
import learn.java.cleber.lecheta.pc.emmaus.CpuTypeEnum;
import learn.java.cleber.lecheta.pc.emmaus.MemoryTypeEnum;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class DesktopOptiPlexMicro3080 extends DellComputer {

    private Cpu cpu;
    private Memory memory;

    public DesktopOptiPlexMicro3080() {
        super(ComputerTypeEnum.Desktop, "OptiPlex", "Micro 3080");
        this.cpu = new Cpu(CpuTypeEnum.CORE_i3, CpuGenEnum.TEN);
        this.memory = new Memory(MemoryTypeEnum.DDR4, 8);
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
