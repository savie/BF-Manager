package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18984 extends C0596 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f61530;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f61531;

    @Override // l.C0596, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f61531) {
            this.f61531 = true;
            super.close();
        }
    }

    @Override // l.C0596, android.media.MediaDataSource
    public final synchronized int readAt(long j, byte[] bArr, int i, int i2) {
        try {
            if (this.f61531) {
                throw new IOException("Audio source is closed");
            }
        } catch (IOException e) {
            this.f61530 = true;
            throw e;
        }
        return super.readAt(j, bArr, i, i2);
    }
}
