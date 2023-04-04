package javaprogrammes;

import java.util.Scanner;

public class Programme_2_MarkSheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name : ");
        String name = sc.next();
        System.out.println("Enter student roll number : ");
        int rollNo = sc.nextInt();
        System.out.println("Enter marks of subject Maths : ");
        int mathsMarks = sc.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please enter correct marks ");
            mathsMarks = sc.nextInt();

        }
        System.out.println("Enter marks of subject Science : ");
        int scienceMarks = sc.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please enter correct marks ");
            scienceMarks = sc.nextInt();
        }
        System.out.println("Enter marks of subject English : ");
        int englishMarks = sc.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please enter correct marks ");
            englishMarks = sc.nextInt();
        }

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name,rollNo,mathsMarks,scienceMarks,englishMarks,total,percentage,result,grade );

        // closing scanner object
        sc.close();
    }

    // Calculating sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // calculating result on subject mark
    public static String calculateResult(int mathsMarks, int englishMarks, int scienceMarks) {
        if (mathsMarks < 35 || englishMarks < 35 || scienceMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grades on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade=null;
if (result.equalsIgnoreCase("pass")){
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";}
            } else {
                grade = "_";
            }
        return grade;
    }
    public static void printTheMarkSheet(String name, int rollNo, int mathMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNo + "                 |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "               |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}



