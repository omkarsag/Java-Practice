package patterns;

public class SingletonDemo {

   private static SingletonDemo instance;
   public String value;

   private SingletonDemo(String value) {
        this.value = value;
   }

   public static SingletonDemo getInstance(String value) {
        // If the instance is null, create a new one
        if (instance == null) {
            instance = new SingletonDemo(value);
        }
        // Return the existing instance
        return instance;
   }
}
