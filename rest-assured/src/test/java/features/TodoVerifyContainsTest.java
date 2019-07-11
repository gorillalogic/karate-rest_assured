
package features;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.Test;

public class TodoVerifyContainsTest {

    private String url = "https://jsonplaceholder.typicode.com/todos/1";
    @Test
    public void verifyTitleContainsDelectus() {
        given()
        .when()
            .get(url).
        then()
            .assertThat().statusCode(200)
            .and().body("title", containsString("delectus"))
            ;
    }
}

