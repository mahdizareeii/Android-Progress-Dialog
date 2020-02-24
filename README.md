# Android-Progress-Dialog
[![](https://jitpack.io/v/mahdizareeii/Android-Progress-Dialog.svg)](https://jitpack.io/#mahdizareeii/Android-Progress-Dialog)

step 1 : add the following codes in 'build.gradle(Project: yourproject)'

    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
    
step 2 : add the following codes in 'build.gradle(Madule: app)'

    dependencies {
            implementation 'com.github.mahdizareeii:Android-Progress-Dialog:1.6'
    }
    

step 3 : how to use
     
     //get instance of ProgressDialog 
     ProgressDialog mzProgressDialog = new ProgressDialog(MainActivity.this);

     //apply settings and show
     mzProgressDialog
                .setCancelable(true)
                .setBackgroundColor(getResources().getColor(R.color.darkBlue2))
                .setTitle("Hello Dialog")
                .setTitleColor(getResources().getColor(R.color.white))
                .setDescription("Download starting")
                .setDescriptionColor(getResources().getColor(R.color.white))
                .setTypeFace(Typeface.createFromAsset(getAssets(), "sans.ttf"))
                .setProgressBarMax(100)
                .setCancelButtonTitle("Cancel Download")
                .setCancelButtonBackgroundColor(getResources().getColor(R.color.yellow))
                .setOnCancelButtonClickListener(new OnCancelButtonClickListener() {
                    @Override
                    public void onClick() {
                        Toast.makeText(MainActivity.this, "Canceled", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
                
      //set progress of Progress dialog with this method for example
      mzProgressDialog.setProgressBarProgress(86);
