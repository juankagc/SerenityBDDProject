package Yelp.steps;

import Yelp.pageobjects.MainPage;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.ScenarioActor;

public class YelpUserInteractions extends ScenarioActor {
    String actor;

    @Steps(shared = true)
    MainPage mainPage;
}
