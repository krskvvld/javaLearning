package javaPro.immutableClass;

import java.util.Date;
import java.util.Objects;

public final class MyImmutableClass {
    private final StringBuilder name;
    private final int age;
    private final Date birthDay;

    public MyImmutableClass(StringBuilder name, int age, Date birthDay) {
        this.name = new StringBuilder(name.toString());
        this.age = age;
        this.birthDay = new Date(birthDay.getTime());
    }

    public String getName() {
        return name.toString();
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDay() {
        return new Date(birthDay.getTime());
    }

    @Override
    public boolean equals(Object o1) {
        if (o1 == this) return true;
        if (o1 == null || o1.getClass() != getClass()) return false;
        MyImmutableClass o2 = (MyImmutableClass) o1;
        return name.toString().equals(o2.getName())
                && age == o2.age
                && Objects.equals(birthDay, o2.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthDay);
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nage: " + age
                + "\nBirthDay: " + birthDay;
    }
}