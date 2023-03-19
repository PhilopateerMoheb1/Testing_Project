import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileAnalyzer {
    ArrayList<String> words=new ArrayList<>();
    Subject subject;
    SubjectBuilder subjectBuilder;
    Student student;
    StudentBuilder studentBuilder;

    public Subject analyze() {
        String myfile, myline;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        myfile = scan.nextLine();

        try {
            FileReader fileReader = new FileReader(myfile);
            BufferedReader bufread = new BufferedReader(fileReader);

            // reading the file, line by line
            while ((myline = bufread.readLine()) != null)
                words.add(myline);
            bufread.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        //To validate Validate
        try {
            validate(words);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        return subject;
    }

    public void validate(ArrayList<String> lines) throws IllegalArgumentException {
        ValidateFirstLine(lines.get(0));
        for (int i = 1; i < lines.size(); i++) {
            ValidateStudents(lines.get(i),i);
        }
        subject=subjectBuilder.build();
    }

    private static boolean checkStringAlphabetic(String input) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]},;:'\"<.>/?";
        char currentCharacter;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharacterPresent = true;

        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = true;
            } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                specialCharacterPresent = false;
            }
        }

        return (upperCasePresent || lowerCasePresent) && specialCharacterPresent;
    }

    private static boolean checkStringAlphaNumeric(String input) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        char currentCharacter;
        boolean numberPresent = false;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharacterPresent = true;

        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                numberPresent = true;
            } else if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = true;
            } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                specialCharacterPresent = false;
            }
        }

        return
                numberPresent && (upperCasePresent || lowerCasePresent) && specialCharacterPresent;
    }


    public void ValidateFirstLine(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',') {
                count++;
            }
        }
        if (count != 2) {
            throw new IllegalArgumentException("Invalid File:Line 1 error");
        }
        String EachStringInLine = "";
        int start = 0;
        for (int i = 0; i < 3; i++) {
            EachStringInLine = "";
            for (int j = start; j < s.length(); j++) {
                if (s.charAt(j) != ',') {
                    EachStringInLine += s.charAt(j);
                } else {
                    start = j + 1;
                    break;
                }
            }
            //if not contain (,)
            if (EachStringInLine.charAt(0) != ' ') {
                if (i == 0) {
                    if (checkStringAlphabetic(EachStringInLine)) {
                        subjectBuilder = new SubjectBuilder();
                        subjectBuilder.setName(EachStringInLine);
                    } else {
                        throw new IllegalArgumentException("Name of subject must contain Alphabetic only ");
                    }
                } else if (i == 1) {
                    if (EachStringInLine.length() == 6 || EachStringInLine.length() == 7) {
                        if (EachStringInLine.length() == 7) {
                            if (EachStringInLine.charAt(6) != 's') {
                                throw new IllegalArgumentException("Last digit mush contain only (s) (if exist)");
                            }
                        }
                        if (checkStringAlphaNumeric(EachStringInLine)) {
                            for (int a = 0; a < EachStringInLine.length(); a++) {
                                if (Character.isDigit(EachStringInLine.charAt(a))) {
                                    if (a == 0 || a == 1 || a == 2) {
                                        throw new IllegalArgumentException("Subject-code: It must be 6-7 Alphanumeric characters. The first 3 are Alphabetic\n" +
                                                "followed by 3 numeric characters. The sevens should be s if exists.");
                                    }
                                } else {
                                    if (a == 3 || a == 4 || a == 5) {
                                        throw new IllegalArgumentException("throw new IllegalArgumentException(Subject-code: It must be 6-7 Alphanumeric characters. The first 3 are Alphabetic\n" + "followed by 3 numeric characters. The sevens should be s if exists.");
                                    }
                                }
                            }
                            subjectBuilder.setId(EachStringInLine);
                        } else {
                            throw new IllegalArgumentException("Subject Code: must contain alphanumeric only");
                        }
                    } else {
                        throw new IllegalArgumentException("Subject code: must be 6 or 7 Alphanumeric and the last digit may be (s) ");

                    }
                }
            }
            else {
                throw new IllegalArgumentException("Can't contain space in the first");
            }
        }
        String FullMark = "100";
        if(FullMark.length()!=EachStringInLine.length()){
            throw new IllegalArgumentException("Full mark must be 100");
        }
        for (int i = 0; i < EachStringInLine.length(); i++) {
            if (FullMark.charAt(i) != EachStringInLine.charAt(i)) {
                throw new IllegalArgumentException("Full mark must be 100");
            }
        }
        subjectBuilder.setFullMark(Integer.parseInt(EachStringInLine));
    }

    public void ValidateStudents(String s,int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',') {
                count++;
            }
        }
        if (count < 5 || count > 5) {
            throw new IllegalArgumentException("Invalid Line of students : line "+(k+1));
        }
        String EachStringInLine = "";
        int start = 0;
        for (int i = 0; i < 6; i++) {
            EachStringInLine = "";
            for (int j = start; j < s.length(); j++) {
                if (s.charAt(j) != ',') {
                    EachStringInLine += s.charAt(j);
                } else {
                    start = j + 1;
                    break;
                }
            }
            if (EachStringInLine.charAt(0) != ' ') {
                if (i == 0) {
                    if (checkStringAlphabetic(EachStringInLine)) {
                        studentBuilder=new StudentBuilder();
                        studentBuilder.setName(EachStringInLine);
                    }
                    else{
                        throw new IllegalArgumentException("Name of Student must contain Alphabetic only at line :"+(k+1));
                    }
                } else if (i == 1) {
                    if (EachStringInLine.length() == 8) {
                        for (int a = 0; a < EachStringInLine.length(); a++) {
                            if (!Character.isDigit(EachStringInLine.charAt(a))&&a!=7) {
                                throw new IllegalArgumentException("Student code :must contain numbers only Line: "+(k+1));
                            }
                        }
                        studentBuilder.setId(EachStringInLine);
                    }
                    else {
                        throw new IllegalArgumentException("Student code:Must be exact 8 Line: "+(k+1));

                    }
                }
                else if(i==2||i==3) {
                    for (int a = 0; a < EachStringInLine.length(); a++) {
                        if (!Character.isDigit(EachStringInLine.charAt(a))) {
                            throw new IllegalArgumentException("Activities or oral/Practical must be Integer :Line :"+(k+1));
                        }
                    }
                    if (Integer.parseInt(EachStringInLine) > 10 || Integer.parseInt(EachStringInLine) < 0) {
                        throw new IllegalArgumentException("Activities or oral/Practical must be in range (0-10) :Line:"+(k+1));
                    }
                    // Check if int
                    if (i == 2) {
                        studentBuilder.setActivities(Integer.parseInt(EachStringInLine));
                    }
                    else if(i==3){
                        studentBuilder.setOral(Integer.parseInt(EachStringInLine));
                    }
                }
                else if(i==4){
                    for (int a = 0; a < EachStringInLine.length(); a++) {
                        if (!Character.isDigit(EachStringInLine.charAt(a))) {
                            throw new IllegalArgumentException("Midterm must be Integer Line :"+(k+1));

                        }
                    }
                    if (Integer.parseInt(EachStringInLine) > 20 || Integer.parseInt(EachStringInLine) < 0) {
                        throw new IllegalArgumentException("Midterm must be in range (0-20) Line :"+(k+1));

                    }
                    studentBuilder.setMidterm(Integer.parseInt(EachStringInLine));
                }
            }
            else{
                throw new IllegalArgumentException("Can't contain space in the first Line : "+(k+1));

            }
        }
        for (int a = 0; a < EachStringInLine.length(); a++) {
            if (!Character.isDigit(EachStringInLine.charAt(a))) {
                throw new IllegalArgumentException("Final Exam: must be integer Line: "+(k+1));
            }
        }
        if (Integer.parseInt(EachStringInLine) > 60 || Integer.parseInt(EachStringInLine) < 0) {
            throw new IllegalArgumentException("Midterm must be in range (0-60) Line :"+(k+1));
        }
        studentBuilder.setFinalExam(Integer.parseInt(EachStringInLine));
        subjectBuilder.addStudent(studentBuilder.build());
    }


    public static void main(String[] args) {
        FileAnalyzer fileAnalyzer=new FileAnalyzer();
        Subject s=new Subject();
        s=fileAnalyzer.analyze();
    }
}
