public class RussianHen extends Hen implements Country {
    	@Override
        public int getCountOfEggsPerMonth() {
            return 70;
        }
    	@Override
        String getDescription() {
            return super.getDescription() + " ��� ������ - " + Country.RUSSIA + ". � ���� " + this.getCountOfEggsPerMonth() + " ��� � �����.";
        }
    }