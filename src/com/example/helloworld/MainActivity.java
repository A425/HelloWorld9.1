package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



public class MainActivity extends ActionBarActivity {

	//LC   HTTP����9.1
	    private Button mSendReqBtn = null;// ��������İ�ť
	    private WebView mWebView = null;// ������ʾ�����������html�ַ����ķ�ʽ��ʾ��Ӧ�����������ʹ��WebView�Լ��ķ�ʽ����URL

	    // ��Ӧ
	    private HttpResponse mHttpResponse = null;
	    // ʵ��
	    private HttpEntity mHttpEntity = null;
	
    //LC   HTTP����9.1
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    

}
