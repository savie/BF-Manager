package l;

import android.media.MediaDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ᩳܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes5.dex */
public final class C18156 implements InterfaceC3153 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C23096 f58046;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final MediaDataSource f58047;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f58048;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C18156(MediaDataSource mediaDataSource, long j, C23096 c23096) {
        this.f58047 = mediaDataSource;
        this.f58048 = j;
        this.f58046 = c23096;
    }

    @Override // l.InterfaceC3153
    public final long length() {
        return this.f58048;
    }

    @Override // l.InterfaceC3153
    /* JADX INFO: renamed from: ܰ */
    public final void mo9547(long j, byte[] bArr, int i, int i2) throws C15335, InterruptedIOException, EOFException {
        C23096 c23096 = this.f58046;
        if (j < 0 || i2 < 0 || j > this.f58048 - ((long) i2)) {
            throw new EOFException("MPEG-TS thumbnail read exceeds source length");
        }
        int i3 = 0;
        while (i3 < i2) {
            C18862.m43512();
            try {
                int at = this.f58047.readAt(((long) i3) + j, bArr, i + i3, i2 - i3);
                if (at <= 0) {
                    C23096.m51104(c23096);
                    throw new C15335(new EOFException("Unexpected end of MPEG-TS thumbnail source"));
                }
                i3 += at;
            } catch (IOException e) {
                C23096.m51104(c23096);
                throw new C15335(e);
            }
        }
    }
}
