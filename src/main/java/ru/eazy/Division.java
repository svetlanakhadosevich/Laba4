package ru.eazy;

/**
 * @author SH;
 */
public class Division {
    private String ID;
    private String name;

    /**
     * @param name - Название бригады
     */
    public Division(String name) {
        this.name = name;
        this.ID = Double.toString(generator());
    }

    public String getName() {
        return name;
    }

    /**
     * @return случйное значение - ID
     */
    public static int generator() {
        return (int) (Math.random() * 1000000);
    }

    @Override
    public String toString() {
        return "Division{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
