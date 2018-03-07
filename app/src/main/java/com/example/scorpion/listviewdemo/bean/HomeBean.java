package com.example.scorpion.listviewdemo.bean;

import java.util.List;

/**
 * Created by scorpion on 2018/3/6.
 */

public class HomeBean {
    private ItemType mItemType;
    private String mTagTitle;
    private Boutique mBoutique;


    public ItemType getItemType() {
        return mItemType;
    }

    public void setItemType(ItemType itemType) {
        mItemType = itemType;
    }

    public String getTagTitle() {
        return mTagTitle;
    }

    public void setTagTitle(String tagTitle) {
        mTagTitle = tagTitle;
    }

    public Boutique getBoutique() {
        return mBoutique;
    }

    public void setBoutique(Boutique boutique) {
        mBoutique = boutique;
    }
}
