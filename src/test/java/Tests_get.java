import static io.restassured.RestAssured.*;
import org.junit.jupiter.api.Test;


public class Tests_get {


    @Test
    public void test_1_listUsers() {
        given().spec(Spec.requestSpec).
        when().
                get(EndPoints.usersPage).
        then().
                statusCode(200).log().all();
    }

    @Test
    void test_2_singleUser() {
        given().spec(Spec.requestSpec).
        when().
                get(EndPoints.user).
        then().
                statusCode(200).log().all();
    }

    @Test
    void test_3_singleUserNotFound() {
        given().spec(Spec.requestSpec).
        when().
                get(EndPoints.userNotFound).
        then().
                statusCode(404).log().all();
    }

    @Test
    void test_4_listResource() {
        given().spec(Spec.requestSpec).
        when().
                get(EndPoints.resources).
        then().
                statusCode(200).log().all();
    }

    @Test
    void test_5_singleResource() {
        given().spec(Spec.requestSpec).
        when().
                get(EndPoints.resource).
        then().
                statusCode(200).log().all();
    }

    @Test
    void test_6_singleResourceNotFound() {
        given().spec(Spec.requestSpec).
        when().
                get(EndPoints.resourceNotFound).
        then().
                statusCode(404).log().all();
    }

    @Test
    void test_7_delayedResponse() {
        given().spec(Spec.requestSpec).
        when().
                get(EndPoints.delay).
        then().
                statusCode(200).log().all();
    }
}
