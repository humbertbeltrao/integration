package com.example.humberto.cinapp;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by Humberto on 23/06/2016.
 */
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class ExampleTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public ExampleTest(){
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

    }

    public void testLocalWelcomeRobotium(){
        solo = new Solo(getInstrumentation(), getActivity());
        EditText edit_txt = (EditText) solo.getView(R.id.editText2);
        solo.enterText(edit_txt, "RoboElectric");
        Button btn_local = (Button) solo.getView(R.id.button2);
        solo.clickOnView(btn_local);
        solo.waitForText("Robotium", 1, 3000);
        TextView tv = (TextView) solo.getView(R.id.textView);
        String result = tv.getText().toString();
        assertEquals(result, "Hello Robotium how are you doing?");

    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

//    public void test_GreetingActivity() throws  Exception {
//        solo.unlockScreen();
//
//    }
//
//    public void testEquals() {
//        assertEquals(1, 1);
//    }

//    public void testBoolean() throws Exception {
//        //test_GreetingActivity();
//        assertTrue(true);
//    }
}
