package test_4;

public class Circle {
    // (радиус)
    double radius;

    // Конструктор для задания радиуса
    Circle(double someRadius){
        this.radius= someRadius;
    }

    //  Геттер для radius
    double getRadius(){
        return radius;
    }
    // Сеттер для поля radius
    void setRadius(double newRadius){
        this.radius = newRadius;

    }
    // Метод calculateArea(), который возвращает площадь (πr2\pi r^2).

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Метод calculateCircumference(), который возвращает длину окружности (2πr2 \pi r)
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
}
