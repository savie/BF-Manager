package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۜۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P70I */
/* JADX INFO: loaded from: classes2.dex */
public final class C6750 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f22761;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C13101 f22762;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22710 f22763;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f22764;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f22765 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f22766;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19182 f22767;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5838 f22768;

    public C6750(long j, long j2, long j3, C22710 c22710, C5838 c5838) {
        this.f22764 = j;
        this.f22761 = j2;
        this.f22766 = j3;
        this.f22763 = c22710;
        this.f22768 = c5838;
        this.f22762 = new C13101(C7893.m20861(c22710));
        this.f22767 = new C19182(c22710);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18251(OutputStream outputStream, int i) throws C8599 {
        m18253();
        this.f22767.m44038(outputStream, i);
        m18253();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745[] m18252() throws C8599 {
        m18253();
        InterfaceC18745[] interfaceC18745ArrM20861 = C7893.m20861(this.f22763);
        try {
            m18253();
            return interfaceC18745ArrM20861;
        } catch (IOException | Error | RuntimeException e) {
            try {
                C15218.m36423(interfaceC18745ArrM20861);
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f22765.compareAndSet(false, true)) {
            this.f22762.m32350();
        }
    }

    public final int length() {
        if (!this.f22765.get()) {
            return this.f22767.m44036();
        }
        throw new IllegalStateException("HexRange is closed");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3927 m18250() {
        AtomicBoolean atomicBoolean = this.f22765;
        if (!atomicBoolean.get()) {
            C13101 c13101 = this.f22762;
            c13101.m32351();
            if (atomicBoolean.get()) {
                c13101.m32350();
                throw new IllegalStateException("HexRange is closed");
            }
            return new C3927(this.f22764, this.f22761, this.f22766, this.f22763, this.f22768, this.f22762);
        }
        throw new IllegalStateException("HexRange is closed");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18253() throws C8599 {
        if (!this.f22765.get()) {
            for (InterfaceC18745 interfaceC18745 : this.f22762.f43627) {
                if (!interfaceC18745.mo2300()) {
                    throw new C8599();
                }
            }
            return;
        }
        throw new IllegalStateException("HexRange is closed");
    }
}
