package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P74O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10797 extends MediaDataSource {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1278 f34259;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile IOException f34260;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f34261;

    public C10797(InterfaceC1278 interfaceC1278) {
        long length = interfaceC1278.length();
        if (length < 0) {
            throw new IllegalArgumentException("Media handle length must be known");
        }
        this.f34259 = interfaceC1278;
        this.f34261 = length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0 || i2 < 0) {
            return -1;
        }
        long j2 = this.f34261;
        if (j >= j2) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j2 - j);
        try {
            this.f34259.mo4667(j, bArr, i, iMin);
            return iMin;
        } catch (IOException e) {
            synchronized (this) {
                if (this.f34260 == null) {
                    this.f34260 = e;
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27504() throws IOException {
        IOException iOException = this.f34260;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f34261;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34259.close();
    }
}
