package l;

import android.graphics.Typeface;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: l.᩸ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21402 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final char[] f69582;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69583 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f69584;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final LruCache f69585;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Typeface f69586;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f69587;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicIntegerArray f69588;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15053 f69589;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47946(char c) {
        if ('a' > c || c > 'z') {
            return ('A' > c || c > 'Z') ? c + 4 : c - '\'';
        }
        return c - 'a';
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x0007, B:8:0x0011), top: B:14:0x0005 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C21402 m47947(Typeface typeface) {
        LruCache lruCache;
        C21402 c21402;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
            lruCache = f69585;
            c21402 = (C21402) lruCache.get(typeface);
            if (c21402 == null) {
                c21402 = new C21402(typeface);
                lruCache.put(typeface, c21402);
            }
        } else {
            lruCache = f69585;
            c21402 = (C21402) lruCache.get(typeface);
            if (c21402 == null) {
                c21402 = new C21402(typeface);
                lruCache.put(typeface, c21402);
            }
        }
        throw th;
        return c21402;
    }

    static {
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        f69582 = charArray;
        f69584 = charArray.length;
        f69585 = new LruCache(8);
    }

    public C21402(Typeface typeface) {
        Typeface typeface2 = Typeface.MONOSPACE;
        C15053 c15053 = typeface2.equals(typeface) ? null : new C15053(typeface);
        int i = f69584;
        this.f69588 = new AtomicIntegerArray(i * i);
        this.f69586 = typeface;
        this.f69589 = c15053;
        this.f69587 = typeface2.equals(typeface);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47950(char c, char c2) {
        int i;
        int i2;
        if (!this.f69587) {
            if ('a' > c || c > 'z') {
                i = ('A' > c || c > 'Z') ? c + 4 : c - '\'';
            } else {
                i = c - 'a';
            }
            int i3 = i * f69584;
            if ('a' > c2 || c2 > 'z') {
                i2 = ('A' > c2 || c2 > 'Z') ? c2 + 4 : c2 - '\'';
            } else {
                i2 = c2 - 'a';
            }
            int i4 = i3 + i2;
            AtomicIntegerArray atomicIntegerArray = this.f69588;
            int i5 = atomicIntegerArray.get(i4);
            if (i5 == 0) {
                int i6 = 2;
                try {
                    if (this.f69589.m36043(c, c2)) {
                        i6 = 1;
                    }
                } catch (RuntimeException unused) {
                }
                if (!atomicIntegerArray.compareAndSet(i4, 0, i6)) {
                    i6 = atomicIntegerArray.get(i4);
                }
                return i6 == 1;
            }
            if (i5 != 1) {
                return false;
            }
        }
        return true;
    }
}
