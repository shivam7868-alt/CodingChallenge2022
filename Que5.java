

import java.io.*;
import java.util.*;

class Que5 {
    static int solution(int cutoffScore, int scoreLength, List<Integer> scores) {
    	 int start = 0;
    	 int end = 0;
         int count = 0;
         int sum = scores.get(0);
  
         while (start < scoreLength && end < scoreLength) {
  
             if (sum < cutoffScore) {
                 end++;
  
                 if (end >= start)
                     count += end - start;
  
                 if (end < scoreLength)
                     sum += scores.get(end);
             }
  
             else {
                 sum -= scores.get(start);
                 start++;
             }
         }
  
         return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int cutoffScore = scanner.nextInt();
        int scoreLength = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        String[] price_str = str.split(" ");
        List<Integer> scores = new ArrayList<Integer>();
        for (String s : price_str) {
            scores.add(Integer.parseInt(s));
        }
        int result = solution(cutoffScore, scoreLength, scores);
        System.out.println(result);
        scanner.close();
    }
}