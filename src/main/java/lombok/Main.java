package lombok;

public class Main {
    public static void main(String[] args) {
        AnnotationsLombok annotationsLombok = new AnnotationsLombok("Michał", "123");
        // jest getter
        System.out.println(annotationsLombok.getLogin());
        // jest setter
        annotationsLombok.setLogin("XXX");
        // jest toString
        System.out.println(annotationsLombok);
    }
}
