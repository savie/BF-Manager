package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۘۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P70I */
/* JADX INFO: loaded from: classes2.dex */
public final class C3927 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f14639;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C22710 f14640;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f14641;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f14642 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f14643;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13101 f14644;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5838 f14645;

    public C3927(long j, long j2, long j3, C22710 c22710, C5838 c5838, C13101 c13101) {
        this.f14641 = j;
        this.f14639 = j2;
        this.f14643 = j3;
        this.f14640 = c22710;
        this.f14645 = c5838;
        this.f14644 = c13101;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f14642.compareAndSet(true, false)) {
            this.f14644.m32350();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6750 m11404(C0843 c0843) throws Throwable {
        AtomicBoolean atomicBoolean = this.f14642;
        if (atomicBoolean.get()) {
            InterfaceC5614 interfaceC5614M29777 = C11965.m29777(c0843);
            if (interfaceC5614M29777.mo2357()) {
                throw new C1105();
            }
            C6750 c6750 = null;
            try {
                C6750 c6751 = new C6750(this.f14641, this.f14639, this.f14643, this.f14640, this.f14645);
                try {
                    c6751.m18253();
                    if (atomicBoolean.get()) {
                        if (interfaceC5614M29777.mo2357()) {
                            throw new C1105();
                        }
                        return c6751;
                    }
                    throw new IllegalStateException("HexRange VersionHandle is not active");
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c6750 = c6751;
                    if (c6750 != null) {
                        try {
                            c6750.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new IllegalStateException("HexRange VersionHandle is not active");
        }
    }
}
