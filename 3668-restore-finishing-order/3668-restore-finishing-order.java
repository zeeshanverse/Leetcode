class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        HashSet<Integer> set = new HashSet<>();

        for (int friend : friends) {
            set.add(friend);
        }

        int[] ans = new int[friends.length];
        int index = 0;

        for (int person : order) {
            if (set.contains(person)) {
                ans[index++] = person;
            }
        }

        return ans;
    }
}