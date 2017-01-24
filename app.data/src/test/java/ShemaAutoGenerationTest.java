import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;

/**
 * Important! --> To create schema in a real database it takes uncomment property spring.jpa.database-platform in application.properties file
 */
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ShemaAutoGenerationTest extends BaseTests {

    @Test
    public void createShema(){
        Assert.assertTrue(true);
    }

}
