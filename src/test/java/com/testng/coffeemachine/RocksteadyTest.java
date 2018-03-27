package com.testng.coffeemachine;

import org.testng.annotations.*;

public class RocksteadyTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void searchPage() {
        actionwords.scenarioSearchPage();
        // Given I'm in
        actionwords.imInRocksteadyWebsite();
        // When I search for "cat"
        actionwords.iSearchForP1("cat");
        // Then the user should see cat in the results
        actionwords.theUserShouldSeeCatInTheResults();
    }
}