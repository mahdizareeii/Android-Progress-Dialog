package com.mahdizareeii.progressdialog;

import android.view.View;

public class ProgressDialogModel {

    private Integer backgroundColor;
    private String title;
    private Integer titleColor;
    private String description;
    private Integer descriptionColor;
    private Integer progressBarMax;
    private String cancelText;
    private Integer cancelBackgroundColor;

    public ProgressDialogModel() {

    }

    public ProgressDialogModel(Integer backgroundColor, String title, Integer titleColor, String description, Integer descriptionColor, Integer progressBarMax, String cancelText, Integer cancelBackgroundColor) {
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.titleColor = titleColor;
        this.description = description;
        this.descriptionColor = descriptionColor;
        this.progressBarMax = progressBarMax;
        this.cancelText = cancelText;
        this.cancelBackgroundColor = cancelBackgroundColor;
    }

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

    public Integer getDescriptionColor() {
        return descriptionColor;
    }

    public void setDescriptionColor(Integer descriptionColor) {
        this.descriptionColor = descriptionColor;
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
}