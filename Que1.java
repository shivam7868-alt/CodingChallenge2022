
import java.util.*;
import java.lang.*;
import java.io.*;

class Que1 {
    public static String solution(long n) {
    	long cnt_even = 0;
        long cnt_odd = 0;
        for (long i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                
                if (n / i == i) {
                	if(i%2==0) {
                		cnt_even++;
                	}else {
                		cnt_odd++;
                	}
                }
 
                else {
                	if(i%2==0) {
                		cnt_even++;
                	}else {
                		cnt_odd++;
                	}
                	if(n/i%2==0) {
                		cnt_even++;
                	}else {
                		cnt_odd++;
                	}
                }
            }
        }
        if(cnt_even>cnt_odd) {
        	return "BUY";
        }else if(cnt_even<cnt_odd){
        	return "SELL";
        }else {
        	return "PASS";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n=Long.parseLong(br.readLine());
        String answer=solution(n);
        System.out.println(answer);
    }
}
