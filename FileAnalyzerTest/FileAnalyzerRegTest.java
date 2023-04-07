import java.io.File;
import java.io.FileNotFoundException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mina Mounir
 */
public class FileAnalyzerRegTest {

    public FileAnalyzerRegTest() {
    }

    @Test
    public void testReadFile1() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE01                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R01");
        File myfile = new File("test cases/Fa_R01.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (StudentNameException e) {
            System.out.println(e.getMessage());
            System.out.println("passed.");
            return;

        }
        fail("program did not throw StudentNameException");

    }

    @Test
    public void testReadFile2() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE02                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R02");
        File myfile = new File("test cases/Fa_R02.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (StudentNumberException e) {
            System.out.println(e.getMessage());
            System.out.println("passed.");
            return;

        }
        fail("program did not throw StudentNumberException");

    }

    @Test
    public void testReadFile3() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE03                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R03");
        File myfile = new File("test cases/Fa_R03.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("passed.");
            return;

        }
        fail("program did not throw IllegalArgumentException");

    }

    @Test
    public void testReadFile4() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE04                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R04");
        File myfile = new File("test cases/Fa_R04.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("passed.");
            return;

        }
        fail("program did not throw IllegalArgumentException");

    }

    @Test
    public void testReadFile5() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE05                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R05");
        File myfile = new File("test cases/Fa_R05.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("passed.");
            return;

        }
        fail("program did not throw IllegalArgumentException");

    }

    @Test
    public void testReadFile6() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE6                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R06:");
        File myfile = new File("test cases/Fa_R06.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (Exception e) {
            fail(e.getMessage() + " ,should work successfully!");

        }
        System.out.println("passed.");

    }

    @Test
    public void testReadFile7() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE7                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R07:");
        File myfile = new File("test cases/Fa_R07.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (StudentNumberException e) {
            System.out.println(e.getMessage());
            System.out.println("passed.");
            return;

        }
        fail("program did not throw StudentNumberException");

    }

    @Test
    public void testReadFile8() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE8                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R08:");
        File myfile = new File("test cases/Fa_R08.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (Exception e) {
            fail(e.getMessage() + " ,should work successfully!");

        }
        System.out.println("passed.");

    }

    @Test
    public void testReadFile9() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE9                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R09:");
        File myfile = new File("test cases/Fa_R09.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("passed.");
            return;

        }
        fail("program did not throw IllegalArgumentException");

    }
    
    @Test
    public void testReadFile10() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE10                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R10:");
        File myfile = new File("test cases/Fa_R09.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("passed.");
            return;

        }
        fail("program did not throw IllegalArgumentException");

    }
    
    @Test
    public void testReadFile11() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE11                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_R11:");
        File myfile = new File("test cases/Fa_R11.txt");

        Subject result = FileAnalyzer.ReadFile(myfile);
        result.getStudents_copy().forEachRemaining(((t) -> {
            assertEquals(56, t.getFinal(),"final grade is incorrect!");
            assertEquals(7, t.getActivites(),"activites grade is incorrect!");
            assertEquals(8, t.getOral(),"oral grade is incorrect!");
            assertEquals(17, t.getMidterm(),"midterm grade is incorrect!");
        }));
        System.out.println("passed.");

    }

}