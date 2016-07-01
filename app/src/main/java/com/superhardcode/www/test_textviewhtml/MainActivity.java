package com.superhardcode.www.test_textviewhtml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.sufficientlysecure.htmltextview.HtmlTextView;

public class MainActivity extends AppCompatActivity {

    private HtmlTextView textview = null;
    private String text = "<font color='#000000' size=60><u>Text</u> <p>with <b>strokes</b></font><br/><img src=\"http://www.siamsport.co.th/_ImagesNews/160607D1Q11240.jpg\"/>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (HtmlTextView) findViewById(R.id.html_text);
        textview.setHtmlFromString(text, new HtmlTextView.RemoteImageGetter());
    }
}
