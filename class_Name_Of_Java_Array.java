public class class_Name_Of_Java_Array
{
	public static void main(String... args)
	{
		int [] arr = {4,4,5};
		
		Class c = arr.getClass();
		String name=c.getName();
		
		System.out.println(name);
	}
}