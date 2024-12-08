import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class CheckTextOnGithubTest {


    @Test
    void checkTextOnPageEnterprises() {
        open("https://github.com/home");
        $(byTagAndText("button","Solutions")).hover();
        $(byTagAndText("a","Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave(Condition.text("The AI-powered\n" +
                "developer platform"));
        sleep(5000);
    }
}
