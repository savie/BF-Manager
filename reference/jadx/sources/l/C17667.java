package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.FrameLayout;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I98E */
/* JADX INFO: loaded from: classes4.dex */
public class C17667 extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f56132;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final GradientDrawable f56133;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC12729 f56134;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f56135;

    public C17667(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C17667(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f56133 = gradientDrawable;
        setClickable(true);
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        float f = context.getResources().getDisplayMetrics().density;
        gradientDrawable.setCornerRadius(2.5f * f);
        int i2 = (int) ((f * 2.0f) + 0.5f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        layerDrawable.setLayerInset(0, i2, i2, i2, i2);
        setBackground(layerDrawable);
        C22357 c22357 = new C22357(context);
        c22357.setGravity(17);
        c22357.setMinEms(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(c22357, layoutParams);
        if (isInEditMode()) {
            this.f56132 = (C16135.m38193(getContext().getTheme(), R.attr.MT_Protector) & 16777215) | Integer.MIN_VALUE;
        } else {
            int iM17842 = C6585.m17842(C20368.m45983(-13948117, -1), 1728053247 & C20368.f65970);
            if (C20368.m45991()) {
                float[] fArr = new float[3];
                C3057.m9161(iM17842, fArr);
                fArr[2] = fArr[2] * 1.05f;
                iM17842 = Color.HSVToColor(fArr);
            }
            this.f56132 = iM17842;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8270.f28747);
        CharSequence text = typedArrayObtainStyledAttributes.getText(3);
        if (text != null) {
            c22357.setText(text);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0.0f) {
            c22357.setTextSize(0, dimension);
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            c22357.setTextColor(colorStateList);
        }
        m41146(typedArrayObtainStyledAttributes.getBoolean(2, false), false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        m41146(z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41146(boolean z, boolean z2) {
        if (z != this.f56135) {
            this.f56135 = z;
            this.f56133.setColor(z ? this.f56132 : 0);
            InterfaceC12729 interfaceC12729 = this.f56134;
            if (interfaceC12729 != null) {
                interfaceC12729.mo7609(this, z, z2);
            }
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f56135;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m41146(!this.f56135, true);
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        m41146(!this.f56135, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41145(InterfaceC12729 interfaceC12729) {
        this.f56134 = interfaceC12729;
    }
}
