package com.example.danie.nameapp_v4;

import android.net.Uri;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;

/**
 * Created by daniel on 31.01.18.
 */

public class NameActivityTest {

    @Rule
    public ActivityTestRule<NameActivity> mActivityRule = new ActivityTestRule(NameActivity.class);
    @Rule
    public ActivityTestRule<AddPersonActivity> mActivityRule2 = new ActivityTestRule(AddPersonActivity.class);

    @Test
    public void testCase4() {
        onView(withId(R.id.menuAdd)).perform(click());
        onView(withId(R.id.editText2)).perform(typeText("test_name"));

        Uri u = Uri.parse("android.resource://com.example.danie.nameapp_v4/drawable/defualt__pic");
        mActivityRule2.getActivity().setSelectedImageUri(u);

        onView(withId(R.id.button7_save)).perform(click());

        onView(withId(R.id.namesList))
                .check(matches(hasDescendant(withText("test_name"))));
    }
}
