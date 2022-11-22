package com.moutamid.ewastemanagement.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.ewastemanagement.R;
import com.moutamid.ewastemanagement.models.ConversationModel;

import java.util.ArrayList;

public class ConversationAdapter extends RecyclerView.Adapter<ConversationAdapter.ConversationVH> {

    private Context context;
    private ArrayList<ConversationModel> list;

    private static final int MSG_TYPE_LEFT = 0;
    private static final int MSG_TYPE_RIGHT = 1;

    public ConversationAdapter(Context context, ArrayList<ConversationModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ConversationVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == MSG_TYPE_RIGHT) {
            view = LayoutInflater.from(context).inflate(R.layout.send_message_card, parent, false);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.recive_message_card, parent, false);
        }
        return new ConversationVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConversationVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        //get currently signed in user
        if (position % 2 != 0) {
            return MSG_TYPE_RIGHT;
        } else {
            return MSG_TYPE_LEFT;
        }
    }

    public class ConversationVH extends RecyclerView.ViewHolder{

        public ConversationVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
