package l;

import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ܶۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15053 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f49057 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Typeface f49058;

    public C15053(Typeface typeface) {
        this.f49058 = typeface;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36043(char c, char c2) {
        ThreadLocal threadLocal = f49057;
        C22814 c22814 = (C22814) threadLocal.get();
        Typeface typeface = this.f49058;
        if (c22814 == null || !typeface.equals(c22814.f74219)) {
            c22814 = new C22814(typeface);
            threadLocal.set(c22814);
        }
        return C22814.m50491(c22814, c, c2);
    }
}
