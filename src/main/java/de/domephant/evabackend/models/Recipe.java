package de.domephant.evabackend.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Recipe {
    public String name;
    public int userID;
    public int time;
    public float stars;
    public Difficulty difficulty;
    public Ingredient[] ingredients;
    public Step[] steps;
}
