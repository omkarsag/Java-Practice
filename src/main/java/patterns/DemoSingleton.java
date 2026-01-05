package patterns;

public class DemoSingleton {
    public static void main(String[] args) {
        // Get the first instance, passing "FOO" as a value
        SingletonDemo singleton1 = SingletonDemo.getInstance("FOO");

        // Try to get another instance, passing "BAR" as a value
        // The getInstance() method will return the already created instance
        SingletonDemo singleton2 = SingletonDemo.getInstance("BAR");

        // Print the value from both references
        System.out.println("Value of singleton1: " + singleton1.value);
        System.out.println("Value of singleton2: " + singleton2.value);

        // Check if both references point to the exact same object
        System.out.println("Do both references point to the same object? " + (singleton1 == singleton2));
    }
}
