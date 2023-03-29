import org.example.Artist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    Artist picasso;
    @BeforeEach
            public void setUp(){
        picasso = new Artist("Picasso");
    }

@Test
    public void hasName(){
        assertThat(picasso.getName()).isEqualTo("Picasso");
}

@Test
    public void canSetName(){
        picasso.setName("Van Gogh");
        assertThat(picasso.getName()).isEqualTo("Van Gogh");
}

}
