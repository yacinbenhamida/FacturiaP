package application.facturia;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Facturia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facturia);
    }

    public void btnConnectClick(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void btnInscritClick(View view) {
<<<<<<< HEAD
        Intent intent = new Intent(this, Inscription.class);
=======
        Intent intent = new Intent(this,Inscription.class);
>>>>>>> new
        startActivity(intent);
    }
}
