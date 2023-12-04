package com.example.todolist.data.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0007H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/todolist/data/dao/TaskDao;", "", "delete", "", "id", "", "getItem", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/todolist/data/TaskModel;", "getItems", "", "getNumberDoneItems", "insert", "item", "(Lcom/example/todolist/data/TaskModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskModel item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskModel item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Query(value = "DELETE FROM item WHERE id = :id")
    public abstract void delete(int id);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM item WHERE id = :id")
    public abstract kotlinx.coroutines.flow.Flow<com.example.todolist.data.TaskModel> getItem(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM item ORDER BY creation_date ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.todolist.data.TaskModel>> getItems();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT COUNT(*) FROM item WHERE is_done = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getNumberDoneItems();
}