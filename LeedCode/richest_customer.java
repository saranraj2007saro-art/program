class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=0,c=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                c+=accounts[i][j];
            }
            m=Math.max(c,m);
            c=0;
        }
        return m;
    }
}