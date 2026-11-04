package l;

import android.media.MediaDataSource;

/* JADX INFO: renamed from: l.۟ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7710 extends MediaDataSource {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13961 f25417;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f25418;

    public C7710(C13961 c13961, boolean z) {
        this.f25417 = c13961;
        this.f25418 = z;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int iMo34032;
        synchronized (this.f25417) {
            this.f25417.seek(j);
            iMo34032 = this.f25417.mo34032(i, i2, bArr);
        }
        return iMo34032;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f25417.length();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f25418) {
            this.f25417.close();
        }
    }
}
