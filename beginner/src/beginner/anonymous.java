package beginner;

import java.time.LocalTime;

 abstract class abcd {
	 abstract void s();
 }
class anonymous{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abcd a=new abcd() {

			@Override
			void s() {
				// TODO Auto-generated method stub
				System.out.println("vemareddy");
			}
			
		};
		a.s();
	}
}