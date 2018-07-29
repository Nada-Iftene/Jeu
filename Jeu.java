import java.util.Scanner;

public class Jeu{
	public static void main(String[]args){
		int a = 4;
		int b;
		int i;
		
		Scanner clavier = new Scanner(System.in);
		
		for (i=1;i<4;i++){
			System.out.println("Entrer un chiffre entre 1 et 10 ");
			b = clavier.nextInt();
			if(b > 10 || b < 1){
				System.out.println("vous avez introduit un mouvais chiffre : " + b);
			}else{
				
			
			if (a == b){
				System.out.println("Vous avez gagné !");
				a++;
			}
			else {
			
				
				
					System.out.println("vous avez perdu");
				}
			}
			}
		System.out.print("fin du jeu");
			
			
		}
	}


