package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6UC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21571 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9017 f70013;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f70014;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f70015 = 1;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C9017 c9017;
        int i = this.f70015;
        if (i <= 0) {
            throw new IllegalStateException("Session metadata already released");
        }
        int i2 = i - 1;
        this.f70015 = i2;
        if (i2 == 0 && (c9017 = this.f70013) != null) {
            c9017.close();
        }
    }

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m48290() {
        int i = this.f70015;
        if (i == 0) {
            throw new IllegalStateException("Session metadata is closed");
        }
        this.f70015 = i + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m48291() {
        return this.f70014;
    }

    public C21571(byte[] bArr, C9017 c9017) {
        this.f70014 = bArr;
        this.f70013 = c9017;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21571 m48288(C10428 c10428, byte[] bArr) {
        if (bArr.length > 8192) {
            throw new IllegalArgumentException("Session metadata is too large");
        }
        C9017 c9017M26333 = c10428 == null ? null : c10428.m26333((((long) bArr.length) + 23) & (-8));
        try {
            return new C21571((byte[]) bArr.clone(), c9017M26333);
        } catch (Error | RuntimeException e) {
            if (c9017M26333 != null) {
                c9017M26333.close();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21571 m48289(C16072 c16072, long j, C3370 c3370) throws IOException {
        int i = c3370.f12488;
        if (i > 8192) {
            throw new IOException("Session metadata is too large");
        }
        C9017 c9017M26333 = c16072.f51982.m26333((((long) i) + 23) & (-8));
        try {
            return new C21571(c16072.m38097(j, c3370), c9017M26333);
        } catch (IOException | Error | RuntimeException e) {
            c9017M26333.close();
            throw e;
        }
    }
}
