package l;

import java.io.BufferedInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19526 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f62782;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f62783 = new byte[256];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream f62784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22682 f62785;

    public C19526(BufferedInputStream bufferedInputStream, C22682 c22682) {
        this.f62784 = bufferedInputStream;
        this.f62785 = c22682;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44607() {
        AbstractC1886.m6135(this.f62785);
        long j = this.f62782 + 1;
        this.f62782 = j;
        if (j > 268435456) {
            throw new IOException("GIF input exceeds byte limit");
        }
        int i = this.f62784.read();
        if (i >= 0) {
            return i;
        }
        throw new IOException("Truncated GIF container");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m44609() {
        return m44607() | (m44607() << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44608(int i) {
        while (i > 0) {
            AbstractC1886.m6135(this.f62785);
            byte[] bArr = this.f62783;
            int i2 = this.f62784.read(bArr, 0, Math.min(i, bArr.length));
            if (i2 < 0) {
                throw new IOException("Truncated GIF container");
            }
            if (i2 == 0) {
                m44607();
                i--;
            } else {
                long j = this.f62782 + ((long) i2);
                this.f62782 = j;
                if (j > 268435456) {
                    throw new IOException("GIF input exceeds byte limit");
                }
                i -= i2;
            }
        }
    }
}
