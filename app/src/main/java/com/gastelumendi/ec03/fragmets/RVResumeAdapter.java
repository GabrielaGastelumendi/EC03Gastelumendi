package com.gastelumendi.ec03.fragmets;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gastelumendi.ec03.databinding.ItemShowResumeBinding;
import com.gastelumendi.ec03.model.Platos;
import com.gastelumendi.ec03.model.Menu;
import com.gastelumendi.ec03.model.Entrada;

import java.util.List;

import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;

public class RVResumeAdapter extends RecyclerView.Adapter <RVResumeAdapter.ResumeVH>{
    private List<Platos> platos;

    public RVResumeAdapter(List<Platos> shows) {
        this.platos = shows;
    }

    @NonNull
    @Override
    public ResumeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemShowResumeBinding binding = ItemShowResumeBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new ResumeVH(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ResumeVH holder, int position) {
        holder.bind(platos.get(position));

    }

    @Override
    public int getItemCount() {
        return platos.size();
    }

    class ResumeVH extends RecyclerView.ViewHolder{

        private ItemShowResumeBinding binding;

        public ResumeVH(ItemShowResumeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Platos show) {
            if(show instanceof Entrada){
                binding.txtSeason.setVisibility(View.GONE);
            }else if (show instanceof Menu){
                binding.txtSeason.setVisibility(View.VISIBLE);
                binding.txtSeason.setText("Season "+ ((Menu)show).getSeason());
            }
            binding.txtName.setText(show.getName());
            ImageLoader imageLoader = Coil.imageLoader(binding.getRoot().getContext());
            ImageRequest request = new ImageRequest.Builder(binding.getRoot().getContext())
                    .data(show.getImgUrl())
                    .crossfade(true)
                    .target(binding.imgPlato)
                    .build();
            imageLoader.enqueue(request);

        }
    }
}
