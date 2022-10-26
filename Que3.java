

import java.util.*;

public class Que3 {

	public static int solution(int N, int M, int[] P) {
			
			while(issorted(P)==false) {
				
				int i = 0;
				
			while(i < P.length-1) {
				
				int count =0;
				int countsum = 0;
				
				if(count ==0 && P[i]==P[i+1]){
					i++;
					continue;
				}else {
					int start = i;
					boolean flag = true;
					int end = i;
				while(i < P.length-1 && P[i]>=P[i+1]){
					if(flag==true) {
						start = i ;
						flag = false;
					}
					count++;
					countsum+=P[i];
					i++;
				}
				countsum+=P[i];
				end  = i;
				
				if(count>0) {
					reverse(P,start , end);
					if(countsum > M) {
						return 0;
					}
				}
				
				}
				
				i++;
			}
	}
			return 1;
	}
	public static boolean issorted(int[] P) {
		for(int i = 0 ; i < P.length-1 ; i++) {
			if(P[i]>P[i+1]) return false;
		}
		return true;
	}
	
	public static void reverse(int[] P , int start , int end) {
		int i = start;
		int j = end;
		while(i<=j) {
			int temp = P[i];
			P[i]=P[j];
			P[j]=temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P[] = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		System.out.println(solution(N, M, P));
	}
}