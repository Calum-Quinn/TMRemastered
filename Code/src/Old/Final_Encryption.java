package OldCode;

import java.util.*;

public class Final_Encryption {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		
		//Entrée de la clé de cryptage par l'utilisateur
		
		System.out.println("Vous allez devoir choisir 5 chiffres/nombres, tous entre 2 et 11 compris.");
		
		//Premier nombre
		
		int nbr = 0;
		
		while (nbr < 2 || nbr > 11) {
			System.out.println("Veuillez choisir votre premier chiffre/nombre:");
			
			nbr = sc.nextInt();
			if (1<nbr && nbr<10) {
				System.out.println("Vous avez saisi le chiffre: "+nbr);
				System.out.println();
			}
			else if (10<nbr && nbr<12){
				System.out.println("Vous avez saisi le nombre : " + nbr);
				System.out.println();
			}
			else {
				System.out.println("Avez-vous lu les conditions?");
				System.out.println("Nous allons réessayer.");
				System.out.println();
			}
		}
		
		//Deuxième nombre
		
		int nbr2 = 0;
			
		while (nbr2 < 2 || nbr2 > 11) {
			System.out.println("Veuillez choisir votre deuxième chiffre/nombre:");
			
			nbr2 = sc.nextInt();
			if (1<nbr2 && nbr2<10) {
				System.out.println("Vous avez saisi le chiffre: "+nbr2);
				System.out.println();
			}
			else if (10<nbr2 && nbr2<12){
				System.out.println("Vous avez saisi le nombre : " + nbr2);
				System.out.println();
			}
			else {
				System.out.println("Avez-vous lu les conditions?");
				System.out.println("Nous allons réessayer.");
				System.out.println();
			}
		}
			
		//Troisième nombre
		
		int nbr3 = 0;
			
		while (nbr3 < 2 || nbr3 > 11) {
			System.out.println("Veuillez choisir votre troisième chiffre/nombre:");
				
			nbr3 = sc.nextInt();
			if (1<nbr3 && nbr3<10) {
				System.out.println("Vous avez saisi le chiffre: "+nbr3);
				System.out.println();
			}
			else if (10<nbr3 && nbr3<12){
				System.out.println("Vous avez saisi le nombre : " + nbr3);
				System.out.println();
			}
			else {
				System.out.println("Avez-vous lu les conditions?");
				System.out.println("Nous allons réessayer.");
				System.out.println();
			}
		}	

		//Quatrième nombre
		
		int nbr4 = 0;
				
		while (nbr4 < 2 || nbr4 > 11) {
			System.out.println("Veuillez choisir votre quatrième chiffre/nombre:");
					
			nbr4 = sc.nextInt();
			if (1<nbr4 && nbr4<10) {
				System.out.println("Vous avez saisi le chiffre: "+nbr4);
				System.out.println();
			}
			else if (10<nbr2 && nbr2<12){
				System.out.println("Vous avez saisi le nombre : " + nbr4);
				System.out.println();
			}
			else {
				System.out.println("Avez-vous lu les conditions?");
				System.out.println("Nous allons réessayer.");
				System.out.println();
			}
		}
		
		//Cinquième nombre
		
		int nbr5 = 0;
					
		while (nbr5 < 2 || nbr5 > 11) {
			System.out.println("Veuillez choisir votre cinquième chiffre/nombre:");
						
			nbr5 = sc.nextInt();
			if (1<nbr5 && nbr5<10) {
				System.out.println("Vous avez saisi le chiffre: "+nbr5);
				System.out.println();
			}
			else if (10<nbr5 && nbr5<12){
				System.out.println("Vous avez saisi le nombre : " + nbr5);
				System.out.println();
			}
			else {
				System.out.println("Avez-vous lu les conditions?");
				System.out.println("Nous allons réessayer.");
				System.out.println();
			}
		}
						
		System.out.println("Donc la clé de cryptage est: "+nbr+nbr2+nbr3+nbr4+nbr5);
		
		//Définition des changements qui seront fait à l'alphabet
		
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		int nbr1 = nbr ;
		
			for (int list = 2; list <= nbr1 + 1; list++) {
			
				array1.add(list);	
		
			}
			
		ArrayList<Integer> array2 = new ArrayList<Integer>();		
				
			int size1 = array1.size();
		
			array2.add(array1.get((nbr2 - 1)%size1));	
		
			for (int i = 1; i<= 10000; i++) {
		
				array2.add(array1.get((((nbr2 % (nbr)) - 1) + i*nbr2) % (nbr)));
			}
			
	    ArrayList<Integer> array3 = new ArrayList<Integer>();		
	    
			array3.add(array1.get((nbr3 - 1)%size1));	
		
			for (int i = 1; i<= 10000; i++) {
		
				array3.add(array1.get((((nbr3 % (nbr)) - 1) + i*nbr3) % (nbr)));
		
			}
	     
	    int x = 0; 
	    int y = 0;
	    int[][] tableau4 = new int[10000][2];		
	    
	    for (int g = 0; g<10000; g++) {
	    			tableau4[g][0] = array2.get(g);
	    			tableau4[g][1] = array3.get(g);
	    }
	    
	    
	    /*
	    System.out.print("Tableau4: ");
	    for (int g = 0; g<10000; g++) {
	    		for (int l = 0; l<2; l++) {
	    			System.out.print(tableau4[g][l]);
	    		}
	    }*/
	    
	      while (x < 10)
	      {
	        y = 0;
	        while(y < 2)
	        {
	          y++;
	        }
	        x++;
	      }
	      
	      System.out.println();
	      
	      ArrayList<Integer> list2_1 = new ArrayList<Integer>();
	      
	      int m = 0;
	      
	      for (m = 0; m<1002; m++) {
	    	  	for (int n=0; n<2; n++) {
	    	  		list2_1.add(tableau4[m][n]);
	    	  	}
	      }
	      
	      //Changements préprogrammer
	      
