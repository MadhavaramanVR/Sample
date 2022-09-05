import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    Main ob=new Main();
  }
  public void add(int num1,int num2)
  {
    int sum=num1+num2;
    System.out.println("Sum: " +sum);
  }
  public void sub(int num1,int num2)
  {
    int sub=num1-num2;
    System.out.println("Subtraction: "+sub);
  }
}
