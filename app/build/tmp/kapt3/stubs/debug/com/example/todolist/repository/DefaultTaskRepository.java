package com.example.todolist.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00140\u0011H\u0016J\u0011\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/todolist/repository/DefaultTaskRepository;", "Lcom/example/todolist/repository/TaskRepository;", "dao", "Lcom/example/todolist/data/dao/TaskDao;", "retrofitClient", "Lcom/example/todolist/network/api/RetrofitClient;", "(Lcom/example/todolist/data/dao/TaskDao;Lcom/example/todolist/network/api/RetrofitClient;)V", "addItem", "", "item", "Lcom/example/todolist/data/TaskModel;", "(Lcom/example/todolist/data/TaskModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteItem", "itemId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNumberDoneItems", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaskItems", "", "refreshItems", "Lcom/example/todolist/network/exception/NetworkState;", "retrieveItem", "id", "updateItem", "Companion", "app_debug"})
public final class DefaultTaskRepository implements com.example.todolist.repository.TaskRepository {
    private final com.example.todolist.data.dao.TaskDao dao = null;
    private final com.example.todolist.network.api.RetrofitClient retrofitClient = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.todolist.repository.DefaultTaskRepository.Companion Companion = null;
    private static final java.lang.String TAG = "Repository";
    
    @javax.inject.Inject
    public DefaultTaskRepository(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.dao.TaskDao dao, @org.jetbrains.annotations.NotNull
    com.example.todolist.network.api.RetrofitClient retrofitClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.todolist.data.TaskModel>> getTaskItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addItem(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskModel item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object retrieveItem(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.example.todolist.data.TaskModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateItem(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskModel item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteItem(int itemId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNumberDoneItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Integer>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object refreshItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.todolist.network.exception.NetworkState> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/todolist/repository/DefaultTaskRepository$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}