
public class Pangram {

	public static void main(String[] args) {
		String s ="THE quick Brown Fox jumps over a lazy Dog";
		System.out.println("The original String is: "+s);
		
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
		boolean missingLetter = false;
		
		for (char c: ar)
		{
			int ind = c-97; // find the index of each letters of alphabet, lower case 97-122
			arr[ind]++;
		}
		
		for (int n:arr)
		{
			if (n == 0)
			{
				System.out.println("\n=> This IS NOT a pangram");
				missingLetter = true;
				break;
			}
		}
		if (missingLetter == false)
			System.out.println("\n=> This IS a pangram, all letters of the alphabet are present");
	}
}
//By IzzyNotEZ @Bizou972