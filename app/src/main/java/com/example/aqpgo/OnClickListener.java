package com.example.aqpgo;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class OnClickListener implements View.OnClickListener {

    private Context context;
    private  Class typeActivity;

    OnClickListener(Context context, Class typeActivity){
        this.context=context;
        this.typeActivity=typeActivity;
    }


    @Override
    public void onClick(View v) {
        Intent intent=new Intent(context,  typeActivity);
        context.startActivity(intent);
    }
}
