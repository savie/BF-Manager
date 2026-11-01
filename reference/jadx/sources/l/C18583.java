package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3Y7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18583 extends Drawable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f59084;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Drawable f59085;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f59086;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f59087;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Drawable f59088;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public View f59089;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ColorFilter f59090;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f59091;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f59092;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f59093;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C18583(View view) {
        Drawable drawableM37904 = C15945.m37904(view.getContext(), R.drawable.MT_Protector);
        C13638.requireNonNull(drawableM37904);
        Drawable drawableM37905 = C15945.m37904(view.getContext(), R.drawable.MT_Protector);
        C13638.requireNonNull(drawableM37905);
        this.f59087 = 255;
        this.f59092 = 1.0f;
        this.f59086 = 0;
        this.f59089 = view;
        this.f59085 = drawableM37904;
        this.f59088 = drawableM37905;
        this.f59084 = Math.max(drawableM37904.getIntrinsicWidth(), drawableM37905.getIntrinsicWidth());
        this.f59093 = Math.max(drawableM37904.getIntrinsicHeight(), drawableM37905.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f59085.setBounds(rect);
        this.f59088.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.f59092 * 255.0f;
        int i = (int) f;
        int i2 = (int) (f * 0.4f);
        int i3 = this.f59086;
        Drawable drawable = this.f59088;
        Drawable drawable2 = this.f59085;
        boolean z = false;
        if (i3 == 0) {
            drawable2.setAlpha(i);
            drawable.setAlpha(i2);
        } else if (i3 == 1) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f59091);
            if (iCurrentTimeMillis < 0 || iCurrentTimeMillis >= 200) {
                this.f59086 = 0;
                drawable2.setAlpha(i);
                drawable.setAlpha(i2);
            } else {
                int i4 = (int) ((iCurrentTimeMillis / 200.0f) * (i - i2));
                drawable2.setAlpha(i2 + i4);
                drawable.setAlpha(i - i4);
                z = true;
            }
        } else if (i3 == 2) {
            drawable2.setAlpha(i2);
            drawable.setAlpha(i);
        } else if (i3 == 3) {
            int iCurrentTimeMillis2 = (int) (System.currentTimeMillis() - this.f59091);
            if (iCurrentTimeMillis2 < 0 || iCurrentTimeMillis2 >= 200) {
                this.f59086 = 2;
                drawable2.setAlpha(i2);
                drawable.setAlpha(i);
            } else {
                int i5 = (int) ((iCurrentTimeMillis2 / 200.0f) * (i - i2));
                drawable2.setAlpha(i - i5);
                drawable.setAlpha(i2 + i5);
                z = true;
            }
        }
        drawable2.draw(canvas);
        drawable.draw(canvas);
        if (z) {
            this.f59089.invalidate();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42983(boolean z) {
        if (z) {
            int i = this.f59086;
            if (i == 0 || i == 1) {
                return;
            } else {
                this.f59086 = 1;
            }
        } else {
            int i2 = this.f59086;
            if (i2 == 2 || i2 == 3) {
                return;
            } else {
                this.f59086 = 3;
            }
        }
        this.f59091 = System.currentTimeMillis();
        this.f59089.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f59087 = i;
        this.f59092 = i / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f59087;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f59090 = colorFilter;
        this.f59085.setColorFilter(colorFilter);
        this.f59088.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f59090;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f59084;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f59093;
    }
}
