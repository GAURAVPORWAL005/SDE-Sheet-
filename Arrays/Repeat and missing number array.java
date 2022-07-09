https://www.interviewbit.com/problems/repeat-and-missing-number-array/
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
     public int[] repeatedNumber(final int[] A) {
 int[] ans = new int[2];
  int[] res = new int[A.length + 1];
   for(int i=0;i<A.length;i++){ 
       res[A[i]] += 1; 
   } 
   for(int i=1;i<res.length;i++){
        if(res[i] == 0){ ans[1] = i;
         }
          else if(res[i] == 2)
          {
           ans[0] = i; 
           } 
       } 
       return ans;
    }
 }
