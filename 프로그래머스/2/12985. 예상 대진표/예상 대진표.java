class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        for(int i=0; i<n; i++){
            answer++;
            if((a+1)/2 == (b+1)/2)
                break;
            a = (a+1)/2;
            b = (b+1)/2;
        }

        return answer;
    }
}