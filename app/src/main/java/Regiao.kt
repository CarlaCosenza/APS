
import android.annotation.TargetApi
import android.graphics.Color
import android.graphics.Color.argb
import android.os.Build
import android.support.annotation.RequiresApi
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.PolygonOptions

class Regiao constructor(nome: String, grauDePerigo: Float, pontos: ArrayList<LatLng>){

    var nome: String
    var grauDePerigo: Float
    var pontos: ArrayList<LatLng>

    init{
        this.nome = nome
        this.grauDePerigo = grauDePerigo/10
        this.pontos = pontos
    }

    @TargetApi(Build.VERSION_CODES.O)
    @RequiresApi(Build.VERSION_CODES.O)
    fun desenharRegiao(mapa: GoogleMap) {
        var polygon = mapa.addPolygon(PolygonOptions()
                .addAll(pontos)
                .strokeColor(Color.RED)
                .strokeWidth(2f)
                .fillColor( argb(grauDePerigo, 1f, 0f, 0f)))
        polygon.tag = nome
        polygon.isClickable = true
    }

}