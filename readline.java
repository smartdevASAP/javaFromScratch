import java.util.Scanner;
public class readline{
public static void main(String[] args){

Scanner scanner=new Scanner(System.in);
System.out.println("Enter a number: ");
int num=scanner.nextInt();
System.out.println("enter a second number: ");
int num2=scanner.nextInt();
int result=num+num2;
System.out.println("Answer is: "+result);
scanner.close();
}
}