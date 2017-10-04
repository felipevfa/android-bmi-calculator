package ubiqua.felipearagao.intents;

import android.content.Intent;
import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;

import ubiqua.felipearagao.intents.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Resources res;

    private Integer height, weight, sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        res = getResources();
    }

    public void onSexSelected(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.male:
                if (checked) this.sex = res.getInteger(R.integer.male);
                break;
            case R.id.female:
                if (checked) this.sex = res.getInteger(R.integer.female);
                break;
        }
    }

    public void submit(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        try {
            this.height = Integer.valueOf(binding.height.getText().toString());
            this.weight = Integer.valueOf(binding.weight.getText().toString());
        } catch (Exception e) {
            this.height = null;
            this.weight = null;
        }

        if (binding.height != null && binding.weight != null && this.sex != null) {
            //TODO: build logic, duh
        }
    }
}
