package ntu.exam.vidu2_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    Button nutXN;
    EditText edtTenDN;
    EditText edtPassword;
    EditText edtEmaillll;
    void TimDieuKhien(){
        nutXN = (Button) findViewById(R.id.btnOK);
        edtTenDN = (EditText) findViewById(R.id.edtUserName);
        edtPassword = (EditText) findViewById(R.id.edtPass);
        edtEmaillll = (EditText) findViewById(R.id.edtMail);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        nutXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // lấy dữ liệu để xử lý điều kiện
                String tenDN = edtTenDN.getText().toString();
                String pass = edtPassword.getText().toString();
                String email = edtEmaillll.getText().toString();

                if(tenDN.equals("nhattrung")&& pass.equals("123")&& email.equals("123@gmail.com"))
                {
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                    iQuiz.putExtra("ten_dn", tenDN); //gửi dữ liệu vào iQuiz
                    iQuiz.putExtra("pass_dn", pass); //gửi dữ liệu vào iQuiz
                    iQuiz.putExtra("email_dn", email); //gửi dữ liệu vào iQuiz
                    startActivity(iQuiz);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "NHẬP SAI THÔNG TIN", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}