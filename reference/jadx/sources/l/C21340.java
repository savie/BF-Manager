package l;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.᩸ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21340 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f69454;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69455;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f69456;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Paint f69457 = new Paint(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47874(int i) {
        this.f69455 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47877() {
        this.f69456 = 1;
        this.f69454 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m47872() {
        int i = this.f69456;
        if (i == 1 || i == 2) {
            this.f69456 = 3;
            this.f69454 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47873() {
        this.f69456 = 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m47876() {
        return this.f69456 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47875(Canvas canvas, int i, float f, float f2) {
        int i2 = this.f69456;
        Paint paint = this.f69457;
        if (i2 == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f69454;
            if (jCurrentTimeMillis >= 100) {
                this.f69456 = 2;
            } else {
                int i3 = i / 2;
                paint.setColor(this.f69455);
                canvas.drawCircle(f, f2, (int) (((i - i3) * (jCurrentTimeMillis / 100.0f)) + i3), paint);
                return true;
            }
        }
        int i4 = this.f69456;
        if (i4 == 2) {
            paint.setColor(this.f69455);
            canvas.drawCircle(f, f2, i, paint);
            return false;
        }
        if (i4 != 3) {
            return false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f69454;
        if (jCurrentTimeMillis2 >= 400) {
            this.f69456 = 0;
            return true;
        }
        float f3 = jCurrentTimeMillis2 / 400.0f;
        int i5 = (int) (i - ((i - ((i * 3) / 4)) * f3));
        int i6 = this.f69455;
        float f4 = i6 >>> 24;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        paint.setColor((((int) ((1.0f - ((float) Math.sin(f3 * 1.5707964f))) * f4)) << 24) | (i6 & 16777215));
        canvas.drawCircle(f, f2, i5, paint);
        return true;
    }
}
