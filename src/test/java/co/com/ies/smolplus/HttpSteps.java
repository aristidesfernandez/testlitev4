package co.com.ies.smolplus;

import static co.com.ies.smolplus.cucumber.CucumberAssertions.*;

import org.springframework.http.HttpStatus;

import io.cucumber.java.en.Then;

public class HttpSteps {

  @Then("I should be forbidden")
  public void shouldBeForbidden() {
    assertThatLastResponse().hasHttpStatus(HttpStatus.FORBIDDEN);
  }
}
