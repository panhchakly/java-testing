package demo;

import java.awt.Point;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

/*
* alt + shift + w and select project explorer. 
*/
public class Testing {
	private static int check_number(int a, int b) {
		int c = a+b;
		return c;
	}
	
	private String myname() {
		return "Lee man twenty two";
	}
	
	static class Cat{
		String meow_love = "Wellcome to this world meow";
		void Meow() {
			System.out.println(meow_love);
		}
	}
	
	public static void main(String args[]) {	
		// create static class under class
		Cat cat = new Cat();
		cat.Meow();
		
		/* 
		Java Data Types
		There 2 Types Of Data Types In Java
		1) Primitive -> byte, char, short, int, long, float, double and boolean.
		2) Non-primitive -> (All Classes) -> String, Arrays etc.
	
		Type	Size	Stores
		byte	1 byte	whole numbers from -128 to 127
		short	2 bytes	"" -32,768 to 32,767
		int	    4 bytes	"" -2,147,483,648 to 2,147,483,647
		long	8 bytes	""-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float	4 bytes	fractional numbers; for storing 6 to 7 decimal digits
		double	8 bytes	fractional numbers; "" 15 ""
		boolean	1 bit	true or false values
		char	2 bytes	single character/letter or ASCII values
		*/
		
		// char name = 'AB'; // Error 
		char name = 'A'; // data type char assign only single letter
		System.out.println(name);
		// method static without declare class object cause static void is reference
		int c = check_number(11, 11);
		System.out.println("Hello mr panhchakly called LEE MAN TWENTY TWO "+c);
		// method declare class object
		Testing test = new Testing();
		String ename = test.myname();
		System.out.println(ename);
		
		
		// System.out.println(); shortcut => sysout
		System.out.println("**********");
		int numberOne = 0;
		int numberTwo = 0;
		System.out.println(numberOne++); // value 0
		System.out.println(numberOne); // value 1
		// it's difference above
		System.out.println("=================");
		System.out.println(++numberTwo); // value 1
		System.out.println(numberTwo); // value 1
		// object in java
		System.out.println("=object in java=");
		Point point = new Point(10,10);
		System.out.println(point);
		point.move(20, 20);
		System.out.println(point);
		// Array in java
		int[] arrayNumber = new int[3]; // out of bounds for length 3
		Arrays.fill(arrayNumber, 99); // fill all index where value from 0 to 99
		arrayNumber[0] = 11;
		arrayNumber[2] = 33;
		// arrayNumber[3] = 44; // error
		System.out.println(Arrays.toString(arrayNumber));
		 int array[]={/*nothing in here = array with no slots*/};
		 System.out.println(Arrays.toString(array));
		 
		 // array values integer
		 int[] numberList = {10,32,43,25,22};
		 System.out.println(Arrays.toString(numberList));
		 numberList[1] = 50; // change value of index 1 from 32 to 50
		 System.out.println(Arrays.toString(numberList));
		 System.out.println(numberList.length); // value of length is 5
		 
		 // array values string
		 String[] names = new String[3];
		 Arrays.fill(names, "Khemarak Sereymun");
		 names[1] = "Chheng Panhchakly";
		 System.out.println(Arrays.toString(names));
		 
		 // for loop
		 String[] nameList = {"jet", "vita", "kao", "kuma", "soya"};
		 for(int i=0; i<nameList.length; i++) {
			 System.out.println(nameList[i]);
		 }
		 
		 // while loop
		 String[] listName = {"CHEM SOVANNA", "NGET VAYU", "CHHON VATHNAK"};
		 int i=0;
		 while(i <= listName.length-1 ) {
			 System.out.println(listName[i]);
			 i++;
		 }
		 
		 // get current date
		/* you can use class below instead of Date
		 * LocalDate
		 * LocalDateTime
		 */
		 String pattern = "MM-dd-yyyy";
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		 String date = simpleDateFormat.format(new Date());
		 String content = "A: What's today?\nB: Today is: "+ date;
		 System.out.println(content);
		 
		 // Switch
		 String nona = "GLANG";
		 switch (nona) {
		case "GLANG":
			System.out.println("Hello GLANG");
			break;
		case "GLANGS":
			System.out.println("Hello GLANGS");
			break;
		default:
			System.out.println("Hello GLEE");
			break;
		}
		 
	}
}
