package learn.java.cleber.lecheta.oop;

import learn.java.cleber.lecheta.pc.emmaus.ComputerTypeEnum;
import learn.java.cleber.lecheta.pc.emmaus.CpuGenEnum;
import learn.java.cleber.lecheta.pc.emmaus.CpuTypeEnum;
import learn.java.cleber.lecheta.pc.emmaus.MemoryTypeEnum;
import learn.java.cleber.lecheta.pc.Cpu;
import learn.java.cleber.lecheta.pc.Memory;

/**
 * Dell Notebook Inspiron 14 5000 concrete class implementation
 *
 * Heritage: This is a subclass of Superclass DellComputer
 *
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class NotebookInspiron14 extends DellComputer {

    private Cpu cpu;
    private Memory memory;

    public NotebookInspiron14() {
        super(ComputerTypeEnum.Notebook, "Inspiron", "14 5000");
        this.cpu = new Cpu(CpuTypeEnum.CORE_i7, CpuGenEnum.EIGHT);
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
