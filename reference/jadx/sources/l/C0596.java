package l;

import android.media.MediaDataSource;

/* JADX INFO: renamed from: l.֡ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: U17E */
/* JADX INFO: loaded from: classes2.dex */
public class C0596 extends MediaDataSource {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f2380;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13961 f2381;

    public C0596(AbstractC22044 abstractC22044) {
        C13961 c13961M49855 = abstractC22044.m49855("r");
        this.f2381 = c13961M49855;
        this.f2380 = c13961M49855.length();
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) {
        int i3;
        synchronized (this.f2381) {
            this.f2381.seek(j);
            i3 = this.f2381.read(bArr, i, i2);
        }
        return i3;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f2380;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2381.close();
    }
}
