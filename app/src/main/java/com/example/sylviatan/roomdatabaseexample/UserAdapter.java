package com.example.sylviatan.roomdatabaseexample;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.display,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {
            holder.email.setText(users.get(position).getEmail());
            holder.name.setText(users.get(position).getName());
            holder.gender.setText(users.get(position).getGender());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView email, name, gender;

        public ViewHolder(View itemView) {
            super(itemView);
            email = itemView.findViewById(R.id.textViewEmail);
            name = itemView.findViewById(R.id.textViewName);
            gender = itemView.findViewById(R.id.textViewGender);

        }
    }
}
