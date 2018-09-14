public class BelarusianHen extends Hen implements Country {
    	//@Override
        public int getCountOfEggsPerMonth() {
            return 60;
        }
    	//@Override
        String getDescription() {
            return super.getDescription() + " ћо€ страна - " + Country.BELARUS + ". я несу " + this.getCountOfEggsPerMonth() + " €иц в мес€ц.";
        }
        
    }