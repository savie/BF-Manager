package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5844 extends MediaDataSource {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f19814;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9373 f19815;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    public C5844(C9373 c9373) {
        this.f19815 = c9373;
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
            long j2 = this.f19814;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) this.f19815.f36737.available())) {
                    return -1;
                }
                this.f19815.seek(j);
                this.f19814 = j;
            }
            if (i2 > this.f19815.f36737.available()) {
                i2 = this.f19815.f36737.available();
            }
            int i3 = this.f19815.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f19814 += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f19814 = -1L;
        return -1;
    }
}
