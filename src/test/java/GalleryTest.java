import org.example.Artist;
import org.example.Artwork;
import org.example.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

Artist vanGogh;
Artwork sunflowers;
Artwork starryNight;
Gallery ourGallery;


@BeforeEach

public void setUp(){
    vanGogh = new Artist("Van Gogh");
    sunflowers = new Artwork("Sunflowers", 99.99);
    starryNight = new Artwork("Starry Night", 100.00);
    ourGallery = new Gallery("The Louvre");
}

@Test

public void hasName(){
    assertThat(ourGallery.getName()).isEqualTo("The Louvre");
}

@Test

public void hasTill(){
    assertThat(ourGallery.getTill()).isEqualTo(0.00);
}

@Test
    public void canIncreaseTill(){
    ourGallery.increaseTill(sunflowers);
    assertThat(ourGallery.getTill()).isEqualTo(99.99);
}
    @Test
    public void canDecreaseTill(){
        ourGallery.decreaseTill(sunflowers);
        assertThat(ourGallery.getTill()).isEqualTo(-99.99);
    }

    @Test
    public void canAddToCollection() {
        ourGallery.addToCollection(sunflowers);
        assertThat(ourGallery.countCollection()).isEqualTo(1);
    }

    @Test
    public void canRemoveFromCollection() {
        ourGallery.addToCollection(starryNight);
        ourGallery.addToCollection(sunflowers);
        ourGallery.removeFromCollection(sunflowers);
        assertThat(ourGallery.countCollection()).isEqualTo(1);
    }
}
