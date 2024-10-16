package gb.polonskaia;

import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*зависимостей и написать код, использующий эти зависимости.
    Пример решения:
            1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или
    блока 2.
            2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и
    com.google.code.gson:gson:2.8.6.
            3. Создайте класс Person с полями firstName, lastName и age.
            4. Используйте библиотеку commons-lang3 для генерации методов toString,
    equals и hashCode.
5. Используйте библиотеку gson для сериализации и десериализации объектов
    класса Person в формат JSON.*/
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Person person = new Person("Vanya","Petrov", 25);
        Person person1 = new Person("Misha","Petrov", 30);
        Gson gson = new Gson();
        String json = gson.toJson(person1);
        Person jsonFrom = gson.fromJson(json,Person.class);
        Boolean check = person1.equals(jsonFrom);
        Boolean check1 = person.equals(jsonFrom);
        System.out.println(check);
        System.out.println(check1);

    }
}