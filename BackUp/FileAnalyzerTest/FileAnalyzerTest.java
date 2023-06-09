/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

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
public class FileAnalyzerTest {

    public FileAnalyzerTest() {
    }

    @Test
    public void testReadFile1() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE01                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Fa_TC01:");
        File myfile = new File("test cases/Fa_TC01.txt");
        Subject result = FileAnalyzer.ReadFile(myfile);
        try ( FileReader FR = new FileReader(myfile);  BufferedReader BR = new BufferedReader(FR)) {
            String[] subjectProb = BR.readLine().split(",");
            assertEquals(subjectProb[0], result.getName());
            assertEquals(subjectProb[1], result.getID());
            assertEquals(Integer.parseInt(subjectProb[2]), result.getFullMark());
            result.getStudents_copy().forEachRemaining((student) -> {
                String line;
                String[] studentProb;
                try {
                    if ((line = BR.readLine()) != null) {
                        studentProb = line.split(",");
                        assertEquals(student.getName(), studentProb[0]);
                        assertEquals(student.getID(), studentProb[1]);
                        assertEquals(student.getActivites(), Integer.parseInt(studentProb[2]));
                        assertEquals(student.getOral(), Integer.parseInt(studentProb[3]));
                        assertEquals(student.getMidterm(), Integer.parseInt(studentProb[4]));
                        assertEquals(student.getFinal(), Integer.parseInt(studentProb[5]));
                    } else {
                        fail("number of expected not correct!");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(FileAnalyzerTest01.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            if (BR.readLine() != null) {
                fail("number of expected not correct!");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileAnalyzerTest01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileAnalyzerTest01.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("passed.");
    }

    @Test
    public void testReadFile2() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE02                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Fa_TC02:");
        File myfile = new File("test cases/Fa_TC02.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (SpaceException e) {
            System.out.println("passed.");
            return;
        }
        fail("program did not throw SpaceException ");

    }
    @Test
    public void testReadFile3() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE03                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC03:");
        File myfile = new File("test cases/Fa_TC03.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (SubjectNameException e) {
            
                System.out.println("passed.");
                return;
            
        }
        fail("program did not throw SubjectNameException");

    }
    @Test
    public void testReadFile4() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE04                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC04:");
        File myfile = new File("test cases/Fa_TC04.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (FullMarkException e) {
            
                System.out.println("passed.");
                return;
            
        }
        fail("program did not throw FullMarkException");

    }
    @Test
    public void testReadFile5() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE05                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC05:");
        File myfile = new File("test cases/Fa_TC05.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (SubjectNameException | SubjectCodeException e) {
            System.out.println("passed.");
            return;
        }
        fail("program did not throw SubjectNameException ");

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
        } catch (SubjectCodeException e) {

            System.out.println("passed.");
            return;

        }
        fail("program did not throw SubjectCodeException ");

    }
    @Test
    public void testReadFile7() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE07                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC07:");
        File myfile = new File("test cases/Fa_TC07.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (FullMarkException e) {

            System.out.println("passed.");
            return;

        }
        fail("program did not throw FullMarkException");

    }
    @Test
    public void testReadFile8() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE08                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC08:");
        File myfile = new File("test cases/Fa_TC08.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (IllegalArgumentException e) {

            System.out.println("passed.");
            return;

        }
        fail("program did not throw illegalArgumentException");

    }
    @Test
    public void testReadFile9() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE09                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC09:");
        File myfile = new File("test cases/Fa_TC09.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (SubjectNameException e) {

            System.out.println("passed.");
            return;

        }
        fail("program did not throw SubjectNameException");

    }
    @Test
    public void testReadFile10() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE10                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC10:");
        File myfile = new File("test cases/Fa_TC10.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (Exception e) {
            fail(e.getMessage()+" should work successfully!");

        }
        System.out.println("passed.");

    }
    @Test
    public void testReadFile11() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE11                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC11:");
        File myfile = new File("test cases/Fa_TC11.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (StudentNumberException e) {
            
                System.out.println("passed.");
                return;
            
        }
        fail("program did not throw StudentNumberException");

    }
    @Test
    public void testReadFile12() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE12                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC12:");
        File myfile = new File("test cases/Fa_TC12.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (SpaceException e) {

            System.out.println("passed.");
            return;

        }
        fail("program did not throw illegalArgumentException");

    }
    @Test
    public void testReadFile13() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE13                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC13:");
        File myfile = new File("test cases/Fa_TC13.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (StudentNameException e) {
            
                System.out.println("passed.");
                return;
            
        }
        fail("program did not throw StudentNameException");

    }

    @Test
    public void testReadFile14() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE14                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC14:");
        File myfile = new File("test cases/Fa_TC14.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (Exception e) {
            fail(e.getMessage()+" should work successfully!");

        }
        System.out.println("passed.");


    }
    @Test
    public void testReadFile15() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE15                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC15:");
        File myfile = new File("test cases/Fa_TC15.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (StudentNumberException e) {

            System.out.println("passed.");
            return;

        }
        fail("program did not throw StudentNumberException");

    }
    @Test
    public void testReadFile16() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE16                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC16:");
        File myfile = new File("test cases/Fa_TC16.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (Exception e) {
            fail(e.getMessage()+" should work successfully!");

        }
        System.out.println("passed.");

    }
    @Test
    public void testReadFile17() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE17                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC17:");
        File myfile = new File("test cases/Fa_TC17.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (IllegalArgumentException e) {
            
                System.out.println("passed.");
                return;
            
        }
        fail("program did not throw illegalArgumentException");

    }
    @Test
    public void testReadFile18() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE18                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC18:");
        File myfile = new File("test cases/Fa_TC18.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (StudentNumberException e) {

            System.out.println("passed.");
            return;

        }
        fail("program did not throw StudentNumberException");

    }
    @Test
    public void testReadFile19() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE19                     ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC19:");
        File myfile = new File("test cases/Fa_TC19.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (SubjectNameException e) {

            System.out.println("passed.");
            return;

        }
        fail("program did not throw SubjectNameException ");

    }
    @Test
    public void testReadFile20() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE20                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC20:");
        File myfile = new File("test cases/Fa_TC20.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (StudentMarkException e) {
            
                System.out.println("passed.");
                return;
            
        }
        fail("program did not throw StudentMarkException");

    }
    @Test
    public void testReadFile21() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE21                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC21:");
        File myfile = new File("test cases/Fa_TC21.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (StudentMarkException e) {
            
                System.out.println("passed.");
                return;
            
        }
        fail("program did not throw StudentMarkException");

    }
    @Test
    public void testReadFile22() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE22                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC22:");
        File myfile = new File("test cases/Fa_TC22.json");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (IllegalArgumentException e) {

            System.out.println("passed.");
            return;

        }
        fail("program did not throw illegalArgumentException");

    }
}
