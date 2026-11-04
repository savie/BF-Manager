package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܽۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C17520 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f56949;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10192 f56950;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f56951;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f56952;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final FileChannel f56953;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f56954 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private synchronized void m41134() {
        if (this.f56949) {
            return;
        }
        this.f56949 = true;
        try {
            this.f56953.close();
            this.f56950.close();
        } catch (Throwable th) {
            this.f56950.close();
            throw th;
        }
    }

    public C17520(FileChannel fileChannel, C10192 c10192) {
        this.f56953 = fileChannel;
        this.f56950 = c10192;
        this.f56952 = fileChannel.size();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m41140() {
        return this.f56952;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41136() {
        return (this.f56951 || this.f56949 || !this.f56953.isOpen()) ? false : true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41137() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f56954;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41135(long j, byte[] bArr, int i, int i2) throws IOException {
        if (this.f56951) {
            throw new C12893();
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            try {
                int i3 = this.f56953.read(byteBufferWrap, j);
                if (i3 < 0) {
                    throw new IOException("Unexpected end of hex checkpoint delta");
                }
                if (i3 == 0) {
                    Thread.yield();
                } else {
                    j += (long) i3;
                }
            } catch (ClosedChannelException e) {
                if (this.f56951) {
                    throw new C12893(e);
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m41138() {
        this.f56951 = true;
        m41134();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41139() {
        AtomicInteger atomicInteger = this.f56954;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet > 0) {
            return;
        }
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex restore delta channel already closed");
        }
        m41134();
    }
}
