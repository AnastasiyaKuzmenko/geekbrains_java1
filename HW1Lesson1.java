
/** 
 * Java Level 1 Lesson 1 Homework
 * 2 задание - метод typesOfVariables()
 * 3 задание - метод сalculatingByFormula()
 * 4 задание - метод sumTwoNumbers()
 * 5 задание - метод negativeOrPositive()
 * 6 задание - метод checkNegative()
 * 7 задание - метод helloName()
 * 8 задание - метод LeapYear()
 * 
 * 
 * @author Kuzmenko Anastasiya 
 * @version 2018-08-12
 * */


class HW1Lesson1{
	
	static void typesOfVariables(){
		// создаем переменные всех пройденных типов данных
		byte a = 100;
		int b = 65000;
		short c = 1000;
		long d = 147483647;
		float f = 3.14f;
		double k = 7.0; 
		char g = 'C';
		boolean flag = true;
		String line = "Hello";
	}


	static int сalculatingByFormula(int a, int b, int c, int d){
		// метод вычисляет выражение a*(b+(c/d))
		return a*(b+(c/d));
	}


	static boolean sumTwoNumbers(int x, int y){
		// метод определяет лежит ли сумма двух чисел в диапазоне от 10 до 20
		boolean flag = false;
		if( x+y > 10 && x+y <= 20)
		    flag = true;
		return flag;
	}


	static void negativeOrPositive(int x){
		// метод определяет является ли число отрицательным или положительным
		if(x >= 0) 
		    System.out.println("Число положительное!");
		else 
		    System.out.println("Число отрицательное!");
	}


	static boolean checkNegative(int x){
		// метод должен определяет является ли число отрицательным
		boolean flag = false;
		if( x < 0)
		    flag = true;
		return flag;
	}


	static void helloName(String x){
		// метод выводит в консоль сообщение «Привет,указанное_имя!»
		System.out.println("Hello " + x+"!");
	}


	static void LeapYear(int year){
		// метод определяет является ли год високосным
		if(year%4 != 0 && (year%100 == 0 && year%400 != 0))
		    System.out.println("Этот год не является високосным " + year + "!");
		else
		    System.out.println("Этот год является високосным " + year + "!");
	}


	public static void main(String args[]){
		System.out.println("Результат выполнения метода сalculatingByFormula: " + сalculatingByFormula(2,3,4,6));
		System.out.println();

		System.out.println("Результат выполнения метода sumTwoNumbers: " + sumTwoNumbers(2,3));
		System.out.println();

    	System.out.println("Результат выполнения метода negativeOrPositive: ");
		negativeOrPositive(6);
		System.out.println();

		System.out.println("Результат выполнения метода checkNegative: " + checkNegative(-6));
		System.out.println();

    	System.out.println("Результат выполнения метода helloName: ");
		helloName("James");
		System.out.println();

		System.out.println("Результат выполнения метода LeapYear: ");
		LeapYear(1998);
		
	}
}
