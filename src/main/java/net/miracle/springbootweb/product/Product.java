package net.miracle.springbootweb.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Product {
    public Integer id;
    public String name;
    public Integer quantity;
    public Number price;
}
