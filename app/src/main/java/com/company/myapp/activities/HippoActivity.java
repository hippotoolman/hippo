package com.company.myapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.content.ContextCompat;
import android.widget.LinearLayout;
import com.company.myapp.lib.DropsourceVaried;
import com.company.myapp.R;
import com.company.myapp.elements.HippoActivity.*;
import com.company.myapp.dataModels.*;
import android.os.Build;

/**
 * The Activity for the page: hippo. This page has the following elements:
 * WebView1; and the following components: StatusBar.
 */
public class HippoActivity extends AppCompatActivity implements DropsourceVaried {
  /**
   * This page's layout container
   */
  LinearLayout hippo;

  /**
   * This page's current variant
   */
  private String variant;

  /**
   * {@link android.support.v4.app.FragmentActivity#onCreate(Bundle savedInstanceState)}
   *
   * @param savedInstanceState If the activity is being re-initialized after previously being shut down then
   *                           this Bundle contains the data it most recently supplied in
   *                           {@link #onSaveInstanceState}. <b><i>Note: Otherwise it is null.</i></b>
   */
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.hippo);

    this.variant = "Default";

    hippo = (LinearLayout) findViewById(R.id.hippo);

    this.synchronizeStyle();
  }

  /**
   * {@link android.support.v4.app.FragmentActivity#onResume()}
   */
  @Override
  protected void onResume() {
    super.onResume();

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
      getWindow()
          .setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.HEX_3F51B5FF));
    }
  }

  /**
   * {@link android.support.v4.app.FragmentActivity#onStop()}
   */
  @Override
  protected void onStop() {
    super.onStop();
  }

  /**
   * Returns "this", to allow for and consistent method by which the current context
   * is accessed.
   */
  public HippoActivity getContext() {
    return this;
  }

  /**
   * {@link DropsourceVaried#setVariant(String)}
   *
   * @param name {@link #variant}
   */
  public void setVariant(String name) {
    this.variant = name;

    synchronizeStyle();
  }

  /**
   * {@link DropsourceVaried#setState(String)}
   *
   * @param name N/A
   */
  public void setState(String name) {}

  /**
   * {@link DropsourceVaried#getState()}
   *
   * @return null since a page does not have a state
   */
  public String getState() {
    return null;
  }

  /**
   * {@link DropsourceVaried#getVariant()}
   *
   * @return {@link #variant}
   */
  public String getVariant() {
    return this.variant;
  }

  /**
   * {@link DropsourceVaried#synchronizeStyle()}
   */
  public void synchronizeStyle() {
    switch (this.variant) {
      case "Default":
        {
          hippo.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.HEX_FFFFFFFF));
        }
        break;
    }
  }

  /**
   * This page's child WebView1.
   */
  public DSWebView1 _getWebView1() {
    return (DSWebView1) this.findViewById(R.id.webview1);
  }
}