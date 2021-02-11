package controlFlow;

public class AsciiChars {
	public static void printNumbers() {
	    // TODO: print valid numeric input
		// numbers range is 48 - 57
		for (int i = 48; i < 58; i++) {
			System.out.printf("%c, ", i);
		}
		System.out.printf("\n");
	  }

	  public static void printLowerCase(){
	    // TODO: print valid lowercase alphabetic input
		// lowercase alpha range is from 97-122
		for (int j = 97; j < 123; j++) {
			System.out.printf("%c, ", j);
		}
		System.out.printf("\n");
	  }
	  
	  public static void printUpperCase() {
	    // TODO: print valid uppercase alphabetic input
		// uppercase alpha range is from 65-90
		for (int k = 65; k < 91; k++) {
			System.out.printf("%c, ", k);
	  }
		System.out.printf("\n");
	}
}
