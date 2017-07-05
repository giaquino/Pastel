package com.giaquino.pastel.layouts;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.DrawableUtils;
import android.util.AttributeSet;
import android.view.View;

/**
 * Helper class for tinting {@link View}.
 * The view should implements TintableBackgroundView and delegate to this class.
 */
public class TintableHelper implements TintableBackgroundView {

  private PorterDuff.Mode tintMode = PorterDuff.Mode.SRC_IN;
  private ColorStateList backgroundTintList;
  private View view;

  public TintableHelper(View view) {
    this.view = view;
  }

  /**
   * Load backgroundTint and backgroundTintMode attributes.
   */
  public void loadFromAttributes(Context context, AttributeSet attrs, int defStyleAttr) {
    TintTypedArray a =
        TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.TintableHelper,
            defStyleAttr, 0);
    try {
      if (a.hasValue(R.styleable.TintableHelper_backgroundTint)) {
        ViewCompat.setBackgroundTintList(view,
            a.getColorStateList(R.styleable.TintableHelper_backgroundTint));
      }
      if (a.hasValue(R.styleable.TintableHelper_backgroundTintMode)) {
        ViewCompat.setBackgroundTintMode(view,
            parseTintMode(a.getInt(R.styleable.TintableHelper_backgroundTintMode, -1), null));
      }
    } finally {
      a.recycle();
    }
  }

  @Override public void setSupportBackgroundTintList(ColorStateList tint) {
    backgroundTintList = tint;
    applyBackgroundTint();
  }

  @Override public ColorStateList getSupportBackgroundTintList() {
    return backgroundTintList;
  }

  @Override public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    tintMode = mode;
    applyBackgroundTint();
  }

  @Override public PorterDuff.Mode getSupportBackgroundTintMode() {
    return tintMode;
  }

  private void applyBackgroundTint() {
    Drawable background = view.getBackground();
    if (background == null) {
      return;
    }
    background = DrawableCompat.unwrap(background);
    background = DrawableCompat.wrap(background);
    DrawableCompat.setTintMode(background, tintMode);
    DrawableCompat.setTintList(background, backgroundTintList);
    if (background.isStateful()) {
      background.setState(view.getDrawableState());
    }
    ViewCompat.setBackground(view, background);
  }

  /**
   * Copied from appcompat {@link DrawableUtils}
   */
  private PorterDuff.Mode parseTintMode(int value, PorterDuff.Mode defaultMode) {
    switch (value) {
      case 3:
        return PorterDuff.Mode.SRC_OVER;
      case 5:
        return PorterDuff.Mode.SRC_IN;
      case 9:
        return PorterDuff.Mode.SRC_ATOP;
      case 14:
        return PorterDuff.Mode.MULTIPLY;
      case 15:
        return PorterDuff.Mode.SCREEN;
      case 16:
        return PorterDuff.Mode.ADD;
      default:
        return defaultMode;
    }
  }
}
