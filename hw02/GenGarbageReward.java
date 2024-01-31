package arch.HW2;

public class GenGarbageReward implements GenItem {
    @Override
    public IGameItem create() {
        return new GarbageReward();
    }
}