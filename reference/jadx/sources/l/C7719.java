package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7719 extends MediaDataSource {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1388 f25534;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f25535;

    public C7719(C1388 c1388, boolean z) {
        this.f25534 = c1388;
        this.f25535 = z;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int iMo4867;
        synchronized (this.f25534) {
            this.f25534.seek(j);
            iMo4867 = this.f25534.mo4867(i, i2, bArr);
        }
        return iMo4867;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f25534.length();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f25535) {
            this.f25534.close();
        }
    }
}
