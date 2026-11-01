package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9G4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6746 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f22723;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f22724;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f22725;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo11383();

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo11384(byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18243(C19240 c19240, int i) {
        this.f22725 = 0;
        byte[] bArr = this.f22724;
        if (bArr == null || bArr.length != 65536) {
            this.f22724 = new byte[65536];
        }
        byte[] bArr2 = this.f22724;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                int iMo11384 = mo11384(bArr2);
                c19240.m27383(iMo11384, bArr2);
                this.f22723 += (long) iMo11384;
                this.f22725 += iMo11384;
            } catch (IOException e) {
                throw new C13865(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18242(C19240 c19240) {
        this.f22725 = 0;
        byte[] bArr = this.f22724;
        if (bArr == null || bArr.length != 65536) {
            this.f22724 = new byte[65536];
        }
        byte[] bArr2 = this.f22724;
        try {
            int iMo11384 = mo11384(bArr2);
            c19240.m27383(iMo11384, bArr2);
            this.f22723 += (long) iMo11384;
            this.f22725 += iMo11384;
        } catch (IOException e) {
            throw new C13865(e);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m18241() {
        return this.f22723;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m18244() {
        return this.f22725;
    }
}
