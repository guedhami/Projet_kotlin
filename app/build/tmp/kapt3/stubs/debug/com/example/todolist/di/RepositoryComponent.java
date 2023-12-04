package com.example.todolist.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/todolist/di/RepositoryComponent;", "", "getRepository", "Lcom/example/todolist/repository/TaskRepository;", "Factory", "app_debug"})
@dagger.Component(modules = {com.example.todolist.di.DatabaseModule.class, com.example.todolist.di.DefaultRepositoryModule.class})
@AppScope
public abstract interface RepositoryComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.todolist.repository.TaskRepository getRepository();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/todolist/di/RepositoryComponent$Factory;", "", "create", "Lcom/example/todolist/di/RepositoryComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.example.todolist.di.RepositoryComponent create(@org.jetbrains.annotations.NotNull
        @dagger.BindsInstance
        android.content.Context context);
    }
}