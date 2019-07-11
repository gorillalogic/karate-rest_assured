package features;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class TodoVerifyEqualityTest {

    private String url = "https://jsonplaceholder.typicode.com/todos/1";
    @Test
    public void verifyFirstTodoIsEqualToTheSumOfItsParts() {
        given()
        .when()
            .get(url). // Do a GET call to the specified resource
        then()
            .assertThat().body("userId", equalTo(1))
            .and().statusCode(200)
            .and().body("id", equalTo(1))
            .and().body("title", equalTo("delectus aut autem"))
            .and().body("completed", equalTo(false))
            ;
    }
}
 // Unfortunately, there is no built-in way to compare a whole JSON in Rest-Assured, yet the Gherkin Syntax included allows for a powerful matching logic