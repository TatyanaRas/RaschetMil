public class BonusMilesService {
    public int calculate(int price) {
        int numberMil;
        if (price < 20) {
            numberMil = 0;
        } else {
            numberMil = price / 20;
        }
        return numberMil;

    }
}
