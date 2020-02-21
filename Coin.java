import java.util.*;
public class Coin {
    enum side {heads, tails};
    enum results {miss, in_glass};
    private side sideup;
    public Coin() {
        sideup = side.heads;
    }
    public side getSideup() {
        return sideup;
    }
    public void toss() {
        Random tosser = new Random();
        int x = tosser.nextInt(2);
        //System.out.println(x);
        if (x == 1) {sideup = side.heads;}
        else {sideup = side.tails;}
    }
    public class Dime extends Coin {
        public static final double value = .1;
    }
    public class Quarter extends Coin {
        private results result;
        public static final double value = .25;
        public Quarter() {
            result = results.miss;
        }
        public results getResult() {
            return result;
        }
        public void bounce() {
            Random bouncer = new Random();
            int x = bouncer.nextInt(5);
            if (x == 1) {result = results.in_glass;}
            else {result = results.miss;}
        }
    }
    public static void main(String[] args){
        Coin myCoin = new Coin();
        myCoin.toss();
        System.out.println(myCoin.getSideup());
    }
	/*
	 * public static void main(String[] args){
		Coin myCoin = new Coin();
		Quarter myQuarter = myCoin.new Quarter();
		myQuarter.bounce();
		System.out.println(myQuarter.getResult());
	}
	 */
}