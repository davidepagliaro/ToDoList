package com.dpagl.todolist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dpagl.todolist.R;
import com.dpagl.todolist.models.Note;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by dpagl on 20/02/2017.
 */

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteAdapterVH>{

    ArrayList<Note> listsNote=new ArrayList<>();

    public void addNote(String title,String body,String endDate){
        Date c=new Date();

        String dataCreation=c.toLocaleString();
        Note note=new Note(title,dataCreation,dataCreation,body,endDate);
        listsNote.add(note);
        notifyDataSetChanged();
    }

    @Override
    public NoteAdapterVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note_view, parent, false);
        return new NoteAdapterVH(view);
    }

    @Override
    public void onBindViewHolder(NoteAdapterVH holder, int position) {
        Note n=listsNote.get(position);
        holder.title.setText(n.getTitle());
        holder.body.setText(n.getBody());
        holder.dataCreation.setText(n.getDataCreation());
        holder.dataLastUpdate.setText(n.getLastUpdate());
    }

    @Override
    public int getItemCount() {
        return listsNote.size();
    }

    public class NoteAdapterVH extends RecyclerView.ViewHolder {
        TextView title,dataCreation,body,dataLastUpdate;


        public NoteAdapterVH(View itemView) {

            super(itemView);
            title=(TextView)itemView.findViewById(R.id.item_title);
            dataCreation=(TextView)itemView.findViewById(R.id.item_dataCreation);
            body=(TextView)itemView.findViewById(R.id.item_body);
            dataLastUpdate=(TextView)itemView.findViewById(R.id.item_dataLastUpdate);
        }
    }
}


