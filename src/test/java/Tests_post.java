import static io.restassured.RestAssured.*;
import org.junit.jupiter.api.Test;

public class Tests_post {

    @Test
    void test_8_createAsExample() {
        User user = new User("morpheus","leader");

        given().spec(Spec.requestSpec).body(user).
        when().
                post(EndPoints.users).
        then().
                statusCode(201).log().all();
    }

    @Test
    void test_9_createAsNotExample() {
        User user = new User("moo","");

        given().spec(Spec.requestSpec).body(user).
        when().
                post(EndPoints.users).
        then().
                statusCode(201).log().all();
    }

    @Test
    void test_10_registerDefineUser() {
        Register register = new Register("eve.holt@reqres.in","pistol");

        given().spec(Spec.requestSpec).body(register).
        when().
                post(EndPoints.register).
        then().
                statusCode(200).log().all();
    }

    @Test
    void test_11_registerRandomUser() {
        Register register = new Register("qqqqqqqqq@ssssss.ddd","aaaaaaa");

        given().spec(Spec.requestSpec).body(register).
        when().
                post(EndPoints.register).
        then().
                statusCode(400).log().all();
    }

    @Test
    void test_12_registerblankEmailAndPass() {
        Register register = new Register("","");

        given().spec(Spec.requestSpec).body(register).
        when().
                post(EndPoints.register).
        then().
                statusCode(400).log().all();
    }

    @Test
    void test_13_registerblankPass() {
        Register register = new Register("eve.holt@reqres.in","");

        given().spec(Spec.requestSpec).body(register).
        when().
                post(EndPoints.register).
        then().
                statusCode(400).log().all();
    }
    }
