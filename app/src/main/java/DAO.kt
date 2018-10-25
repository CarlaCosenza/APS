class DAO private constructor(){

    //Fazer Singleton
    private object Holder {val INSTANCE = DAO()}
    companion object {
        val instance: DAO by lazy { Holder.INSTANCE }
    }

}