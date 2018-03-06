package com.example.scorpion.listviewdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.scorpion.listviewdemo.R;
import com.example.scorpion.listviewdemo.bean.HomeBean;
import com.example.scorpion.listviewdemo.holder.SignMallHolder;
import com.example.scorpion.listviewdemo.holder.TagHolder;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by scorpion on 2018/3/5.
 */

public class HomeAdapter extends BaseAdapter {
    // SIGN_MALL(0), TAG(1), BOUTIQUE(2), AD(3), RECIPE(4), COOK_SHOW(5), GOURMET(6);
    private static final int SIGN_MALL = 0;
    private static final int TAG = 1;
    private static final int BOUTIQUE = 2;
    private static final int AD = 3;
    private static final int RECIPE = 4;
    private static final int COOK_SHOW = 5;
    private static final int GOURMET = 6;



    private Context mContext;
    private List<HomeBean> mList;

    public HomeAdapter(Context context, List<HomeBean> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList==null?0:mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return 7;
    }

    @Override
    public int getItemViewType(int position) {

        return mList.get(position).getItemType().getValue();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        HomeBean bean = mList.get(position);
//        SignMallHolder signMallHolder;
        TagHolder tagHolder;
        switch (bean.getItemType().getValue()) {
            case SIGN_MALL:
                if (convertView == null) {
                    convertView = inflater.inflate(R.layout.layout_sign_and_mall, null);
                }
                break;
            case TAG:
                if (convertView == null) {
                    convertView = inflater.inflate(R.layout.layout_tag, null);
                    tagHolder = new TagHolder(convertView);
                    convertView.setTag(tagHolder);
                } else {
                    tagHolder = (TagHolder) convertView.getTag();
                }
                tagHolder.refreshUI(bean);
                break;
        }


        return convertView;
    }
}
