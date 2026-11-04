package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۜܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70I */
/* JADX INFO: loaded from: classes3.dex */
public final class C7210 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f23790;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C13856 f23791;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f23792;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C2735 f23793;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f23794 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f23795;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15130 f23796;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17037 f23797;

    public C7210(long j, long j2, long j3, C13856 c13856, C17037 c17037) {
        this.f23792 = j;
        this.f23795 = j2;
        this.f23790 = j3;
        this.f23791 = c13856;
        this.f23797 = c17037;
        this.f23793 = new C2735(C19606.m45234(c13856));
        this.f23796 = new C15130(c13856);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19797(int i, byte[] bArr, int i2, int i3) {
        m19801();
        this.f23796.m36405(i, bArr, i2, i3);
        m19801();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19798(OutputStream outputStream, int i) {
        m19801();
        this.f23796.m36406(outputStream, i);
        m19801();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808[] m19799() throws Throwable {
        m19801();
        InterfaceC22808[] interfaceC22808ArrM45234 = C19606.m45234(this.f23791);
        try {
            m19801();
            return interfaceC22808ArrM45234;
        } catch (IOException | Error | RuntimeException e) {
            try {
                C4908.m15061(interfaceC22808ArrM45234);
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f23794.compareAndSet(false, true)) {
            this.f23793.m9083();
        }
    }

    public final int length() {
        if (!this.f23794.get()) {
            return this.f23796.m36404();
        }
        throw new IllegalStateException("HexRange is closed");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8701 m19800() {
        AtomicBoolean atomicBoolean = this.f23794;
        if (!atomicBoolean.get()) {
            C2735 c2735 = this.f23793;
            c2735.m9084();
            if (atomicBoolean.get()) {
                c2735.m9083();
                throw new IllegalStateException("HexRange is closed");
            }
            return new C8701(this.f23792, this.f23795, this.f23790, this.f23791, this.f23797, this.f23793);
        }
        throw new IllegalStateException("HexRange is closed");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19801() {
        if (!this.f23794.get()) {
            for (InterfaceC22808 interfaceC22808 : this.f23793.f9096) {
                if (!interfaceC22808.mo2792()) {
                    throw new C12893();
                }
            }
            return;
        }
        throw new IllegalStateException("HexRange is closed");
    }
}
