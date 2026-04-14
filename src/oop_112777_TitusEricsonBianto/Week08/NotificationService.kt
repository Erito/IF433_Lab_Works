package oop_112777_TitusEricsonBianto.Week08

class NotificationService {
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){
        if(user.email != null){
            sendEmail(user.email)
        } else{
            println("User ${user.name} Tidak memiliki email")
        }
    }
}
