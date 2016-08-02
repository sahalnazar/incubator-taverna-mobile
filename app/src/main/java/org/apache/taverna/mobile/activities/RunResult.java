package org.apache.taverna.mobile.activities;

import org.apache.taverna.mobile.R;
import org.apache.taverna.mobile.fragments.workflowdetails.RunFragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class RunResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_result);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, RunFragment.newInstance())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        this.finish();

        return super.onOptionsItemSelected(item);
    }

}
