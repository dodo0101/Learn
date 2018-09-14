public class RussianHen extends Hen implements Country {
    	@Override
        public int getCountOfEggsPerMonth() {
            return 70;
        }
    	@Override
        String getDescription() {
            return super.getDescription() + " ћо€ страна - " + Country.RUSSIA + ". я несу " + this.getCountOfEggsPerMonth() + " €иц в мес€ц.";
        }
    }