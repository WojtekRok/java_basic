package lombok;
// model java beans
@ToString            // dodaje metodę toString()
@Setter             // dodaje settery dla wszystkich pól
@Getter             // dodaje gettery dla wszystkich pól
@NoArgsConstructor // dodaje konstruktor domyślny - bez argumentów
@AllArgsConstructor // dodaje konstruktor z wszystkimi polami klasowymi w argumencie
@Data // dodaje gettery, settery i toString() do wszystkich pól klasowych
public class AnnotationsLombok {
    private String login;
    private String password;



}
