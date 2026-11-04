package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۫۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70O */
/* JADX INFO: loaded from: classes4.dex */
public final class C13111 implements InterfaceC2122, InterfaceC22062 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C1161 f41893;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f41894;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f41895 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile boolean f41896;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FileChannel f41897;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f41898;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6597 f41899;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10192 f41900;

    public C13111(C1161 c1161, C6597 c6597, FileChannel fileChannel, C10192 c10192, BooleanSupplier booleanSupplier) {
        this.f41893 = c1161;
        this.f41899 = c6597;
        this.f41894 = (int) Math.min(c6597.m18524(), 2147483647L);
        this.f41897 = fileChannel;
        this.f41900 = c10192;
        this.f41898 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13111 m32574(C1161 c1161) {
        return m32575(c1161, new C15348(), false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13111 m32576(C1161 c1161) {
        return m32575(c1161, new C15348(), true);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007c A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13111 m32575(C1161 c1161, BooleanSupplier booleanSupplier, boolean z) throws Throwable {
        C10192 c10192M4496;
        C17359.requireNonNull(c1161);
        if (!booleanSupplier.getAsBoolean()) {
            throw new C12893();
        }
        C6597 c6597M18521 = C6597.m18521(c1161);
        if (!z && c6597M18521.m18524() > 2147483647L) {
            throw new IOException("Only files smaller than 2 GB can be opened");
        }
        FileChannel fileChannel = null;
        try {
            c10192M4496 = C1244.m4496();
            try {
                FileChannel fileChannelMo4280 = c1161.mo4280();
                C17359.requireNonNull(fileChannelMo4280);
                try {
                    C6597 c6597M18522 = C6597.m18521(c1161);
                    if (!c6597M18521.equals(c6597M18522) || !booleanSupplier.getAsBoolean()) {
                        throw new C12893();
                    }
                    return new C13111(c1161, c6597M18522, fileChannelMo4280, c10192M4496, booleanSupplier);
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    fileChannel = fileChannelMo4280;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                            if (c10192M4496 != null) {
                            }
                        } catch (Throwable th) {
                            if (th != e) {
                                try {
                                    e.addSuppressed(th);
                                } finally {
                                    if (c10192M4496 != null) {
                                        c10192M4496.close();
                                    }
                                }
                            }
                            throw e;
                        }
                    } else if (c10192M4496 != null) {
                    }
                    throw e;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Error e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        } catch (IOException | Error | RuntimeException e5) {
            e = e5;
            c10192M4496 = null;
        }
    }

    @Override // l.InterfaceC22808
    public final int length() {
        return this.f41894;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۙ */
    public final void mo2790(int i, byte[] bArr, int i2, int i3) throws IOException {
        C13921.m33904(this.f41894, i, i3);
        C13921.m33902(bArr.length, i2, i3);
        if (this.f41895.get() <= 0) {
            throw new ClosedChannelException();
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, i3);
        long j = i;
        while (byteBufferWrap.hasRemaining()) {
            int i4 = this.f41897.read(byteBufferWrap, j);
            if (i4 < 0) {
                if (!mo2792()) {
                    throw new C12893();
                }
                throw new C12893(new EOFException("Unexpected end of source file"));
            }
            if (i4 == 0) {
                Thread.yield();
            } else {
                j += (long) i4;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6597 m32577() {
        return this.f41899;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo2792() {
        if (this.f41896) {
            return true;
        }
        return this.f41899.m18523(this.f41893) && this.f41898.getAsBoolean();
    }

    @Override // l.InterfaceC2122
    /* JADX INFO: renamed from: ᩻ۙ */
    public final void mo7314() {
        this.f41896 = true;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۠᩷ */
    public final InterfaceC22808 mo2791() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f41895;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C10192 c10192 = this.f41900;
        AtomicInteger atomicInteger = this.f41895;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet == 0) {
            try {
                this.f41897.close();
            } finally {
                c10192.close();
            }
        } else {
            if (iDecrementAndGet >= 0) {
                return;
            }
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("NormalFileSource already closed");
        }
    }
}
