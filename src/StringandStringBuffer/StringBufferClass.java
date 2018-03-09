package StringandStringBuffer;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is read only and immutable
		String str = new String("Hello");
		System.out.println(str += "World");
		
		//StringBuffer is fast
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.append("Paris"));
	}

}
