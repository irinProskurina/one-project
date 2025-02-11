package test_4;

public class Laptop {
    String brand;
    double price;

    // Конструктор для задания бренда и цены
    Laptop (String someBrand, double somePrice){
        this.brand = someBrand;
        this.price = somePrice;

    }

    //  Геттер для поля brand
     String getBrand(){
        return brand;
    }
    // Сеттер для поля brand
    void setBrand(String newBrand){
        this.brand = newBrand;

    }

    //  Геттер для поля price
    double getPrice(){
        return price;
    }
    // Сеттер для поля price
    void setPrice(double newPrice){
        this.price = newPrice;

    }

    // Метод printInfo()
    void printInfo(){
        System.out.printf("Ноутбук: %s, Цена: %.2f руб.\n", brand, price);
    }
}
