package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: l.ܿܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6UH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17482 implements InterfaceC11133 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f55617;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final FileChannel f55618;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final FileLock f55619;

    public C17482(InterfaceC3800 interfaceC3800, boolean z) throws IOException {
        this.f55617 = interfaceC3800.toAbsolutePath();
        FileChannel fileChannelOpen = z ? C6001.open(interfaceC3800, EnumC17912.CREATE_NEW, EnumC17912.READ, EnumC17912.WRITE) : C6001.open(interfaceC3800, EnumC17912.READ, EnumC17912.WRITE);
        this.f55618 = fileChannelOpen;
        try {
            FileLock fileLockTryLock = fileChannelOpen.tryLock();
            this.f55619 = fileLockTryLock;
            if (fileLockTryLock != null) {
            } else {
                throw new IOException("Recovery file is already in use");
            }
        } catch (IOException | RuntimeException e) {
            this.f55618.close();
            throw e;
        }
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ۙ */
    public final void mo17202(long j, byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f55618.read(byteBufferWrap, j);
            if (i3 < 0) {
                throw new EOFException("Truncated recovery file");
            }
            if (i3 == 0) {
                throw new IOException("Recovery read made no progress");
            }
            j += (long) i3;
        }
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ۙ */
    public final void mo17201(long j, int i, byte[] bArr) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        while (byteBufferWrap.hasRemaining()) {
            int iWrite = this.f55618.write(byteBufferWrap, j);
            if (iWrite <= 0) {
                throw new IOException("Recovery write made no progress");
            }
            j += (long) iWrite;
        }
    }

    @Override // l.InterfaceC11133
    public final long length() {
        return this.f55618.size();
    }

    @Override // l.InterfaceC11133
    public final void truncate(long j) throws IOException {
        this.f55618.truncate(j);
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ܶ */
    public final void mo17203() throws IOException {
        this.f55618.force(true);
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ᩳۙ */
    public final void mo17204() throws Throwable {
        C23833.m52506(this.f55617.getParent());
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f55618;
        try {
            this.f55619.release();
        } finally {
            fileChannel.close();
        }
    }
}
