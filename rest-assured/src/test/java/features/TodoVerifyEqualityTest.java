package features;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class TodoVerifyEqualityTest {

    @Test
    public void validateCountryForZipCode() {
        given()
        .when()
        .get("http://api.zippopotam.us/us/90210"). // Do a GET call to the specified resource
        then().assertThat(). // Assert that the value of the element 'country'
        body("country", equalTo("United States")); // in the response body equals 'United States'
    }
}