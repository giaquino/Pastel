package com.giaquino.pastel.layouts;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.v4.view.TintableBackgroundView;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class TintableFrameLayout extends FrameLayout implements TintableBackgroundView {

  private final TintableHelper tintableHelper = new TintableHelper(this);

  public TintableFrameLayout(Context context) {
    super(context);
  }

  public TintableFrameLayout(Context context, AttributeSet attrs) {
    this(context, attrs, -1);
  }

  public TintableFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    tintableHelper.loadFromAttributes(context, attrs, defStyleAttr);
  }

  @Override public void setSupportBackgroundTintList(ColorStateList tint) {
    tintableHelper.setSupportBackgroundTintList(tint);
  }

  @Override public ColorStateList getSupportBackgroundTintList() {
    return tintableHelper.getSupportBackgroundTintList();
  }

  @Override public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
    tintableHelper.setSupportBackgroundTintMode(tintMode);
  }

  @Override public PorterDuff.Mode getSupportBackgroundTintMode() {
    return tintableHelper.getSupportBackgroundTintMode();
  }
}