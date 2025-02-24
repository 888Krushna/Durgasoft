package Interface;
import java.util.Scanner;
public class client {

    public static void main(String[] args) {
        person p = new Raju();
        p.input();
        p.output();
    }
}

 interface person {

   public void input();
    void output();

    //the both methds are public+abstarct bydefault
    //person requirement

}
class Raju implements person{
    String name;
    double salary;
    public void input(){
        Scanner r= new Scanner(System.in);
        System.out.println("Enter username: ");
        name=r.nextLine();

        System.out.println("Enter salary: ");
        salary=r.nextDouble();
    }


  public void output(){
      System.out.println("Employee deatils:" + name + " " +salary);
  }
}