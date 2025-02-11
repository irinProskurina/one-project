package test_4;

public class Main {
    public static void main(String[] args) {
        // проверка конструктора
        Car car = new Car("Toyota", 2015);
        car.print();

        car.setYear(2022);
        car.print();


        // Создаем объект Rectangle
        Rectangle rectangle = new Rectangle(5, 10);
        // Выводим площадь прямоугольника
        rectangle.print();

        // Изменяем ширину через сеттер
        rectangle.setWidth(8);

        // Снова выводим площадь прямоугольника
        rectangle.print();

        // Создаем объект Book
        Book book = new Book(" Гарри Поттер", " Джоан Роулинг");
        // Выводим автора и название
       book.print();
        // Изменяем автора через сеттер
        book.setAuthor(" Михаил Булгаков");
        book.print();

         // Создаем банковский счет

        BankAccount account = new BankAccount("Проскурина Ирина", 60000);
        account.printBalance();

        // Вносим депозит
        account.deposit(500.0);
        account.printBalance();

        // Cнимите деньги
        account.withdraw(250.0);
        account.printBalance();

        // В методе main измените координату x и выведите новые координаты.

        // Создаем объект Point
        Point point =  new Point(5,10);
        point.print();
        point.setX(8);
        point.print();

        // Создаем объект StudentGroup
        StudentGroup student = new StudentGroup("QA", 25);
        student.printInfo();
        student.setStudentCount(30);
        student.printInfo();

        // Создаем объект Cirle
        Circle circle = new Circle(25.00);
        // Выводим площадь и длину окружности
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Длина окружности: " + circle.calculateCircumference());
        circle.setRadius(6);
        System.out.println("Площадь круга после изменений: " + circle.calculateArea());
        System.out.println("Длина окружности после изменений: " + circle.calculateCircumference());

        // Создаем объект  Teacher

        Teacher  teacher_1 = new  Teacher("Анна Ивановна", "Математика");
        teacher_1.printInfo();
        teacher_1.setSubject("Русский");
        teacher_1.printInfo();

        // Создаем объект  Product
        Product product_1 = new Product("Хлеб", 50.0);
        product_1.printInfo();
        System.out.println("Цена после изменения:");
        product_1.setPrice(100.0);
        product_1.printInfo();
        product_1.applyDiscount(20);
        System.out.println("Цена после скидки:");
        product_1.printInfo();

        // Создаем объект   Laptop

        Laptop laptop_1 = new Laptop("Lenovo", 70000.0);
        laptop_1.printInfo();;
        System.out.println("Цена после изменения:");
        laptop_1.setPrice(80000.0);
        laptop_1.printInfo();

    }


    }


