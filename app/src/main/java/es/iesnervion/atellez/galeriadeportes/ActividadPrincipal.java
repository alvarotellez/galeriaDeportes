package es.iesnervion.atellez.galeriadeportes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ActividadPrincipal extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private GridView gridView;
    private AdaptadorDeportes adaptador;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);


        gridView = (GridView) findViewById(R.id.grid);
        adaptador = new AdaptadorDeportes(this);
        //gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Aqui iría el detalle
    }
}
