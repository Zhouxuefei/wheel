/*
 * Update By Michael Chou
 *
 *  Base on Android Wheel Control.
 */

package com.michaelchou.wheel.adapter;

import android.content.Context;

/**
 * The simple Array wheel adapter
 *
 * @param <T> the element type
 */
public class ArrayWheelAdapter<T> extends AbstractWheelTextAdapter {

    // items
    private T items[];

    /**
     * Constructor
     *
     * @param context the current context
     * @param items   the items
     */
    public ArrayWheelAdapter(Context context, T items[]) {
        super(context);

        //setEmptyItemResource(TEXT_VIEW_ITEM_RESOURCE);
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public CharSequence getItem(int position) {
        if (position >= 0 && position < items.length) {
            Object item = items[position];
            if (item instanceof CharSequence) {
                return (CharSequence) item;
            }
            return item.toString();
        }
        return null;
    }
}
