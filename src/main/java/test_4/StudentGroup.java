package test_4;

public class StudentGroup {
    //название группы
    String groupName;
    // (количество студентов)
    int studentCount;

    // Конструктор для задания названия группы и количества студентов//

 StudentGroup( String someGroupName, int someStudentCount){
     this.groupName = someGroupName;
     this.studentCount= someStudentCount;

 }

    //  Геттер для поля groupName
    String getGroupName(){
        return groupName;
    }
    //  Геттер для поля studentCount
    int getStudentCount(){
        return studentCount;
    }

    // Сеттер для поля groupName
    void setGroupName(String newGroupName){
        this.groupName = newGroupName;

    }
    // Сеттер для поля studentCount
    void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;

    }
    // Метод printInfo() для вывода информации о группе

    void printInfo(){
     System.out.println("Группа: " + this.groupName + ", Количество студентов: " + this.studentCount);
    }

}
