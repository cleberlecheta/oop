package learn.java.cleber.lecheta.pc.emmaus;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public enum CpuGenEnum {
    SEVEN("7th Gen"),
    EIGHT("8th Gen"),
    NINE("9th Gen"),
    TEN("10th Gen"),
    ELEVEN("11th Gen");

    CpuGenEnum(String generation) {
        this.generation = generation;
    }

    private String generation;

    public String getKey() {
        return name();
    }
    public String getGeneration() {
        return this.generation;
    }

    public String toString() {
        return this.getGeneration();
    }
}