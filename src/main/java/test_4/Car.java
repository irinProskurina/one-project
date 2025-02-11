package test_4;

public class Car {
    // поля
    String brand;
    int year;

    // конструктор
    Car(String someBrand, int someYear){
       this.brand = someBrand;
       this.year= someYear;
    }

    // геттеры для поля года
    int getYear(){
        return this.year;

    }
    // геттеры для поля марки
    String getBrand(){
        return this.brand;
    }

    // сеттеры для поля year
    void setYear(int newYear){
        this.year =newYear;

    }

    // сеттеры для поля марки
    void setBrand(String newBrand){
        this.brand = newBrand;

    }

    void print(){
        System.out.println("Год  машины " + this.year + " ,  Марка: " + this.brand);

    }



}
