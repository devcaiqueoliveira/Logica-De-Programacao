package domain;

import java.util.HashMap;
import java.util.Map;

public class VoteCounter {
    private final Map<String, Integer> votes = new HashMap<>();

    public void vote(String candidateName) {
        int currentCount = votes.getOrDefault(candidateName, 0);
        votes.put(candidateName, currentCount + 1);
    }

    public void showResults() {
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votos");
        }
    }
}