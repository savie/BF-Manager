package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: l.ۜۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M6UH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7064 implements InterfaceC4565 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FileChannel f23275;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f23276;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final FileLock f23277;

    public C7064(InterfaceC24329 interfaceC24329, boolean z) throws IOException {
        this.f23276 = interfaceC24329.toAbsolutePath();
        FileChannel fileChannelOpen = z ? C19853.open(interfaceC24329, EnumC0462.CREATE_NEW, EnumC0462.READ, EnumC0462.WRITE) : C19853.open(interfaceC24329, EnumC0462.READ, EnumC0462.WRITE);
        this.f23275 = fileChannelOpen;
        try {
            FileLock fileLockTryLock = fileChannelOpen.tryLock();
            this.f23277 = fileLockTryLock;
            if (fileLockTryLock != null) {
            } else {
                throw new IOException("Recovery file is already in use");
            }
        } catch (IOException | RuntimeException e) {
            this.f23275.close();
            throw e;
        }
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ۙ */
    public final void mo14341(long j, byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f23275.read(byteBufferWrap, j);
            if (i3 < 0) {
                throw new EOFException("Truncated recovery file");
            }
            if (i3 == 0) {
                throw new IOException("Recovery read made no progress");
            }
            j += (long) i3;
        }
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ۙ */
    public final void mo14340(long j, int i, byte[] bArr) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        while (byteBufferWrap.hasRemaining()) {
            int iWrite = this.f23275.write(byteBufferWrap, j);
            if (iWrite <= 0) {
                throw new IOException("Recovery write made no progress");
            }
            j += (long) iWrite;
        }
    }

    @Override // l.InterfaceC4565
    public final long length() {
        return this.f23275.size();
    }

    @Override // l.InterfaceC4565
    public final void truncate(long j) throws IOException {
        this.f23275.truncate(j);
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ܺ */
    public final void mo14343() throws IOException {
        this.f23275.force(true);
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ܶۙ */
    public final void mo14342() throws Throwable {
        C21719.m49293(this.f23276.getParent());
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f23275;
        try {
            this.f23277.release();
        } finally {
            fileChannel.close();
        }
    }
}
