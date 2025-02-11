package test_3;
// метод main - точка входа в программу
public class MathOperations {
    public static void main(String[] args){
        int add1= add(5,8);
        System.out.println("Сумма двух чисел x + y = " + add1);

        int subtract1 = subtract(1000, 800);
        System.out.println("Разность двух чисел x - y = " + subtract1);

        int multiply1 = multiply(400, 7);
        System.out.println("Произведение двух чисел x * y = " + multiply1);

        double divide1= divide( 5, 2);
        System.out.println("Деление двух чисел x / y = " + divide1);

        int findMax1 = findMax(9000,5);
        System.out.println("Возвращает большее из двух чисел " + findMax1);

        int difference1 = difference(100, 300);
        System.out.println("Возвращает разницу между двумя числами " + difference1);

        int squareArea1 = squareArea(5);
        System.out.println("Возвращает площадь квадрата " + squareArea1 );

        int squarePerimeter1 = squarePerimeter(6);
        System.out.println("возвращает периметр квадрата " + squarePerimeter1);

        String convertSecondsToMinutes1 = convertSecondsToMinutes(120);
        System.out.println(convertSecondsToMinutes1);

        String averageSpeed1 = averageSpeed(100, 20);
        System.out.println(averageSpeed1);

        String findHypotenuse1 = findHypotenuse(8, 9);
        System.out.println(findHypotenuse1);

        double circleCircumference1 = circleCircumference(5);
        System.out.println("Радиус окружности = " + circleCircumference1);

        double calculatePercentage1 = calculatePercentage(200, 50);
        System.out.println("Процент составляет: " + calculatePercentage1 + " %");

        double celsiusToFahrenheit1 = celsiusToFahrenheit(25.0);
        System.out.println( "Перевод из градусов Цельсия в Фаренгейты " + celsiusToFahrenheit1);


        double fahrenheitToCelsius1 = fahrenheitToCelsius(77.0);
        System.out.println( "Перевод  температуру из Фаренгейтов в Цельсии " + fahrenheitToCelsius1);

    }

    public static int add(int x, int y){
        // тело метода
        return x + y; // возвращаемое значение из метода

    }
    public static int subtract(int x, int y){
        // тело метода
        return x-y; // возвращаемое значение из метода

    }

    public static int multiply( int x, int y){
        // тело метода
        return x * y; // возвращаемое значение из метода
    }
    public static double divide(int x, int y){
        return (double) x / y;

    }

    public static int findMax(int a, int b){
        return Math.max(a, b);
    }

    public static int difference(int x, int y){
        return Math.min(x, y);
    }

    public static int squareArea(int side){
        return side * side;

    }

    public static int squarePerimeter(int side){
        return 4 * side;
    }

    public static String convertSecondsToMinutes(int seconds){
        int minutes = seconds / 60;  // Вычисляем минуты
        return seconds + " секунд = " + minutes + " минут";
    }

    public static String averageSpeed(double distance, double time){
        double speed = distance / time;
        return "Скорость = " + speed + " м/с (расстояние = " + distance + " м, время = " + time + " с)";
    }
    public static String findHypotenuse(double a, double b){
        double   hypotenuse = Math.sqrt(a * a + b * b);
        return String.format("Гипотенуза = %.2f, катеты = %.2f и %.2f", hypotenuse, a, b);
    }

    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part){
          return (part / total) * 100;


    }

    public static  double celsiusToFahrenheit(double celsius) {
        return celsius * 9/5 + 32;

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }


}
