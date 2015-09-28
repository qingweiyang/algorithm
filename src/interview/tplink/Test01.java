package interview.tplink;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static <T> int NUM_ELEMS(T[] t) {
		if(t == null) {
			return -1;
		} else 
			return t.length;
	}
}
