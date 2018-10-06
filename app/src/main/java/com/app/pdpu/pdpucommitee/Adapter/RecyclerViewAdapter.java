package com.app.pdpu.pdpucommitee.Adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.pdpu.pdpucommitee.Util.ListCommitee;
import com.app.pdpu.pdpucommitee.R;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<ListCommitee> listCommitees;

    public RecyclerViewAdapter(Context context, List listCommitees)
    {
        this.context=context;
        this.listCommitees=listCommitees;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

            ListCommitee l = listCommitees.get(position);
            holder.name.setText(l.getName());
    }

    @Override
    public int getItemCount() {
        return listCommitees.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            name=(TextView) itemView.findViewById(R.id.CommiteeName);
        }
    }
}
