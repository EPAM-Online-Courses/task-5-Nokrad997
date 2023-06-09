package efs.task.collections.entity;

public class Hero {
    private String name;
    private String heroClass;

    public Hero(String name, String heroClass) {
        this.name = name;
        this.heroClass = heroClass;
    }

    public String getName() {
        return name;
    }

    public String getHeroClass() {
        return heroClass;
    }

    // TODO implementacja metody equal porównująca obiekty Hero na podstawie pól
    // name i heroClass.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        Hero hero = (Hero) o;
    
        if (name != null ? !name.equals(hero.name) : hero.name != null) {
            return false;
        }
        return heroClass != null ? heroClass.equals(hero.heroClass) : hero.heroClass == null;
    }

    // TODO implementacja metody equal biorąca pod uwagę name i heroClass.
    @Override
    public int hashCode() {
        int result = 17;
        if (name != null) {
            result = 31 * result + name.hashCode();
        }
        if (heroClass != null) {
            result = 31 * result + heroClass.hashCode();
        }
        
        return result;
    }

    @Override
    public String toString() {
        return "My name is " + name + "and I am " + heroClass;
    }
}
