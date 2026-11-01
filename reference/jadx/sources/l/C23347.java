package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P74O */
/* JADX INFO: loaded from: classes.dex */
public final class C23347 extends MediaDataSource {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile IOException f75644;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3153 f75645;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f75646;

    public C23347(InterfaceC3153 interfaceC3153) {
        long length = interfaceC3153.length();
        if (length < 0) {
            throw new IllegalArgumentException("Media handle length must be known");
        }
        this.f75645 = interfaceC3153;
        this.f75646 = length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0 || i2 < 0) {
            return -1;
        }
        long j2 = this.f75646;
        if (j >= j2) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j2 - j);
        try {
            this.f75645.mo9547(j, bArr, i, iMin);
            return iMin;
        } catch (IOException e) {
            synchronized (this) {
                if (this.f75644 == null) {
                    this.f75644 = e;
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51469() throws IOException {
        IOException iOException = this.f75644;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f75646;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f75645.close();
    }
}
