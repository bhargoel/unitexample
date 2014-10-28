package example.cisco.com.unitexample.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

import example.cisco.com.unitexample.MyActivity;
import example.cisco.com.unitexample.R;

/**
 * Created by bhargoel on 28/10/14.
 */
public class MyActivityTest extends ActivityInstrumentationTestCase2<MyActivity> {


    MyActivity activity;

    public MyActivityTest()
    {

        super(MyActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity=getActivity();
    }


    @SmallTest
    public void testTextViewNotNull()
    {

        TextView textView= (TextView)activity.findViewById(R.id.textView);
        assertNotNull(textView);

    }
}
