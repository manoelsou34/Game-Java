package logica;
import java.util.Scanner;

public class gamePontuacao {
   public int [] numeros = {10,20,30};
   
   public static void main(String args[]) {
	   Scanner scanner = new Scanner(System.in);
	   int pontos = 0;
	   System.out.println("Bem-vindo! Pressione S para continuar.");
	   String string = scanner.nextLine();
	   if(string.equals("s")) {
		   System.out.println("Qual o game mais famoso de zumbi da capcon?");
		   string = scanner.nextLine();
		   if(string.equals("Resident Evil")) {
			   System.out.println("Voc� acertou");
			   System.out.println("Voc� deseja continuar? (s) ou desistir? (d)");
			   string = scanner.nextLine();
			   if(string.equals("s")) {
				   //Proxima Pegunta 
				   System.out.println("Qual o console da sony");
				   string = scanner.nextLine();
				   if(string.equals("Playstation")) {
					   System.out.println("Voc� acertou");
				   }
			   }else {
				   System.out.println("Fim de Jogo ate mais");
			   }
		   }else {
			   System.out.println("Voc� errou sinto muito");
		   }
		   
	   }else {
		   System.out.println("Acabou o game.. Voc� marcou 0");
	   }
   }
}
