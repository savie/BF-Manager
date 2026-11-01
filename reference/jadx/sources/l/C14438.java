package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܳۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C14438 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f47325 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f47326;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f47327;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5339 f47328;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FileChannel f47329;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f47330;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private synchronized void m34719() {
        if (this.f47326) {
            return;
        }
        this.f47326 = true;
        try {
            this.f47329.close();
            this.f47328.close();
        } catch (Throwable th) {
            this.f47328.close();
            throw th;
        }
    }

    public C14438(FileChannel fileChannel, C5339 c5339) {
        this.f47329 = fileChannel;
        this.f47328 = c5339;
        this.f47327 = fileChannel.size();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m34720() {
        return this.f47327;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34722() {
        return (this.f47330 || this.f47326 || !this.f47329.isOpen()) ? false : true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34724() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f47325;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34721(long j, byte[] bArr, int i, int i2) throws IOException {
        if (this.f47330) {
            throw new C8599();
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            try {
                int i3 = this.f47329.read(byteBufferWrap, j);
                if (i3 < 0) {
                    throw new IOException("Unexpected end of hex checkpoint delta");
                }
                if (i3 == 0) {
                    Thread.yield();
                } else {
                    j += (long) i3;
                }
            } catch (ClosedChannelException e) {
                if (this.f47330) {
                    throw new C8599(e);
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m34723() {
        this.f47330 = true;
        m34719();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34725() {
        AtomicInteger atomicInteger = this.f47325;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet > 0) {
            return;
        }
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex restore delta channel already closed");
        }
        m34719();
    }
}
