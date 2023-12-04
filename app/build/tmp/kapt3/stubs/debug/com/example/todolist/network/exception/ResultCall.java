package com.example.todolist.network.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0017\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u0016\u00f8\u0001\u0000J\u001f\u0010\u000b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\rH\u0016\u00f8\u0001\u0000J\u0017\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u000fH\u0016\u00f8\u0001\u0000J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/todolist/network/exception/ResultCall;", "T", "Lretrofit2/Call;", "Lkotlin/Result;", "delegate", "(Lretrofit2/Call;)V", "getDelegate", "()Lretrofit2/Call;", "cancel", "", "clone", "enqueue", "callback", "Lretrofit2/Callback;", "execute", "Lretrofit2/Response;", "isCanceled", "", "isExecuted", "request", "Lokhttp3/Request;", "timeout", "Lokio/Timeout;", "app_debug"})
public final class ResultCall<T extends java.lang.Object> implements retrofit2.Call<kotlin.Result<? extends T>> {
    @org.jetbrains.annotations.NotNull
    private final retrofit2.Call<T> delegate = null;
    
    public ResultCall(@org.jetbrains.annotations.NotNull
    retrofit2.Call<T> delegate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<T> getDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public retrofit2.Call<kotlin.Result<T>> clone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public retrofit2.Response<kotlin.Result<T>> execute() {
        return null;
    }
    
    @java.lang.Override
    public void enqueue(@org.jetbrains.annotations.NotNull
    retrofit2.Callback<kotlin.Result<T>> callback) {
    }
    
    @java.lang.Override
    public boolean isExecuted() {
        return false;
    }
    
    @java.lang.Override
    public void cancel() {
    }
    
    @java.lang.Override
    public boolean isCanceled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okhttp3.Request request() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okio.Timeout timeout() {
        return null;
    }
}