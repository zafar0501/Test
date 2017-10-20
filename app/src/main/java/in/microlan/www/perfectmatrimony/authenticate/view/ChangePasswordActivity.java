package in.microlan.www.perfectmatrimony.authenticate.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import in.microlan.www.perfectmatrimony.R;
import in.microlan.www.perfectmatrimony.common.base.BaseActivity;


public class ChangePasswordActivity extends BaseActivity implements View.OnClickListener {
    private Context context = ChangePasswordActivity.this;
    private Button btn_login, btn_signup;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InitView();
    }

    @Override
    public void InitView() {

        btn_login = (Button) findViewById(R.id.btn_login);
        btn_signup = (Button) findViewById(R.id.btn_signup);

        btn_login.setOnClickListener(this);
        btn_signup.setOnClickListener(this);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_change_password;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login: {
                startActivity(new Intent(context, LoginActivity.class));
                finish();

            }
            break;
            case R.id.btn_signup: {
                startActivity(new Intent(context, SignUpActivity.class));
                finish();
            }
            break;
        }
    }
}
