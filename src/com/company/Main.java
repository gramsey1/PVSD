package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Grace" , 3.8);
        Student student2 = new Student("Eden" , 4.1);
        Student student3 = new Student("Ruby" , 4.0);
        Student student4 = new Student("Amanda" , 3.8);
        Student student5 = new Student("Lily" , 4.5);
        Student student6 = new Student("Q" , 4.2);
        Student student7 = new Student("Julie" , 5.0);
        Student studentInfo[] = {student1, student2, student2, student3, student4, student5, student6, student7};
        double studentGPA[] = {student1.GPA, student2.GPA, student3.GPA, student4.GPA, student5.GPA, student6.GPA, student7.GPA};
        String rank1 = "", rank2 = "", rank3 = "";

        Arrays.sort(studentGPA);

        for(int i = 0; i <= 7; i++)
        {
            if (studentGPA[6] == studentInfo[i].GPA)
            {
                rank1 = studentInfo[i].name;
            }
            else if (studentGPA[5] == studentInfo[i].GPA)
            {
                rank2 = studentInfo[i].name;
            }
            else if (studentGPA[4] == studentInfo[i].GPA)
            {
                rank3 = studentInfo[i].name;
            }
        }
        System.out.println("The top three students are: \n" + rank1  + "\n" + rank2 + "\n" + rank3);

    }
}