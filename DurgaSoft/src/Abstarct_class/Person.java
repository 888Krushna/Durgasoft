package Abstarct_class;

//by using constructor in parent class
abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    class student extends Person {
        int roll;
        double salary;

        student(String name, int age, int roll, int salary) {
            super(name, age);
            this.roll = roll;
            this.salary = salary;
        }

        // To display the details of the student
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll: " + roll);
            System.out.println("Salary: " + salary);


            student S = new student("krushna", 25, 11, 4500);

        }


    }


}