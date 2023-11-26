//package com.example.antismokingassistant;
//
//import android.app.Service;
//import android.content.Intent;
//import android.os.IBinder;
//import android.util.Log;
//
//import androidx.annotation.Nullable;
//
//public class MyForeGroundService extends Service {
//    //step2-1
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        //step2-1-1
//        new Thread(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        while (true) {
//                            Log.e("Service", "Service is running...");
//                            try {
//                                Thread.sleep(2000);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                }
//        ).start();
//
//
//        return 0;
//    }
//    //step2-2
//    @Nullable
//    @Override
//    public IBinder onBind(Intent intent) {
//        return null;
//    }
//
//    }
