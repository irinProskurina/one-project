package test_4;

public class BankAccount {
    String owner;
    double balance;

    //  конструктор
    BankAccount(String someOwner, double someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    //  Геттер для поля owner
    String getOwner() {
        return owner;
    }

    //  Геттер для поля balance
    double getBalance() {
        return balance;
    }

    // Сеттер для поля owner
    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    // Сеттер для поля balance
    void setBalance(double newBalance) {
        this.balance = newBalance;
    }


    public void deposit(double amount) {
        // Увеличиваем баланс на сумму депозита
        balance += amount;
        // Сообщаем об успешном внесении депозита
        System.out.println("Депозит на " + amount + " успешно внесен.");
    }


    public void withdraw(double amount) {
        // Уменьшаем баланс на сумму снятия
        balance -= amount;

        // Сообщаем об успешном снятии
        System.out.println("Депозит на " + amount + " успешно внесен.");

    }
    // Метод для вывода текущего баланса
    public void printBalance() {
        System.out.println("Текущий баланс: " + balance);

    }

}




