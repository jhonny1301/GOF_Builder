public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .setMasa("delgada")
                .setSalsa("tomate")
                .setRelleno("queso y pepperoni")
                .build();

        System.out.println(pizza);
    }
}