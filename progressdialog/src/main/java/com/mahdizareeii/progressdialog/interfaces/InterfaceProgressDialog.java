package com.mahdizareeii.progressdialog.interfaces;

import android.graphics.Typeface;

import com.mahdizareeii.progressdialog.ProgressDialog;

public interface InterfaceProgressDialog {

    ProgressDialog setCancelable(boolean cancelable);

    ProgressDialog setBackgroundColor(int color);

    ProgressDialog setTitle(String text);

    ProgressDialog setTitleColor(int color);

    ProgressDialog setDescription(String text);

    ProgressDialog setDescriptionColor(int color);

    ProgressDialog setTypeFace(Typeface typeface);

    ProgressDialog setProgressBarMax(int max);

    ProgressDialog setIsCircleProgress(boolean isCircleProgress);

    ProgressDialog setJustDialog(boolean isJustDialog);

    ProgressDialog setCancelButtonTitle(String text);

    ProgressDialog setCancelButtonBackgroundColor(int color);

    ProgressDialog setOnCancelButtonClickListener(OnCancelButtonClickListener onCancelButtonClickListener);

    ProgressDialog setOnDismissListener(OnProgressDialogDismissListener listener);

    ProgressDialog show();

    ProgressDialog dismiss();

    void setProgressBarProgress(int progress);
}
