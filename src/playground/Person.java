package playground;

import java.io.*;
import java.util.Arrays;

public class Person implements Serializable {
    private String name;
    private int age;
    private static final long serialVersionUID = 1L;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Person michael = new Person("Michael", 26);
        Person peter = new Person("Peter", 37);

        FileOutputStream fileOutputStream = new FileOutputStream("persons.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(michael);
        objectOutputStream.writeObject(peter);

        FileInputStream fileInputStream = new FileInputStream("persons.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person personCopy = (Person) objectInputStream.readObject();
        System.out.println(personCopy.toString());
    }
}