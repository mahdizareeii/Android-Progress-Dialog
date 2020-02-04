package com.mahdizareeii.progressdialog.interfaces;

import com.mahdizareeii.progressdialog.ProgressDialog;

public interface InterfaceProgressDialog {

    ProgressDialog setCancelableProgressDialog(boolean cancelable);

    ProgressDialog setBackgroundColor(int color);

    ProgressDialog setTitle(String text);

    ProgressDialog setTitleColor(int color);

    ProgressDialog setDescription(String text);

    ProgressDialog setDescriptionColor(int color);

    ProgressDialog setProgressBarMax(int max);

    ProgressDialog setCancelTitle(String text);

    ProgressDialog setCancelBackgroundColor(int color);

    ProgressDialog setOnProgressDialogDismissListener(OnProgressDialogDismissListener listener);

    ProgressDialog show();

    void setProgressBarProgress(int progress);
}
