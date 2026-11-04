package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U73P */
/* JADX INFO: loaded from: classes.dex */
public final class C21946 implements InterfaceC1278 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f70832;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8889 f70833;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8889 f70834;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f70835;

    public C21946(C8889 c8889, C8889 c88810) {
        this.f70833 = c8889;
        this.f70834 = c88810;
        this.f70835 = c8889.length();
        this.f70832 = c88810.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m49655() {
        return this.f70835;
    }

    @Override // l.InterfaceC1278
    public final long length() {
        return this.f70835 + this.f70832;
    }

    @Override // l.InterfaceC1278
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4667(long j, byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        if (j >= 0 && i2 >= 0) {
            long j2 = i2;
            if (j <= length() - j2) {
                long j3 = this.f70835;
                if (j < j3) {
                    iMin = (int) Math.min(j2, j3 - j);
                    this.f70833.mo4667(j, bArr, i, iMin);
                } else {
                    iMin = 0;
                }
                int i3 = i2 - iMin;
                if (i3 > 0) {
                    this.f70834.mo4667(Math.max(0L, j - j3), bArr, i + iMin, i3);
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
            this.f70833.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f70834.close();
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
