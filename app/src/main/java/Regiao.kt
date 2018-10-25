
import android.graphics.Color
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.PolygonOptions

class Regiao constructor(nome: String, pontos: ArrayList<LatLng>){

    var nome: String
    var pontos: ArrayList<LatLng>

    init{
        this.nome = nome
        this.pontos = pontos
    }

    fun desenharRegiao(mapa: GoogleMap) {
        mapa.addPolygon(PolygonOptions()
                .addAll(pontos)
                .strokeColor(Color.BLACK)
                .fillColor(Color.BLACK) )
    }

}