

package features;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;
import org.junit.Test;

public class TodoVerifyNotContainsTest {

    private String url = "https://jsonplaceholder.typicode.com/todos/1";
    @Test
    public void verifyTitleNotContainsLoremIpsum() {
        given()
        .when()
            .get(url).
        then()
            .assertThat().statusCode(200)
            .and().body("title", not(containsString("lorem ipsum"))) // Look ma, No Regex
            ;
    }

    @Test
    public void verifyResponseDoesNotContainAuthor() {
		given()
        .when()
            .get(url).
        then()
            .assertThat().statusCode(200)
            .and().body( "any { it.key == 'author'}", is(false)) // Dark Wizardry, Do not touch
            ;
    }

    @Test @Ignore
    public void ignored() {
        given()
                .when()
                .get(url).
                then()
                .assertThat().statusCode(200)
                .and().body( "any { it.key == 'author'}", is(false))
        ;
    }
}

