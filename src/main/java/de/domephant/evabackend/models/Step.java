package de.domephant.evabackend.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Step {
    public Ingredient[] ingredients;
    public String description;
    public String tip;
}
