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
public class NotebookXps13 extends DellComputer {

    private Cpu cpu;
    private Memory memory;

    public NotebookXps13() {
        super(ComputerTypeEnum.Notebook, "XPS", "13");
        this.cpu = new Cpu(CpuTypeEnum.CORE_i7, CpuGenEnum.ELEVEN);
        this.memory = new Memory(MemoryTypeEnum.DDR4, 16);
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
