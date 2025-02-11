package test_4;

public class Point {
    int x;
    int y;

    //конструктор

    Point(int someX,  int someY){
        this.x = someX;
        this.y = someY;

    }

    //  Геттер для поля x
    int getX () {
        return x;
    }
    //  Геттер для поля y
    int getY () {
        return y;
    }

    // Сеттер для поля x
    void setX(int newX) {
        this.x = newX;
    }
    // Сеттер для поля y
    void setY(int newY) {
        this.y = newY;
    }
     void print(){
         System.out.println("Координаты: x =  " + x + " , y = " + y );
     }
}
