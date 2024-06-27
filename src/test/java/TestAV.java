import org.example.steps.AvSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAV extends BaseTest {
    AvSteps avSteps = new AvSteps();

    @Test
    public void exampleTest() {
        avSteps.clickAllowButton();
        avSteps.clickViewButton();

        Assert.assertTrue(avSteps.isTextDisplayed());
    }
}
