package l;

import android.graphics.Typeface;

/* JADX INFO: renamed from: l.᩻ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes.dex */
public final class C24830 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f80318 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Typeface f80319;

    public C24830(Typeface typeface) {
        this.f80319 = typeface;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55346(char c, char c2) {
        ThreadLocal threadLocal = f80318;
        C11403 c11403 = (C11403) threadLocal.get();
        Typeface typeface = this.f80319;
        if (c11403 == null || !typeface.equals(c11403.f35867)) {
            c11403 = new C11403(typeface);
            threadLocal.set(c11403);
        }
        return C11403.m28755(c11403, c, c2);
    }
}
