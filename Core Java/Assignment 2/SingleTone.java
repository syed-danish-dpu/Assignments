import java.util.*;

public class SingleTone {

	public static void main(String[] args) 
	{		
		Abc obj1 = Abc.getInstance();
		
	}
}
class Abc
{
	static Abc obj = new Abc();
	private Abc()
	{
		public static Abc getInstance()
		{
			retun obj;
		}
	}
}
		
		