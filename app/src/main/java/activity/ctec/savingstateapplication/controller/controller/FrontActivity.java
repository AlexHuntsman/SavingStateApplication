package activity.ctec.savingstateapplication.controller.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
//
import android.view.View;
//for screen changing
import android.content.Intent;
import activity.ctec.savingstateapplication.controller.R;
import activity.ctec.savingstateapplication.controller.model.AndroidSaveState;

public class FrontActivity extends Activity
{
    private Button submitButton;
    private EditText nameText;
    private EditText ageText;
    private CheckBox tiredBox;

    private AndroidSaveState saveState;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        saveState = (AndroidSaveState) getApplication();

        submitButton = (Button) findViewById(R.id.submitButton);
        nameText = (EditText) findViewById(R.id.nameText);
        ageText = (EditText) findViewById(R.id.ageText);
        tiredBox = (CheckBox) findViewById(R.id.isTiredBox);


        setupListeners();
    }

    private void setupListeners()
    {
        submitButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View clickView)
            {
                String name = nameText.getText().toString();
                int age = Integer.parseInt(ageText.getText().toString());
                boolean tired = tiredBox.isChecked();

                //Save user input o the saveState
                saveState.setAge(age);
                saveState.setUserName(name);
                saveState.setIsTired(tired);

                Intent newScreenIntent = new Intent(clickView.getContext(), BackPageActivity.class);
                startActivityForResult(newScreenIntent, 0);
            }
        });
    }

}
