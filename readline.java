import java.util.Scanner;
public class readline{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a number: ");
int myNum=scanner.nextInt();
System.out.println("You entered: "+myNum);
scanner.close();
}
}