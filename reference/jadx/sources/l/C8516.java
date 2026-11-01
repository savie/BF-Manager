package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۠᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8516 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5614 f29498;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f29499;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC21921 f29500;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f29501 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f29497 = new AtomicInteger(-1);

    public C8516(long j) {
        this.f29499 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22241(InterfaceC21921 interfaceC21921) {
        this.f29500 = interfaceC21921;
        if (interfaceC21921 instanceof InterfaceC5614) {
            this.f29498 = (InterfaceC5614) interfaceC21921;
        } else {
            this.f29498 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22243(InterfaceC21921 interfaceC21921) {
        this.f29500 = new C13455(interfaceC21921);
        if (interfaceC21921 instanceof InterfaceC5614) {
            this.f29498 = (InterfaceC5614) interfaceC21921;
        } else {
            this.f29498 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22242(int i) {
        long j = this.f29499;
        if (j == 0) {
            return false;
        }
        int iAddAndGet = (int) ((this.f29501.addAndGet(i) * 100) / j);
        if (iAddAndGet > 100) {
            iAddAndGet = 100;
        }
        if (iAddAndGet == this.f29497.getAndSet(iAddAndGet)) {
            return false;
        }
        InterfaceC21921 interfaceC21921 = this.f29500;
        if (interfaceC21921 == null) {
            return true;
        }
        interfaceC21921.mo1855(iAddAndGet);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22240(long j) {
        InterfaceC21921 interfaceC21921;
        long j2 = this.f29499;
        if (j2 == 0) {
            return;
        }
        int iAddAndGet = (int) ((this.f29501.addAndGet(j) * 100) / j2);
        if (iAddAndGet > 100) {
            iAddAndGet = 100;
        }
        if (iAddAndGet == this.f29497.getAndSet(iAddAndGet) || (interfaceC21921 = this.f29500) == null) {
            return;
        }
        interfaceC21921.mo1855(iAddAndGet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22239() {
        return this.f29497.get();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m22244() {
        InterfaceC5614 interfaceC5614 = this.f29498;
        return interfaceC5614 != null && interfaceC5614.mo2357();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22238(long j, long j2) {
        if (j2 == 0) {
            return 0;
        }
        return (int) ((j * 100) / j2);
    }
}
