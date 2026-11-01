package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: U73P */
/* JADX INFO: loaded from: classes.dex */
public final class C22890 implements InterfaceC3153 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16291 f74429;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16291 f74430;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f74431;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f74432;

    public C22890(C16291 c16291, C16291 c16292) {
        this.f74430 = c16291;
        this.f74429 = c16292;
        this.f74432 = c16291.length();
        this.f74431 = c16292.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m50650() {
        return this.f74432;
    }

    @Override // l.InterfaceC3153
    public final long length() {
        return this.f74432 + this.f74431;
    }

    @Override // l.InterfaceC3153
    /* JADX INFO: renamed from: ܰ */
    public final void mo9547(long j, byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        if (j >= 0 && i2 >= 0) {
            long j2 = i2;
            if (j <= length() - j2) {
                long j3 = this.f74432;
                if (j < j3) {
                    iMin = (int) Math.min(j2, j3 - j);
                    this.f74430.mo9547(j, bArr, i, iMin);
                } else {
                    iMin = 0;
                }
                int i3 = i2 - iMin;
                if (i3 > 0) {
                    this.f74429.mo9547(Math.max(0L, j - j3), bArr, i + iMin, i3);
                    return;
                }
                return;
            }
        }
        throw new EOFException("HLS fragment read exceeds virtual resource");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.f74430.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f74429.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        if (e != null) {
            throw e;
        }
    }
}
