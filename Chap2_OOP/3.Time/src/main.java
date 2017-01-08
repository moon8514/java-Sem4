
public class main {
	public static void main(String[] args) {
		TimeClass t = new TimeClass(7,0,0);
		while(true){
			try {
//				Runtime.getRuntime().exec("clear");
				System.out.println(t.display());
				t.incSecond();
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
