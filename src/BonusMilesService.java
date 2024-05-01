public class BonusMilesService {
    public int calculate(int price) {
        int colvoMil;
        if (price < 20) {
            colvoMil = 0;
        } else {
            colvoMil = price / 20;
        }
        return colvoMil;

    }
}
