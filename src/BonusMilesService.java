public class BonusMilesService {

    public int calculate(int cost) {
        int ticket = cost;
        int bonus = 20;
        int bonusMiles = ticket / bonus;
        return bonusMiles;

    }
}
