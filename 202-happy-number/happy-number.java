class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = sq(slow);
            fast = sq(sq(fast)); 
        }
        while(slow != fast);

        return slow == 1;
    }
    int sq (int n)
    {
        int a = 0;
        while(n > 0)
        {
            int r = n % 10;
            a += r * r;
            n /= 10;
        }
        return a;
    }
}
