// Generated by Dagger (https://dagger.dev).
package com.example.todolist.network.api;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("com.example.todolist.di.AppScope")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitClient_Factory implements Factory<RetrofitClient> {
  @Override
  public RetrofitClient get() {
    return newInstance();
  }

  public static RetrofitClient_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RetrofitClient newInstance() {
    return new RetrofitClient();
  }

  private static final class InstanceHolder {
    private static final RetrofitClient_Factory INSTANCE = new RetrofitClient_Factory();
  }
}