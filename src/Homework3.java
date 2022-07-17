
public class Homework3 {

	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 50};
		
		int subtractFirstFromLast = ages[ages.length-1] - ages[0];
		System.out.println(subtractFirstFromLast);
		
		double avg = 0;
		for(int age : ages) {
			avg += age;
		}
		avg /= ages.length;
		System.out.println(avg);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int avgStringLength = 0;
		for(String name : names) {
			avgStringLength += name.length();
		}
		avgStringLength /= names.length;
		System.out.println(avgStringLength);
		
		String allNames = "";
		for(String name : names) {
			allNames = allNames + " " + name;
		}
		System.out.println(allNames);
		
		int[] nameLengths = new int[6];
		for(int i = 0; i<names.length;i++) {
			nameLengths[i] = names[i].length();
		}
		int sumOfLengths = 0;
		for(int length : nameLengths) {
			sumOfLengths += length;
		}
		System.out.println(sumOfLengths);
		
		stringConcatenator("hello", 3);
		System.out.println(fullName("Tara", "Young"));
		int[] under100 = {3, 9};
		int[] over100 = {93, 50};
		System.out.println(arrayGreaterThanOneHundred(over100));
		System.out.println(arrayGreaterThanOneHundred(under100));
		
		double[] doubles = {93, 50};
		double[] greaterDoubles = {200, 50};
		System.out.println("10: " + averageOfDoubles(doubles));
		
	
		System.out.println("11: " + greaterDoubleArray(doubles, greaterDoubles));
		System.out.println("11: " + greaterDoubleArray(greaterDoubles, doubles));
		
		System.out.println("12: " + willBuyDrink(true, 11));
		System.out.println("12: " + willBuyDrink(true, 6));
		System.out.println("12: " + willBuyDrink(false, 9));
		System.out.println("12: " + willBuyDrink(false, 11));
		
		System.out.println("13: " + goToBed(22));
		
	}
	
	public static String stringConcatenator(String word, int n) {
		String concatenatedWord = "";
		for(int i = 0; i<n; i++) {
			concatenatedWord += word;
		}
		System.out.println(concatenatedWord);
		return word;
	}
	
	public static String fullName(String first, String last) {
		return first + " " + last;
	}
	
	public static boolean arrayGreaterThanOneHundred(int[] arr) {
		int sum = 0;
		for(int number : arr) {
			sum += number;
		}
		return sum > 100;
	}
	
	public static double averageOfDoubles(double[] doublesArrray) {
		int sum = 0;
		for(double number : doublesArrray) {
			sum += number;
		}
		
		return sum/doublesArrray.length-1;
	}
	
	public static boolean greaterDoubleArray(double[] doublesArrray1, double[] doublesArrray2) {
		int sum1 = 0;
		for(double number : doublesArrray1) {
			sum1 += number;
		}
		
		int sum2 = 0;
		for(double number : doublesArrray2) {
			sum2 += number;
		}
		
		return sum1/doublesArrray1.length-1 > sum2/doublesArrray2.length-1;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean goToBed(int timeOfDayIn24hours) {
		//9pm is bedtime in 24hr format
		if(timeOfDayIn24hours > 21) {
			return true;
		}else {			
			return false;
		}
		
	}

}
