class SessionManager(context: context) {

    private val pref = context.getSharedPreferences("APP", Context.MODE_PRIVATE)

    fun saveToken(token: String) {
        pref.edit().putString("TOKEN", token).apply()
    }

    fun getToken(): String? {
        return pref.getString("TOKEN", null)
    }
}