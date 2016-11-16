package es.iesnervion.atellez.galeriadeportes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by atellez on 16/11/16.
 */

public class AdaptadorDeportes {
    private Context context;
    public AdaptadorDeportes(Context context){
        this.context = context;
    }

    public int getCount() {
        return Deporte.ITEMS.length;
    }


    public Deporte getItem(int position) {
        return Deporte.ITEMS[position];
    }


    public long getItemId(int position) {
        return getItem(position).getId();
    }


    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagenDeporte = (ImageView) view.findViewById(R.id.imagen_deporte);
        TextView nombreDeporte = (TextView) view.findViewById(R.id.nombre_deporte);

        final Deporte item = getItem(position);
        imagenDeporte.setImageResource(item.getIdDrawable());
        nombreDeporte.setText(item.getNombre());
        return view;
    }
    //http://www.hermosaprogramacion.com/2015/07/tutorial-para-crear-un-gridview-en-android/
}
