package de.domephant.evabackend.models;

public enum Difficulty {
    easy,
    normal,
    hard;

    @Override
    public String toString() {
        switch (this) {
            case easy:
                return "EASY";
            case normal:
                return "NORMAL";
            case hard:
                return "HARD";
        }
        return null;
    }

    public Difficulty toDifficulty(String s) {
        switch (s) {
            case "EASY":
                return Difficulty.easy;
            case "NORMAL":
                return Difficulty.normal;
            case "HARD":
                return Difficulty.hard;
        }
        return null;
    }
}
