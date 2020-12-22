package com.company;
import java.util.*;


public class Main {


	public static void main(String[] args) {
		int age = 25;
		String name = "Salman Alnajdi";

		for(int x = 1 ; x <= 3;x++) {
			test(age, name);
		}

	}
	public static void test(int age, String name) {

		if(age<18){
			System.out.println("Sorry "+ name+ "  you are still young to get your license ");
		}else{
			System.out.println("congratulations "+ name+ " you will get your license");
		}

	}
}





