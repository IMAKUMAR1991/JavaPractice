package Collections;

public class CountLengthofStringWithoutUsingLENGTHmETHOD {

	public static void main(String[] args) {

		String str = "sampleString";
		int i = 0;
		char[] a=str.toCharArray();
		System.out.println(a);
		System.out.println(str.toCharArray() );
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		for (char c : str.toCharArray()) {
			System.out.println(c);
			i++;
		}
		System.out.println("Length of the given string ::" + i);
	}
}
