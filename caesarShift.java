public class caesarShift {
	
	public static void main(String[] args)
	{
		System.out.println(caesarShift("Hello world",5));
			
	}
	public static String caesarShift(String str, int amount)
	{
		char[] myArray= str.toCharArray();		
		
		for (int i=0;i<str.length();i++)
		{
			
			if(myArray[i]!=' ')
			{
				myArray[i]+=amount;
			
			}
		}
		
		return String.valueOf(myArray);		
	}
}
