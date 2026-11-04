package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KB */
/* JADX INFO: loaded from: classes2.dex */
public final class C1085 extends MediaDataSource {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f3879;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final MediaDataSource f3880;

    public C1085(MediaDataSource mediaDataSource) {
        this.f3880 = mediaDataSource;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f3880.readAt(j, bArr, i, i2);
        } catch (IOException e) {
            this.f3879 = true;
            throw e;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() throws IOException {
        try {
            return this.f3880.getSize();
        } catch (IOException e) {
            this.f3879 = true;
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3880.close();
    }
}
