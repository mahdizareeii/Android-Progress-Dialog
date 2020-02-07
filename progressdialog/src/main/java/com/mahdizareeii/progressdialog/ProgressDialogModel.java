package com.mahdizareeii.progressdialog;

import android.graphics.Typeface;

import com.mahdizareeii.progressdialog.interfaces.OnCancelButtonClickListener;

public class ProgressDialogModel {

    private Integer backgroundColor;
    private String title;
    private Integer titleColor;
    private String description;
    private Typeface typeface;
    private Integer descriptionColor;
    private boolean isCircleProgress;
    private boolean isJustDialog;
    private Integer progressBarMax;
    private String cancelText;
    private Integer cancelBackgroundColor;
    private OnCancelButtonClickListener onCancelButtonClickListener;

    public Integer getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(Integer titleColor) {
        this.titleColor = titleColor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Typeface getTypeface() {
        return typeface;
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }

    public Integer getDescriptionColor() {
        return descriptionColor;
    }

    public void setDescriptionColor(Integer descriptionColor) {
        this.descriptionColor = descriptionColor;
    }

    public boolean isCircleProgress() {
        return isCircleProgress;
    }

    public void setCircleProgress(boolean circleProgress) {
        isCircleProgress = circleProgress;
    }

    public boolean isJustDialog() {
        return isJustDialog;
    }

    public void setJustDialog(boolean justDialog) {
        isJustDialog = justDialog;
    }

    public Integer getProgressBarMax() {
        return progressBarMax;
    }

    public void setProgressBarMax(Integer progressBarMax) {
        this.progressBarMax = progressBarMax;
    }

    public String getCancelText() {
        return cancelText;
    }

    public void setCancelText(String cancelText) {
        this.cancelText = cancelText;
    }

    public Integer getCancelBackgroundColor() {
        return cancelBackgroundColor;
    }

    public void setCancelBackgroundColor(Integer cancelBackgroundColor) {
        this.cancelBackgroundColor = cancelBackgroundColor;
    }

    public OnCancelButtonClickListener getOnCancelButtonClickListener() {
        return onCancelButtonClickListener;
    }

    public void setOnCancelButtonClickListener(OnCancelButtonClickListener onCancelButtonClickListener) {
        this.onCancelButtonClickListener = onCancelButtonClickListener;
    }
}