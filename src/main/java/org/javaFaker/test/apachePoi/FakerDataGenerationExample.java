package org.javaFaker.test.apachePoi;

import org.testng.annotations.Test;

import java.io.File;

public class FakerDataGenerationExample {

    private static final String SHEET_NAME = "Fake data";
    public static final File FILE_X = new File("FAKE-DATA.xls");
    public static final int DATA_SIZE = 1000;

    @Test
    public void mainTest() {
        exportData();
        loadDataAndPrint();
    }

    private static void exportData() {
        System.out.println("1");
    }

    private static void loadDataAndPrint() {
        System.out.println("2");
    }
}
