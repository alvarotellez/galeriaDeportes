package es.iesnervion.atellez.galeriadeportes;

/**
 * Created by atellez on 16/11/16.
 */

public class Deporte {
    private String nombre;
    private int idDrawable;

    public Deporte(String nombre, int idDrawable){
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId(){
        return nombre.hashCode();
    }
    public static Deporte[] ITEMS={
            new Deporte("Tiro con arco",R.drawable.archery),
            new Deporte("Badminton",R.drawable.badminton),
            new Deporte("Ballet",R.drawable.ballet),
            new Deporte ("Beisbol",R.drawable.baseball),
            new Deporte("Baloncesto",R.drawable.basketball),
            new Deporte ("Ciclismo",R.drawable.bicycle),
            new Deporte ("Futbol",R.drawable.boot),
            new Deporte ("Bolos",R.drawable.bowling),
            new Deporte("Campeones",R.drawable.cup),
            new Deporte("Ajedrez",R.drawable.chess),
            new Deporte("Buceo",R.drawable.goggles),
            new Deporte("Rugby",R.drawable.rugby)
    };
    public static Deporte getItem(int id){
        for(Deporte item: ITEMS ){
            if(item.getId()==id){
                return item;
            }
        }
        return null;
    }
}
