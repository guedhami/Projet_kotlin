package com.example.todolist.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/todolist/network/api/RetrofitClient;", "", "()V", "retrofit", "Lretrofit2/Retrofit;", "retrofitServices", "Lcom/example/todolist/network/api/RetrofitServices;", "getClient", "getServices", "Companion", "app_debug"})
@com.example.todolist.di.AppScope
public final class RetrofitClient {
    @org.jetbrains.annotations.NotNull
    public static final com.example.todolist.network.api.RetrofitClient.Companion Companion = null;
    private static final java.lang.String BASE_URL = "http://10.0.2.2:5000/";
    private retrofit2.Retrofit retrofit;
    private com.example.todolist.network.api.RetrofitServices retrofitServices;
    
    @javax.inject.Inject
    public RetrofitClient() {
        super();
    }
    
    private final retrofit2.Retrofit getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.network.api.RetrofitServices getServices() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/todolist/network/api/RetrofitClient$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}