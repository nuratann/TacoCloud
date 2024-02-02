package com.nuratan.tacocloud;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min=3,message = "at least 3 character")
    private String name;
    @NotNull
    @Size(min=1,message = "at least 1 ingredient")
    private List<Ingredient> ingredients;
}
