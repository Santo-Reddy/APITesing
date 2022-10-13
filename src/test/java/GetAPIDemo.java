import com.github.fge.jsonschema.core.processing.ProcessorSelector;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAPIDemo extends Base{

    @Test
    public void getDemo() {
        System.out.println("Welcome to Testing");
        given().
                when().get("https://reqres.in/api/users?page=2").
                then().log().all();

    }

    @Test
    public void postDemo() {
        System.out.println("Welcome to Testing");
        given().body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").
                contentType("application/json").
                when().post("https://reqres.in/api/users").
                then().log().all().statusCode(201);

    }
    @Test
    public void putDemo() {
        System.out.println("Welcome to Testing");
        given().body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").
                contentType("application/json").
                when().put("https://reqres.in/api/users/2").
                then().log().all().statusCode(200);

    }
}
