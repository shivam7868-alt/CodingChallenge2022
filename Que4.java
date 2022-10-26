
import java.io.*;
import java.util.*;

class Que4 {
    static void solution(int n, List<String> employees, List<List<Integer>> shifts) {
    	
        TreeSet<Integer> set = new TreeSet<>();
    	for(int i =0 ;i < shifts.size(); i++) {
    		set.add(shifts.get(i).get(0));
    		set.add(shifts.get(i).get(1));
    	}
    	Iterator itr = set.iterator();
    	int c =0;
    	int a = (int)itr.next();
    	int b = (int)itr.next();
    	//if(!itr.hasNext()) {
    		List<String> names = new ArrayList<>();
    		int count = check(shifts , a , b , employees , names);
    		 System.out.println(a + " " + b + " " + count + " " + names);
    		 //return;
    	//}
    	while(itr.hasNext()) {
    		List<String> name = new ArrayList<>();
    		int k =0;
    		a=b;
    		b=(int)itr.next();
    		k = check(shifts , a , b , employees , name);
   		 System.out.println(a + " " + b + " " + k + " " + name);
    		 
    	}
    	
    	
    }
    
    static int check(List<List<Integer>> shifts , int a, int b , List<String> employees , List<String> names) {
    	int count =0;
    	
    	for(int i =0 ;i < shifts.size(); i++) {
    		if(a>=shifts.get(i).get(0) && a<=shifts.get(i).get(1) && b>=shifts.get(i).get(0) && b<=shifts.get(i).get(1)) {
    			count++;
    			names.add(employees.get(i));
    		}
    		
    	}
    	
    	Collections.sort(names);
    	return count;
    	
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> employees = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            employees.add(scanner.next());
        }
        List<List<Integer>> shifts = new ArrayList();
        for(int i = 0; i < n; i++) {
            List<Integer> curr = new ArrayList<Integer>(2);
            curr.add(scanner.nextInt());
            curr.add(scanner.nextInt());
            shifts.add(curr);
        }
        scanner.close();
        solution(n, employees, shifts);
    }
}