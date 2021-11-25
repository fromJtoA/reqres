import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.Test;

public class Tests_put_patch_delete {

    @Test
    void test_14_putUser() {
        User user = new User("homer","reviser");

        given().spec(Spec.requestSpec).body(user).
        when().
                put(EndPoints.user).
        then().
                statusCode(200).log().all();
    }

    @Test
    void test_15_putRegister() {
        Register register = new Register("qqqqqqqqq@ssssss.ddd","aaaaaaa");

        given().spec(Spec.requestSpec).body(register).
        when().
                put(EndPoints.register).
        then().
                statusCode(200).log().all();
    }

    @Test
    void test_16_patchUser() {
        User user = new User("morpheus","zion resident");

        given().spec(Spec.requestSpec).body(user).
        when().
                patch(EndPoints.user).
        then().
                statusCode(200).log().all();
    }

    @Test
    void test_17_patchRegister() {
        Register register = new Register("qqqqqqqqq@ssssss.ddd","aaaaaaa");

        given().spec(Spec.requestSpec).body(register).
                when().
                patch(EndPoints.register).
                then().
                statusCode(200).log().all();
    }
    @Test
    void test_18_delete() {
        given().spec(Spec.requestSpec).
        when().
                delete(EndPoints.user).
        then().
                statusCode(204).log().all();
    }
}
