package test_4;

public class Book {
    String title;
    String author;


//  конструктор
    Book(String someTitle, String someAuthor){
        this.title = someTitle;
        this.author = someAuthor;
    }

    //  Геттер для поля title
    String getTitle(){
        return title;
    }
    //  Геттер для поля author
    String getAuthor(){
        return author;
    }

    // Сеттер для поля title
    void setTitle(String newTitle){
        this.title = newTitle;

    }
    // Сеттер для поля author
    void setAuthor(String newAuthor){
        this.author = newAuthor;

    }

    public String printInfo(){
        return  "Название: " + this.title + " , Автор" + this.author;
    }

    void print(){
        System.out.println(this.printInfo());

    }





}
