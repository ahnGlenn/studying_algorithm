class Solution {
    public int solution(int[][] sizes) {     
        
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int i=0; i<sizes.length; i++){
            // 1. 비교해서 swap 실행
            swap(sizes, i);
            
            // 2. 모든 가로 최대값 추출
            if(maxWidth < sizes[i][0]){
                maxWidth = sizes[i][0];
            }

            // 3. 세로 최대값 추출
            if(maxHeight < sizes[i][1]){
               maxHeight = sizes[i][1];
            }    
        }
          
        return maxWidth * maxHeight;
    }
    
    public void swap(int[][] sizes, int i){
        int temp=0;
        if(sizes[i][0] < sizes[i][1]){
            temp = sizes[i][1];
            sizes[i][1] = sizes[i][0];
            sizes[i][0] = temp;
        }      
    }   
}