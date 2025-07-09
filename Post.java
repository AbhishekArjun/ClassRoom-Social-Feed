import java.time.LocalDateTime;

public class Post {
    private String author;
    private String content;
    private LocalDateTime timestamp;

    public Post(String author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String toString() {
        return "[" + timestamp + "] " + author + ": " + content;
    }
}
