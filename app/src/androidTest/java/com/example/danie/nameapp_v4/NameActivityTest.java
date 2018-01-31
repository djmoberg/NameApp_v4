package com.example.danie.nameapp_v4;

import android.support.test.rule.ActivityTestRule;

import org.junit.*;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

/**
 * Created by daniel on 31.01.18.
 */

public class NameActivityTest {

    @Rule
    public ActivityTestRule<NameActivity> mActivityRule =
            new ActivityTestRule(NameActivity.class);

    @Test
    public void testCase4() {
        onView(withId(R.id.menuAdd)).perform(click());
        onView(withId(R.id.editText2)).check(matches(withText("")));

    }
}
