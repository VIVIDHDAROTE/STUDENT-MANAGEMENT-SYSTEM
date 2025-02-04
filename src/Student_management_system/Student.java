package Student_management_system;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private int id;
    private String city;

    Student(int id,int age,String name,String city){
        this.id=id;
        this.age=age;
        this.name=name;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city=city;
    }



    @Override
    public String toString(){
        return "Id: "+id+" Name: "+name+" Age: "+age+" City: "+city;
    }


}
