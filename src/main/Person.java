package main;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;

    }

    @Override
    public String toString() {
        if (gender == 'M' | gender == 'm') {
            return "Hello,my name is " + name + ". I am a man and I am " + age + " old.";
        }
        else if (gender == 'F' | gender == 'f') {
            return "Hello,my name is " + name + ". I am a woman and I am " + age + " old.";
        }
        else{
            return "Hello,my name is " + name + ". My gender is not specified and I am " + age+"years old";
        }
    }
}
