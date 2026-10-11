class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> st = new TreeSet<>();
        for(int a : nums)
        {
            st.add(a);
        }
        if(st.size() < 3)
        return st.last();

        else
        st.pollLast();
        st.pollLast();

        return st.last();
    }
}