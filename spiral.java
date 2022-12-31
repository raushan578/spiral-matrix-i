class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int t =0,l=0,r=matrix[0].length-1,b = matrix.length-1,d=0;

        while(l<= r && t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){
                    list.add(matrix[t][i]);
                }
                t++;
                d=1;
            }
                       else if(d==1){
                for(int i=t;i<=b;i++){
                    list.add(matrix[i][r]);
                }
                r--;
                d=2;
            }
                       else if(d==2){
                for(int i=r;i>=l;i--){
                    list.add(matrix[b][i]);
                }
                b--;
                d=3;
            }
                       else if(d==3){
                for(int i=b;i>=t;i--){
                    list.add(matrix[i][l]);
                }
                l++;
                d=0;
            }
           
        }
        return list;
    }
}
