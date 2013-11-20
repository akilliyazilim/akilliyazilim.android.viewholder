package akilliyazilim.viewholder;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainPage extends Activity {

	private ListView myList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_page);

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < 20; i++) {
			list.add("Android - " + i);
		}

		myList = (ListView) findViewById(R.id.listView1);

		myList.setAdapter(new MyCustomAdapter(MainPage.this, list));

	}

}
