package l;

import java.io.BufferedInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0095 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f1032 = new byte[256];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream f1033;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4108 f1034;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f1035;

    public C0095(BufferedInputStream bufferedInputStream, C4108 c4108) {
        this.f1033 = bufferedInputStream;
        this.f1034 = c4108;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1194() {
        AbstractC13057.m32543(this.f1034);
        long j = this.f1035 + 1;
        this.f1035 = j;
        if (j > 268435456) {
            throw new IOException("GIF input exceeds byte limit");
        }
        int i = this.f1033.read();
        if (i >= 0) {
            return i;
        }
        throw new IOException("Truncated GIF container");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m1196() {
        return m1194() | (m1194() << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1195(int i) {
        while (i > 0) {
            AbstractC13057.m32543(this.f1034);
            byte[] bArr = this.f1032;
            int i2 = this.f1033.read(bArr, 0, Math.min(i, bArr.length));
            if (i2 < 0) {
                throw new IOException("Truncated GIF container");
            }
            if (i2 == 0) {
                m1194();
                i--;
            } else {
                long j = this.f1035 + ((long) i2);
                this.f1035 = j;
                if (j > 268435456) {
                    throw new IOException("GIF input exceeds byte limit");
                }
                i -= i2;
            }
        }
    }
}
