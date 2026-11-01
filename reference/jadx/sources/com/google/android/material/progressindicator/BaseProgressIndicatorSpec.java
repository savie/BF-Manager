package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import l.C0976;
import l.C2387;
import l.C8033;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    public int[] indicatorColors = new int[0];
    public int indicatorTrackGapSize;
    public int showAnimationBehavior;
    public int trackColor;
    public int trackCornerRadius;
    public int trackThickness;

    public BaseProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0976.f3830);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C8033.f27740, i, i2, new int[0]);
        this.trackThickness = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C8033.f27581, dimensionPixelSize);
        this.trackCornerRadius = Math.min(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C8033.f26357, 0), this.trackThickness / 2);
        this.showAnimationBehavior = typedArrayObtainStyledAttributes.getInt(C8033.f27899, 0);
        this.hideAnimationBehavior = typedArrayObtainStyledAttributes.getInt(C8033.f27793, 0);
        this.indicatorTrackGapSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27102, 0);
        loadIndicatorColors(context, typedArrayObtainStyledAttributes);
        loadTrackColor(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void loadIndicatorColors(Context context, TypedArray typedArray) {
        if (!typedArray.hasValue(C8033.f26996)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, C2387.f9313, -1)};
            return;
        }
        if (typedArray.peekValue(C8033.f26996).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(C8033.f26996, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(C8033.f26996, -1));
        this.indicatorColors = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void loadTrackColor(Context context, TypedArray typedArray) {
        if (typedArray.hasValue(C8033.f27846)) {
            this.trackColor = typedArray.getColor(C8033.f27846, -1);
            return;
        }
        this.trackColor = this.indicatorColors[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.trackColor = MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f * 255.0f));
    }

    public boolean isShowAnimationEnabled() {
        return this.showAnimationBehavior != 0;
    }

    public boolean isHideAnimationEnabled() {
        return this.hideAnimationBehavior != 0;
    }

    public void validateSpec() {
        if (this.indicatorTrackGapSize < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
