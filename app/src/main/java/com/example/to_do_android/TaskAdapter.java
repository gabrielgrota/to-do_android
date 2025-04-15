package com.example.to_do_android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private ArrayList<Task> taskList;

    // constructor
    public TaskAdapter(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    // cria o layout do item da lista
    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // aqui ele pega o XML do layout do item (no caso task_item.xml) e transforma ele em um objeto View real, que o Android consegue mostrar na tela.
        // parent: é o RecyclerView
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        return new TaskViewHolder(itemView);
    }

    // coloca os dados no item da lista
    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task currentTask = taskList.get(position);
        holder.taskText.setText(currentTask.getDescription());
    }

    // quantos itens a lista tem
    @Override
    public int getItemCount() {
        return taskList.size();
    }

    // classe que representa cada item (ViewHolder)
    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        public TextView taskText;

        public TaskViewHolder(View itemView) {
            super(itemView);
            taskText = itemView.findViewById(R.id.taskText);
        }
    }
}