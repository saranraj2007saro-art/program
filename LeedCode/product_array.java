class Solution {
    public int[] productExceptSelf(int[] nums) {
      //  int n=nums[0];
    //   int n[]=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         int m=1;
    //         for(int j=0;j<nums.length;j++){
    //             if(j!=i){
    //               m*=nums[j];
    //             }
    //         }
            
    //         n[i]=m;
    //     }

    //     return n;

    int a[]=new int[nums.length];
    a[0]=1;
    for(int i=1;i<a.length;i++){
        a[i]=a[i-1]*nums[i-1];
    }
    int r=1;
    for(int i=a.length-1;i>=0;i--){
        a[i]=a[i]*r;
        r=r*nums[i];  
    }
      return a;

    }
}