package test_4;

public class Teacher {
    // имя учителя
    String name;
    // предмет
    String subject;

    //Конструктор для задания имени и предмета
    Teacher(String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;
    }

    //  Геттер для поля name
    String getName(){
        return name;
    }
    // Сеттер для поля name
    void setName(String newName){
        this.name = newName;

    }

    //  Геттер для поля subject
    String getSubject(){
        return subject;
    }

    // Сеттер для поля subject
    void setSubject(String newSubject){
        this.subject = newSubject;
    }
    // Метод printInfo()

    void printInfo(){
        System.out.println("Учитель: " + this.name + ", Предмет: " + this.subject);
    }
}
