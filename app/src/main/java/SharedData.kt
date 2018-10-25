import com.google.android.gms.maps.model.LatLng

class SharedData private constructor(){

    //Fazer Singleton
    private object Holder {val INSTANCE = SharedData()}
    companion object {
        val instance: SharedData by lazy { Holder.INSTANCE }
    }

    var regioes: Regiao = Regiao("Carla", pontos = arrayListOf(LatLng(-22.982799, -43.222483), LatLng(-22.955682, -43.166336), LatLng(-22.978772, -43.233093)))

}