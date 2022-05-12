package Animal;

public class Animal {
     String dogName;
    boolean ifDog;
    public Animal(String dogName, boolean ifDog) {
        this.dogName = dogName;
        this.ifDog = ifDog;
    }
        //OVERLOADING ASSIGNMENT BELOW
    public Animal(boolean ifDog) {
        this.ifDog = true;
    }

    public String getDogName() {
        return dogName;
    }

    public boolean isIfDog() {
        return ifDog;
    }

    @Override
    public String toString() {
        return (getDogName() + " is a dog = " + isIfDog());
    }
}
