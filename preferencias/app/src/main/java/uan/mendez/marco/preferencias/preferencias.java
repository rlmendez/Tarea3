package uan.mendez.marco.preferencias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class preferencias extends AppCompatActivity {

    private TextView edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_preferencias, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        TextView Valor = (TextView)findViewById(R.id.edad);

        String val = Valor.getText().toString();
        int num = Integer.parseInt(val);

        outState.putInt("edad_rec",num);
         }

    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        int e = inState.getInt("edad_rec");

        TextView Valor = (TextView)findViewById(R.id.edad);

        Valor.setText(String.valueOf(e));

    }

    public void Calculo(View Edad){

        Intent picIntent = new Intent(String.valueOf(resultado.class));

        startActivity(picIntent);


    }//void


}
