package steps;

import br.com.challenge.blockbuster.BlockbusterApplication;
import br.com.challenge.blockbuster.models.User;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@SpringBootTest(classes = BlockbusterApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration
@DirtiesContext
public class Steps {

    int response = 0;
    String baseURL =  "http://localhost:8080/user";
    protected RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> movieStatus;
    User userById;
    User movieId;

    @When("i call movies")
    public void callsMovies() {
        try{
            movieStatus = restTemplate.getForEntity(new URI(baseURL + "/movies"), String.class);
        } catch (Exception e){
            System.out.println("url error");
        }
    }

    @Then("should be visible the value {string}")
    public void receivesResponseStatusValue(String status) {
        Assert.assertEquals(status, movieStatus.getStatusCode().toString());

    }

    @When("i make a call with value {string}")
    public void callsIdWith(String id) {
        try{
            userById = restTemplate.getForObject(new URI(baseURL+ id), User.class);
        } catch (Exception e){
            System.out.println("url error");
        }
    }

    @Then("should be visible the name Lee Pong")
    public void receivesResponseWithFirst_nameKeyValue(String firstname, String Lastname) {
        Assert.assertEquals(firstname, userById.getFirstName());
        Assert.assertEquals(Lastname, userById.getLasttName());
    }



}
