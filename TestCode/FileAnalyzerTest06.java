/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testingproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ghaith
 */
public class FileAnalyzerTest06 {

    public FileAnalyzerTest06() {
    }

    @Test
    public void testReadFile6() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE06                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC06:");
        File myfile = new File("test cases/Fa_TC06.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (IllegalArgumentException e) {
            String massage = "subject code should be 6-7 Alphanumeric characters";
            if (e.getMessage().equals(massage)) {
                System.out.println("passed.");
                return;
            }
            fail("wrong massage:" + e.getMessage() + ",supposed: " + massage);

        }
        fail("program did not throw illegalArgumentException ");

    }

}
