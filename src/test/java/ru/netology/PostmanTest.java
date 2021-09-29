package ru.netology;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanTest {
    @Test
        void shouldTryPostmanReqests(){

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
               .when()
                .post("/post")
               .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
                .contentType(ContentType.JSON);
    }
}
