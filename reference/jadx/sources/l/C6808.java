package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6808 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C6808 f22671 = new C6808(268435456, 268435456);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C6808 f22672 = new C6808(1000000000, 536870912);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f22673;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f22674;

    public C6808(long j, long j2) {
        if (j <= 0 || j2 <= 0 || j > 2305843009213693951L) {
            throw new IllegalArgumentException("Invalid image decode limits");
        }
        this.f22674 = j;
        this.f22673 = j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6808 m18988(String str, boolean z) {
        return (this == f22671 && ("image/x-tga".equals(str) || (z && ("image/jpeg".equals(str) || "image/png".equals(str))))) ? f22672 : this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18989(int i, int i2) throws IOException {
        if (i <= 0 || i2 <= 0) {
            throw new IOException("Invalid image dimensions");
        }
        if (i > 1000000 || i2 > 1000000 || ((long) i) * ((long) i2) > this.f22674) {
            throw new C9789("Image dimensions exceed safe decode limits");
        }
    }
}
