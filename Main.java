import java.util.*;

public class Main
{
	public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);

	  try {
		  System.out.println("Digite o primeiro numero: ");
		  int num1 = scan.nextInt();

		  try {
			  System.out.println("Digite o segundo numero: ");
			  int num2 = scan.nextInt();
			  System.out.println("A soma total é de:  " + (num1 + num2));


		  } catch (Exception e) {
			  System.out.println("Usuario Digitou letra ou Algum caracter");

		  }

	  } catch (Exception e) {
		  System.out.println("Usuario Digitou letra ou Algum caracter");
	  }
  }
  
 }