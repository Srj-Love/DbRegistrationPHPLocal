package srjlove.com.registrationphp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {


    //initialization
    private EditText e_name, e_pass, e_contact, e_country;
    String name, pass, contact, country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        //instantiate
        e_name = (EditText)findViewById(R.id.et_name);
        e_pass = (EditText)findViewById(R.id.et_password);
        e_contact = (EditText)findViewById(R.id.et_contact);
        e_country = (EditText)findViewById(R.id.et_country);

    }

    public void insert(View view) {
        //get VValue from User
        name = e_name.getText().toString();
        pass = e_pass.getText().toString();
        contact = e_contact.getText().toString();
        country = e_country.getText().toString();

        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,name,pass,contact,country);
        finish();

    }
}
