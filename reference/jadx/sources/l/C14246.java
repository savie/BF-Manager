package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ܰ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes5.dex */
public final class C14246 implements InterfaceC1278 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8351 f45028;

    public C14246(C8351 c8351) {
        this.f45028 = c8351;
    }

    @Override // l.InterfaceC1278
    public final long length() {
        return this.f45028.m22473();
    }

    @Override // l.InterfaceC1278
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4667(long j, byte[] bArr, int i, int i2) throws EOFException {
        int i3 = 0;
        while (i3 < i2) {
            int iM22472 = this.f45028.m22472(j + ((long) i3), bArr, i + i3, i2 - i3);
            if (iM22472 <= 0) {
                throw new EOFException("Unexpected end of metadata");
            }
            i3 += iM22472;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45028.close();
    }
}
