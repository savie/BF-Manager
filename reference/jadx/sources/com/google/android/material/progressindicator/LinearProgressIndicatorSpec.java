package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.ThemeEnforcement;
import l.C2387;
import l.C8033;

/* JADX INFO: loaded from: classes.dex */
public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public boolean drawHorizontallyInverse;
    public int indeterminateAnimationType;
    public int indicatorDirection;
    public int trackStopIndicatorSize;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2387.f9461);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.DEF_STYLE_RES);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C8033.f26706, C2387.f9461, LinearProgressIndicator.DEF_STYLE_RES, new int[0]);
        this.indeterminateAnimationType = typedArrayObtainStyledAttributes.getInt(C8033.f27981, 1);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(C8033.f26386, 0);
        this.trackStopIndicatorSize = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27291, 0), this.trackThickness);
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
        this.drawHorizontallyInverse = this.indicatorDirection == 1;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public void validateSpec() {
        super.validateSpec();
        if (this.trackStopIndicatorSize < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.indeterminateAnimationType == 0) {
            if (this.trackCornerRadius > 0 && this.indicatorTrackGapSize == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.indicatorColors.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
