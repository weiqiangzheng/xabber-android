package com.xabber.android.ui.adapter.contactlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.xabber.android.R;


class GroupViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    final ImageView indicator;
    final TextView name;
    final ImageView groupOfflineIndicator;
    final ImageView offlineShadow;
    private final GroupClickListener listener;

    interface GroupClickListener {
        void onGroupClick(int adapterPosition);
    }

    GroupViewHolder(View view, GroupClickListener listener) {
        super(view);
        this.listener = listener;

        itemView.setOnClickListener(this);
        indicator = (ImageView) view.findViewById(R.id.indicator);
        name = (TextView) view.findViewById(R.id.name);
        groupOfflineIndicator = (ImageView) view.findViewById(R.id.group_offline_indicator);
        offlineShadow = (ImageView) view.findViewById(R.id.offline_shadow);
    }

    @Override
    public void onClick(View v) {
        listener.onGroupClick(getAdapterPosition());
    }
}