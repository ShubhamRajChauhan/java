//Min Steps to 1


//------------------- Using Recursion ----------------
/* 
public class two {

    public static int minStepsTo1(int n) {
        if(n==1) {
            return 0;
        }

        int ans1 = minStepsTo1(n-1);
        int ans2 = Integer.MAX_VALUE;
        if((n%2)==0) {
            ans2 = minStepsTo1(n/2);
        }
        int ans3 = Integer.MAX_VALUE;
        if((n%3)==0) {
            ans3 = minStepsTo1(n/3);
        }

        int myAns = Math.min(ans1, Math.min(ans2, ans3)) + 1;
        return myAns;
    }

    public static void main(String[] args) {
        int n = 10;
        int ans = minStepsTo1(n);
        System.out.println(ans);
    }
}
*/




//----------------  Using Recursive DP, TC:0(n) SC:0(n)----------------
/*
public class two {

    public static int minStepsTo1(int n, int[] dp) {
        if(n==1) {
            return 0;
        }

        int ans1;
        if(dp[n-1] == -1) {
            ans1 = minStepsTo1(n-1, dp);
            dp[n-1] = ans1;
        }else {
            ans1 = dp[n-1];
        }
        
        int ans2 = Integer.MAX_VALUE;
        if((n%2)==0) {
            if(dp[n/2] == -1) {
                ans2 = minStepsTo1(n/2, dp);
                dp[n/2] = ans2;
            } else {
                ans2 = dp[n/2];
            }
        }
        
        int ans3 = Integer.MAX_VALUE;
        if((n%3)==0) {
            if(dp[n/3] == -1) {
                ans3 = minStepsTo1(n/3, dp);
                dp[n/3] = ans3;
            } else {
                ans3 = dp[n/3];
            }
        }

        int myAns = Math.min(ans1, Math.min(ans2, ans3)) + 1;
        return myAns;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n+1];
        for(int i=0; i<dp.length; i++) {
            dp[i] = -1;
        }
        int ans = minStepsTo1(n, dp);
        System.out.println(ans);
    }
}
*/









//----------------  Iterative DP ----------------
public class two {

    public static int minStepsTo1(int n) {
        if(n==0 || n == 1) {
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + 1;
            if((i%2) == 0) {
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }
            if((i%3) == 0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }
        return dp[n];

        
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = minStepsTo1(n);
        System.out.println(ans);
    }
}
