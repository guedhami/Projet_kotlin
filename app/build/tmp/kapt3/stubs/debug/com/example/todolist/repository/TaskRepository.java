package com.example.todolist.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\fH&J\u0011\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/todolist/repository/TaskRepository;", "", "addItem", "", "item", "Lcom/example/todolist/data/TaskModel;", "(Lcom/example/todolist/data/TaskModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteItem", "itemId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNumberDoneItems", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaskItems", "", "refreshItems", "Lcom/example/todolist/network/exception/NetworkState;", "retrieveItem", "id", "updateItem", "app_debug"})
public abstract interface TaskRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.todolist.data.TaskModel>> getTaskItems();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addItem(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskModel item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object retrieveItem(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.example.todolist.data.TaskModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateItem(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskModel item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteItem(int itemId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNumberDoneItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Integer>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object refreshItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.todolist.network.exception.NetworkState> continuation);
}