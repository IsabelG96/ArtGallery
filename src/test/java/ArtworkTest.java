import org.example.Artist;
import org.example.Artwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {
    
    Artwork sunflowers;
    Artist vanGogh;
    
    @BeforeEach
    public void setUp(){
        sunflowers = new Artwork("Sunflowers", 99.99);
        vanGogh = new Artist("Van Gogh");
    }
    
    @Test
    public void hasTitle(){
        assertThat(sunflowers.getTitle()).isEqualTo("Sunflowers");
    }

    @Test
    public void hasPrice(){
        assertThat(sunflowers.getPrice()).isEqualTo(99.99);
    }

    @Test 
    public void hasArtistName(){
        assertThat(vanGogh.getName()).isEqualTo("Van Gogh");
    }
    
}
