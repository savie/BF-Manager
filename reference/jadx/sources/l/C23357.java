package l;

import android.media.MediaDataSource;

/* JADX INFO: renamed from: l.᩻֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes.dex */
public final class C23357 extends MediaDataSource {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f75664;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9246 f75665;

    public C23357(C9246 c9246) {
        this.f75665 = c9246;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        return this.f75665.m23776(j, bArr, i, i2);
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f75665.m23773();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f75664) {
            return;
        }
        this.f75664 = true;
        this.f75665.close();
    }
}
