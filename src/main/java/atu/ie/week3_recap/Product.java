package atu.ie.week3_recap;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @NotNull
    private long id;

    @NotBlank(message = "invalid must enter name")
    @Size(min = 1, max=25, message = "Name must be between 1 to 25")
    private String name;

    @Positive
    private double price;
}

