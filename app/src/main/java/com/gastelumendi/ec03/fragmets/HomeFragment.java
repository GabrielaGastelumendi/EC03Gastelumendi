package com.gastelumendi.ec03.fragmets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.gastelumendi.ec03.databinding.FragmentHomeBinding;
import com.gastelumendi.ec03.model.Platos;
import com.gastelumendi.ec03.model.Entrada;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RVResumeAdapter adapter = new RVResumeAdapter(getData());
        binding.rvPlatosResume.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        binding.rvPlatosResume.setLayoutManager(layoutManager);
    }


    private List<Platos> getData(){
        List<Platos> platos = new ArrayList<>();
        platos.add(new Entrada("Aji de gallina","https://viajerocasual.com/wp-content/uploads/2021/05/comidas-tipicas-de-peru-aji-de-gallina.webp",""));
        platos.add(new Entrada("Causa rellena","https://viajerocasual.com/wp-content/uploads/2021/05/comidas-tipicas-de-peru-causa-rellena.webp",""));
        platos.add(new Entrada("Papa rellena","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBz1pyatMaOUkqCVo2vYe_fZ7nqA2SPV3OnyQtlYnZ1mNyMO6H8kn4tELTvvbdkSFSVlc&usqp=CAU",""));
        platos.add(new Entrada("Rocoto rellno ","https://viajerocasual.com/wp-content/uploads/2021/05/comidas-tipicas-de-peru-rocoto-relleno.webp",""));
        platos.add(new Entrada("Seco de carne","https://viajerocasual.com/wp-content/uploads/2021/05/comidas-tipicas-de-peru-seco-de-carne.webp",""));
        platos.add(new Entrada("Anticucho","https://viajerocasual.com/wp-content/uploads/2021/05/comidas-tipicas-de-peru-anticuchos.webp",""));
        platos.add(new Entrada("Pachamanca","https://viajerocasual.com/wp-content/uploads/2021/05/comidas-tipicas-de-peru-pachamanca.webp",""));
        platos.add(new Entrada("Arroz con camarones","https://viajerocasual.com/wp-content/uploads/2021/05/comidas-tipicas-de-peru-arroz-con-camarones.webp",""));
        platos.add(new Entrada("Adobo","https://viajerocasual.com/wp-content/uploads/2021/05/comidas-tipicas-de-peru-adobo.webp",""));
        platos.add(new Entrada("Papa a la huancaina","https://viajerocasual.com/wp-content/uploads/2021/05/comidas-tipicas-de-peru-papa-a-la-huancaina.webp",""));
        return platos;
    }
}