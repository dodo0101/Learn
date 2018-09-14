public class UkranianHen extends Hen implements Country {
    	@Override
        public int getCountOfEggsPerMonth() {
            return 90;
        }
    	@Override
        String getDescription() {
            return super.getDescription() + " ћо€ страна - " + Country.UKRAINE + ". я несу " + this.getCountOfEggsPerMonth() + " €иц в мес€ц.";
        }
        
    }