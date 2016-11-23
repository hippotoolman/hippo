package com.company.myapp.lib;

import android.support.annotation.Nullable;
import android.util.Base64;
import java.util.ArrayList;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.Date;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.http.*;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * The class which handles Networking, Request, and HTTP. Each API used in this
 * application has its own interface, as well as an interface method and a
 * manager method for each of its paths. HTTP Requests can be initiated by
 * calling the corresponding path method, passing in the necessary
 * arguments, and a Callback method to be executed upon completion of the
 * request. All requests are performed asynchronously.
 */
public class HTTPManager {
  CookieManager cookieManager;

  /**
   * Initializes this HTTPManager by instantiating the cookieManager, and setting the
   * default cookie policy to ACCEPT_ALL
   */
  public HTTPManager() {
    cookieManager = new CookieManager();

    cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
  }
}