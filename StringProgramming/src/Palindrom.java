
public class Palindrom {

	public static void main(String[] args) {
		String s = "2552";
		System.out.println("\nOriginal String: "+s);
		String p = "";
		
		for (int i = s.length()-1; i>=0; i--)
		{
			p+= s.charAt(i);
		}
		System.out.println("\nReversed String: "+p);
		
		if (s.equals(p))
			System.out.println("\n\n=> The String IS a Palindrom");
		else
			System.out.println("\n\n=> The String IS NOT a Palindrom");

	}

}
