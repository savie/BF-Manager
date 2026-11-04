package l;

import android.media.MediaDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.᩺۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes.dex */
public final class C24315 implements InterfaceC1278 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final MediaDataSource f78710;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20585 f78711;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f78712;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C24315(MediaDataSource mediaDataSource, long j, C20585 c20585) {
        this.f78710 = mediaDataSource;
        this.f78712 = j;
        this.f78711 = c20585;
    }

    @Override // l.InterfaceC1278
    public final long length() {
        return this.f78712;
    }

    @Override // l.InterfaceC1278
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4667(long j, byte[] bArr, int i, int i2) throws C12380, InterruptedIOException, EOFException {
        C20585 c20585 = this.f78711;
        if (j < 0 || i2 < 0 || j > this.f78712 - ((long) i2)) {
            throw new EOFException("MPEG-TS thumbnail read exceeds source length");
        }
        int i3 = 0;
        while (i3 < i2) {
            C4177.m13359();
            try {
                int at = this.f78710.readAt(((long) i3) + j, bArr, i + i3, i2 - i3);
                if (at <= 0) {
                    C20585.m47177(c20585);
                    throw new C12380(new EOFException("Unexpected end of MPEG-TS thumbnail source"));
                }
                i3 += at;
            } catch (IOException e) {
                C20585.m47177(c20585);
                throw new C12380(e);
            }
        }
    }
}
