
import java.io.*;
import java.util.*;

class Que6 {
    static String solution(int n, ArrayList<Integer> flows)
    {
    	StringBuffer str = new StringBuffer();
        for(int i =0; i < flows.size() ; i++) {
        	
        	int count = count(flows , flows.get(i) , i);
        	str.append(count);
        }
        return str.toString();
    }
    static int count(ArrayList<Integer> flows , int l , int j) {
    	int i=j;
    	int count =1;
    	while(flows.get(i)!=j+1) {
    		i=flows.get(i)-1;
    		count++;
    		
    	}
    	return count;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        String[] numsStr = str.split(" ");
        ArrayList<Integer> flows = new ArrayList<Integer>();
        for (String s: numsStr){flows.add(Integer.parseInt(s));}
        String result = solution(n,flows);
        System.out.println(result);


    }
}