package arch.HW2;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        List<GenItem> fabriclist = new ArrayList<>();
        fabriclist.add(new GenGoldReward());
        fabriclist.add(new GenGemReward());
        fabriclist.add(new GenGarbageReward());
        HashMap<String, Integer> rewards = new HashMap<>();

        int fabricListSize = fabriclist.size();
        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt() % fabricListSize);
            String reward = fabriclist.get(index).create().open();
            rewards.put(reward, rewards.containsKey(reward) ? rewards.get(reward) + 1 : 1);
        }

        rewards.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach((reward) -> System.out.println(reward.getValue() + " -> " + reward.getKey()));
    }
}