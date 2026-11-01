package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I1AI */
/* JADX INFO: loaded from: classes3.dex */
public class C5548 extends AbstractC3472 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public float f19021;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f19022;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C5444 f19023;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f19024;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public float f19025;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f19026;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f19027;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public float f19028;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f19029;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f19030;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public float f19031;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f19032;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f19033;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public float f19034;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public View[] f19035;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f19036;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public float f19037;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f19038;

    public C5548(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19021 = Float.NaN;
        this.f19031 = Float.NaN;
        this.f19027 = Float.NaN;
        this.f19025 = 1.0f;
        this.f19028 = 1.0f;
        this.f19022 = Float.NaN;
        this.f19029 = Float.NaN;
        this.f19024 = Float.NaN;
        this.f19026 = Float.NaN;
        this.f19032 = Float.NaN;
        this.f19030 = Float.NaN;
        this.f19036 = true;
        this.f19035 = null;
        this.f19037 = 0.0f;
        this.f19034 = 0.0f;
    }

    public C5548(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19021 = Float.NaN;
        this.f19031 = Float.NaN;
        this.f19027 = Float.NaN;
        this.f19025 = 1.0f;
        this.f19028 = 1.0f;
        this.f19022 = Float.NaN;
        this.f19029 = Float.NaN;
        this.f19024 = Float.NaN;
        this.f19026 = Float.NaN;
        this.f19032 = Float.NaN;
        this.f19030 = Float.NaN;
        this.f19036 = true;
        this.f19035 = null;
        this.f19037 = 0.0f;
        this.f19034 = 0.0f;
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ۙ */
    public final void mo8328(AttributeSet attributeSet) {
        super.mo8328(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51890);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f19033 = true;
                } else if (index == 13) {
                    this.f19038 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // l.AbstractC3472, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19023 = (C5444) getParent();
        if (this.f19033 || this.f19038) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f12751; i++) {
                View viewById = this.f19023.getViewById(this.f12747[i]);
                if (viewById != null) {
                    if (this.f19033) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f19038 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ۨ */
    public final void mo10203(C5444 c5444) {
        this.f19023 = c5444;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (Float.isNaN(this.f19027)) {
                return;
            }
            this.f19027 = rotation;
            return;
        }
        this.f19027 = rotation;
    }

    @Override // android.view.View
    public final void setRotation(float f) {
        this.f19027 = f;
        m15298();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        this.f19025 = f;
        m15298();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        this.f19028 = f;
        m15298();
    }

    @Override // android.view.View
    public final void setPivotX(float f) {
        this.f19021 = f;
        m15298();
    }

    @Override // android.view.View
    public final void setPivotY(float f) {
        this.f19031 = f;
        m15298();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        this.f19037 = f;
        m15298();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.f19034 = f;
        m15298();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        m10196();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        m10196();
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ܰ */
    public final void mo10204() {
        m15297();
        this.f19022 = Float.NaN;
        this.f19029 = Float.NaN;
        C20719 c20719M29477 = ((C11795) getLayoutParams()).m29477();
        c20719M29477.m46608(0);
        c20719M29477.m46620(0);
        m15299();
        layout(((int) this.f19032) - getPaddingLeft(), ((int) this.f19030) - getPaddingTop(), getPaddingRight() + ((int) this.f19024), getPaddingBottom() + ((int) this.f19026));
        m15298();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m15297() {
        int i;
        if (this.f19023 == null || (i = this.f12751) == 0) {
            return;
        }
        View[] viewArr = this.f19035;
        if (viewArr == null || viewArr.length != i) {
            this.f19035 = new View[i];
        }
        for (int i2 = 0; i2 < this.f12751; i2++) {
            this.f19035[i2] = this.f19023.getViewById(this.f12747[i2]);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m15299() {
        if (this.f19023 == null) {
            return;
        }
        if (this.f19036 || Float.isNaN(this.f19022) || Float.isNaN(this.f19029)) {
            if (Float.isNaN(this.f19021) || Float.isNaN(this.f19031)) {
                View[] viewArrM10206 = m10206(this.f19023);
                int left = viewArrM10206[0].getLeft();
                int top = viewArrM10206[0].getTop();
                int right = viewArrM10206[0].getRight();
                int bottom = viewArrM10206[0].getBottom();
                for (int i = 0; i < this.f12751; i++) {
                    View view = viewArrM10206[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f19024 = right;
                this.f19026 = bottom;
                this.f19032 = left;
                this.f19030 = top;
                if (Float.isNaN(this.f19021)) {
                    this.f19022 = (left + right) / 2;
                } else {
                    this.f19022 = this.f19021;
                }
                if (Float.isNaN(this.f19031)) {
                    this.f19029 = (top + bottom) / 2;
                    return;
                } else {
                    this.f19029 = this.f19031;
                    return;
                }
            }
            this.f19029 = this.f19031;
            this.f19022 = this.f19021;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m15298() {
        if (this.f19023 == null) {
            return;
        }
        if (this.f19035 == null) {
            m15297();
        }
        m15299();
        double radians = Float.isNaN(this.f19027) ? 0.0d : Math.toRadians(this.f19027);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.f19025;
        float f2 = f * fCos;
        float f3 = this.f19028;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f12751; i++) {
            View view = this.f19035[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.f19022;
            float f8 = bottom - this.f19029;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.f19037;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.f19034;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f19028);
            view.setScaleX(this.f19025);
            if (!Float.isNaN(this.f19027)) {
                view.setRotation(this.f19027);
            }
        }
    }
}
