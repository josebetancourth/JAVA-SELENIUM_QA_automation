package steps;

        import io.cucumber.java.en.*;
        import org.junit.Test;
        import pages.SandBox;

public class SandboxStep {

    SandBox sand = new SandBox();

    @Given("^I navigate to a test page$")
    public void I_navigate_to_a_test_page() {
        sand.OpenSandBox();
    }

    @And("^click on dropdown$")
    public void SelectSand() {
        sand.SandBoxSelectByIndex(1);
    }
}