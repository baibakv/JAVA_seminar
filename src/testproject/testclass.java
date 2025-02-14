package testproject;

import java.util.Arrays;

/**
 * @author localuser
 * @version
 * MainService class for JAVA basics
 * 
 */

public class testclass {

	private static String name;
	//garais pieraksts---> name = new String ("Baiba");
	private static int age;
	private static float height;
	private static boolean hasExperienceInJAVA;
	private static char sex;
	

	public static void main(String[] args) {
		//vienas rindas komentārs
		
		/*
		 vairāku rindu kometārs
		 */
		// ------------------------- Mainīgo piemēri-----------------------//
		System.out.println("Hai! :3");
		name = "Baiba";
		age = 21;
		height = 1.69f;
		hasExperienceInJAVA = false;
		sex = 'F'; //var arī sex = 70;, jo pēc ASCII paņems
		
		var surname = "Kvizikeviča";//nav ieteicams izmantot var apmācibu procesā
		
		System.out.println(name + " " + surname + " (" + age + ") " 
				+ height + " m, ir pieredze JAVA: " + hasExperienceInJAVA
				+ ", dzimums: " + sex);
		

		// ------------------------- Masīvu piemēri-----------------------//
		
		int [] grades = {3, 5, 8, 1, 7, 9, 10}; //ja veidošanas brīdī ir zināmas šūnu vērtības
		System.out.println(grades[3]);//grades[100] <-izmetīs kļūdu
		System.out.println(grades);//izprintēs tikai adresi
		grades[3] = 10;
		
		//izprintēs visus elementus
		for(int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		System.out.println();
		System.out.println("hei");
		
		System.out.println(Arrays.toString(grades));
		
		
		//foreach cikli
		for(int temp : grades) {
			System.out.print(temp+" ");
		}
		
		System.out.println();
		
		
		//---------------------STRING PIEMERI----------------------------
		
		String courseTitle = "Progrsmmesana timekli JAVA";
		String facultyTitle = "ITF";
		String studyProgram = "Datorzinatnes";
		String accountNo = "LV03HABA0551002144730";
		String email = "kbaiba@inbox.lv";
		
		System.out.println("Kursa nosaukuma garums---> "+ courseTitle.length());
		System.out.println(facultyTitle.charAt(0)+ " " +facultyTitle.charAt(1)+ " " +facultyTitle.charAt(2));
		System.out.println("Sakas ar D---> " + studyProgram.startsWith("D"));
		
		System.out.println("Programma atbilst formatejumam---> " +
		studyProgram.matches("[A-Z]{1}[a-z]{4,30}"));
		
		System.out.println("Bankas konta nummurs atbilst formatejumam--->"
		+ accountNo.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{4,13}$"));
		
		System.out.println("e-pasts atbilst formatjumam---> "+ 
		email.matches("[a-zA-Z0-9_.]{3,30}[@]{1}[a-zA-Z]{3,15}[.]{1}[a-z]{2,4}"));
		
		
		//-----------------------------DATU TIPA MAINAS PIEMERI----------------------------
		System.out.println("--------------------------------------------------");
		double EX = 3.14765782658;
		System.out.println(EX);
		float EXf = (float)EX;
		System.out.println(EXf);
		long EXl = (long)EXf;
		System.out.println(EXl);
		byte EXb = (byte)EXl;
		System.out.println(EXb);
		
		String price = "2.34";
		float pricef = Float.parseFloat(price);
		System.out.println("Cena ir ---> "+ pricef + " eiro.");
		
		int agei = Integer.parseInt("21");
		System.out.println("Vecums ir " + agei);
		
	}

}













