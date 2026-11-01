package l;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۫ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C12321 implements InterfaceC18745, InterfaceC18039, InterfaceC21567 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f41170;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f41171 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f41172 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14438 f41173;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f41174;

    public C12321(C14438 c14438, int i) throws ClosedChannelException {
        this.f41173 = c14438;
        this.f41170 = i;
        c14438.m34724();
    }

    @Override // l.InterfaceC18745
    public final int length() {
        return this.f41170;
    }

    @Override // l.InterfaceC18039
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8032() {
        return this.f41173;
    }

    @Override // l.InterfaceC18039
    /* JADX INFO: renamed from: ۨ */
    public final long mo8035() {
        return this.f41173.m34720();
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo2300() {
        return this.f41173.m34722();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30590(long j) {
        if (this.f41171.get() <= 0 || j < 0) {
            throw new IllegalArgumentException("Invalid hex restore delta mapping");
        }
        this.f41172 = j;
        this.f41174 = true;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۙ */
    public final void mo2299(int i, byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f41174 || this.f41171.get() <= 0) {
            throw new ClosedChannelException();
        }
        C22979.m50823(this.f41170, i, i3);
        C22979.m50824(bArr.length, i2, i3);
        if (i3 == 0) {
            return;
        }
        this.f41173.m34721(this.f41172 + ((long) i), bArr, i2, i3);
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ֫ܰ */
    public final InterfaceC18745 mo2298() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f41171;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicInteger atomicInteger = this.f41171;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet > 0) {
            return;
        }
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex restore delta source already closed");
        }
        this.f41173.m34725();
    }
}
