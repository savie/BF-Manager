package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۛܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6UH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6193 implements InterfaceC11133 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final FileChannel f21071;

    public C6193(InterfaceC3800 interfaceC3800) {
        this.f21071 = C6001.open(interfaceC3800, EnumC17912.READ);
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17202(long j, byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f21071.read(byteBufferWrap, j);
            if (i3 < 0) {
                throw new EOFException("Truncated recovery validation file");
            }
            if (i3 == 0) {
                throw new IOException("Recovery validation read made no progress");
            }
            j += (long) i3;
        }
    }

    @Override // l.InterfaceC11133
    public final long length() {
        return this.f21071.size();
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17201(long j, int i, byte[] bArr) throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // l.InterfaceC11133
    public final void truncate(long j) throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void mo17203() throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final void mo17204() throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21071.close();
    }
}
