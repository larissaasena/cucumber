package cucumbertest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

class Breeds {
    static String breeds(String answer) {
        return "1".equals(answer) ? "valid!" : "not valid!";
    }
}

public class StepDefinitions {
    private String answer;
    private String actualAnswer;

    @Given("limit parameter as {string}")
    public void limit_is(String answer) {
        this.answer = answer;
    }

    @When("I check if it is an integer")
    public void i_check_if_it_is_an_integer() {
        actualAnswer = Breeds.breeds(answer);
    }

    @Then("I should assert {string}")
    public void i_should_assert(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}