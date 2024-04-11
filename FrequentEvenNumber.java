import java.util.HashMap;

public class FrequentEvenNumber {
    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> temp = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                if(temp.containsKey(nums[i])){
                    temp.put(nums[i], temp.get(nums[i])+1);
                }else{
                    temp.put(nums[i],1);
                }
            }
        }
        int out = -1;
        int count = Integer.MIN_VALUE;

        for(int a : temp.keySet()){
            if(temp.get(a) >= count){
                if(temp.get(a) == count){
                    if(a < out){
                        out = a;
                    }
                }else{
                    count = temp.get(a);
                    out = a;
                }
            }
        }
        return out;
    }
}
