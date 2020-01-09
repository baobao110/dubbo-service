package model;

import java.io.Serializable;

/**
 * @Auther chenhao
 * @Date 2020/1/9
 */
public class User implements Serializable {

    private static final long serialVersionUID = -2077103100169104977L;

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
