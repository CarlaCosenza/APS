class User private constructor(){

    //Fazer Singleton
    private object Holder {val INSTANCE = User()}
    companion object {
        val instance: User by lazy { Holder.INSTANCE }
    }

}