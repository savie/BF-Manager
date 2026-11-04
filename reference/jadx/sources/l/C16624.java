package l;

import android.graphics.Typeface;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: l.ܺۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16624 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int f53751;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final char[] f53752;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final LruCache f53753;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53754 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f53755;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicIntegerArray f53756;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24830 f53757;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Typeface f53758;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39323(char c) {
        if ('a' > c || c > 'z') {
            return ('A' > c || c > 'Z') ? c + 4 : c - '\'';
        }
        return c - 'a';
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x0007, B:8:0x0011), top: B:14:0x0005 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C16624 m39324(Typeface typeface) {
        LruCache lruCache;
        C16624 c16624;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
            lruCache = f53753;
            c16624 = (C16624) lruCache.get(typeface);
            if (c16624 == null) {
                c16624 = new C16624(typeface);
                lruCache.put(typeface, c16624);
            }
        } else {
            lruCache = f53753;
            c16624 = (C16624) lruCache.get(typeface);
            if (c16624 == null) {
                c16624 = new C16624(typeface);
                lruCache.put(typeface, c16624);
            }
        }
        throw th;
        return c16624;
    }

    static {
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        f53752 = charArray;
        f53751 = charArray.length;
        f53753 = new LruCache(8);
    }

    public C16624(Typeface typeface) {
        Typeface typeface2 = Typeface.MONOSPACE;
        C24830 c24830 = typeface2.equals(typeface) ? null : new C24830(typeface);
        int i = f53751;
        this.f53756 = new AtomicIntegerArray(i * i);
        this.f53758 = typeface;
        this.f53757 = c24830;
        this.f53755 = typeface2.equals(typeface);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39327(char c, char c2) {
        int i;
        int i2;
        if (!this.f53755) {
            if ('a' > c || c > 'z') {
                i = ('A' > c || c > 'Z') ? c + 4 : c - '\'';
            } else {
                i = c - 'a';
            }
            int i3 = i * f53751;
            if ('a' > c2 || c2 > 'z') {
                i2 = ('A' > c2 || c2 > 'Z') ? c2 + 4 : c2 - '\'';
            } else {
                i2 = c2 - 'a';
            }
            int i4 = i3 + i2;
            AtomicIntegerArray atomicIntegerArray = this.f53756;
            int i5 = atomicIntegerArray.get(i4);
            if (i5 == 0) {
                int i6 = 2;
                try {
                    if (this.f53757.m55346(c, c2)) {
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
