package arch.HW2;

public class GenGoldReward implements GenItem {

    @Override
    public IGameItem create() {
        return new GoldReward();
    }
}