package com.example.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/todolist/TodoListApplication;", "Landroid/app/Application;", "()V", "repositoryComponent", "Lcom/example/todolist/di/RepositoryComponent;", "getRepositoryComponent", "onCreate", "", "app_debug"})
public final class TodoListApplication extends android.app.Application {
    private com.example.todolist.di.RepositoryComponent repositoryComponent;
    
    public TodoListApplication() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.di.RepositoryComponent getRepositoryComponent() {
        return null;
    }
}