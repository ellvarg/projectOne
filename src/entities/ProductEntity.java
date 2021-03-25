package entities;

public class ProductEntity {
    //Atributos
    public String name;
    public Double price;
    public String description;
    public Integer quantity;
    public String category;


    //Construtores

    public ProductEntity() {}

    public ProductEntity(String name, Double price, String description, int quantity, String category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
    }


    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}