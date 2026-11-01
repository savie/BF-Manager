package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵ܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OA5R */
/* JADX INFO: loaded from: classes5.dex */
public final class C19617 extends AbstractC21307 implements InterfaceC0191, Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f62971;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6479 f62972;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f62973;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final OutputStream f62974;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20591 f62975;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9501 f62976;

    public C19617(long j, C9501 c9501) {
        C6479 c6479 = new C6479(8192L);
        this.f62972 = c6479;
        InterfaceC10983 interfaceC10983M3436 = C0834.m3436(c6479.m17673());
        this.f62975 = interfaceC10983M3436.mo5902();
        this.f62971 = j;
        this.f62976 = c9501;
        this.f62974 = new C8328(this, j, interfaceC10983M3436);
    }

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public final OutputStream m44710() {
        return this.f62974;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20591 m44709() {
        return this.f62975;
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۙ */
    public final long mo4375() {
        return this.f62971;
    }

    public final boolean isClosed() {
        return this.f62973;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f62973) {
            return;
        }
        this.f62973 = true;
        try {
            this.f62972.m17674().close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۨ */
    public final C9501 mo4377() {
        return this.f62976;
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۙ */
    public final void mo4376(InterfaceC10983 interfaceC10983) {
        C0834.m3437(this.f62972.m17674()).mo16401(interfaceC10983);
    }
}
