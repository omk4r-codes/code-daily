public class Lesson16_Richest_customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1},{76}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int i = 0; i < accounts.length; i++){
            int intermiediateResult = 0;
            for(int num: accounts[i]){
                intermiediateResult = intermiediateResult + num;
            }
            if(intermiediateResult > res)
                res = intermiediateResult;
        }
        return res;
    }
}
