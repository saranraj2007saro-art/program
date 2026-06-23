class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");

        String k[]=s.split(" ");
        int i=0;
        int j=k.length-1;

System.out.print(Arrays.toString(k));
        while(i<j){
             String r=k[i];
             k[i]=k[j];
             k[j]=r;
             i++;
             j--;     
        }


// String p="";
// for(String d:k){
//     p+=d+" ";
// }
// p=p.trim();

String p=String.join(" ",k);
return p;
      //return Arrays.toString(k);

    }
}