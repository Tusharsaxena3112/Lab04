package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Person person=new Person("0",18,'M');
        Scanner input = new Scanner(System.in);
//        person.setName(input.nextLine());
//        person.setAge(input.nextInt());
//        char gender = input.next().trim().charAt(0);
////        String shortTerm=input.nextLine().trim();
//        person.setShortterm("HOD");
//        person.setGender(gender);
//        person.introduction();
////        System.out.println(person.toString());
        String name = input.nextLine();
        int age = input.nextInt();
        char gender = input.next().trim().charAt(0);
        String course = input.next();
        int rollno = input.nextInt();
        Student1 student1 = new Student1(name, age, gender, course, rollno);
        System.out.println(student1);
    }
}
