import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Que2 {
	
	public static int solution(String s) {

	    if(s==null || s.length()==0)
	        return 0;

	    HashSet<Character> hs = new HashSet<>();
	    int count = 0;

	    for(int i = 0; i < s.length(); i++) {
	        if(hs.contains(s.charAt(i))) {
	            hs.remove(s.charAt(i));
	            count++;
	        } else {
	            hs.add(s.charAt(i));
	        }
	    }
	    if(!hs.isEmpty())
	        return count * 2 + 1;

	    return count * 2;
	}
	
	 private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
        String str = scanner.nextLine();
        scanner.close();

        int answer = solution(str);
        System.out.println(answer);
    }
}
