package l;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۚۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes3.dex */
public final class C5588 implements InterfaceC22808, InterfaceC10873, InterfaceC22062 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17520 f19400;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f19401 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f19402 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f19403;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f19404;

    public C5588(C17520 c17520, int i) throws ClosedChannelException {
        this.f19400 = c17520;
        this.f19403 = i;
        c17520.m41137();
    }

    @Override // l.InterfaceC22808
    public final int length() {
        return this.f19403;
    }

    @Override // l.InterfaceC10873
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2788() {
        return this.f19400;
    }

    @Override // l.InterfaceC10873
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2796() {
        return this.f19400.m41140();
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo2792() {
        return this.f19400.m41136();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16562(long j) {
        if (this.f19401.get() <= 0 || j < 0) {
            throw new IllegalArgumentException("Invalid hex restore delta mapping");
        }
        this.f19402 = j;
        this.f19404 = true;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۙ */
    public final void mo2790(int i, byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f19404 || this.f19401.get() <= 0) {
            throw new ClosedChannelException();
        }
        C13921.m33904(this.f19403, i, i3);
        C13921.m33902(bArr.length, i2, i3);
        if (i3 == 0) {
            return;
        }
        this.f19400.m41135(this.f19402 + ((long) i), bArr, i2, i3);
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۠᩷ */
    public final InterfaceC22808 mo2791() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f19401;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicInteger atomicInteger = this.f19401;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet > 0) {
            return;
        }
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex restore delta source already closed");
        }
        this.f19400.m41139();
    }
}
