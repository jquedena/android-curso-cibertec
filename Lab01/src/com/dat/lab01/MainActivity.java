package com.dat.lab01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {

	EditText txtN1;
	EditText txtN2;
	EditText txtRP;
	Spinner spinner;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sumar_layout);
        
        txtN1 = (EditText) findViewById(R.id.txtN1);
        txtN2 = (EditText) findViewById(R.id.txtN2);
        txtRP = (EditText) findViewById(R.id.txtRP);
        spinner = (Spinner) findViewById(R.id.spinner1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void btnSumar(View v) {
    	int operador = spinner.getSelectedItemPosition();
    	int n1 = Integer.parseInt(txtN1.getText().toString());
    	int n2 = Integer.parseInt(txtN2.getText().toString());
    	int rp = 0;
    	
    	switch(operador){
    	case 0:
    		rp= n1 + n2;
    		break;
    	case 1:
    		rp= n1 - n2;
    		break;
    	case 2:
    		rp= n1 * n2;
    		break;
    	case 3:
    		rp= n1 / n2;
    		break;
    	}
    	
    	txtRP.setText(String.valueOf(rp));
    }
}