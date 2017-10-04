package ubiqua.felipearagao.intents;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import ubiqua.felipearagao.intents.databinding.SecondActivityBinding;

public class SecondActivity extends AppCompatActivity {
    private SecondActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.second_activity);
    }
}
