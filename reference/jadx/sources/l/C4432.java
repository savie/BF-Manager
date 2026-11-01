package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ۙۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D96H */
/* JADX INFO: loaded from: classes2.dex */
public final class C4432 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f15758 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f15759 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1527 f15760;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f15761;

    public C4432(C1527 c1527, int i) {
        this.f15760 = c1527;
        this.f15761 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12370(Canvas canvas, float f, float f2, Paint paint) {
        C1527 c1527 = this.f15760;
        Typeface typefaceM5300 = c1527.m5300();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM5300);
        canvas.drawText(c1527.m5299(), this.f15761 * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C0904 m12364() {
        ThreadLocal threadLocal = f15758;
        C0904 c0904 = (C0904) threadLocal.get();
        if (c0904 == null) {
            c0904 = new C0904();
            threadLocal.set(c0904);
        }
        this.f15760.m5302().m31975(c0904, this.f15761);
        return c0904;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m12366() {
        return m12364().m3598();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m12376() {
        return m12364().m3604();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m12373() {
        return m12364().m3601();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final short m12372() {
        return m12364().m3600();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m12367() {
        this.f15759 = (this.f15759 & 3) | 4;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m12375() {
        return this.f15759 & 3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12371(boolean z) {
        int i = this.f15759 & 4;
        this.f15759 = z ? i | 2 : i | 1;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m12374() {
        return (this.f15759 & 4) > 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m12365() {
        return m12364().m3603();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12369(int i) {
        return m12364().m3602(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12368() {
        return m12364().m3599();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m12366()));
        sb.append(", codepoints:");
        int iM12368 = m12368();
        for (int i = 0; i < iM12368; i++) {
            sb.append(Integer.toHexString(m12369(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
