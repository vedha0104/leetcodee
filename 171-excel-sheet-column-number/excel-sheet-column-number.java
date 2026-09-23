class Solution {
    public int titleToNumber(String columnTitle) {
        long res = 0;
        for(int i = 0;i < columnTitle.length();i++)
        {
            char c = columnTitle.charAt(i);
            res = res * 26 + (c - 'A' + 1);
        }
        return (int)res;
    }
}