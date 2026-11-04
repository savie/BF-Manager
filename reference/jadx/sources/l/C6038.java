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

/* JADX INFO: renamed from: l.ۛ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I98E */
/* JADX INFO: loaded from: classes3.dex */
public class C6038 extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC12003 f20653;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final GradientDrawable f20654;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f20655;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f20656;

    public C6038(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6038(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f20654 = gradientDrawable;
        setClickable(true);
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        float f = context.getResources().getDisplayMetrics().density;
        gradientDrawable.setCornerRadius(2.5f * f);
        int i2 = (int) ((f * 2.0f) + 0.5f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        layerDrawable.setLayerInset(0, i2, i2, i2, i2);
        setBackground(layerDrawable);
        C5752 c5752 = new C5752(context);
        c5752.setGravity(17);
        c5752.setMinEms(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(c5752, layoutParams);
        if (isInEditMode()) {
            this.f20655 = (C23434.m52632(getContext().getTheme(), R.attr.MT_Protector) & 16777215) | Integer.MIN_VALUE;
        } else {
            int iM16177 = C5438.m16177(C3296.m10871(-13948117, -1), 1728053247 & C3296.f10738);
            if (C3296.m10878()) {
                float[] fArr = new float[3];
                C8420.m22613(iM16177, fArr);
                fArr[2] = fArr[2] * 1.05f;
                iM16177 = Color.HSVToColor(fArr);
            }
            this.f20655 = iM16177;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3676.f12643);
        CharSequence text = typedArrayObtainStyledAttributes.getText(3);
        if (text != null) {
            c5752.setText(text);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0.0f) {
            c5752.setTextSize(0, dimension);
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            c5752.setTextColor(colorStateList);
        }
        m17516(typedArrayObtainStyledAttributes.getBoolean(2, false), false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        m17516(z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17516(boolean z, boolean z2) {
        if (z != this.f20656) {
            this.f20656 = z;
            this.f20654.setColor(z ? this.f20655 : 0);
            InterfaceC12003 interfaceC12003 = this.f20653;
            if (interfaceC12003 != null) {
                interfaceC12003.mo2838(this, z, z2);
            }
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f20656;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m17516(!this.f20656, true);
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        m17516(!this.f20656, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17515(InterfaceC12003 interfaceC12003) {
        this.f20653 = interfaceC12003;
    }
}
