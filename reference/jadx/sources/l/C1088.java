package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.֨ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1088 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f4973;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AtomicLong f4974 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f4975 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17379 f4976;

    public C1088(long j, InterfaceC17379 interfaceC17379) {
        this.f4973 = j == 0 ? 1L : j;
        this.f4976 = interfaceC17379;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4089(int i) {
        InterfaceC17379 interfaceC17379 = this.f4976;
        if (interfaceC17379 == null) {
            return;
        }
        int iAddAndGet = (int) ((this.f4974.addAndGet(i) * 100) / this.f4973);
        if (iAddAndGet != this.f4975.getAndSet(iAddAndGet)) {
            interfaceC17379.mo2646(iAddAndGet, iAddAndGet);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4090(long j) {
        InterfaceC17379 interfaceC17379 = this.f4976;
        if (interfaceC17379 == null) {
            return;
        }
        int iAddAndGet = (int) ((this.f4974.addAndGet(j) * 100) / this.f4973);
        if (iAddAndGet != this.f4975.getAndSet(iAddAndGet)) {
            interfaceC17379.mo2646(iAddAndGet, iAddAndGet);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19248 m4088(InterfaceC19248 interfaceC19248) {
        return this.f4976 == null ? interfaceC19248 : new C22256(this, interfaceC19248);
    }
}
