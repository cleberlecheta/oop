package learn.java.cleber.lecheta.oop;

import learn.java.cleber.lecheta.pc.emmaus.ComputerTypeEnum;

/**
 * Abstract class work as a default model to heritage, can't be directly instantiate
 * The methods in here must be override in the concrete subclass
 *
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public abstract class DellComputer implements Computer {
    //final classes cannot be heritage, so we did not add final to our DellComputer class

    protected String baseLine;
    protected String modelNumber;
    protected Boolean hasBuiltinScreen;

    private ComputerTypeEnum format;

    /**
     * A println were added here to keep track whenever the super constructor is called
     */
    public DellComputer() {
        //System.out.println("I love my computer it does makes me feel alright?");
    }

    public DellComputer(ComputerTypeEnum format, String baseLine, String modelNumber) {
        this();
        this.baseLine = baseLine;
        this.modelNumber = modelNumber;
        this.format = format;
        setHasBuiltinScreen();
    }

    @Override
    public ComputerTypeEnum getFormat() {
        return format;
    }

    private void setHasBuiltinScreen() {
        if (this.getFormat() == ComputerTypeEnum.Desktop) {
            this.hasBuiltinScreen = false;
        } else {
            this.hasBuiltinScreen = true;
        }
    }

    @Override
    public String toString() {
        return getFormat() + " " + baseLine + " " + modelNumber;
    }
}
