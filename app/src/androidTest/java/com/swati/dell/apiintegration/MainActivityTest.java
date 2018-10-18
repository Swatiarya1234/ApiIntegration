package com.swati.dell.apiintegration;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class MainActivityTest {

   private  MainActivity mainActivity=null;
   @Rule
   public ActivityTestRule<MainActivity>mainActivityActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);

   @Before
   public void setup() throws Exception {
         mainActivity=mainActivityActivityTestRule.getActivity();
   }

    @Test
    public void onCreate() {
       assertNotNull(mainActivity.findViewById(R.id.Search));
       assertNotNull(mainActivity.findViewById(R.id.url));
       assertNotNull(mainActivity.findViewById(R.id.author));
       assertNotNull(mainActivity.findViewById(R.id.description));
       assertNotNull(mainActivity.findViewById(R.id.title));
       assertNotNull(mainActivity.findViewById(R.id.urldetails));
       assertNotNull(mainActivity.findViewById(R.id.Authordeatils));
       assertNotNull(mainActivity.findViewById(R.id.descriptiondetails));
       assertNotNull(mainActivity.findViewById(R.id.titledetails));
       onView(withId(R.id.Search)).perform(typeText("in"));


    }

    @After
    public void testdown()throws IOException{
       mainActivity=null;
    }
}