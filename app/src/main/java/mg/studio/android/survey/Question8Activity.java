package mg.studio.android.survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Question8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);
    }

    public void btn_next(View v) {
        String q = new String("Q8: ");

        if (((RadioButton)findViewById(R.id.radioButton2)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton2)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton3)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton3)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton4)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton4)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton5)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton5)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton6)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton6)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton7)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton7)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton8)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton8)).getText().toString();
        }
        else  {
            Toast.makeText(this, "Haven't selected one", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = this.getIntent();
        intent.setClass(this, Question9Activity.class);
        Bundle bundle = intent.getExtras();
        bundle.putString("q8", q);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
