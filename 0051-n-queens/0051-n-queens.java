class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>() ;
        List<String> board = new ArrayList<>() ;
        String s = ".".repeat(n) ;
        for(int i = 0 ; i < n ; i++ ) board.add(s) ;

        HashSet<Integer> leftRow = new HashSet<>();
        HashSet<Integer> lowerDig = new HashSet<>();
        HashSet<Integer> upperDig = new HashSet<>();

        solve(0 , board , ans , leftRow , lowerDig , upperDig , n ) ;

        return ans ;
    }
    void solve(int col , List<String> board , List<List<String>> ans , HashSet<Integer> leftRow ,
                    HashSet<Integer> lowerDig , HashSet<Integer> upperDig , int n ) {
        
        if(col == n ) {
            ans.add(new ArrayList<>(board)) ;

            return ;
        }

        for(int row = 0 ; row < n ; row++ ) {
           if (!leftRow.contains(row)
                && !lowerDig.contains(row + col)
                && !upperDig.contains(col - row + n - 1)) {

                String current = board.get(row);
                String updated = current.substring(0, col ) + "Q" + current.substring(col + 1);

                board.set(row, updated);

                leftRow.add(row) ;
                lowerDig.add(row + col) ;
                upperDig.add(col - row + n - 1) ;

                solve(col + 1 , board , ans , leftRow , lowerDig , upperDig , n ) ;

                current = board.get(row);
                updated = current.substring(0, col) + "." + current.substring(col + 1);

                board.set(row, updated);

                leftRow.remove(row) ;
                lowerDig.remove(row + col) ;
                upperDig.remove(col - row + n - 1 ) ;
            }
        }
    }
}