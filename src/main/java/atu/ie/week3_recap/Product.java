package atu.ie.week3_recap;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @NotNull
    private float id;
    @NotBlank
    @Size(min = 1, max=16, message = "Name must be between max (1-16)")
    private String name;
    @PositiveOrZero
    private float price;
}

