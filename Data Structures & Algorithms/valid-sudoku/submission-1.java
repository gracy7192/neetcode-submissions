class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            HashSet<Character> set2=new HashSet<>();
            for(int j=0;j<9;j++){
            if(board[i][j]!='.'){
            if(set.contains(board[i][j])){
                return false;
            }
            set.add(board[i][j]);
            }
             if(board[j][i]!='.'){
            if(set2.contains(board[j][i])){
                return false;
            }
             set2.add(board[j][i]);
             }
            }
        }

        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
            HashSet<Character> set=new HashSet<>();
            for(int row=i;row<i+3;row++){
            for(int col=j;col<j+3;col++){
                  if(board[row][col]=='.'){
                    continue;
                  }
                  if(set.contains(board[row][col])){
                    return false;
                  }
                  set.add(board[row][col]);
                }
            }
            }
        }
        return true;    
    }
}
