import java.text.DecimalFormat;

public class StudentTest {
    public static void main (String [] args){

        Student stud1 = new Student();
        stud1.StudIdNum = 23032;
        stud1.YeOfStudy = 2024;
        stud1.FirstName = " Valera ";
        stud1.LastName = " Diyrchick ";
        stud1.agMath = 3.85;
        stud1.agEconmcs = 2.34;
        stud1.agForeignLang = 3.76;

        Student stud2 = new Student();
        stud2.StudIdNum = 23033;
        stud2.YeOfStudy = 2024;
        stud2.FirstName = " Tolik ";
        stud2.LastName = " Shyher ";
        stud2.agMath = 2.50;
        stud2.agEconmcs = 4.80;
        stud2.agForeignLang = 5.00;

        Student stud3 = new Student();
        stud3.StudIdNum = 23034;
        stud3.YeOfStudy = 2024;
        stud3.FirstName = " Vasyan ";
        stud3.LastName = " Byben ";
        stud3.agMath = 2.25;
        stud3.agEconmcs = 2.35;
        stud3.agForeignLang = 5.00;


        System.out.println("Средний арифметический балл по предметам" +
                "\n" + stud1.FirstName + stud1.LastName + ": " + (stud1.agMath + stud1.agEconmcs + stud1.agForeignLang)/3 +
                "\n" + stud2.FirstName + stud2.LastName + ": " + (stud2.agMath + stud2.agEconmcs + stud2.agForeignLang)/3 +
                "\n" + stud3.FirstName + stud3.LastName + ": " + (stud3.agMath + stud3.agEconmcs + stud3.agForeignLang)/3);

    }
}
