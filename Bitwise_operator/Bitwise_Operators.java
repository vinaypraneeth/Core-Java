public class Bitwise_Operators
 
{

	public static void main(String[] args)
	{
		// Initial values
		int a = 5;
		int b = 7;

		//Bitwise And
		System.out.println("a&b = " + (a & b));
        //Bitwise OR
		System.out.println("a|b = " + (a | b));

        //Bitwise XOR
		System.out.println("a^b = " + (a ^ b));

        //Nogation
		System.out.println("~a = " + ~a);
        //leftshift
        System.out.println("Bitwise Left Shift: " + (a << 2));
        //rightshift
        System.out.println("Bitwise Right Shift: " + (a >> 2));
		
		a &= b;
		System.out.println("a= " + a);
	}
}

    

