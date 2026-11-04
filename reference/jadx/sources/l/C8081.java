package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8081 extends MediaDataSource {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f26735;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2860 f26736;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    public C8081(C2860 c2860) {
        this.f26736 = c2860;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f26735;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) this.f26736.f62311.available())) {
                    return -1;
                }
                this.f26736.seek(j);
                this.f26735 = j;
            }
            if (i2 > this.f26736.f62311.available()) {
                i2 = this.f26736.f62311.available();
            }
            int i3 = this.f26736.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f26735 += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f26735 = -1L;
        return -1;
    }
}
