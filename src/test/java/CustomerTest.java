import org.example.Artist;
import org.example.Artwork;
import org.example.Customer;
import org.example.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Gallery ourGallery;
    Artist vanGogh;
    Artwork starryNight;
    Artwork sunflowers;
    Customer Thibyaa;

@BeforeEach

public void setUp(){
    vanGogh = new Artist("Van Gogh");
    sunflowers = new Artwork("Sunflowers", 99.99);
    starryNight = new Artwork("Starry Night", 100.00);
    ourGallery = new Gallery("The Louvre");
    Thibyaa = new Customer("Thibyaa");
}

@Test
public void hasName(){
    assertThat(Thibyaa.getName()).isEqualTo("Thibyaa");
}

@Test
public void canBuyArtwork(){
    Thibyaa.buyArtwork(starryNight);
    assertThat(Thibyaa.getWallet()).isEqualTo(0.00);
}








}
