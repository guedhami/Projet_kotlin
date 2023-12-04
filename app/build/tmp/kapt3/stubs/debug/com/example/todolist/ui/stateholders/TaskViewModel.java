package com.example.todolist.ui.stateholders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J=\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f\u00a2\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001dJ\u000e\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u0007J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002J\u0011\u0010)\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0010\u0010+\u001a\u0004\u0018\u00010\r2\u0006\u0010,\u001a\u00020\u0007J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\rJE\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f\u00a2\u0006\u0002\u0010.R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/example/todolist/ui/stateholders/TaskViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/todolist/repository/TaskRepository;", "(Lcom/example/todolist/repository/TaskRepository;)V", "_doneTasks", "Lkotlinx/coroutines/flow/StateFlow;", "", "_lastRefreshStatus", "Lcom/example/todolist/network/exception/NetworkState;", "allItems", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/todolist/data/TaskModel;", "getAllItems", "()Lkotlinx/coroutines/flow/Flow;", "doneTasks", "getDoneTasks", "()Lkotlinx/coroutines/flow/StateFlow;", "lastRefreshStatus", "getLastRefreshStatus", "()Lcom/example/todolist/network/exception/NetworkState;", "addItem", "", "description", "", "priority", "Lcom/example/todolist/data/TaskPriority;", "isDone", "", "deadlineDate", "", "creationDate", "editDate", "(Ljava/lang/String;Lcom/example/todolist/data/TaskPriority;ZLjava/lang/Long;JJ)V", "changeStatus", "item", "status", "deleteItem", "itemId", "getDoneTasksCount", "refreshItems", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveItem", "id", "updateItem", "(ILjava/lang/String;Lcom/example/todolist/data/TaskPriority;ZLjava/lang/Long;JJ)V", "app_debug"})
public final class TaskViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todolist.repository.TaskRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todolist.data.TaskModel>> allItems = null;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> _doneTasks = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> doneTasks = null;
    private com.example.todolist.network.exception.NetworkState _lastRefreshStatus = com.example.todolist.network.exception.NetworkState.OK;
    
    public TaskViewModel(@org.jetbrains.annotations.NotNull
    com.example.todolist.repository.TaskRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todolist.data.TaskModel>> getAllItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getDoneTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.network.exception.NetworkState getLastRefreshStatus() {
        return null;
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskPriority priority, boolean isDone, @org.jetbrains.annotations.Nullable
    java.lang.Long deadlineDate, long creationDate, long editDate) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.todolist.data.TaskModel retrieveItem(int id) {
        return null;
    }
    
    public final void updateItem(int id, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskPriority priority, boolean isDone, @org.jetbrains.annotations.Nullable
    java.lang.Long deadlineDate, long creationDate, long editDate) {
    }
    
    public final void updateItem(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskModel item) {
    }
    
    public final void changeStatus(@org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskModel item, boolean status) {
    }
    
    public final void deleteItem(int itemId) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refreshItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> getDoneTasksCount() {
        return null;
    }
}