public class DuplicateChar 
{
	public static void main(String[] args) 
	{
		String s = "communication";
		System.out.println("Original String:       "+s);
		
		removeDuplicates (s);
		printDuplicates (s);
	}
	
	private static void removeDuplicates (String s)
	{
		String ss =""; // new String without duplicate characters
		for (int i=0 ; i< s.length(); i++) // iterate through all indexes of the string
		{
			if (i==0) // write the first letter in the new string without checking
			{
				ss+= s.charAt(i);
			}
			else 
			{
				int j=i-1; // check each letters with all the preceding letters
				while (j>=0 && s.charAt(i)!= s.charAt(j))
				{
					if (j== 0) // if there is no duplicate found when checking all previous letter, concatenate the checked character to the new String
					{
						ss+= s.charAt(i);
					}
					j--; 
				}
			}	
		} 
		System.out.println("Removed duplicates:    "+ss);
	}
	
	private static void printDuplicates (String s)
	{
		String d =""; // new String of duplicate characters
		for (int i = 1 ; i < s.length(); i++)
		{
			duplicate: for (int j = i-1;j>=0;j--) // checking all previous characters of checked index
			{
				if(s.charAt(i) == s.charAt(j)) // if i found a duplicate
				{
					if (d.length() != 0 ) // check if the new String of duplicate isNotEmpty
					{
						int k=0;
						while (k<d.length() && s.charAt(i)!= d.charAt(k)) // if the character hasn't been found before
						{
							if (k == d.length()-1) 
							{
								d+= s.charAt(i)+" "; // concatenate the checked character to the new String
								break duplicate; // once the checked character has found a duplicate, check the next character i 
							}
							k++; 
						}
						break duplicate;
					}
					else
					{
						d+=s.charAt(i)+" ";
						break;
					}
				}
			}
			
		} 
		System.out.println("Duplicates characters: "+d);
	}
}
//By IzzyNotEZ @Bizou972