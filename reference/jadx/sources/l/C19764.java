package l;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: renamed from: l.᩵᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X54K */
/* JADX INFO: loaded from: classes4.dex */
public final class C19764 extends ColorDrawable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f63501;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63502;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f63503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AccelerateInterpolator f63504;

    public C19764(int i) {
        super(i);
        this.f63504 = new AccelerateInterpolator();
        this.f63503 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44952(int i) {
        this.f63502 = i;
        this.f63501 = System.currentTimeMillis();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.ColorDrawable
    public final void setColor(int i) {
        if (!this.f63503) {
            this.f63503 = true;
            setAlpha(255);
        }
        super.setColor(i);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        if (this.f63503) {
            super.draw(canvas);
            return;
        }
        if (this.f63501 != 0) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f63501);
            int i = this.f63502;
            z = false;
            if (iCurrentTimeMillis < i) {
                setAlpha((int) ((1.0f - this.f63504.getInterpolation(iCurrentTimeMillis / i)) * 255.0f));
            } else {
                setAlpha(0);
            }
        } else {
            this.f63501 = 0L;
            z = true;
        }
        super.draw(canvas);
        if (z) {
            return;
        }
        invalidateSelf();
    }
}
