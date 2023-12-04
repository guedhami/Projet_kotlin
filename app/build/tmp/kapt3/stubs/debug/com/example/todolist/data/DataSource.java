package com.example.todolist.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/example/todolist/data/DataSource;", "", "()V", "maxId", "", "todoItems", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/todolist/data/TaskModel;", "getTodoItems", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "addItem", "", "item", "deleteItem", "itemId", "retrieveItem", "Lkotlinx/coroutines/flow/StateFlow;", "id", "updateItem", "app_debug"})
public final class DataSource {
    @org.jetbrains.annotations.NotNull
    public static final com.example.todolist.data.DataSource INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.todolist.data.TaskModel>> todoItems = null;
    private static int maxId = 10;
    
    private DataSource() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.todolist.data.TaskModel>> getTodoItems() {
        return null;
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskModel item) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.flow.StateFlow<com.example.todolist.data.TaskModel> retrieveItem(int id) {
        return null;
    }
    
    public final void updateItem(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskModel item) {
    }
    
    public final void deleteItem(int itemId) {
    }
}