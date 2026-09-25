class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for(int row=0 ; row< 9;row++){
            for(int col = 0; col < 9; col++){
                char c = board[row][col];
                if(c != '.'){
                    if(set.contains(c)){
                        return false;
                    }
                    set.add(c);
                }
            }
            set.clear();
        }

        for(int col=0 ; col< 9;col++){
            for(int row = 0; row < 9; row++){
                char c = board[row][col];
                if(c != '.'){
                    if(set.contains(c)){
                        return false;
                    }
                    set.add(c);
                }
            }
            set.clear();
        }

        for(int row=0 ; row< 9;row += 3){
            for(int col = 0; col < 9; col += 3){
                
                for(int i=row; i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        char c = board[i][j];
                        if(c != '.'){
                            if(set.contains(c)){
                                return false;
                            }
                            set.add(c);
                        }
                    }
                }

                set.clear();
            }
        }

        return true;
    }
}
