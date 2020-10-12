package moor.foundation.choseyoursiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import moor.foundation.choseyoursiz.data.Respirators;

public class RespAdapter extends RecyclerView.Adapter<RespAdapter.RespViewHolder> {

    List<Respirators> respItem;
    Context context;


    public RespAdapter(List<Respirators> respItem, Context context) {
        this.respItem = respItem;
        this.context = context;
    }

    @NonNull
    @Override
    public RespAdapter.RespViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resp_card,
                parent, false);
        RespViewHolder respViewHolder = new RespViewHolder(view);
        return respViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RespAdapter.RespViewHolder holder, int position) {
        Respirators respirators = respItem.get(position);
     holder.titleTextView.setText(respirators.getTitle());
     holder.clapan.setText(respirators.getClapan());
     holder.construction.setText(respirators.getConstruction());
     holder.classOfDefend.setText(respirators.getClassOfDefend());
     holder.imageResource.setImageResource(respirators.getImageResource());


    }

    @Override
    public int getItemCount() {
        return respItem.size();
    }

    public class RespViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView titleTextView;
        TextView classOfDefend;
        TextView clapan;
        TextView construction;
        ImageView imageResource;




        public RespViewHolder(@NonNull View itemView) {


            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            classOfDefend = itemView.findViewById(R.id.defendTextView);
            clapan = itemView.findViewById(R.id.clapanTextView);
            construction = itemView.findViewById(R.id.constructionTextView);
            imageResource = itemView.findViewById(R.id.respiratorImageView);



        }

        @Override
        public void onClick(View v) {

        }
    }
}
