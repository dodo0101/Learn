public class MoldovanHen extends Hen implements Country {
    	@Override
        public int getCountOfEggsPerMonth() {
            return 80;
        }
    	@Override
        String getDescription() {
            return super.getDescription() + " ��� ������ - " + Country.MOLDOVA + ". � ���� " + this.getCountOfEggsPerMonth() + " ��� � �����.";
        }
        
    }