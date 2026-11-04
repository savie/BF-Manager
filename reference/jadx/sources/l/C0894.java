package l;

import android.media.MediaDataSource;

/* JADX INFO: renamed from: l.֨ۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0894 extends MediaDataSource {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f3324;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8351 f3325;

    public C0894(C8351 c8351) {
        this.f3325 = c8351;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        return this.f3325.m22472(j, bArr, i, i2);
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f3325.m22473();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3324) {
            return;
        }
        this.f3324 = true;
        this.f3325.close();
    }
}
