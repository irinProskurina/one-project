package test_4;

public class Rectangle {
    int width;
    int height;

//  конструктор

    Rectangle (int someWidth, int someHeight){
        this.width = someWidth;
        this.height= someHeight;
    }

    //  Геттер для поля width
    int getWidth(){
        return width;
    }
 //  Геттер для поля height
    int getHeight(){
        return height;
    }
    // Сеттер для поля width
    void setWidth(int newWidth){
        this.width = newWidth;

    }
    // Сеттер для поля height
    void setHeight(int newHeight){
        this.height = newHeight;
    }

    // Метод для вычисления площади прямоугольника
    public int calculateArea() {
        return width * height;
    }

    void print(){
        System.out.println("Площадь прямоугольника: " + this.calculateArea());

    }


}
