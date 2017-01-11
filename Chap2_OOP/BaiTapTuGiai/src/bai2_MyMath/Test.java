package bai2_MyMath;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 12, c = -10;
		float x = 1.2f, y = 2.5f, z = 3.5f;
		System.out.println("UCLN của a và b: " + MyMath.comDiv(a, b));
		System.out.println("Giá trị lớn nhất: " + MyMath.max(x,y,z));
		System.out.println("Giá trị nhỏ nhất: " + MyMath.min(x, y, z));
		System.out.println("Kiểm tra a là số nguyên tố :" + MyMath.isPrimeNumber(a));
		System.out.println("Tổng dãy số từ 1 đến a: " + MyMath.sumRange(a));
		System.out.println("Giá trị tuyệt đối của c: " + MyMath.abs(c));
		System.out.println("Làm tròn số y: " + MyMath.round(y));
	}

}
