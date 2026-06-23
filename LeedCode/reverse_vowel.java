class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;

        char c[]=new char[s.length()];
        
        for(int k=0;k<s.length();k++){
            c[k]=s.charAt(k);
        }
        while(i<j){
            if("AEIOUaeiou".indexOf(c[i])==-1){
                i++;
            }
            else if("AEIOUaeiou".indexOf(c[j])==-1){
                j--;
            }
            // else ("AEIOUaeiou".indexOf(c[i])!=-1 && "AEIOUaeiou".indexOf(c[j])!=-1){
            else{
                char t=c[i];
                c[i]=c[j];
                c[j]=t;
                i++;
                j--;
            }
           
        }

      String k=new String(c);

        return k;
    }
}