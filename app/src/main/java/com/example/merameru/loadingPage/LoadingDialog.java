package com.example.merameru.loadingPage;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

import com.example.merameru.R;

public class LoadingDialog {

    private Activity activity;
    private AlertDialog dialog;

    public LoadingDialog(Activity myActivity){
        activity = myActivity;
    }

    public void startLoadingDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_dialog,null));

        dialog = builder.create();
        dialog.show();
    }

    public void  dismissDialog(){
        dialog.dismiss();
    }
}
