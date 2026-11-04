package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۠ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70I */
/* JADX INFO: loaded from: classes3.dex */
public final class C8701 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f28359;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f28360;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C13856 f28361;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f28362 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f28363;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2735 f28364;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17037 f28365;

    public C8701(long j, long j2, long j3, C13856 c13856, C17037 c17037, C2735 c2735) {
        this.f28360 = j;
        this.f28363 = j2;
        this.f28359 = j3;
        this.f28361 = c13856;
        this.f28365 = c17037;
        this.f28364 = c2735;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f28362.compareAndSet(true, false)) {
            this.f28364.m9083();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7210 m23394(C18266 c18266) throws Throwable {
        AtomicBoolean atomicBoolean = this.f28362;
        if (atomicBoolean.get()) {
            InterfaceC7509 interfaceC7509M41888 = C17950.m41888(c18266);
            if (interfaceC7509M41888.mo924()) {
                throw new C9446();
            }
            C7210 c7210 = null;
            try {
                C7210 c7211 = new C7210(this.f28360, this.f28363, this.f28359, this.f28361, this.f28365);
                try {
                    c7211.m19801();
                    if (atomicBoolean.get()) {
                        if (interfaceC7509M41888.mo924()) {
                            throw new C9446();
                        }
                        return c7211;
                    }
                    throw new IllegalStateException("HexRange VersionHandle is not active");
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c7210 = c7211;
                    if (c7210 != null) {
                        try {
                            c7210.close();
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
