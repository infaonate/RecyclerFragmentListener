package com.example.recyclerfragmentlistener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolder> {
    private List<Persona> personas;
    private FragmentActivity activity;

    public PersonaAdapter(List<Persona> personas, FragmentActivity activity) {
        this.personas = personas;
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_persona, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(personas.get(position));
    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);

            itemView.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    Persona persona = personas.get(position);

                    DetalleFragment detalle = DetalleFragment.newInstance(
                            persona.getNombre(),
                            persona.getApellidos()
                    );
                    activity.getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, detalle)
                            .addToBackStack(null)
                            .commit();
                }
            });
        }

        public void bind(Persona persona) {
            tvNombre.setText(persona.getNombre());
        }
    }
}