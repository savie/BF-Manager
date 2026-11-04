package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ۙᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D96H */
/* JADX INFO: loaded from: classes2.dex */
public final class C5098 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f17796 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f17797 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8914 f17798;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f17799;

    public C5098(C8914 c8914, int i) {
        this.f17798 = c8914;
        this.f17799 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15412(Canvas canvas, float f, float f2, Paint paint) {
        C8914 c8914 = this.f17798;
        Typeface typefaceM23828 = c8914.m23828();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM23828);
        canvas.drawText(c8914.m23826(), this.f17799 * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C13301 m15408() {
        ThreadLocal threadLocal = f17796;
        C13301 c13301 = (C13301) threadLocal.get();
        if (c13301 == null) {
            c13301 = new C13301();
            threadLocal.set(c13301);
        }
        this.f17798.m23829().m17029(c13301, this.f17799);
        return c13301;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m15420() {
        return m15408().m32846();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m15417() {
        return m15408().m32842();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m15415() {
        return m15408().m32841();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final short m15418() {
        return m15408().m32843();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15409() {
        this.f17797 = (this.f17797 & 3) | 4;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15419() {
        return this.f17797 & 3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15413(boolean z) {
        int i = this.f17797 & 4;
        this.f17797 = z ? i | 2 : i | 1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m15414() {
        return (this.f17797 & 4) > 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m15416() {
        return m15408().m32845();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15411(int i) {
        return m15408().m32844(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15410() {
        return m15408().m32840();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m15420()));
        sb.append(", codepoints:");
        int iM15410 = m15410();
        for (int i = 0; i < iM15410; i++) {
            sb.append(Integer.toHexString(m15411(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
