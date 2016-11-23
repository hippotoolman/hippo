package com.company.myapp.dataModels;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class DataModel {
  public String toJson() {
    GsonBuilder builder = new GsonBuilder();

    Gson gson = builder.create();

    return gson.toJson(this);
  }
}