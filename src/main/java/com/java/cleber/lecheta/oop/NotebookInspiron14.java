package com.java.cleber.lecheta.oop;

import com.java.cleber.lecheta.oop.emmaus.ComputerTypeEnum;
import com.java.cleber.lecheta.oop.emmaus.CpuTypeEnum;
import com.java.cleber.lecheta.oop.emmaus.MemoryTypeEnum;

public class NotebookInspiron14 extends DellComputer {

    public NotebookInspiron14() {
        super(ComputerTypeEnum.Notebook, CpuTypeEnum.CORE_i7, MemoryTypeEnum._16GB);
        this.topLine = "Inspiron";
        this.modelNumber = "14 5000";
    }

    @Override
    public Boolean isFavorite() {
        return null;
    }
}
