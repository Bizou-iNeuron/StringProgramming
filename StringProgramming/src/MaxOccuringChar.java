
public class MaxOccuringChar {

	public static void main(String[] args) {
		String s ="Hello, my name is Belle and I am learning JavaEE ll !";
		System.out.println("\nThe original String is: \n"+s);
		
		String sl = cleanString(s);
		char [] ar = createArray(sl);
		countLetters(ar);
		
	}
	
	private static String cleanString(String s)
	{ // 1. IF MIXED CASES, SPACES OR SPECIAL CHARACTERS, CLEAN STRING TO LOWERCASE AND ASSIGN TO NEW VARIABLE
		String sl = "";
		for (int i = 0; i<s.length(); i++)
		{
			if (s.charAt(i)>=65 && s.charAt(i)<=90) // check if uppercase letters
			{
				sl+=(char) (s.charAt(i)+32);
			}
			else if (s.charAt(i)<97 || s.charAt(i)>122) // check if special characters
			{
				sl+="";
			}
			else
				sl+=s.charAt(i);
		}
		return sl; // System.out.println("lower: "+sl);
	}
	
	private static char[] createArray (String sl)
	{ // 3. CREATE ARRAYS OF CHARACTERS FROM STRING SL
		char [] ar = new char [sl.length()];
		for (int i = 0 ; i< ar.length;i++)
		{
			ar[i]= sl.charAt(i);
		}
		return ar;
	}
	
	private static void countLetters (char [] ar)
	{
		int [] arr = new int [26]; // creation of an array for the 26 letters of the alphabet
		for (char c: ar)
		{
			int ind = c-97; // find the index of each letters of alphabet, lower case 97-122
			arr[ind]++;
		}
		
		printArray(ar);
		System.out.println();
		printArray(arr);
		
		int maxVal = arr[0];
		int maxInd = 0;
		
		for (int i =1 ; i< arr.length; i++)
		{
			if (arr[maxInd] < arr[i])
			{
				maxInd = i;
				maxVal = arr[i];
			}
		} 
		System.out.println("\n\nThe character which occurs the most in this String is '"+(char)(maxInd+97)+"'. It appears "+maxVal+" times");
	}
	
	private static void printArray (char [] ar) // Method overloaded Print Array of char
	{
		System.out.println("\nThe Array of the String: ");
		for (char m:ar)
		{
			System.out.print(m+" ");
		}
	}
	
	private static void printArray (int [] ar) // Method overloaded Print Array of int
	{
		System.out.println("\nThe array of the letters of the alphabel: ");
		for (int n:ar)
		{
			System.out.print(n+" ");
		}
	}
}
//By IzzyNotEZ @Bizou972