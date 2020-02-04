package com.sample.progressdialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mahdizareeii.progressdialog.ProgressDialog;
import com.mahdizareeii.progressdialog.interfaces.OnProgressDialogDismissListener;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ProgressDialog mzProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.showDialog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        mzProgressDialog = new ProgressDialog(MainActivity.this);

        mzProgressDialog
                .setCancelableProgressDialog(false)
                .setBackgroundColor(getResources().getColor(R.color.darkBlue2))
                .setTitle("Hello Dialog")
                .setTitleColor(getResources().getColor(R.color.white))
                .setDescription("Download starting")
                .setDescriptionColor(getResources().getColor(R.color.white))
                .setProgressBarMax(100)
                .setCancelTitle("Cancel Download")
                .setCancelBackgroundColor(getResources().getColor(R.color.yellow))
                .setOnProgressDialogDismissListener(new OnProgressDialogDismissListener() {
                    @Override
                    public void onDismiss() {
                        Toast.makeText(MainActivity.this, "Dismissed", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();

        mzProgressDialog.setProgressBarProgress(12);
    }

}
