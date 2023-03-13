package Ques;
// skip a select character from the given string (a)

public class Skip {
	public static void main(String[] args) {
		skip("", "bacccaad");
		System.out.println(skip2("bahdgdad"));
		System.out.println(skipApple("ahehdjfappleefs"));
		System.out.println(skipApp("appdufhfdappled"));
	}
	
	
	// p is processed
	// up is unprocessed
	static void skip(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {
			skip(p, up.substring(1));
		} else {
			skip(p + ch, up.substring(1));
		}
	}
	
	static String skip2(String up) {
		if (up.isEmpty()) {
			return "";
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {
			return skip2(up.substring(1));
		} else {
			return ch + skip2(up.substring(1));
		}
	}
	
	// skip apple
	static String skipApple(String up) {
		if (up.isEmpty()) {
			return "";
		}
		
		if(up.startsWith("apple")) {
			return skipApple(up.substring(5));
		} else {
			return up.charAt(0) + skipApple(up.substring(1));
		}
	}
	
	// skip app but not apple
	static String skipApp(String up) {
		if (up.isEmpty()) {
			return "";
		}
		
		if(up.startsWith("app") && !up.startsWith("apple")) {
			return skipApp(up.substring(3));
		} else {
			return up.charAt(0) + skipApp(up.substring(1));
		}
	}
}
