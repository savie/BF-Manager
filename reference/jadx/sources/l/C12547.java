package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G6UC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12547 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f40313;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18251 f40314;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40315 = 1;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C18251 c18251;
        int i = this.f40315;
        if (i <= 0) {
            throw new IllegalStateException("Session metadata already released");
        }
        int i2 = i - 1;
        this.f40315 = i2;
        if (i2 == 0 && (c18251 = this.f40314) != null) {
            c18251.close();
        }
    }

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m31223() {
        int i = this.f40315;
        if (i == 0) {
            throw new IllegalStateException("Session metadata is closed");
        }
        this.f40315 = i + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m31222() {
        return this.f40313;
    }

    public C12547(byte[] bArr, C18251 c18251) {
        this.f40313 = bArr;
        this.f40314 = c18251;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12547 m31220(C0352 c0352, byte[] bArr) {
        if (bArr.length > 8192) {
            throw new IllegalArgumentException("Session metadata is too large");
        }
        C18251 c18251M2112 = c0352 == null ? null : c0352.m2112((((long) bArr.length) + 23) & (-8));
        try {
            return new C12547((byte[]) bArr.clone(), c18251M2112);
        } catch (Error | RuntimeException e) {
            if (c18251M2112 != null) {
                c18251M2112.close();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12547 m31221(C10046 c10046, long j, C15005 c15005) throws IOException {
        int i = c15005.f49016;
        if (i > 8192) {
            throw new IOException("Session metadata is too large");
        }
        C18251 c18251M2112 = c10046.f32208.m2112((((long) i) + 23) & (-8));
        try {
            return new C12547(c10046.m25970(j, c15005), c18251M2112);
        } catch (IOException | Error | RuntimeException e) {
            c18251M2112.close();
            throw e;
        }
    }
}
