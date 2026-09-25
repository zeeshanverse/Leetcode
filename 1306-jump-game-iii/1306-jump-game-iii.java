class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<>() ;

        boolean [] visited = new boolean[arr.length] ;

        q.offer(start) ;
        visited[start] = true ;

        while(!q.isEmpty()) {
            int i = q.poll() ;

            if(arr[i] == 0 ) return true ;

            int forward = i + arr[i] ;
            int backward = i - arr[i] ;

            if(forward < arr.length && !visited[forward]) {
                visited[forward] = true ;
                q.offer(forward) ;
            }
            if(backward >= 0 && !visited[backward]) {
                visited[backward] = true ;
                q.offer(backward) ;
            }
        }
        return false ;
    }
}