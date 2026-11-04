package l;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.۫᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13362 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42600;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f42601;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Paint f42602 = new Paint(1);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f42603;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32940(int i) {
        this.f42600 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32943() {
        this.f42601 = 1;
        this.f42603 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m32944() {
        int i = this.f42601;
        if (i == 1 || i == 2) {
            this.f42601 = 3;
            this.f42603 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32939() {
        this.f42601 = 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m32942() {
        return this.f42601 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32941(Canvas canvas, int i, float f, float f2) {
        int i2 = this.f42601;
        Paint paint = this.f42602;
        if (i2 == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f42603;
            if (jCurrentTimeMillis >= 100) {
                this.f42601 = 2;
            } else {
                int i3 = i / 2;
                paint.setColor(this.f42600);
                canvas.drawCircle(f, f2, (int) (((i - i3) * (jCurrentTimeMillis / 100.0f)) + i3), paint);
                return true;
            }
        }
        int i4 = this.f42601;
        if (i4 == 2) {
            paint.setColor(this.f42600);
            canvas.drawCircle(f, f2, i, paint);
            return false;
        }
        if (i4 != 3) {
            return false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f42603;
        if (jCurrentTimeMillis2 >= 400) {
            this.f42601 = 0;
            return true;
        }
        float f3 = jCurrentTimeMillis2 / 400.0f;
        int i5 = (int) (i - ((i - ((i * 3) / 4)) * f3));
        int i6 = this.f42600;
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
