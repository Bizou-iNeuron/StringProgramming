
public class CountVowelConsonantSpecialChar 
{
	public static void main(String[] args) {
		String s ="My dev pseudo is #IzzyNotEZ & my handle is @Bizou972";
		System.out.println("\nThe original String is: "+s);
		
		String sl = toLowerNoSpace(s);
		countVowelConsonantSpecial(sl);
	}
	
	private static String toLowerNoSpace(String s)
	{ // 1. IF MIXED CASES, CONVERT STRING TO LOWERCASE AND ASSIGN TO NEW VARIABLE
		String sl = "";
		for (int i = 0; i<s.length(); i++)
		{
			if (s.charAt(i)>=65 && s.charAt(i)<=90) // check if uppercase letters
			{
				sl+=(char) (s.charAt(i)+32);
			}
			else if (s.charAt(i) == 32)
			{
				sl+="";
			}
			else
				sl+=s.charAt(i);
		} 
		//System.out.println("\nlower no space: "+sl+"\n");
		return sl; 
	}
	
	private static void countVowelConsonantSpecial(String sl)
	{
		int countSpecial=0;
		int countVowel=0;
		int countConsonant=0;
		int countNumbers=0;
		
		for (int i =0 ; i<sl.length(); i++)
		{
			if ((sl.charAt(i)>=48 && sl.charAt(i)<=57)) // check if numbers
			{
				countNumbers ++;
			}
			else if ((sl.charAt(i)<97 || sl.charAt(i)>122)) // check if special characters (except for spaces)
			{
				countSpecial ++;
			}
			else if (sl.charAt(i) == 97 || sl.charAt(i) == 101 || sl.charAt(i) == 105 || sl.charAt(i) == 111 || sl.charAt(i) == 117) // check vowels
			{
				countVowel ++;
			}
			else // if not spaces, numbers, special char nor vowel then it's a consonant
				countConsonant++;
		}
		
		System.out.println("\nThere is/are "+countVowel+" VOWEL(S) in this String (** Y is not considered a vowel in this program **)\n");
		System.out.println("\nThere is/are "+countConsonant+" CONSONANT(S) in this String\n");
		System.out.println("\nThere is/are "+countSpecial+" SPECIAL CHARACTER(S) in this String\n");
		System.out.println("\nThere is/are "+countNumbers+" NUMBER(S) in this String\n");
		
	}
}
//By IzzyNotEZ @Bizou972