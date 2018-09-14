public class MoldovanHen extends Hen implements Country {
    	@Override
        public int getCountOfEggsPerMonth() {
            return 80;
        }
    	@Override
        String getDescription() {
            return super.getDescription() + " ћо€ страна - " + Country.MOLDOVA + ". я несу " + this.getCountOfEggsPerMonth() + " €иц в мес€ц.";
        }
        
    }