package com.amigoscode;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person alex = new Person("alex");
		Person bala = alex;
		
		System.out.println("before changing alex");
		System.out.println(alex.name + " " + bala.name);
	 
		bala.name = "bolu"; 
		
		System.out.println("after changing alex");
		System.out.println(alex.name + " " + bala.name);
		}
		
		
	}
		static class Person {
			String name;
			
			Person(String name){
				this.name = name;
			}
			}

}
