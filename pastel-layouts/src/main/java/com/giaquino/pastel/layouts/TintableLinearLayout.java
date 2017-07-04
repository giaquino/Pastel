package com.giaquino.pastel.layouts;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.v4.view.TintableBackgroundView;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class TintableLinearLayout extends LinearLayout implements TintableBackgroundView {

  private final TintableHelper tintableHelper = new TintableHelper(this);

  public TintableLinearLayout(Context context) {
    super(context);
  }

  public TintableLinearLayout(Context context, AttributeSet attrs) {
    this(context, attrs, -1);
  }

  public TintableLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
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
