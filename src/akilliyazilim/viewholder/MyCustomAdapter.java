package akilliyazilim.viewholder;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {
	private ArrayList<String> mListItems;
	private LayoutInflater mLayoutInflater;

	public MyCustomAdapter(Context context, ArrayList<String> arrayList) {

		mListItems = arrayList;

		// get the layout inflater
		mLayoutInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub

		return mListItems.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		// TODO Auto-generated method stub

		ViewHolder holder;

		if (view == null) {
			holder = new ViewHolder();

			view = mLayoutInflater.inflate(R.layout.list_item, null);
			holder.itemName = (TextView) view
					.findViewById(R.id.list_item_text_view);
			holder.itemImage = (ImageView) view
					.findViewById(R.id.list_item_image_view);

			view.setTag(holder);
		} else {

			holder = (ViewHolder) view.getTag();
		}

		String stringItem = mListItems.get(position);
		if (stringItem != null) {
			if (holder.itemName != null) {

				holder.itemName.setText(stringItem);
				holder.itemImage.setImageResource(R.drawable.image);
			}
		}

		return view;

	}

	private static class ViewHolder {

		protected TextView itemName;
		protected ImageView itemImage;

	}
}
