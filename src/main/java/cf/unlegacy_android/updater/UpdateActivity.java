package cf.unlegacy_android.updater;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UpdateActivity extends AppCompatActivity {

    private TextView actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        actionButton = (TextView) findViewById(R.id.action_button);
        actionButton.setText(R.string.system_update_check_now_button_text);
    }

}