	      char alphabet[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	      
	      char change[][] = {
		    	  {alphabet[24],alphabet[1],alphabet[0],alphabet[3],alphabet[2],alphabet[5],alphabet[4],alphabet[7],alphabet[6],alphabet[9],alphabet[8],alphabet[11],alphabet[10],alphabet[13],alphabet[12],alphabet[15],alphabet[14],alphabet[17],alphabet[16],alphabet[19],alphabet[18],alphabet[21],alphabet[20],alphabet[23],alphabet[22],alphabet[25]},
		      {alphabet[1],alphabet[24],alphabet[3],alphabet[0],alphabet[5],alphabet[2],alphabet[7],alphabet[4],alphabet[9],alphabet[6],alphabet[11],alphabet[8],alphabet[13],alphabet[10],alphabet[15],alphabet[12],alphabet[17],alphabet[14],alphabet[19],alphabet[16],alphabet[21],alphabet[18],alphabet[23],alphabet[20],alphabet[25],alphabet[22]},
		      {alphabet[22],alphabet[1],alphabet[24],alphabet[3],alphabet[0],alphabet[5],alphabet[2],alphabet[7],alphabet[4],alphabet[9],alphabet[6],alphabet[11],alphabet[8],alphabet[13],alphabet[10],alphabet[15],alphabet[12],alphabet[17],alphabet[14],alphabet[19],alphabet[16],alphabet[21],alphabet[18],alphabet[23],alphabet[20],alphabet[25]},
		      {alphabet[1],alphabet[22],alphabet[3],alphabet[24],alphabet[5],alphabet[0],alphabet[7],alphabet[2],alphabet[9],alphabet[4],alphabet[11],alphabet[6],alphabet[13],alphabet[8],alphabet[15],alphabet[10],alphabet[17],alphabet[12],alphabet[19],alphabet[14],alphabet[21],alphabet[16],alphabet[23],alphabet[18],alphabet[25],alphabet[20]},
		      {alphabet[20],alphabet[1],alphabet[22],alphabet[3],alphabet[24],alphabet[5],alphabet[0],alphabet[7],alphabet[2],alphabet[9],alphabet[4],alphabet[11],alphabet[6],alphabet[13],alphabet[8],alphabet[15],alphabet[10],alphabet[17],alphabet[12],alphabet[19],alphabet[14],alphabet[21],alphabet[16],alphabet[23],alphabet[18],alphabet[25]},
		      {alphabet[1],alphabet[20],alphabet[3],alphabet[22],alphabet[5],alphabet[24],alphabet[7],alphabet[0],alphabet[9],alphabet[2],alphabet[11],alphabet[4],alphabet[13],alphabet[6],alphabet[15],alphabet[8],alphabet[17],alphabet[10],alphabet[19],alphabet[12],alphabet[21],alphabet[14],alphabet[23],alphabet[16],alphabet[25],alphabet[18]},
		      {alphabet[18],alphabet[1],alphabet[20],alphabet[3],alphabet[22],alphabet[5],alphabet[24],alphabet[7],alphabet[0],alphabet[9],alphabet[2],alphabet[11],alphabet[4],alphabet[13],alphabet[6],alphabet[15],alphabet[8],alphabet[17],alphabet[10],alphabet[19],alphabet[12],alphabet[21],alphabet[14],alphabet[23],alphabet[16],alphabet[25]},
		      {alphabet[1],alphabet[18],alphabet[3],alphabet[20],alphabet[5],alphabet[22],alphabet[7],alphabet[24],alphabet[9],alphabet[0],alphabet[11],alphabet[2],alphabet[13],alphabet[4],alphabet[15],alphabet[6],alphabet[17],alphabet[8],alphabet[19],alphabet[10],alphabet[21],alphabet[12],alphabet[23],alphabet[14],alphabet[25],alphabet[16]},
		      {alphabet[16],alphabet[1],alphabet[18],alphabet[3],alphabet[20],alphabet[5],alphabet[22],alphabet[7],alphabet[24],alphabet[9],alphabet[0],alphabet[11],alphabet[2],alphabet[13],alphabet[4],alphabet[15],alphabet[6],alphabet[17],alphabet[8],alphabet[19],alphabet[10],alphabet[21],alphabet[12],alphabet[23],alphabet[14],alphabet[25]},
		      {alphabet[1],alphabet[16],alphabet[3],alphabet[18],alphabet[5],alphabet[20],alphabet[7],alphabet[22],alphabet[9],alphabet[24],alphabet[11],alphabet[0],alphabet[13],alphabet[2],alphabet[15],alphabet[4],alphabet[17],alphabet[6],alphabet[19],alphabet[8],alphabet[21],alphabet[10],alphabet[23],alphabet[12],alphabet[25],alphabet[14]},
		      {alphabet[14],alphabet[1],alphabet[16],alphabet[3],alphabet[18],alphabet[5],alphabet[20],alphabet[7],alphabet[22],alphabet[9],alphabet[24],alphabet[11],alphabet[0],alphabet[13],alphabet[2],alphabet[15],alphabet[4],alphabet[17],alphabet[6],alphabet[19],alphabet[8],alphabet[21],alphabet[10],alphabet[23],alphabet[12],alphabet[25]},
		    		  
		      {alphabet[24],alphabet[1],alphabet[2],alphabet[0],alphabet[4],alphabet[5],alphabet[3],alphabet[7],alphabet[8],alphabet[6],alphabet[10],alphabet[11],alphabet[9],alphabet[13],alphabet[14],alphabet[12],alphabet[16],alphabet[17],alphabet[15],alphabet[19],alphabet[20],alphabet[18],alphabet[22],alphabet[23],alphabet[21],alphabet[25]},
		      {alphabet[1],alphabet[24],alphabet[2],alphabet[0],alphabet[4],alphabet[5],alphabet[3],alphabet[7],alphabet[8],alphabet[6],alphabet[10],alphabet[11],alphabet[9],alphabet[13],alphabet[14],alphabet[12],alphabet[16],alphabet[17],alphabet[15],alphabet[19],alphabet[20],alphabet[18],alphabet[22],alphabet[23],alphabet[21],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[24],alphabet[4],alphabet[0],alphabet[5],alphabet[7],alphabet[3],alphabet[8],alphabet[10],alphabet[6],alphabet[11],alphabet[13],alphabet[9],alphabet[14],alphabet[16],alphabet[12],alphabet[17],alphabet[19],alphabet[15],alphabet[20],alphabet[22],alphabet[18],alphabet[23],alphabet[25],alphabet[21]},
		      {alphabet[21],alphabet[1],alphabet[2],alphabet[24],alphabet[4],alphabet[5],alphabet[0],alphabet[7],alphabet[8],alphabet[3],alphabet[10],alphabet[11],alphabet[6],alphabet[13],alphabet[14],alphabet[9],alphabet[16],alphabet[17],alphabet[12],alphabet[19],alphabet[20],alphabet[15],alphabet[22],alphabet[23],alphabet[18],alphabet[25]},
		      {alphabet[1],alphabet[21],alphabet[2],alphabet[4],alphabet[24],alphabet[5],alphabet[0],alphabet[7],alphabet[8],alphabet[3],alphabet[10],alphabet[11],alphabet[6],alphabet[13],alphabet[14],alphabet[9],alphabet[16],alphabet[17],alphabet[12],alphabet[19],alphabet[20],alphabet[15],alphabet[22],alphabet[23],alphabet[18],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[21],alphabet[4],alphabet[5],alphabet[24],alphabet[7],alphabet[0],alphabet[8],alphabet[10],alphabet[3],alphabet[11],alphabet[13],alphabet[6],alphabet[14],alphabet[16],alphabet[9],alphabet[17],alphabet[19],alphabet[12],alphabet[20],alphabet[22],alphabet[15],alphabet[23],alphabet[25],alphabet[18]},
		      {alphabet[18],alphabet[1],alphabet[2],alphabet[21],alphabet[4],alphabet[5],alphabet[24],alphabet[7],alphabet[8],alphabet[0],alphabet[10],alphabet[11],alphabet[3],alphabet[13],alphabet[14],alphabet[6],alphabet[16],alphabet[17],alphabet[9],alphabet[19],alphabet[20],alphabet[12],alphabet[22],alphabet[23],alphabet[15],alphabet[25]},
		      {alphabet[1],alphabet[18],alphabet[2],alphabet[4],alphabet[21],alphabet[5],alphabet[7],alphabet[24],alphabet[8],alphabet[0],alphabet[10],alphabet[11],alphabet[3],alphabet[13],alphabet[14],alphabet[6],alphabet[16],alphabet[17],alphabet[9],alphabet[19],alphabet[20],alphabet[12],alphabet[22],alphabet[23],alphabet[15],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[18],alphabet[4],alphabet[5],alphabet[21],alphabet[7],alphabet[8],alphabet[24],alphabet[10],alphabet[0],alphabet[11],alphabet[13],alphabet[3],alphabet[14],alphabet[16],alphabet[6],alphabet[17],alphabet[19],alphabet[9],alphabet[20],alphabet[22],alphabet[12],alphabet[23],alphabet[25],alphabet[15]},
		      {alphabet[15],alphabet[1],alphabet[2],alphabet[18],alphabet[4],alphabet[5],alphabet[21],alphabet[7],alphabet[8],alphabet[24],alphabet[10],alphabet[11],alphabet[0],alphabet[13],alphabet[14],alphabet[3],alphabet[16],alphabet[17],alphabet[6],alphabet[19],alphabet[20],alphabet[9],alphabet[22],alphabet[23],alphabet[12],alphabet[25]},
		      {alphabet[1],alphabet[15],alphabet[2],alphabet[4],alphabet[18],alphabet[5],alphabet[7],alphabet[21],alphabet[8],alphabet[10],alphabet[24],alphabet[11],alphabet[0],alphabet[13],alphabet[14],alphabet[3],alphabet[16],alphabet[17],alphabet[6],alphabet[19],alphabet[20],alphabet[9],alphabet[22],alphabet[23],alphabet[12],alphabet[25]},
		    	      
		      {alphabet[24],alphabet[1],alphabet[2],alphabet[0],alphabet[3],alphabet[5],alphabet[6],alphabet[4],alphabet[7],alphabet[9],alphabet[10],alphabet[8],alphabet[11],alphabet[13],alphabet[14],alphabet[12],alphabet[15],alphabet[17],alphabet[18],alphabet[16],alphabet[19],alphabet[21],alphabet[22],alphabet[20],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[24],alphabet[2],alphabet[3],alphabet[0],alphabet[5],alphabet[6],alphabet[7],alphabet[4],alphabet[9],alphabet[10],alphabet[11],alphabet[8],alphabet[13],alphabet[14],alphabet[15],alphabet[12],alphabet[17],alphabet[18],alphabet[19],alphabet[16],alphabet[21],alphabet[22],alphabet[23],alphabet[20],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[24],alphabet[3],alphabet[0],alphabet[5],alphabet[6],alphabet[7],alphabet[4],alphabet[9],alphabet[10],alphabet[11],alphabet[8],alphabet[13],alphabet[14],alphabet[15],alphabet[12],alphabet[17],alphabet[18],alphabet[19],alphabet[16],alphabet[21],alphabet[22],alphabet[23],alphabet[20],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[24],alphabet[5],alphabet[0],alphabet[6],alphabet[7],alphabet[9],alphabet[4],alphabet[10],alphabet[11],alphabet[13],alphabet[8],alphabet[14],alphabet[15],alphabet[17],alphabet[12],alphabet[18],alphabet[19],alphabet[21],alphabet[16],alphabet[22],alphabet[23],alphabet[25],alphabet[20]},
		      {alphabet[20],alphabet[1],alphabet[2],alphabet[3],alphabet[24],alphabet[5],alphabet[6],alphabet[0],alphabet[7],alphabet[9],alphabet[10],alphabet[4],alphabet[11],alphabet[13],alphabet[14],alphabet[8],alphabet[15],alphabet[17],alphabet[18],alphabet[12],alphabet[19],alphabet[21],alphabet[22],alphabet[16],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[20],alphabet[2],alphabet[3],alphabet[5],alphabet[24],alphabet[6],alphabet[7],alphabet[0],alphabet[9],alphabet[10],alphabet[11],alphabet[4],alphabet[13],alphabet[14],alphabet[15],alphabet[8],alphabet[17],alphabet[18],alphabet[19],alphabet[12],alphabet[21],alphabet[22],alphabet[23],alphabet[16],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[20],alphabet[3],alphabet[5],alphabet[6],alphabet[24],alphabet[7],alphabet[0],alphabet[9],alphabet[10],alphabet[11],alphabet[4],alphabet[13],alphabet[14],alphabet[15],alphabet[8],alphabet[17],alphabet[18],alphabet[19],alphabet[12],alphabet[21],alphabet[22],alphabet[23],alphabet[16],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[20],alphabet[5],alphabet[6],alphabet[7],alphabet[24],alphabet[9],alphabet[0],alphabet[10],alphabet[11],alphabet[13],alphabet[4],alphabet[14],alphabet[15],alphabet[17],alphabet[8],alphabet[18],alphabet[19],alphabet[21],alphabet[12],alphabet[22],alphabet[23],alphabet[25],alphabet[16]},
		      {alphabet[16],alphabet[1],alphabet[2],alphabet[3],alphabet[20],alphabet[5],alphabet[6],alphabet[7],alphabet[24],alphabet[9],alphabet[10],alphabet[0],alphabet[11],alphabet[13],alphabet[14],alphabet[4],alphabet[15],alphabet[17],alphabet[18],alphabet[8],alphabet[19],alphabet[21],alphabet[22],alphabet[12],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[16],alphabet[2],alphabet[3],alphabet[5],alphabet[20],alphabet[6],alphabet[7],alphabet[9],alphabet[24],alphabet[10],alphabet[11],alphabet[0],alphabet[13],alphabet[14],alphabet[15],alphabet[4],alphabet[17],alphabet[18],alphabet[19],alphabet[8],alphabet[21],alphabet[22],alphabet[23],alphabet[12],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[16],alphabet[3],alphabet[5],alphabet[6],alphabet[20],alphabet[7],alphabet[9],alphabet[10],alphabet[24],alphabet[11],alphabet[0],alphabet[13],alphabet[14],alphabet[15],alphabet[4],alphabet[17],alphabet[18],alphabet[19],alphabet[8],alphabet[21],alphabet[22],alphabet[23],alphabet[12],alphabet[25]},
		    	      
		      {alphabet[1],alphabet[25],alphabet[2],alphabet[0],alphabet[3],alphabet[4],alphabet[6],alphabet[7],alphabet[5],alphabet[8],alphabet[9],alphabet[11],alphabet[12],alphabet[10],alphabet[13],alphabet[14],alphabet[16],alphabet[17],alphabet[15],alphabet[18],alphabet[19],alphabet[21],alphabet[22],alphabet[20],alphabet[23],alphabet[24]},
		      {alphabet[1],alphabet[2],alphabet[25],alphabet[3],alphabet[0],alphabet[4],alphabet[6],alphabet[7],alphabet[8],alphabet[5],alphabet[9],alphabet[11],alphabet[12],alphabet[13],alphabet[10],alphabet[14],alphabet[16],alphabet[17],alphabet[18],alphabet[15],alphabet[19],alphabet[21],alphabet[22],alphabet[23],alphabet[20],alphabet[24]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[25],alphabet[4],alphabet[0],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[5],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[10],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[15],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[20]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[25],alphabet[0],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[5],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[10],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[15],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[20]},
		      {alphabet[20],alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[25],alphabet[6],alphabet[0],alphabet[7],alphabet[8],alphabet[9],alphabet[11],alphabet[5],alphabet[12],alphabet[13],alphabet[14],alphabet[16],alphabet[10],alphabet[17],alphabet[18],alphabet[19],alphabet[21],alphabet[15],alphabet[22],alphabet[23],alphabet[24]},
		      {alphabet[1],alphabet[20],alphabet[2],alphabet[3],alphabet[4],alphabet[6],alphabet[25],alphabet[7],alphabet[0],alphabet[8],alphabet[9],alphabet[11],alphabet[12],alphabet[5],alphabet[13],alphabet[14],alphabet[16],alphabet[17],alphabet[10],alphabet[18],alphabet[19],alphabet[21],alphabet[22],alphabet[15],alphabet[23],alphabet[24]},
		      {alphabet[1],alphabet[2],alphabet[20],alphabet[3],alphabet[4],alphabet[6],alphabet[7],alphabet[25],alphabet[8],alphabet[0],alphabet[9],alphabet[11],alphabet[12],alphabet[13],alphabet[5],alphabet[14],alphabet[16],alphabet[17],alphabet[18],alphabet[10],alphabet[19],alphabet[21],alphabet[22],alphabet[23],alphabet[15],alphabet[24]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[20],alphabet[4],alphabet[6],alphabet[7],alphabet[8],alphabet[25],alphabet[9],alphabet[0],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[5],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[10],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[15]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[20],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[25],alphabet[0],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[5],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[10],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[15]},
		      {alphabet[15],alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[20],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[25],alphabet[11],alphabet[0],alphabet[12],alphabet[13],alphabet[14],alphabet[16],alphabet[5],alphabet[17],alphabet[18],alphabet[19],alphabet[21],alphabet[10],alphabet[22],alphabet[23],alphabet[24]},
		      {alphabet[1],alphabet[15],alphabet[2],alphabet[3],alphabet[4],alphabet[6],alphabet[20],alphabet[7],alphabet[8],alphabet[9],alphabet[11],alphabet[25],alphabet[12],alphabet[0],alphabet[13],alphabet[14],alphabet[16],alphabet[17],alphabet[5],alphabet[18],alphabet[19],alphabet[21],alphabet[22],alphabet[10],alphabet[23],alphabet[24]},
		     
		      {alphabet[24],alphabet[1],alphabet[2],alphabet[0],alphabet[3],alphabet[4],alphabet[5],alphabet[7],alphabet[8],alphabet[6],alphabet[9],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[12],alphabet[15],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[18],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[24],alphabet[2],alphabet[3],alphabet[0],alphabet[4],alphabet[5],alphabet[7],alphabet[8],alphabet[9],alphabet[6],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[12],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[21],alphabet[18],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[24],alphabet[3],alphabet[4],alphabet[0],alphabet[5],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[6],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[12],alphabet[17],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[18],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[24],alphabet[4],alphabet[5],alphabet[0],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[6],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[12],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[18],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[24],alphabet[5],alphabet[0],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[6],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[12],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[18],alphabet[25]},   
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[24],alphabet[7],alphabet[0],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[13],alphabet[6],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[19],alphabet[12],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25],alphabet[18]},
		      {alphabet[18],alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[24],alphabet[7],alphabet[8],alphabet[0],alphabet[9],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[6],alphabet[15],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[12],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[18],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[7],alphabet[24],alphabet[8],alphabet[9],alphabet[0],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[6],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[21],alphabet[12],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[18],alphabet[3],alphabet[4],alphabet[5],alphabet[7],alphabet[8],alphabet[24],alphabet[9],alphabet[10],alphabet[0],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[6],alphabet[17],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[12],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[18],alphabet[4],alphabet[5],alphabet[7],alphabet[8],alphabet[9],alphabet[24],alphabet[10],alphabet[11],alphabet[0],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[6],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[12],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[18],alphabet[5],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[24],alphabet[11],alphabet[0],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[6],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[12],alphabet[25]},
		    	      
