package TwoSum;
import java.util.Arrays;

public class TwoSum {

    public static class Solution{
        public Solution(){};
        
        public int[] TwoSum(int[] argNums, int argTarget){
            int num1 = 0;
            int num2 = 0;
            int[] output = new int[2];

            for(int i1 = 0; i1 < argNums.length; i1++){
                num1 = argNums[i1];
                
                for(int i2 = i1+1; i2 < argNums.length; i2++){
                    num2 = argNums[i2];
                    int soma = num1 + num2;

                    if(soma != argTarget){
                        continue;
                    }else{
                        output[0] = i1;
                        output[1] = i2;
                        return output;
                    }
                }
            }
            output[0] = -1;
            output[1] = -1;
            return output;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,5,3,21,15};
        int target = 8;
        int[] output = new Solution().TwoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }
}
