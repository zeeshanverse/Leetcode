class Solution {
    int[][] directions = {{1 , 0 } , {-1 , 0 } , {0 , 1} , {0 , -1 }} ; 

    public boolean exist(char[][] board, String word) {
        int m = board.length ;
        int n = board[0].length ;
        for(int i = 0 ; i < m ; i++ ) {
            for(int j = 0 ; j < n ; j++ ) {
                if(board[i][j] == word.charAt(0) && find(0 , i , j , board , word , m , n )) return true ;
            }
        }

        return false ;
    }
    boolean find(int ind , int i , int j , char[][] board , String word , int m , int n ) {
        if(ind == word.length()) return true ;

        if(i < 0 || j < 0 || i >= m || j >= n || board[i][j] == '$' || board[i][j] != word.charAt(ind)) return false ;

        char temp = board[i][j] ;
        board[i][j] = '$' ;

        for(int[] dir : directions ) {
            int new_i = i + dir[0] ;
            int new_j = j + dir[1] ;

            if(find(ind + 1 , new_i , new_j , board , word , m , n )) return true ;
        }
        board[i][j] = temp ;

        return false ;
    }
}