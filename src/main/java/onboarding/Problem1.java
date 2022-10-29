package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        int max = 0, sum = 0, mul = 1;

        // #1 : List<Integer> xxx = List.of(97, 98);

        // #2 : Find the Maximum (pobi)
        for(int i = 0; i < 2; i++){
            int pobi_num = pobi.get(i);
            while(pobi_num > 0){
                sum += pobi_num % 10;
                mul *= pobi_num % 10;
                pobi_num /= 10;
            }
            // #3 : Result Max Value
            max = sum > mul ? sum : mul;
        }

        // #2 : Find the Maximum (crong)
        max = 0; sum = 0; mul = 1;
        for(int i = 0; i < 2; i++){
            int crong_num = crong.get(i);
            while(crong_num > 0){
                sum += crong_num % 10;
                mul *= crong_num % 10;
                crong_num /= 10;
            }
            // #3 : Result Max Value
            max = sum > mul ? sum : mul;
        }

        return answer;
    }
}