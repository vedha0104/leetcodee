class Solution {
public:
    int romanToInt(string s) {
        int ans = 0;
        unordered_map<char, int> rm = {
            {'I' , 1},
            {'V' , 5},
            {'X' , 10},
            {'L',50},
            {'C',100},
            {'D',500},
            {'M',1000}            
            };
            for(int i = 0;i <s.size() - 1;i++)
            {
                if(rm[s[i]] < rm[s[i + 1]])
                {
                    ans  -= rm[s[i]];
                }
                else{
                    ans += rm[s[i]];
                }
            }
            return ans + rm[s[s.size() - 1]];
    }
};