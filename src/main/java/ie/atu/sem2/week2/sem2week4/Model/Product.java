package ie.atu.sem2.week2.sem2week4.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @NotBlank(message = "Product Name Is Required.")
    private String name;

    @Positive(message = "Price Must Be Greater Than Zero.")
    private double price;
}
