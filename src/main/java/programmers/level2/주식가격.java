package programmers.level2;

public class 주식가격 {

    class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];

            for (int i = 0; i < prices.length; i++) {
                int cnt = 0;

                for (int j = i + 1; j < prices.length; j++) {
                    cnt++;

                    if (prices[i] > prices[j]) {
                        break;
                    }
                }
                answer[i] = cnt;
            }

            return answer;
        }
    }

}
