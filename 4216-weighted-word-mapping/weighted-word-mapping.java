class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
      char[] ch={'z', 'y', 'x', 'w','v','u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a' };

       StringBuilder sb=new StringBuilder();
       for(String word:words){
         int s=0;
         for(char c:word.toCharArray()) s+=weights[c-'a'];
         sb.append(ch[s%26]);
       }
       return sb.toString();
    }
}