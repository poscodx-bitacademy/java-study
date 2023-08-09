package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		double[] d = new double[a.length];
		for(int i = 0; i < a.length; i++) {
			d[i] = a[i];
		}
		
		return d;
	}

	public static int[] doubleToInt(double[] d) {
		int[] a = new int[d.length];
		for(int i = 0; i < d.length; i++) {
			a[i] = (int)d[i];
		}
		return a;
	}

	public static int[] concat(int[] a1, int[] a2) {
		return null;
	}

}
