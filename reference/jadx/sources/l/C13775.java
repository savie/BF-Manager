package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.۬ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M6UH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13775 implements InterfaceC4565 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FileChannel f43719;

    public C13775(InterfaceC24329 interfaceC24329) {
        this.f43719 = C19853.open(interfaceC24329, EnumC0462.READ);
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ۙ */
    public final void mo14341(long j, byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f43719.read(byteBufferWrap, j);
            if (i3 < 0) {
                throw new EOFException("Truncated recovery validation file");
            }
            if (i3 == 0) {
                throw new IOException("Recovery validation read made no progress");
            }
            j += (long) i3;
        }
    }

    @Override // l.InterfaceC4565
    public final long length() {
        return this.f43719.size();
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ۙ */
    public final void mo14340(long j, int i, byte[] bArr) throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // l.InterfaceC4565
    public final void truncate(long j) throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ܺ */
    public final void mo14343() throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ܶۙ */
    public final void mo14342() throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f43719.close();
    }
}
