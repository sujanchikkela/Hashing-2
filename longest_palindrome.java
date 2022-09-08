//TC- O(n)
//SC- O(n)

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hash1 = new HashSet<>();
        int count=0;
        
        for(int i=0; i<s.length(); i++){
            if (!hash1.contains(s.charAt(i))){
                hash1.add(s.charAt(i));
            }else{
                count+=2;
                hash1.remove(s.charAt(i));
            }
        }
        if(!hash1.isEmpty()){
            count+=1;
        }else{
            count+=0;
        }
        return count;
        
    }
}
