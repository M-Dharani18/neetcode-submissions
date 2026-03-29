class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> s = new HashSet<>();
        //row
        for(int i=0;i<board.length;i++){
            s.clear();
            for(int j=0;j<board.length;j++){
                if(board[i][j] == '.') continue;
                if(!s.add(board[i][j])) return false;
            }
        }
        //column
        for(int j=0;j<board.length;j++){
            s.clear();
            for(int i=0;i<board.length;i++){
                if(board[i][j] == '.') continue;
                if(!s.add(board[i][j])) return false;
            }
        }
        //box
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
             s.clear();
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        char value = board[i+k][j+l];
                        if(value == '.') continue;
                        if(!s.add(value)) return false;}
                }
            }
        }
    return true;
    }
}
