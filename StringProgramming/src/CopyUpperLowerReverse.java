
public class CopyUpperLowerReverse {

	public static void main(String[] args) {
		String s = "hello my name is Isabelle";
		System.out.println("original String is:  "+s);
		String sc = "";
		String su = "";
		String sl = "";
		String ro = "";
		String rl = "";
		
		// copy
		for (int i = 0; i< s.length();i++)
		{
			sc += s.charAt(i);
		}
		System.out.println("copied String is:    "+sc);
		
		// to Upper
		for (int i = 0; i< s.length();i++)
		{
			if (s.charAt(i)== ' ')
				su +=" ";
			
			else 
				if (s.charAt(i)>=65 && s.charAt(i)<=90)
					su += s.charAt(i);
				else if (s.charAt(i)>=97 && s.charAt(i)<=122)
					su += (char)(s.charAt(i)-32);
			
		}
		System.out.println("Uppercase String is: "+su);
		
		// to Lower
		for (int i = 0; i< s.length();i++)
		{
			if (s.charAt(i)== ' ')
				sl +=" ";
			
			else if(s.charAt(i)!= ' ')
				if (s.charAt(i)>=65 && s.charAt(i)<=90)
					sl += (char)(s.charAt(i)+32);
				else if (s.charAt(i)>=97 && s.charAt(i)<=122)
					sl += s.charAt(i);
			
		}
		System.out.println("Lowercase String is: "+sl);
		
		
		String [] order = s.split(" "); // create an array from the String s each location is before " "
		// reverse order of words
		for (int i=order.length-1 ; i>=0  ; i--)
		{
			ro += order[i]+" ";
		}
		System.out.println("reverser order:      "+ro);
		
		// reverse of letters
		for (String word : order)
		{
			for (int i = word.length()-1 ; i>=0; i--)
			{
				rl+= word.charAt(i);
			}
			rl+=" ";
		}
		System.out.println("reversed letters:    "+rl);

	}

}
//By IzzyNotEZ @Bizou972