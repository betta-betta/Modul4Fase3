import java.util.ArrayList;
import java.util.Scanner;

public class MOdul4Fase3 {

	public static void main(String[] args) {
		int euro5=5;
		int euro10=10;
		int euro20=20;
		int euro50=50;
		int euro100=100;
		int euro200=200;
		int euro500=500;
		int total=0;
		String eleccio;
		int resp=1;
		String[] menu = new String[2];
		Integer[] preu = new Integer[2];
		
		Scanner sc =new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		for(int i=0;i<menu.length;i++) 
		{
			System.out.println("Introdueix el nom del "+(i+1)+" plat del menu: ");
		    String nomPlat= sc.nextLine();
		    	menu[i]= nomPlat;
		    	System.out.println("Introdueix el preu del "+(i+1)+" plat del menu: ");
				Integer preuPlat = sc1.nextInt();	
				preu[i]=preuPlat;
			
				
		}
		for(int i=0;i<menu.length;i++) 
		{
			System.out.println("EL preu del plat número "+i+" "+menu[i]+" és : "+preu[i] );
		}
		
		
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		ArrayList<String> comanda = new  ArrayList <String>();
		System.out.println(" no");
		while  (resp>=1) {
			
			System.out.println("Introdueixi el número del plat que vol demanà:");
			eleccio=sc3.nextLine();
			
			comanda.add(eleccio);
		
			
			System.out.println("Si vols demanar un altre plat marca el número 1, si vols acabar de demanar, marcael número 0");	
			resp=sc4.nextInt();
			 
			}
		///solo para saber que sale en pantalla	
		System.out.println(comanda.get(0)+" "+menu[0]);
		//+++++++++++++++++++++++++++++++++++++++++
			for(int i=0;i<comanda.size();i++)
		{
			 
			for (int j=0;j<menu.length;j++)
			{
				if (comanda.get(i)==(menu[j])) 
				{
					total+=preu[i];
					
				}
				
				
				
			}
			
			
		}
			System.out.println("Total de la conta : "+total);
			sc.close();
			sc1.close();
			sc3.close();
			sc4.close();

	}

}
