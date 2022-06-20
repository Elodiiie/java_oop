package stuPackage;

/**
 * @Author: Lynn
 * @Date: 2022/6/19 23:09
 */
public class Student {
    private String name;
    private int age;
    private int sex;
    private int id;

    public Student(String name, int age, int sex, int id) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String sexName="male";
        if(age!=1){
            sexName ="female";
        }
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + sexName +
                ", sex=" + sex +
                ", id=" + id +
                '}';
    }

}
