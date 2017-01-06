import java.util.Arrays;

public class _3_MinArrayValue {

	public static void main(String[] args) {
		int a[] = {1,6,3,4,8,2,0};
		
		Arrays.sort(a);
		
		System.out.println("Giá trị nhỏ nhất: " + a[0]);
	}
}
