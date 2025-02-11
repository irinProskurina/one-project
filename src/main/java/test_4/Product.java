package test_4;

public class Product {
    // название товара
    String name;
    // цена товара
    double price;

    // Конструктор для задания имени и цены
    Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }
    //  Геттер для поля name
     String getName(){
        return name;
    }
    // Сеттер для поля name
    void setName(String newName){
        this.name = newName;

    }
    //  Геттер для поля price
    double getPrice(){
        return price;
    }

    // Сеттер для поля price
    void setPrice(double newPrice){
        this.price = newPrice;
    }

    // Метод applyDiscount(double discount) для уменьшения цены на discount процентов.

    public void applyDiscount(double discount) {

        this.price = this.price * (1 - discount / 100.0);
    }

    // Метод printInfo()
    void printInfo(){
        System.out.printf("Товар: %s, Цена: %.2f руб.\n", name, price);
    }

}
