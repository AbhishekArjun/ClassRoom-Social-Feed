import java.util.ArrayList;
import java.util.List;

public class Feed {
    private List<Post> posts = new ArrayList<>();

    public void addPost(String author, String content) {
        posts.add(new Post(author, content));
    }

    public void displayFeed() {
        if (posts.isEmpty()) {
            System.out.println("No posts available.");
        } else {
            for (Post post : posts) {
                System.out.println(post);
            }
        }
    }
}
