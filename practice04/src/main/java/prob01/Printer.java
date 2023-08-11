package prob01;


public class Printer {
//	public void println(int i) {
//		System.out.println(i);
//	}
//	
//	public void println(boolean b) {
//		System.out.println(b);
//	}
//
//	public void println(double d) {
//		System.out.println(d);
//	}
//
//	public void println(String s) {
//		System.out.println(s);
//	}
	
	public <T> void println(T t) {
		System.out.println(t);
	}
	
	public int sum(Integer... nums) {
		int s = 0;
		for(Integer n:nums) {
			s += n;
		}
		
		return s;
	}
	
	public <T> void println(T... ts) {
		for(T t:ts) {
			System.out.println(t);
		}
	}
	
}
