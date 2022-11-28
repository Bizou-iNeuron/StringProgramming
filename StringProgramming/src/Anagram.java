
public class Anagram 
{
	public static void main(String[] args) 
	{
		String s ="Eleven plus two and a decimal point!";
		System.out.println("\nFirst String:  "+s);
		String ss = "Twelve plus one and I’m a dot in place";
		System.out.println("\nSecond String: "+ss);

		String sl = cleanString(s);
		String ssl = cleanString(ss);
		
		// 2. CHECK IF BOTH CLEANED STRINGS HAVE SAME LENGTH
		if (sl.length() == ssl.length())
		{
			char [] ar = createArray (sl);
			char [] arr = createArray (ssl);
			
			sortArray (ar);
			sortArray (arr);
			
			compareArrays (ar, arr);
		}
		else
			System.out.println("\n=> This IS NOT an anagram");
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
	
	private static char [] sortArray (char [] ar)
	{ // 4. SORT ARRAYS
		for (int i=0; i<ar.length;i++)
		{
			for (int j=i+1; j< ar.length;j++) 
			{
				if (ar[i]>ar[j])
				{
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=(char)temp;
				}
			}
		}
		return ar;
	}
	
	private static void compareArrays (char [] ar, char [] arr)
	{ // 5. TRAVERSE AND COMPARE BOTH ARRAYS SIMULTEANOUSLY
		boolean anagram= false;
		int idx=0;
		while (ar[idx] == arr[idx] && idx < ar.length ) // as long as ar[idx] is equal to arr[idx] and idx is less than both arrays length
		{
			if (idx == ar.length-1 ) // if idx has reached the last location for both arrays
			{
				System.out.println("\n=> This IS an anagram");
				anagram = true;
				break;
			}
			idx++;
		}
		if (anagram == false)
			System.out.println("\n=> This IS NOT an anagram");
	}
}
//By IzzyNotEZ @Bizou972