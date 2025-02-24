package Loop.IF_ELASE;

public class Example {
    public static void main(String[] args) {
        //Example number No1
    /*   int number = 10;

        if (number > 15) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }*/


        //  Ladder of if esle Example no 2 check the given marks in which gread will be get
      /*  int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }*/

//using without curly breaceses example NO 3 . finad the max value
    /*    int a = 10;
        int b = 20;
        int c = 30;

        if (a > b)
            if (a > c)
                System.out.println("a is the greatest");
            else
                System.out.println("c is the greatest");
        else
        if (b > c)
            System.out.println("b is the greatest");
        else

            System.out.println("c is the greatest");*/


        //Exampple no 4. find the greatest value
        int a = 15, b = 30, c = 25;

        if (a > b) {

            if (a > c) {
                System.out.println("a is the greatest");
            } else {
                System.out.println("c is the greatest");
            }
        } else {
            if (b > c) {
                System.out.println("b is the greatest");
            } else {
                System.out.println("c is the greatest");
            }
        }
    }
}
