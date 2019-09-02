package main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person person=new Person("0",18,'M');
        Scanner input=new Scanner(System.in);
        person.setName(input.nextLine());
        person.setAge(input.nextInt());
        System.out.println(person.toString());
    }
}
