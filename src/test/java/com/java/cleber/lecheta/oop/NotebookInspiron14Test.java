package com.java.cleber.lecheta.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NotebookInspiron14Test {

    @Test
    void produceRightVendorName() {
        DellComputer inspironNotebook = new NotebookInspiron14();
        String expected = "Notebook Inspiron 14 5000";
        assertEquals(expected, inspironNotebook.toString());
    }

}
