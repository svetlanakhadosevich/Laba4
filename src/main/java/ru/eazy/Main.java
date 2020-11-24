package ru.eazy;

import java.io.IOException;

/**
 * @author SH;
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader("foreign_names.csv");
        AllDivision allDivision = new AllDivision(4, reader.getOutput());
        System.out.println(allDivision.allDivision.toString());

        AboutBass[] aboutBass = new AboutBass[reader.getOutput().length];
        for (int i = 0; i < aboutBass.length; i++) {
            aboutBass[i] = new AboutBass(reader.getOutput()[i], allDivision.getAllDivision());
        }
        System.out.println(aboutBass[1].toString());
        System.out.println(aboutBass[aboutBass.length - 1].toString());
    }
}
