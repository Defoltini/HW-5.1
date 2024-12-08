import com.codeborne.selenide.Condition;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class MoveFigureTest {

    @Test
    void MoveFigureOnPage() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement one = $("#column-a").shouldBe(Condition.visible);
        SelenideElement two = $("#column-b").shouldBe(Condition.visible);
       /* actions()
                .clickAndHold(one)
                .moveToElement(two)
                .release()
                .build()
                .perform(); */

        $(one).dragAndDrop(DragAndDropOptions.to(two));
        $("#column-b").shouldHave(Condition.text("A"));
    }
}


