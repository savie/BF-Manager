package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9G4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8111 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f26775;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f26776;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26777;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo2855();

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo2857(byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21990(C7453 c7453, int i) {
        this.f26777 = 0;
        byte[] bArr = this.f26775;
        if (bArr == null || bArr.length != 65536) {
            this.f26775 = new byte[65536];
        }
        byte[] bArr2 = this.f26775;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                int iMo2857 = mo2857(bArr2);
                c7453.m56007(iMo2857, bArr2);
                this.f26776 += (long) iMo2857;
                this.f26777 += iMo2857;
            } catch (IOException e) {
                throw new C12082(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21989(C7453 c7453) {
        this.f26777 = 0;
        byte[] bArr = this.f26775;
        if (bArr == null || bArr.length != 65536) {
            this.f26775 = new byte[65536];
        }
        byte[] bArr2 = this.f26775;
        try {
            int iMo2857 = mo2857(bArr2);
            c7453.m56007(iMo2857, bArr2);
            this.f26776 += (long) iMo2857;
            this.f26777 += iMo2857;
        } catch (IOException e) {
            throw new C12082(e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m21991() {
        return this.f26776;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21992() {
        return this.f26777;
    }
}
