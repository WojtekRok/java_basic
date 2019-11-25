package staticClass;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("x","x");
        User user2 = new User("y","y");
        //System.out.println(user1.getLogin());
        // Odwołanie do składowej statycznej
        // 1. odwołanie do składowej statycznej nie wymaga utworzenia obiektu
        // 2. odwołujemy się poprzedając składową nazwą klasy
        // 3. jest tylko jedna kopia składowej statycznej w ramach klasy
        System.out.println(User.globalId);
        User.incrementGlobalId();
    }
}
