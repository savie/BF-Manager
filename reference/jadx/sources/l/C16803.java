package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N3Y7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16803 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f54218;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54219;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f54220;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ColorFilter f54221;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public View f54222;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f54223;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f54224;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Drawable f54225;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f54226;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Drawable f54227;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C16803(View view) {
        Drawable drawableM2186 = C0385.m2186(view.getContext(), R.drawable.MT_Protector);
        C17359.requireNonNull(drawableM2186);
        Drawable drawableM2187 = C0385.m2186(view.getContext(), R.drawable.MT_Protector);
        C17359.requireNonNull(drawableM2187);
        this.f54219 = 255;
        this.f54226 = 1.0f;
        this.f54218 = 0;
        this.f54222 = view;
        this.f54227 = drawableM2186;
        this.f54225 = drawableM2187;
        this.f54223 = Math.max(drawableM2186.getIntrinsicWidth(), drawableM2187.getIntrinsicWidth());
        this.f54224 = Math.max(drawableM2186.getIntrinsicHeight(), drawableM2187.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f54227.setBounds(rect);
        this.f54225.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.f54226 * 255.0f;
        int i = (int) f;
        int i2 = (int) (f * 0.4f);
        int i3 = this.f54218;
        Drawable drawable = this.f54225;
        Drawable drawable2 = this.f54227;
        boolean z = false;
        if (i3 == 0) {
            drawable2.setAlpha(i);
            drawable.setAlpha(i2);
        } else if (i3 == 1) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f54220);
            if (iCurrentTimeMillis < 0 || iCurrentTimeMillis >= 200) {
                this.f54218 = 0;
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
            int iCurrentTimeMillis2 = (int) (System.currentTimeMillis() - this.f54220);
            if (iCurrentTimeMillis2 < 0 || iCurrentTimeMillis2 >= 200) {
                this.f54218 = 2;
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
            this.f54222.invalidate();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39696(boolean z) {
        if (z) {
            int i = this.f54218;
            if (i == 0 || i == 1) {
                return;
            } else {
                this.f54218 = 1;
            }
        } else {
            int i2 = this.f54218;
            if (i2 == 2 || i2 == 3) {
                return;
            } else {
                this.f54218 = 3;
            }
        }
        this.f54220 = System.currentTimeMillis();
        this.f54222.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f54219 = i;
        this.f54226 = i / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f54219;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f54221 = colorFilter;
        this.f54227.setColorFilter(colorFilter);
        this.f54225.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f54221;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f54223;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f54224;
    }
}
