package com.example.notificationapp
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    var TAG = "FIREBASE"

    override fun onNewToken(token: String) {
        Log.i(TAG, token)
    }

    override fun onMessageReceived(remote: RemoteMessage) {
        remote.notification?.let{
            showNotification("123", it.title.toString(), it.body.toString())
        }
    }
}