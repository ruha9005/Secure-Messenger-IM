package future.im;



import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomEmojis extends BaseAdapter{
	private Activity activity;
	private static LayoutInflater inflater = null;
	
	public final int[] images = new int[] { R.drawable.e2	,R.drawable.e1,
			 
			R.drawable.e2	,
			R.drawable.e3	,
			R.drawable.e4	,
			R.drawable.e5	,
			R.drawable.e6	,
			R.drawable.e7	,
			R.drawable.e8	,
			R.drawable.e9	,
			R.drawable.e10, 
			R.drawable.e11	,
			R.drawable.e12	,
			R.drawable.e13	,
			R.drawable.e14	,
			R.drawable.e15	,
			R.drawable.e16	,
			R.drawable.e17	,
			R.drawable.e18	,
			R.drawable.e19	,
			R.drawable.e20,
			R.drawable.e21	,
			R.drawable.e22	,
			R.drawable.e23	,
			R.drawable.e24	,
			R.drawable.e25	,
			R.drawable.e26	,
			R.drawable.e27	,
			R.drawable.e28	,
			R.drawable.e29	,
			R.drawable.e30	,
			R.drawable.e31,
			R.drawable.e32	,
			R.drawable.e33	,
			R.drawable.e34	,
			R.drawable.e35	,
			R.drawable.e36	,
			R.drawable.e37	,
			R.drawable.e38	,
			R.drawable.e39	,
			R.drawable.e40	,
			R.drawable.e41,
			R.drawable.e42	,
			R.drawable.e43	,
			R.drawable.e44	,
			R.drawable.e45	,
			R.drawable.e46	,
			R.drawable.e47	,
			R.drawable.e48	,
			R.drawable.e49	,
			R.drawable.e50	,
			R.drawable.e51	,
			R.drawable.e52	,
			R.drawable.e53	,
			R.drawable.e54	,
			R.drawable.e55	,
			R.drawable.e56	,
			R.drawable.e57,
			R.drawable.e58	,
			R.drawable.e59	,
			R.drawable.e60	,
			R.drawable.e61,
			R.drawable.e62	,
			R.drawable.e63	,
			R.drawable.e64	,
			R.drawable.e65	,
			R.drawable.e66	,
			R.drawable.e67	,
			R.drawable.e68	,
			R.drawable.e69	,
			R.drawable.e70	,
			R.drawable.e71	,
			R.drawable.e72	,
			R.drawable.e73	,
			R.drawable.e74	,
			R.drawable.e75	,
			R.drawable.e76	,
			R.drawable.e77	,
			R.drawable.e78	,
			
};
	
	public CustomEmojis(Activity act) {
		activity = act;
		inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	@Override
	public int getCount() {
		return images.length;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView == null){
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.grid_row, null);
			holder.imageView = (ImageView)convertView.findViewById(R.id.imageView1);
			convertView.setTag(holder);
		}
		else{
			holder = (ViewHolder)convertView.getTag();
		}
		holder.imageView.setImageResource(images[position]);
		return convertView;
	}
	public static class ViewHolder{
		public ImageView imageView;
	}

}
