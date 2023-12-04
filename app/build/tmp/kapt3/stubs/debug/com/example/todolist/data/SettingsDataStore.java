package com.example.todolist.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/todolist/data/SettingsDataStore;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "SHOW_DONE_TASKS", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "preferenceFlow", "Lkotlinx/coroutines/flow/Flow;", "getPreferenceFlow", "()Lkotlinx/coroutines/flow/Flow;", "saveLayoutToPreferenceStore", "", "isLinearLayoutManager", "(ZLandroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SettingsDataStore {
    private final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> SHOW_DONE_TASKS = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> preferenceFlow = null;
    
    public SettingsDataStore(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getPreferenceFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveLayoutToPreferenceStore(boolean isLinearLayoutManager, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}