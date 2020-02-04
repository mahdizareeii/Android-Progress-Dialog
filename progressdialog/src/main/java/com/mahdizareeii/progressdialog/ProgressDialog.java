package com.mahdizareeii.progressdialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.mahdizareeii.progressdialog.interfaces.InterfaceProgressDialog;
import com.mahdizareeii.progressdialog.interfaces.OnProgressDialogDismissListener;

public class ProgressDialog implements InterfaceProgressDialog {

    private Dialog dialog;
    private ProgressDialogModel model;
    private LinearLayout dialogBackground;
    private TextView dialogTitle, dialogDescription;
    private ProgressBar dialogProgressBar;
    private Button dialogCancel;
    private Activity activity;

    public ProgressDialog(@NonNull Activity activity) {
        dialog = new Dialog(activity, R.style.CustomDialog);
        model = new ProgressDialogModel();
        this.activity = activity;
    }

    private void initView(View view) {
        dialogBackground = view.findViewById(R.id.dialogBackground);
        dialogTitle = view.findViewById(R.id.dialogTitle);
        dialogDescription = view.findViewById(R.id.dialogDescription);
        dialogProgressBar = view.findViewById(R.id.dialogProgressBar);
        dialogCancel = view.findViewById(R.id.dialogCancel);
    }

    private void initAction() {
        if (model.getBackgroundColor() != null)
            dialogBackground.setBackgroundColor(model.getBackgroundColor());
        if (model.getTitle() != null)
            dialogTitle.setText(model.getTitle());
        if (model.getTitleColor() != null)
            dialogTitle.setTextColor(model.getTitleColor());
        if (model.getDescription() != null)
            dialogDescription.setText(model.getDescription());
        if (model.getDescriptionColor() != null)
            dialogDescription.setTextColor(model.getDescriptionColor());
        if (model.getProgressBarMax() != null)
            dialogProgressBar.setMax(model.getProgressBarMax());
        if (model.getCancelText() != null)
            dialogCancel.setText(model.getCancelText());
        if (model.getCancelBackgroundColor() != null)
            dialogCancel.setBackgroundColor(model.getCancelBackgroundColor());

        dialogCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

    }

    @Override
    public ProgressDialog setCancelableProgressDialog(boolean cancelable) {
        dialog.setCancelable(cancelable);
        return this;
    }

    @Override
    public ProgressDialog setBackgroundColor(int color) {
        model.setBackgroundColor(color);
        return this;
    }

    @Override
    public ProgressDialog setTitle(String text) {
        model.setTitle(text);
        return this;
    }

    @Override
    public ProgressDialog setTitleColor(int color) {
        model.setTitleColor(color);
        return this;
    }

    @Override
    public ProgressDialog setDescription(String text) {
        model.setDescription(text);
        return this;
    }

    @Override
    public ProgressDialog setDescriptionColor(int color) {
        model.setDescriptionColor(color);
        return this;
    }

    @Override
    public ProgressDialog setProgressBarMax(int max) {
        model.setProgressBarMax(max);
        return this;
    }

    @Override
    public ProgressDialog setCancelTitle(String text) {
        model.setCancelText(text);
        return this;
    }

    @Override
    public ProgressDialog setCancelBackgroundColor(int color) {
        model.setCancelBackgroundColor(color);
        return this;
    }

    @Override
    public ProgressDialog setOnProgressDialogDismissListener(final OnProgressDialogDismissListener onProgressDialogDismissListener) {
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                onProgressDialogDismissListener.onDismiss();
            }
        });
        return this;
    }

    @Override
    public ProgressDialog show() {
        ViewGroup viewGroup = activity.findViewById(R.id.content);
        View view = LayoutInflater.from(activity).inflate(R.layout.progress_dialog, viewGroup, false);
        initView(view);
        initAction();
        dialog.setContentView(view);
        dialog.show();
        return this;
    }

    @Override
    public void setProgressBarProgress(int progress) {
        if (dialogProgressBar != null)
            dialogProgressBar.setProgress(progress);
    }

}
