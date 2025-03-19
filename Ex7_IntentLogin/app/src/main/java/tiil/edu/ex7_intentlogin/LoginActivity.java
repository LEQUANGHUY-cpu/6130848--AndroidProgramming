package tiil.edu.ex7_intentlogin;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button btnXN = (Button) findViewById(R.id.btnOk);

        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edTDN= (EditText) findViewById(R.id.edtUsername);
                EditText edPass= (EditText) findViewById(R.id.edtPass);
                String  tenDangNhap = edTDN.getText().toString();
                String Matkhau= edPass.getText().toString();
                 if (tenDangNhap.equals("lequanghuy") && Matkhau.equals("123")){
                     Intent iQuiz= new Intent(LoginActivity.this, HomeActivity.class);
                     iQuiz.putExtra("ten_dang_nhap", tenDangNhap);
                     iQuiz.putExtra("mk_dang_nhap", Matkhau);
                     startActivity(iQuiz);
                 }
                 else {
                     Toast.makeText(LoginActivity.this,"MẬT KHẨU SAI",Toast.LENGTH_LONG);
                 }
            }
        });

    }
}