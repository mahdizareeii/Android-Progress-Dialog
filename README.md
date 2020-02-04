# Android-Progress-Dialog
[![](https://jitpack.io/v/mahdizareeii/Android-Progress-Dialog.svg)](https://jitpack.io/#mahdizareeii/Android-Progress-Dialog)

step 1 :

    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
    
step 2 :

    dependencies {
            implementation 'com.github.mahdizareeii:Android-Progress-Dialog:1.0'
    }
    

step 3 :
     
     //get instance of ProgressDialog 
     ProgressDialog mzProgressDialog = new ProgressDialog(MainActivity.this);

     //apply settings and show
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
                
      //set progress of Progress dialog with this method for example
      mzProgressDialog.setProgressBarProgress(86);
