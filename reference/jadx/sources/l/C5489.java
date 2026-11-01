package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z99C */
/* JADX INFO: loaded from: classes3.dex */
public class C5489 extends C2830 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f18881;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f18882;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f18883;

    public C5489(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5489(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8270.f28753);
        String string = typedArrayObtainStyledAttributes.getString(1);
        this.f18881 = string;
        this.f18882 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        int iM26299 = C10405.m26299(context, C2666.m8211(string).m29536());
        float f = getResources().getDisplayMetrics().density;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iM26299);
        gradientDrawable.setStroke((int) (0.5f + f), isInEditMode() ? C16135.m38190(context) : C20368.m45991() ? -2140772762 : -2138535800);
        gradientDrawable.setCornerRadius(f * 20.0f);
        setImageDrawable(gradientDrawable);
        if (C3057.m9159(iM26299) > 220) {
            this.f18883 = C15945.m37904(context, R.drawable.MT_Protector);
        } else {
            this.f18883 = C15945.m37904(context, R.drawable.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15177(boolean z) {
        if (this.f18882 != z) {
            this.f18882 = z;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m15178() {
        return this.f18881;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f18882) {
            int width = getWidth();
            int height = getHeight();
            int i = (height * 2) / 3;
            int i2 = (width - i) / 2;
            int i3 = (height - i) / 2;
            Drawable drawable = this.f18883;
            drawable.setBounds(i2, i3, i2 + i, i + i3);
            drawable.draw(canvas);
        }
    }
}
