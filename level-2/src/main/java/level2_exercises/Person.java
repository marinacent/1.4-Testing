package level2_exercises;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private String favoriteColor;
    private List<String> favoriteComposers;

    public Person(String name, int age, String favoriteColor) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.favoriteComposers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void addFavoriteComposer(String name) {
        favoriteComposers.add(name);
    }

    public void printFavoriteComposers(int numberOfComposers) {
        if (numberOfComposers > favoriteComposers.size() || numberOfComposers < 0) {
            throw new ArrayIndexOutOfBoundsException(numberOfComposers);
        }
        System.out.println("Top " + numberOfComposers + " favorite composers:");
        for (int i = 0; i < numberOfComposers; i++) {
            System.out.println(favoriteComposers.get(i));
        }
    }
}