		      {alphabet[1],alphabet[2],alphabet[0],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[8],alphabet[9],alphabet[7],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[15],alphabet[16],alphabet[14],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[22],alphabet[23],alphabet[21],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[0],alphabet[4],alphabet[5],alphabet[6],alphabet[8],alphabet[9],alphabet[10],alphabet[7],alphabet[11],alphabet[12],alphabet[13],alphabet[15],alphabet[16],alphabet[17],alphabet[14],alphabet[18],alphabet[19],alphabet[20],alphabet[22],alphabet[23],alphabet[24],alphabet[21],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[0],alphabet[5],alphabet[6],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[7],alphabet[12],alphabet[13],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[14],alphabet[19],alphabet[20],alphabet[22],alphabet[23],alphabet[24],alphabet[25],alphabet[21]},
		      {alphabet[21],alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[0],alphabet[6],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[12],alphabet[7],alphabet[13],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[14],alphabet[20],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[21],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[0],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[7],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[14],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[21],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[0],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[7],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[14],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[21],alphabet[4],alphabet[5],alphabet[6],alphabet[8],alphabet[0],alphabet[9],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[15],alphabet[7],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[22],alphabet[14],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[21],alphabet[5],alphabet[6],alphabet[8],alphabet[9],alphabet[0],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[15],alphabet[16],alphabet[7],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[22],alphabet[23],alphabet[14],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[21],alphabet[6],alphabet[8],alphabet[9],alphabet[10],alphabet[0],alphabet[11],alphabet[12],alphabet[13],alphabet[15],alphabet[16],alphabet[17],alphabet[7],alphabet[18],alphabet[19],alphabet[20],alphabet[22],alphabet[23],alphabet[24],alphabet[14],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[21],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[0],alphabet[12],alphabet[13],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[7],alphabet[19],alphabet[20],alphabet[22],alphabet[23],alphabet[24],alphabet[25],alphabet[14]},
		      {alphabet[14],alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[21],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[12],alphabet[0],alphabet[13],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[7],alphabet[20],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      
		      {alphabet[24],alphabet[1],alphabet[2],alphabet[0],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[9],alphabet[10],alphabet[8],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[17],alphabet[18],alphabet[16],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[24],alphabet[2],alphabet[3],alphabet[0],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[9],alphabet[10],alphabet[11],alphabet[8],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[17],alphabet[18],alphabet[19],alphabet[16],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[24],alphabet[3],alphabet[4],alphabet[0],alphabet[5],alphabet[6],alphabet[7],alphabet[9],alphabet[10],alphabet[11],alphabet[12],alphabet[8],alphabet[13],alphabet[14],alphabet[15],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[16],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[24],alphabet[4],alphabet[5],alphabet[0],alphabet[6],alphabet[7],alphabet[9],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[8],alphabet[14],alphabet[15],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[16],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[24],alphabet[5],alphabet[6],alphabet[0],alphabet[7],alphabet[9],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[8],alphabet[15],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[16],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[24],alphabet[6],alphabet[7],alphabet[0],alphabet[9],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[8],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[16],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[24],alphabet[7],alphabet[0],alphabet[9],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[8],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[16],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[24],alphabet[9],alphabet[0],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[17],alphabet[8],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25],alphabet[16]},
		      {alphabet[16],alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[24],alphabet[9],alphabet[10],alphabet[0],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[17],alphabet[18],alphabet[8],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[16],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[9],alphabet[24],alphabet[10],alphabet[11],alphabet[0],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[17],alphabet[18],alphabet[19],alphabet[8],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[16],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[9],alphabet[10],alphabet[24],alphabet[11],alphabet[12],alphabet[0],alphabet[13],alphabet[14],alphabet[15],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[8],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		     
		      {alphabet[1],alphabet[2],alphabet[0],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[10],alphabet[11],alphabet[9],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[18],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[0],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[10],alphabet[11],alphabet[12],alphabet[9],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[21],alphabet[18],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[0],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[9],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[18],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[0],alphabet[6],alphabet[7],alphabet[8],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[9],alphabet[15],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[18],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[0],alphabet[7],alphabet[8],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[9],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[18],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[0],alphabet[8],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[9],alphabet[17],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25],alphabet[18]},
		      {alphabet[18],alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[0],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[9],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[18],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[0],alphabet[10],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[9],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[18],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[10],alphabet[0],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[19],alphabet[9],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[18],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[10],alphabet[11],alphabet[0],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[9],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[18],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[10],alphabet[11],alphabet[12],alphabet[0],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[19],alphabet[20],alphabet[21],alphabet[9],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      
		      {alphabet[1],alphabet[2],alphabet[0],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[11],alphabet[12],alphabet[10],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[21],alphabet[22],alphabet[20],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[0],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[11],alphabet[12],alphabet[13],alphabet[10],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[21],alphabet[22],alphabet[23],alphabet[20],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[0],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[10],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[20],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[0],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[10],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25],alphabet[20]},
		      {alphabet[20],alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[0],alphabet[7],alphabet[8],alphabet[9],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[10],alphabet[17],alphabet[18],alphabet[19],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[20],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[0],alphabet[8],alphabet[9],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[10],alphabet[18],alphabet[19],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[20],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[0],alphabet[9],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[10],alphabet[19],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[20],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[0],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[10],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[20],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[0],alphabet[11],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[10],alphabet[21],alphabet[22],alphabet[23],alphabet[24],alphabet[25]}, 
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[20],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[11],alphabet[0],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[21],alphabet[10],alphabet[22],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[20],alphabet[7],alphabet[8],alphabet[9],alphabet[11],alphabet[12],alphabet[0],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[21],alphabet[22],alphabet[10],alphabet[23],alphabet[24],alphabet[25]},
		      
		      {alphabet[1],alphabet[2],alphabet[0],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[12],alphabet[13],alphabet[11],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[23],alphabet[24],alphabet[22],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[0],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[12],alphabet[13],alphabet[14],alphabet[11],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[23],alphabet[24],alphabet[25],alphabet[22]},
		      {alphabet[22],alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[0],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[11],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[22],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[0],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[11],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[22],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[0],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[11],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[22],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[0],alphabet[8],alphabet[9],alphabet[10],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[11],alphabet[19],alphabet[20],alphabet[21],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[22],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[0],alphabet[9],alphabet[10],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[11],alphabet[20],alphabet[21],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[22],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[0],alphabet[10],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[11],alphabet[21],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[22],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[0],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[11],alphabet[23],alphabet[24],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[22],alphabet[8],alphabet[9],alphabet[10],alphabet[0],alphabet[12],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[11],alphabet[23],alphabet[24],alphabet[25]},   
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[22],alphabet[9],alphabet[10],alphabet[12],alphabet[0],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[23],alphabet[11],alphabet[24],alphabet[25]},
		      
		      {alphabet[24],alphabet[1],alphabet[2],alphabet[0],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[12],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[24],alphabet[2],alphabet[3],alphabet[0],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[12],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[24],alphabet[3],alphabet[4],alphabet[0],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[12],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[24],alphabet[4],alphabet[5],alphabet[0],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[12],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[24],alphabet[5],alphabet[6],alphabet[0],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[12],alphabet[19],alphabet[20],alphabet[22],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[24],alphabet[6],alphabet[7],alphabet[0],alphabet[8],alphabet[9],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[12],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[24],alphabet[7],alphabet[8],alphabet[0],alphabet[9],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[12],alphabet[21],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[24],alphabet[8],alphabet[9],alphabet[0],alphabet[10],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[12],alphabet[22],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[24],alphabet[9],alphabet[10],alphabet[0],alphabet[11],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[12],alphabet[23],alphabet[25]},
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[24],alphabet[10],alphabet[11],alphabet[0],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[12],alphabet[25]}, 
		      {alphabet[1],alphabet[2],alphabet[3],alphabet[4],alphabet[5],alphabet[6],alphabet[7],alphabet[8],alphabet[9],alphabet[10],alphabet[24],alphabet[11],alphabet[0],alphabet[13],alphabet[14],alphabet[15],alphabet[16],alphabet[17],alphabet[18],alphabet[19],alphabet[20],alphabet[21],alphabet[22],alphabet[23],alphabet[12],alphabet[25]}
		      };
	      
	      //Cryptage
	      
	      //Entrée du message à crypter
	      
	      System.out.println("Veuillez svp introduire le text à encrypter:");
	      sc.nextLine();
	      String str = sc.nextLine();
	      str = str.toLowerCase();
	      str = str.replaceAll("\\s","");
	      System.out.println("Vous avez saisi : " + str);
		    
	      //Premier changement fait à l'alphabet
	      
		    int n = 0;
		    
		    ArrayList<Character> encryptedMessage = new ArrayList<Character>();
		    ArrayList<Character> baseAlphabet = new ArrayList<Character>();
		    ArrayList<Character> baseAlphabet3 = new ArrayList<Character>();
		    
		    int monIndice1 = 0;
		    int index = 0;
		    
		    int a = -(nbr5*2);
			int b = -(nbr5*2);
		    int p = 0;
		    int j = 0;
		    int j2 = 0;
		    char nletter = ' ';
		    
		   // System.out.println("List2_1: "+list2_1);
		    	
		    for (n = 0; n<str.length(); n++) {
		    	
		    	baseAlphabet.clear();
		    		
		    //	System.out.println("NEW LETTER!!!");
		    	
		    	if (n == 0) {
		    	a = a+(nbr5*2);
		    	b = b+(nbr5*2+1);
		    	}
		    	else {
		    		a = n*(nbr5*2);
		    		b = n*(nbr5*2)+1;
		    	}
		    	nletter = str.charAt(n);
		    	
		    	for (j=0 ; j< alphabet.length ; j++) {
		    		if (nletter == (alphabet[j])) {
		    			j2 = j;
		    			
		    		}
		    	}
		    	/*
		    	System.out.println("a="+a);
		    	System.out.println("b="+b);
		    	System.out.println("list2_1.get(a): "+list2_1.get(a));
		    	System.out.println("list2_1.get(b): "+list2_1.get(b));
		    	*/		
		    	if (list2_1.get(a) == 2) {
		    		index = list2_1.get(b)-2;
		    	}
		    	else if (list2_1.get(a) == 3) {
		   		index = 11+list2_1.get(b)-2;
		    	}
		  	else if (list2_1.get(a) == 4) {
		    		index = 22+list2_1.get(b)-2;
		    	}
		    	else if (list2_1.get(a) == 5) {
		    		index = 33+list2_1.get(b)-2;
		    	}
		    	else if (list2_1.get(a) == 6) {
		    		index = 44+list2_1.get(b)-2;
		    	}
		    	else if (list2_1.get(a) == 7) {
		    		index = 55+list2_1.get(b)-2;
		    	}
		    	else if (list2_1.get(a) == 8) {
		    		index = 66+list2_1.get(b)-2;
		    	}
		    	else if (list2_1.get(a) == 9) {
		    		index = 77+list2_1.get(b)-2;
		    	}
		    	else if (list2_1.get(a) == 10) {
		    		index = 88+list2_1.get(b)-2;
		    	}
		    	else if (list2_1.get(a) == 11) {
		    		index = 99+list2_1.get(b)-2;
		    	}
		    	else if (list2_1.get(a) == 12) {
		    		index = 111+list2_1.get(b)-2;
		    	}
		    			
		   	monIndice1 = index;
		    			
		    	for (int t = 0; t<26; t++) {
		    		baseAlphabet.add(change[monIndice1][t]);
		    	}
		    	/*
		    	System.out.println("Base: "+baseAlphabet);
		    	*/		
		    	a = a+2;
		    	b = b+2;
		    	/*		
		    	System.out.println(baseAlphabet);
		    */
		    
		    	//Changements préprogrammer pour tous les changements de l'alphabet sauf le premier
		    	
		    		char baseAlphabet2[] = {baseAlphabet.get(0),baseAlphabet.get(1),baseAlphabet.get(2),baseAlphabet.get(3),baseAlphabet.get(4),baseAlphabet.get(5),baseAlphabet.get(6),baseAlphabet.get(7),baseAlphabet.get(8),baseAlphabet.get(9),baseAlphabet.get(10),baseAlphabet.get(11),baseAlphabet.get(12),baseAlphabet.get(13),baseAlphabet.get(14),baseAlphabet.get(15),baseAlphabet.get(16),baseAlphabet.get(17),baseAlphabet.get(18),baseAlphabet.get(19),baseAlphabet.get(20),baseAlphabet.get(21),baseAlphabet.get(22),baseAlphabet.get(23),baseAlphabet.get(24),baseAlphabet.get(25)};
	    			
	    			char change2[][] = {
	    			    	  {baseAlphabet2[24],baseAlphabet2[1],baseAlphabet2[0],baseAlphabet2[3],baseAlphabet2[2],baseAlphabet2[5],baseAlphabet2[4],baseAlphabet2[7],baseAlphabet2[6],baseAlphabet2[9],baseAlphabet2[8],baseAlphabet2[11],baseAlphabet2[10],baseAlphabet2[13],baseAlphabet2[12],baseAlphabet2[15],baseAlphabet2[14],baseAlphabet2[17],baseAlphabet2[16],baseAlphabet2[19],baseAlphabet2[18],baseAlphabet2[21],baseAlphabet2[20],baseAlphabet2[23],baseAlphabet2[22],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[24],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[2],baseAlphabet2[7],baseAlphabet2[4],baseAlphabet2[9],baseAlphabet2[6],baseAlphabet2[11],baseAlphabet2[8],baseAlphabet2[13],baseAlphabet2[10],baseAlphabet2[15],baseAlphabet2[12],baseAlphabet2[17],baseAlphabet2[14],baseAlphabet2[19],baseAlphabet2[16],baseAlphabet2[21],baseAlphabet2[18],baseAlphabet2[23],baseAlphabet2[20],baseAlphabet2[25],baseAlphabet2[22]},
	    			      {baseAlphabet2[22],baseAlphabet2[1],baseAlphabet2[24],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[2],baseAlphabet2[7],baseAlphabet2[4],baseAlphabet2[9],baseAlphabet2[6],baseAlphabet2[11],baseAlphabet2[8],baseAlphabet2[13],baseAlphabet2[10],baseAlphabet2[15],baseAlphabet2[12],baseAlphabet2[17],baseAlphabet2[14],baseAlphabet2[19],baseAlphabet2[16],baseAlphabet2[21],baseAlphabet2[18],baseAlphabet2[23],baseAlphabet2[20],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[22],baseAlphabet2[3],baseAlphabet2[24],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[2],baseAlphabet2[9],baseAlphabet2[4],baseAlphabet2[11],baseAlphabet2[6],baseAlphabet2[13],baseAlphabet2[8],baseAlphabet2[15],baseAlphabet2[10],baseAlphabet2[17],baseAlphabet2[12],baseAlphabet2[19],baseAlphabet2[14],baseAlphabet2[21],baseAlphabet2[16],baseAlphabet2[23],baseAlphabet2[18],baseAlphabet2[25],baseAlphabet2[20]},
	    			      {baseAlphabet2[20],baseAlphabet2[1],baseAlphabet2[22],baseAlphabet2[3],baseAlphabet2[24],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[2],baseAlphabet2[9],baseAlphabet2[4],baseAlphabet2[11],baseAlphabet2[6],baseAlphabet2[13],baseAlphabet2[8],baseAlphabet2[15],baseAlphabet2[10],baseAlphabet2[17],baseAlphabet2[12],baseAlphabet2[19],baseAlphabet2[14],baseAlphabet2[21],baseAlphabet2[16],baseAlphabet2[23],baseAlphabet2[18],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[20],baseAlphabet2[3],baseAlphabet2[22],baseAlphabet2[5],baseAlphabet2[24],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[2],baseAlphabet2[11],baseAlphabet2[4],baseAlphabet2[13],baseAlphabet2[6],baseAlphabet2[15],baseAlphabet2[8],baseAlphabet2[17],baseAlphabet2[10],baseAlphabet2[19],baseAlphabet2[12],baseAlphabet2[21],baseAlphabet2[14],baseAlphabet2[23],baseAlphabet2[16],baseAlphabet2[25],baseAlphabet2[18]},
	    			      {baseAlphabet2[18],baseAlphabet2[1],baseAlphabet2[20],baseAlphabet2[3],baseAlphabet2[22],baseAlphabet2[5],baseAlphabet2[24],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[2],baseAlphabet2[11],baseAlphabet2[4],baseAlphabet2[13],baseAlphabet2[6],baseAlphabet2[15],baseAlphabet2[8],baseAlphabet2[17],baseAlphabet2[10],baseAlphabet2[19],baseAlphabet2[12],baseAlphabet2[21],baseAlphabet2[14],baseAlphabet2[23],baseAlphabet2[16],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[18],baseAlphabet2[3],baseAlphabet2[20],baseAlphabet2[5],baseAlphabet2[22],baseAlphabet2[7],baseAlphabet2[24],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[2],baseAlphabet2[13],baseAlphabet2[4],baseAlphabet2[15],baseAlphabet2[6],baseAlphabet2[17],baseAlphabet2[8],baseAlphabet2[19],baseAlphabet2[10],baseAlphabet2[21],baseAlphabet2[12],baseAlphabet2[23],baseAlphabet2[14],baseAlphabet2[25],baseAlphabet2[16]},
	    			      {baseAlphabet2[16],baseAlphabet2[1],baseAlphabet2[18],baseAlphabet2[3],baseAlphabet2[20],baseAlphabet2[5],baseAlphabet2[22],baseAlphabet2[7],baseAlphabet2[24],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[2],baseAlphabet2[13],baseAlphabet2[4],baseAlphabet2[15],baseAlphabet2[6],baseAlphabet2[17],baseAlphabet2[8],baseAlphabet2[19],baseAlphabet2[10],baseAlphabet2[21],baseAlphabet2[12],baseAlphabet2[23],baseAlphabet2[14],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[16],baseAlphabet2[3],baseAlphabet2[18],baseAlphabet2[5],baseAlphabet2[20],baseAlphabet2[7],baseAlphabet2[22],baseAlphabet2[9],baseAlphabet2[24],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[2],baseAlphabet2[15],baseAlphabet2[4],baseAlphabet2[17],baseAlphabet2[6],baseAlphabet2[19],baseAlphabet2[8],baseAlphabet2[21],baseAlphabet2[10],baseAlphabet2[23],baseAlphabet2[12],baseAlphabet2[25],baseAlphabet2[14]},
	    			      {baseAlphabet2[14],baseAlphabet2[1],baseAlphabet2[16],baseAlphabet2[3],baseAlphabet2[18],baseAlphabet2[5],baseAlphabet2[20],baseAlphabet2[7],baseAlphabet2[22],baseAlphabet2[9],baseAlphabet2[24],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[2],baseAlphabet2[15],baseAlphabet2[4],baseAlphabet2[17],baseAlphabet2[6],baseAlphabet2[19],baseAlphabet2[8],baseAlphabet2[21],baseAlphabet2[10],baseAlphabet2[23],baseAlphabet2[12],baseAlphabet2[25]},
	    			    		  
	    			      {baseAlphabet2[24],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[3],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[6],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[9],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[12],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[15],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[18],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[21],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[24],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[3],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[6],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[9],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[12],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[15],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[18],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[21],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[24],baseAlphabet2[4],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[7],baseAlphabet2[3],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[6],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[9],baseAlphabet2[14],baseAlphabet2[16],baseAlphabet2[12],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[15],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[18],baseAlphabet2[23],baseAlphabet2[25],baseAlphabet2[21]},
	    			      {baseAlphabet2[21],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[24],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[3],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[6],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[9],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[12],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[15],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[18],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[21],baseAlphabet2[2],baseAlphabet2[4],baseAlphabet2[24],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[3],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[6],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[9],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[12],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[15],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[18],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[21],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[24],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[3],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[6],baseAlphabet2[14],baseAlphabet2[16],baseAlphabet2[9],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[12],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[15],baseAlphabet2[23],baseAlphabet2[25],baseAlphabet2[18]},
	    			      {baseAlphabet2[18],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[21],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[24],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[0],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[3],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[6],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[9],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[12],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[15],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[18],baseAlphabet2[2],baseAlphabet2[4],baseAlphabet2[21],baseAlphabet2[5],baseAlphabet2[7],baseAlphabet2[24],baseAlphabet2[8],baseAlphabet2[0],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[3],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[6],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[9],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[12],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[15],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[18],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[21],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[24],baseAlphabet2[10],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[3],baseAlphabet2[14],baseAlphabet2[16],baseAlphabet2[6],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[9],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[12],baseAlphabet2[23],baseAlphabet2[25],baseAlphabet2[15]},
	    			      {baseAlphabet2[15],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[18],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[21],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[24],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[3],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[6],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[9],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[12],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[15],baseAlphabet2[2],baseAlphabet2[4],baseAlphabet2[18],baseAlphabet2[5],baseAlphabet2[7],baseAlphabet2[21],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[24],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[3],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[6],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[9],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[12],baseAlphabet2[25]},
	    			    	      
	    			      {baseAlphabet2[24],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[3],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[4],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[8],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[12],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[16],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[20],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[24],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[4],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[8],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[12],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[16],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[20],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[24],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[4],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[8],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[12],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[16],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[20],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[24],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[4],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[8],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[12],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[16],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25],baseAlphabet2[20]},
	    			      {baseAlphabet2[20],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[24],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[4],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[8],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[12],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[16],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[20],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[5],baseAlphabet2[24],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[4],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[8],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[12],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[16],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[20],baseAlphabet2[3],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[24],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[4],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[8],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[12],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[16],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[20],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[24],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[4],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[8],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[12],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25],baseAlphabet2[16]},
	    			      {baseAlphabet2[16],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[20],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[24],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[4],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[8],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[12],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[16],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[5],baseAlphabet2[20],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[24],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[4],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[8],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[12],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[16],baseAlphabet2[3],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[20],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[24],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[4],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[8],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[12],baseAlphabet2[25]},
	    			    	      
	    			      {baseAlphabet2[1],baseAlphabet2[25],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[5],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[10],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[15],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[20],baseAlphabet2[23],baseAlphabet2[24]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[25],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[4],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[5],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[10],baseAlphabet2[14],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[15],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[20],baseAlphabet2[24]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[25],baseAlphabet2[4],baseAlphabet2[0],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[5],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[10],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[15],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[20]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[25],baseAlphabet2[0],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[5],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[10],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[15],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[20]},
	    			      {baseAlphabet2[20],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[25],baseAlphabet2[6],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[5],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[16],baseAlphabet2[10],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[15],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24]},
	    			      {baseAlphabet2[1],baseAlphabet2[20],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[6],baseAlphabet2[25],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[5],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[10],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[15],baseAlphabet2[23],baseAlphabet2[24]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[20],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[25],baseAlphabet2[8],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[5],baseAlphabet2[14],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[10],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[15],baseAlphabet2[24]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[20],baseAlphabet2[4],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[25],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[5],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[10],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[15]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[20],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[25],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[5],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[10],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[15]},
	    			      {baseAlphabet2[15],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[20],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[25],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[16],baseAlphabet2[5],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[10],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24]},
	    			      {baseAlphabet2[1],baseAlphabet2[15],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[6],baseAlphabet2[20],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[25],baseAlphabet2[12],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[5],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[10],baseAlphabet2[23],baseAlphabet2[24]},
	    			     
	    			      {baseAlphabet2[24],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[6],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[12],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[18],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[24],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[6],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[12],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[18],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[24],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[6],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[12],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[18],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[24],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[6],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[12],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[18],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[24],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[6],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[12],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[18],baseAlphabet2[25]},   
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[24],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[6],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[12],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25],baseAlphabet2[18]},
	    			      {baseAlphabet2[18],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[24],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[6],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[12],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[18],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[7],baseAlphabet2[24],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[6],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[12],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[18],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[24],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[6],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[12],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[18],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[24],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[6],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[12],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[18],baseAlphabet2[5],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[24],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[6],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[12],baseAlphabet2[25]},
	    			    	      
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[7],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[14],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[21],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[7],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[14],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[21],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[7],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[14],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25],baseAlphabet2[21]},
	    			      {baseAlphabet2[21],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[6],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[7],baseAlphabet2[13],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[14],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[21],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[0],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[7],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[14],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[21],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[0],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[7],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[14],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[21],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[8],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[15],baseAlphabet2[7],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[14],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[21],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[7],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[14],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[21],baseAlphabet2[6],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[7],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[14],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[21],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[7],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25],baseAlphabet2[14]},
	    			      {baseAlphabet2[14],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[21],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[7],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      
	    			      {baseAlphabet2[24],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[8],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[16],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[24],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[8],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[16],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[24],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[8],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[16],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[24],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[8],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[16],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[24],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[8],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[16],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[24],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[8],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[16],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[24],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[8],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[16],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[24],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[8],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25],baseAlphabet2[16]},
	    			      {baseAlphabet2[16],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[24],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[8],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[16],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[24],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[8],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[16],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[24],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[8],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			     
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[9],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[18],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[9],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[18],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[9],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[18],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[9],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[18],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[9],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[18],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[9],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25],baseAlphabet2[18]},
	    			      {baseAlphabet2[18],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[0],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[9],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[18],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[0],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[9],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[18],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[9],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[18],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[9],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[18],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[9],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[10],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[20],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[10],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[20],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[10],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[20],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[10],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25],baseAlphabet2[20]},
	    			      {baseAlphabet2[20],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[10],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[20],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[10],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[20],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[10],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[20],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[10],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[20],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[10],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]}, 
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[20],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[10],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[20],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[11],baseAlphabet2[12],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[10],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[11],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[22],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[11],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25],baseAlphabet2[22]},
	    			      {baseAlphabet2[22],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[11],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[22],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[11],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[22],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[11],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[22],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[11],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[22],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[11],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[22],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[10],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[11],baseAlphabet2[21],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[22],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[0],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[11],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[22],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[0],baseAlphabet2[12],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[11],baseAlphabet2[23],baseAlphabet2[24],baseAlphabet2[25]},   
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[22],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[12],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[23],baseAlphabet2[11],baseAlphabet2[24],baseAlphabet2[25]},
	    			      
	    			      {baseAlphabet2[24],baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[0],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[12],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[24],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[0],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[12],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[24],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[0],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[12],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[24],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[0],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[12],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[24],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[0],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[12],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[22],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[24],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[0],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[12],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[24],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[0],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[12],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[24],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[0],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[12],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[24],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[0],baseAlphabet2[11],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[12],baseAlphabet2[23],baseAlphabet2[25]},
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[24],baseAlphabet2[10],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[12],baseAlphabet2[25]}, 
	    			      {baseAlphabet2[1],baseAlphabet2[2],baseAlphabet2[3],baseAlphabet2[4],baseAlphabet2[5],baseAlphabet2[6],baseAlphabet2[7],baseAlphabet2[8],baseAlphabet2[9],baseAlphabet2[10],baseAlphabet2[24],baseAlphabet2[11],baseAlphabet2[0],baseAlphabet2[13],baseAlphabet2[14],baseAlphabet2[15],baseAlphabet2[16],baseAlphabet2[17],baseAlphabet2[18],baseAlphabet2[19],baseAlphabet2[20],baseAlphabet2[21],baseAlphabet2[22],baseAlphabet2[23],baseAlphabet2[12],baseAlphabet2[25]}
	    			      };
		    
		    
	    			//Autres changements de l'alphabet déjà changé une fois
	    			
	    			String whyNot = "";
		    
	    			for (p=1; p<nbr4; p++) {
	    			
	    				baseAlphabet3.clear();
	    			/*
	    				System.out.println("a="+a);
	    				System.out.println("b="+b);
	    				System.out.println("list2_1.get(a): "+list2_1.get(a));
	    				System.out.println("list2_1.get(b): "+list2_1.get(b));
	    			*/
	    				if (list2_1.get(a) == 2) {
	    					index = list2_1.get(b)-2;
	    				}
	    				else if (list2_1.get(a) == 3) {
	    					index = 11+list2_1.get(b)-2;
	    				}
	    				else if (list2_1.get(a) == 4) {
	    					index = 22+list2_1.get(b)-2;
	    				}	
	    				else if (list2_1.get(a) == 5) {
	    					index = 33+list2_1.get(b)-2;
	    				}
	    				else if (list2_1.get(a) == 6) {
	    					index = 44+list2_1.get(b)-2;
	    				}
	    				else if (list2_1.get(a) == 7) {
	    					index = 55+list2_1.get(b)-2;
	    				}
	    				else if (list2_1.get(a) == 8) {
	    					index = 66+list2_1.get(b)-2;
	    				}
	    				else if (list2_1.get(a) == 9) {
	    					index = 77+list2_1.get(b)-2;
	    				}
	    				else if (list2_1.get(a) == 10) {
	    					index = 88+list2_1.get(b)-2;
	    				}
	    				else if (list2_1.get(a) == 11) {
	    					index = 99+list2_1.get(b)-2;
	    				}
	    				else if (list2_1.get(a) == 12) {
	    					index = 111+list2_1.get(b)-2;
	    				}
	    			
	    				monIndice1 = index;
	    			
	    				for (int t = 0; t<26; t++) {
	    					baseAlphabet3.add(change2[monIndice1][t]);
	    				}
	    				/*
	    				System.out.println("Base: "+baseAlphabet3);
	    			*/
	    				
	    				baseAlphabet.clear();
	    				for (int z = 0; z<26; z++) {
	    					baseAlphabet.add(baseAlphabet3.get(z));
	    				}
	    				
	    				baseAlphabet2 = new char[]{baseAlphabet.get(0),baseAlphabet.get(1),baseAlphabet.get(2),baseAlphabet.get(3),baseAlphabet.get(4),baseAlphabet.get(5),baseAlphabet.get(6),baseAlphabet.get(7),baseAlphabet.get(8),baseAlphabet.get(9),baseAlphabet.get(10),baseAlphabet.get(11),baseAlphabet.get(12),baseAlphabet.get(13),baseAlphabet.get(14),baseAlphabet.get(15),baseAlphabet.get(16),baseAlphabet.get(17),baseAlphabet.get(18),baseAlphabet.get(19),baseAlphabet.get(20),baseAlphabet.get(21),baseAlphabet.get(22),baseAlphabet.get(23),baseAlphabet.get(24),baseAlphabet.get(25)};
	    				whyNot = String.valueOf(baseAlphabet2);
	    				//System.out.println("baseAlphabet2: "+whyNot);
	    				a = a+2;
	    				b = b+2;
	    			}

	    			//System.out.println("j = "+j2);	
			    	encryptedMessage.add(whyNot.charAt(j2));
			    	
		    }
		    
		    //Sortie du message crypté
		    
		    System.out.print("Votre message crypté est : ");
		    for (int h = 0; h<encryptedMessage.size(); h++) {
		    		System.out.print(encryptedMessage.get(h));
		    }
	}
}