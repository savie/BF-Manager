package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U17E */
/* JADX INFO: loaded from: classes2.dex */
public final class C1667 extends MediaDataSource {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f6639;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1388 f6640;

    public C1667(AbstractC20745 abstractC20745) {
        C1388 c1388M46710 = abstractC20745.m46710("r");
        this.f6640 = c1388M46710;
        this.f6639 = c1388M46710.length();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int i3;
        synchronized (this.f6640) {
            this.f6640.seek(j);
            i3 = this.f6640.read(bArr, i, i2);
        }
        return i3;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f6639;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6640.close();
    }
}
