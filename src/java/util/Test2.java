package java.util;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		Iterator<String> iter = al.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
//			System.err.println(iter.next());
		}

	}

}
