
public class StringProcessing {
	public static void main(String[] args) {
		String s = "Write a Java program is very easy";

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') count++;
		}
		System.out.println("Số lượng kí tự a có trong chuỗi: " + count);
		
		if(s.indexOf("Java") >= 0) System.out.println("Chuỗi có chứa từ Java");
		else System.out.println("Chuỗi không chứa từ Java");
		
		if(s.startsWith("Write")) System.out.println("Chuỗi bắt đầu bằng Write");
		else System.out.println("Chuỗi không bắt đầu bằng Write");
		
		if(s.endsWith("easy")) System.out.println("Chuỗi kết thúc bằng easy");
		else System.out.println("Chuỗi không kết thúc bằng easy");
	}
}
