class Solution {
    public int lengthOfLastWord(String s) {
        int a=s.length()-1;
        int count=0;
        for(int i=a;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
  
            }
            else{
                if(count>0)
                return count;
            }
                
        }
      return count; 
    }
}
