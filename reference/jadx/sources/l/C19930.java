package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩶ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O8FK */
/* JADX INFO: loaded from: classes4.dex */
public final class C19930 extends Drawable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f63865;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Paint f63868 = new Paint(1);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f63867 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63866 = 820965102;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public C19930() {
    }

    public C19930(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        int i = this.f63867;
        if (i != 2) {
            if (i == 3) {
                this.f63867 = 1;
                return;
            } else if (i != 4) {
                return;
            }
        }
        this.f63867 = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = this.f63867;
        Paint paint = this.f63868;
        if (i == 1) {
            paint.setColor(this.f63866);
            Rect bounds = getBounds();
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), Math.min(bounds.width(), bounds.height()) / 2, paint);
            return;
        }
        if (i == 2) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f63865;
            if (jUptimeMillis < 0 || jUptimeMillis > 600) {
                this.f63867 = 0;
                return;
            }
            Rect bounds2 = getBounds();
            float f = jUptimeMillis >= 200 ? 1.0f - ((jUptimeMillis - 200) / 400.0f) : 1.0f;
            float fMin = ((0.05f * f) + 0.95f) * (Math.min(bounds2.width(), bounds2.height()) / 2);
            int i2 = this.f63866;
            paint.setColor((i2 & 16777215) | (((int) ((i2 >>> 24) * f)) << 24));
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), fMin, paint);
            invalidateSelf();
            return;
        }
        if (i == 3 || i == 4) {
            Rect bounds3 = getBounds();
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.f63865;
            if (jUptimeMillis2 >= 0 && jUptimeMillis2 <= 150) {
                float f2 = ((jUptimeMillis2 / 150.0f) * 0.5f) + 0.5f;
                float fMin2 = (Math.min(bounds3.width(), bounds3.height()) / 2) * f2;
                int i3 = this.f63866;
                paint.setColor((((int) ((i3 >>> 24) * f2)) << 24) | (i3 & 16777215));
                canvas.drawCircle(bounds3.centerX(), bounds3.centerY(), fMin2, paint);
                invalidateSelf();
                return;
            }
            if (this.f63867 == 3) {
                paint.setColor(this.f63866);
                canvas.drawCircle(bounds3.centerX(), bounds3.centerY(), Math.min(bounds3.width(), bounds3.height()) / 2, paint);
                this.f63867 = 1;
            } else {
                if (jUptimeMillis2 > 750) {
                    this.f63867 = 0;
                    return;
                }
                paint.setColor(this.f63866);
                canvas.drawCircle(bounds3.centerX(), bounds3.centerY(), Math.min(bounds3.width(), bounds3.height()) / 2, paint);
                this.f63867 = 2;
                this.f63865 = SystemClock.uptimeMillis();
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == -16842910) {
                this.f63867 = 0;
                invalidateSelf();
                return true;
            }
            if (i == 16842913) {
                this.f63867 = 1;
                invalidateSelf();
                return true;
            }
            if (i == 16842919) {
                z = true;
            }
        }
        if (z) {
            int i2 = this.f63867;
            if (i2 == 0 || i2 == 2) {
                this.f63867 = 3;
                this.f63865 = SystemClock.uptimeMillis();
                invalidateSelf();
                return true;
            }
        } else {
            int i3 = this.f63867;
            if (i3 == 1) {
                this.f63867 = 2;
                this.f63865 = SystemClock.uptimeMillis();
                invalidateSelf();
                return true;
            }
            if (i3 == 3) {
                this.f63867 = 4;
                invalidateSelf();
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f63866 = (i << 24) | (this.f63866 & 16777215);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f63868.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
