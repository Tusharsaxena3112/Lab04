package main;

public class Main {
    public static void main(String[] args) {
//        Person person=new Person("0",18,'M');
//        Scanner input=new Scanner(System.in);
//        person.setName(input.nextLine());
//        person.setAge(input.nextInt());
//        char gender = input.next().trim().charAt(0);
////        String shortTerm=input.nextLine().trim();
//        person.setShortterm("HOD");
//        person.setGender(gender);
//        person.introduction();
////        System.out.println(person.toString());
        Student1 student1 = new Student1("Tushar", 18, 'M', "B.Tech", 123);
        System.out.println(student1);
    }
}
