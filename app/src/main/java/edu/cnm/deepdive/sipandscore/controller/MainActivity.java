package edu.cnm.deepdive.sipandscore.controller;

import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import edu.cnm.deepdive.sipandscore.R;

public class MainActivity extends AppCompatActivity {

  private AppBarConfiguration appBarConfiguration;
  private NavController navController;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FloatingActionButton fab = findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Snackbar.make(view, (R.string.main_activity_snackbar), Snackbar.LENGTH_LONG)
            .setAction("Action", null).show();
      }
    });
  }
}