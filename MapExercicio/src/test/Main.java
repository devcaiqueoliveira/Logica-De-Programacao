package test;

import domain.VoteCounter;

public class Main {
    public static void main(String[] args) {
        VoteCounter voteCounter = new VoteCounter();

        voteCounter.vote("Candidato A");
        voteCounter.vote("Candidato B");
        voteCounter.vote("Candidato A");
        voteCounter.vote("Candidato C");
        voteCounter.vote("Candidato B");
        voteCounter.vote("Candidato A");

        voteCounter.showResults();
    }
}