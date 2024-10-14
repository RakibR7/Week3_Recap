package atu.ie.week3_recap;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @NotNull(message = "must not be empty")
    private long id;
    @NotBlank(message = "A value need to be entered")
    @Size(max=25, message = "Name must be between 3 to 25 characters")
    private String name;
    @Positive
    private double price;
}

