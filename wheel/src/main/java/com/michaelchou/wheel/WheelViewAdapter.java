/*
 *  By Michael Chou
 *
 */

package com.michaelchou.wheel;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Wheel items adapter interface
 */
public abstract class WheelViewAdapter extends BaseAdapter {


    /**
     * Get a View that displays an empty wheel item placed before the first or after
     * the last wheel item.
     *
     * @param convertView the old view to reuse if possible
     * @param parent      the parent that this view will eventually be attached to
     * @return the empty item View
     */
    public View getEmptyView(View convertView, ViewGroup parent) {
        return null;
    }

    protected int currentItem;

    protected void setCurrentItem(int index) {
        currentItem = index;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
