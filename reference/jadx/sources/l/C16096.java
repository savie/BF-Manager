package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OA5R */
/* JADX INFO: loaded from: classes5.dex */
public final class C16096 extends AbstractC10190 implements InterfaceC19604, Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final OutputStream f52141;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C0387 f52142;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f52143;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f52144;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22411 f52145;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16157 f52146;

    public C16096(long j, C16157 c16157) {
        C0387 c0387 = new C0387(8192L);
        this.f52142 = c0387;
        InterfaceC11573 interfaceC11573M35106 = C14556.m35106(c0387.m2193());
        this.f52145 = interfaceC11573M35106.mo6067();
        this.f52144 = j;
        this.f52146 = c16157;
        this.f52141 = new C17588(this, j, interfaceC11573M35106);
    }

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public final OutputStream m38254() {
        return this.f52141;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22411 m38253() {
        return this.f52145;
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ۙ */
    public final long mo26310() {
        return this.f52144;
    }

    public final boolean isClosed() {
        return this.f52143;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f52143) {
            return;
        }
        this.f52143 = true;
        try {
            this.f52142.m2194().close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ᩷ */
    public final C16157 mo26312() {
        return this.f52146;
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ۙ */
    public final void mo26311(InterfaceC11573 interfaceC11573) {
        C14556.m35108(this.f52142.m2194()).mo4175(interfaceC11573);
    }
}
