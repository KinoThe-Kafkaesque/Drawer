package two.one.drawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import two.one.drawer.entities.User;
import two.one.drawer.web.LoginController;
import two.one.drawer.web.RetrofitSettings;

public class LoginActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(v);
            }
        });
    }

    public void login(View view) {
        LoginController loginController =
                RetrofitSettings.getRetrofit().create(LoginController.class);
        Call<User> call = loginController.login(username.getText().toString(), password.getText().toString());

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                System.out.println(response.body().toString());
                if (response.isSuccessful()) {
                    User user = response.body();
                    System.out.println("hellohellohellohellohellohellohellohellohellohello");
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                t.printStackTrace();
                System.out.println(call.request().body());
            }

        });

    }
}