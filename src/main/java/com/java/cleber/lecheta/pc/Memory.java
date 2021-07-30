package com.java.cleber.lecheta.pc;

import com.java.cleber.lecheta.pc.emmaus.MemoryTypeEnum;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Memory {

    private MemoryTypeEnum type;
    private int quantity;

    public Memory(MemoryTypeEnum typeEnum) {
        this.type = typeEnum;
    }

    public Memory(MemoryTypeEnum typeEnum, int quantity) {
        this.type = typeEnum;
        this.setQuantity(quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (type == MemoryTypeEnum.FPM) {
            if (quantity > 8) {
                throwExceedsMaximumMemoryError(quantity);
            }
        } else if (type == MemoryTypeEnum.EDO_RAM) {
            if (quantity > 32) {
                throwExceedsMaximumMemoryError(quantity);
            }
        } else if (type == MemoryTypeEnum.SDRAM) {
            if (quantity > 128) {
                throwExceedsMaximumMemoryError(quantity);
            }
        } else if (type == MemoryTypeEnum.RDRAM) {
            if (quantity > 256) {
                throwExceedsMaximumMemoryError(quantity);
            }
        } else if (type == MemoryTypeEnum.DDR) {
            if (quantity > 4) {
                throwExceedsMaximumMemoryError(quantity);
            }
        } else if (type == MemoryTypeEnum.DDR2) {
            if (quantity > 8) {
                throwExceedsMaximumMemoryError(quantity);
            }
        } else if (type == MemoryTypeEnum.DDR3) {
            if (quantity > 16) {
                throwExceedsMaximumMemoryError(quantity);
            }
        } else if (type == MemoryTypeEnum.DDR4) {
            if (quantity > 64) {
                throwExceedsMaximumMemoryError(quantity);
            }
        }
        this.quantity = quantity;
    }

    private void throwExceedsMaximumMemoryError(int quantity) {
        throw new RuntimeException(quantity + "exceeds the maximum quantity of a " + type + "memory");
    }

    @Override
    public String toString() {
        return quantity + "MB/GB of " + type.getKey() + " " + type.getDescription();
    }
}
