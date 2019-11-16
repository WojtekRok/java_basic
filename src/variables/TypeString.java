package variables;

public class TypeString {
    public static void main(String[] args) {
        String text = "Dowolny napis 1 1.34";
        System.out.println("text: " + text);
        System.out.println("Pierwszy znak napisu:" + text.charAt(0));
        System.out.println("Trzeci znak napisu:" + text.charAt(2));
        System.out.println("Ostatni znak napisu:" + text.charAt(text.length() - 1));
        System.out.println("y znajduje się na indeksie: " + text.indexOf('y'));
        System.out.println("Długość napisu w zmiennej text: " + text.length());

        //jak wydobyć i zapisać w nowej zmiennej słowo napis ze zmiennej text
        String napis = text.substring(8, 13);
        System.out.println(napis);
        String cite = "Być albo nie być!";
        String updateCite = cite.replaceAll("ć", "c");
        System.out.println(cite);
        System.out.println(updateCite);

        String name1 = "Ala";
        String name2 = "ala";
        System.out.println(name1.equals(name2)); //sprawdzenie czy napisy się równają
        System.out.println(name1.length() >= name2.length()); // porównanie długości napisu


        String name = "Michał";
        System.out.println("Przed: " + name);
        //    name.charAt(name.length() -1) = "l" -> typ string jest niezmienny



        // Sprawdzenie czy napis jest palindromem
        String txt = "KAJAK";
        System.out.println(txt);
        //utworzyliśmy obiekt klasy StringBuffer -> edytowalny String
        StringBuffer editableTxt = new StringBuffer(txt);
        // odwrócenie kolejności liter w napisie
        editableTxt.reverse();
        //przypisanie odwróconego napisu do zmiennej String -> needytowalnej
        String txtReversed = editableTxt.toString();
        System.out.println(editableTxt);

        String sentence = "Być albo nie być oto jest pytanie";
        // podziel zdanie na wyrazy
        // separator -> spacja
        String[] words = sentence.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        System.out.println(words[5]);
        System.out.println(words[6]);
    }
}
