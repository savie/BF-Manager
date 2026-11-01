package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۡۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M70O */
/* JADX INFO: loaded from: classes4.dex */
public final class C8868 implements InterfaceC16422, InterfaceC21567 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f30413;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30414;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f30415;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f30416 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final FileChannel f30417;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15432 f30418;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4695 f30419;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5339 f30420;

    public C8868(C15432 c15432, C4695 c4695, FileChannel fileChannel, C5339 c5339, BooleanSupplier booleanSupplier) {
        this.f30418 = c15432;
        this.f30419 = c4695;
        this.f30415 = (int) Math.min(c4695.m13012(), 2147483647L);
        this.f30417 = fileChannel;
        this.f30420 = c5339;
        this.f30413 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8868 m23008(C15432 c15432) {
        return m23009(c15432, new C19451(), false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C8868 m23010(C15432 c15432) {
        return m23009(c15432, new C19451(), true);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x008e A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8868 m23009(C15432 c15432, BooleanSupplier booleanSupplier, boolean z) throws Throwable {
        C5339 c5339M49439;
        C13638.requireNonNull(c15432);
        if (booleanSupplier.getAsBoolean()) {
            C4695 c4695 = new C4695(c15432.mo33964(), c15432.mo33991());
            if (!z && c4695.m13012() > 2147483647L) {
                throw new IOException("Only files smaller than 2 GB can be opened");
            }
            FileChannel fileChannel = null;
            try {
                c5339M49439 = C22273.m49439();
                try {
                    FileChannel fileChannelMo33982 = c15432.mo33982();
                    C13638.requireNonNull(fileChannelMo33982);
                    try {
                        C4695 c4696 = new C4695(c15432.mo33964(), c15432.mo33991());
                        if (!c4695.equals(c4696) || !booleanSupplier.getAsBoolean()) {
                            throw new C8599();
                        }
                        return new C8868(c15432, c4696, fileChannelMo33982, c5339M49439, booleanSupplier);
                    } catch (IOException | Error | RuntimeException e) {
                        e = e;
                        fileChannel = fileChannelMo33982;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                                if (c5339M49439 != null) {
                                }
                            } catch (Throwable th) {
                                if (th != e) {
                                    try {
                                        e.addSuppressed(th);
                                    } finally {
                                        if (c5339M49439 != null) {
                                            c5339M49439.close();
                                        }
                                    }
                                }
                                throw e;
                            }
                        } else if (c5339M49439 != null) {
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
                c5339M49439 = null;
            }
        } else {
            throw new C8599();
        }
    }

    @Override // l.InterfaceC18745
    public final int length() {
        return this.f30415;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۙ */
    public final void mo2299(int i, byte[] bArr, int i2, int i3) throws IOException {
        C22979.m50823(this.f30415, i, i3);
        C22979.m50824(bArr.length, i2, i3);
        if (this.f30416.get() <= 0) {
            throw new ClosedChannelException();
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, i3);
        long j = i;
        while (byteBufferWrap.hasRemaining()) {
            int i4 = this.f30417.read(byteBufferWrap, j);
            if (i4 < 0) {
                if (!mo2300()) {
                    throw new C8599();
                }
                throw new C8599(new EOFException("Unexpected end of source file"));
            }
            if (i4 == 0) {
                Thread.yield();
            } else {
                j += (long) i4;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4695 m23011() {
        return this.f30419;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo2300() {
        if (this.f30414) {
            return true;
        }
        return this.f30419.m13011(this.f30418) && this.f30413.getAsBoolean();
    }

    @Override // l.InterfaceC16422
    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23012() {
        this.f30414 = true;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ֫ܰ */
    public final InterfaceC18745 mo2298() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f30416;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5339 c5339 = this.f30420;
        AtomicInteger atomicInteger = this.f30416;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet == 0) {
            try {
                this.f30417.close();
            } finally {
                c5339.close();
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
