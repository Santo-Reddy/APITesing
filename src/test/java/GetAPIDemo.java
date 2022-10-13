import com.aventstack.extentreports.Status;
import com.github.fge.jsonschema.core.processing.ProcessorSelector;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static io.restassured.RestAssured.*;

public class GetAPIDemo extends Base{

    @Test
    public void getDemo() {
        System.out.println("Welcome to Testing");
        given().
                when().get(MyConstant.BASE_URL+"users?page=2").
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
                when().post(MyConstant.BASE_URL+"users").
                then().log().all().statusCode(201);

    }
    @Test
    public void putDemo(Method m) {
        System.out.println("Welcome to Testing");
        given().body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").
                contentType("application/json").
                when().put(MyConstant.BASE_URL+"users/2").
                then().log().all().statusCode(200);
        test.log(Status.PASS,m.getName()+" is passed");

    }
}
