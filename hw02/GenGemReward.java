package arch.HW2;

public class GenGemReward implements GenItem {
    @Override
    public IGameItem create() {
        return new GemReward();
    }
}