/**  The application  starts with an activity which  presents the data of the students  developed the application
 * Author : Anna Manolaki AM 20051 */

package com.anna.myquiz;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class IntroAct extends AppCompatActivity implements View.OnClickListener
{
    Button ButtonEnter;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        ButtonEnter = (Button) findViewById (R.id.ButtonEnter);
        ButtonEnter.setOnClickListener (this);

    }
    /** Called when a button is pressed.
     *  Jumps to LoginAct activity.*/
    @Override
    public void onClick (View v)
    {
        if (v == ButtonEnter)
        {
            Intent intent = new Intent (getApplicationContext (), LoginAct.class);
            startActivity (intent);
            finish();
        }
    }
}