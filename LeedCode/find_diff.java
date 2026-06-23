class Solution {
    public char findTheDifference(String s, String t) {
        int a[]=new int[26];


       if(s.length()==t.length()){
                return '\0';
       } 
       else{
                 for(int i=0;i<s.length();i++){
                         a[s.charAt(i)-'a']++;
                        // a[t.charAt(i)-'a']--;
                   }
                 for(int i=0;i<t.length();i++){
                        // a[s.charAt(i)-'a']++;
                         a[t.charAt(i)-'a']--;
                   }

            for(int i=0;i<a.length;i++){
                if(a[i]!=0) return (char)(i+'a');
            }

        

       
       }

    // for(int i=0;i<t.length();i++){
    //     if(s.indexOf(Character.toString(t.charAt(i)))==-1){
    //         return t.charAt(i);
    //     }
    // }
               return '\0';
       
    }
}