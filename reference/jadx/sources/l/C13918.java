package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z99C */
/* JADX INFO: loaded from: classes4.dex */
public class C13918 extends C15688 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f44134;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f44135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f44136;

    public C13918(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C13918(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3676.f12641);
        String string = typedArrayObtainStyledAttributes.getString(1);
        this.f44135 = string;
        this.f44134 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        int iM20558 = C7508.m20558(context, C7207.m19792(string).m23388());
        float f = getResources().getDisplayMetrics().density;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iM20558);
        gradientDrawable.setStroke((int) (0.5f + f), isInEditMode() ? C23434.m52629(context) : C3296.m10878() ? -2140772762 : -2138535800);
        gradientDrawable.setCornerRadius(f * 20.0f);
        setImageDrawable(gradientDrawable);
        if (C8420.m22611(iM20558) > 220) {
            this.f44136 = C0385.m2186(context, R.drawable.MT_Protector);
        } else {
            this.f44136 = C0385.m2186(context, R.drawable.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33896(boolean z) {
        if (this.f44134 != z) {
            this.f44134 = z;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m33897() {
        return this.f44135;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f44134) {
            int width = getWidth();
            int height = getHeight();
            int i = (height * 2) / 3;
            int i2 = (width - i) / 2;
            int i3 = (height - i) / 2;
            Drawable drawable = this.f44136;
            drawable.setBounds(i2, i3, i2 + i, i + i3);
            drawable.draw(canvas);
        }
    }
}
