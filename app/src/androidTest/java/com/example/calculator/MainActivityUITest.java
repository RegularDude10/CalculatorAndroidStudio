package com.example.calculator;

import androidx.test.filters.MediumTest;
import org.junit.Test;
import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@MediumTest
public class MainActivityUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityScenarioRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void addTwoNumbers() {
        onView(withId(R.id.BTN2)).perform(click());
        onView(withId(R.id.BTNAdd)).perform(click());
        onView(withId(R.id.BTN3)).perform(click());
        onView(withId(R.id.BTNEql)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5.0")));

    }

    @Test
    public void subtractTwoNumbers() {
        onView(withId(R.id.BTN8)).perform(click());
        onView(withId(R.id.BTNSub)).perform(click());
        onView(withId(R.id.BTN3)).perform(click());
        onView(withId(R.id.BTNEql)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5.0")));

    }

    @Test
    public void multiplyTwoNumbers() {
        onView(withId(R.id.BTN8)).perform(click());
        onView(withId(R.id.BTNMul)).perform(click());
        onView(withId(R.id.BTN3)).perform(click());
        onView(withId(R.id.BTNEql)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("24.0")));
    }

    @Test
    public void divideTwoNumbers() {
        onView(withId(R.id.BTN9)).perform(click());
        onView(withId(R.id.BTNDiv)).perform(click());
        onView(withId(R.id.BTN3)).perform(click());
        onView(withId(R.id.BTNEql)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3.0")));
    }

    @Test
    public void divisionOnZero() {
        onView(withId(R.id.BTN8)).perform(click());
        onView(withId(R.id.BTNDiv)).perform(click());
        onView(withId(R.id.BTN0)).perform(click());
        onView(withId(R.id.BTNEql)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("NaN")));
    }

    @Test
    public void SquareRootOfNegativeNumber() {
        onView(withId(R.id.BTNSub)).perform(click());
        onView(withId(R.id.BTN8)).perform(click());
        onView(withId(R.id.BTNSqrt)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("Error")));
    }

}



























































