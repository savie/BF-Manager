package l;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: renamed from: l.ᩴ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X54K */
/* JADX INFO: loaded from: classes5.dex */
public final class C20163 extends ColorDrawable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f64766;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f64767;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AccelerateInterpolator f64768;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f64769;

    public C20163(int i) {
        super(i);
        this.f64768 = new AccelerateInterpolator();
        this.f64767 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46374(int i) {
        this.f64766 = i;
        this.f64769 = System.currentTimeMillis();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.ColorDrawable
    public final void setColor(int i) {
        if (!this.f64767) {
            this.f64767 = true;
            setAlpha(255);
        }
        super.setColor(i);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        if (this.f64767) {
            super.draw(canvas);
            return;
        }
        if (this.f64769 != 0) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f64769);
            int i = this.f64766;
            z = false;
            if (iCurrentTimeMillis < i) {
                setAlpha((int) ((1.0f - this.f64768.getInterpolation(iCurrentTimeMillis / i)) * 255.0f));
            } else {
                setAlpha(0);
            }
        } else {
            this.f64769 = 0L;
            z = true;
        }
        super.draw(canvas);
        if (z) {
            return;
        }
        invalidateSelf();
    }
}
