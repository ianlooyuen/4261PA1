package com.example.a4261pa1;

import android.app.ProgressDialog;
import android.os.AsyncTask;

public class MyAsyncTask extends AsyncTask<String, String, String> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        // display a progress dialog to show the user what is happening
        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("processing results");
        progressDialog.setCancelable(false);
        progressDialog.show();
    }



        @Override
    protected String doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
