package API_demo_day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Day_01 {

    
    @Test
    public void helthchecktest(){
        given().when().get("https://restful-booker.herokuapp.com/").then().assertThat().statusCode(200);
    }
}
