package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۗۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3374 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7509 f10986;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC17544 f10987;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f10988;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicLong f10989 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f10990 = new AtomicInteger(-1);

    public C3374(long j) {
        this.f10988 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11078(InterfaceC17544 interfaceC17544) {
        this.f10987 = interfaceC17544;
        if (interfaceC17544 instanceof InterfaceC7509) {
            this.f10986 = (InterfaceC7509) interfaceC17544;
        } else {
            this.f10986 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11080(InterfaceC17544 interfaceC17544) {
        this.f10987 = new C5612(interfaceC17544);
        if (interfaceC17544 instanceof InterfaceC7509) {
            this.f10986 = (InterfaceC7509) interfaceC17544;
        } else {
            this.f10986 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11079(int i) {
        long j = this.f10988;
        if (j == 0) {
            return false;
        }
        int iAddAndGet = (int) ((this.f10989.addAndGet(i) * 100) / j);
        if (iAddAndGet > 100) {
            iAddAndGet = 100;
        }
        if (iAddAndGet == this.f10990.getAndSet(iAddAndGet)) {
            return false;
        }
        InterfaceC17544 interfaceC17544 = this.f10987;
        if (interfaceC17544 == null) {
            return true;
        }
        interfaceC17544.mo1209(iAddAndGet);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11077(long j) {
        InterfaceC17544 interfaceC17544;
        long j2 = this.f10988;
        if (j2 == 0) {
            return;
        }
        int iAddAndGet = (int) ((this.f10989.addAndGet(j) * 100) / j2);
        if (iAddAndGet > 100) {
            iAddAndGet = 100;
        }
        if (iAddAndGet == this.f10990.getAndSet(iAddAndGet) || (interfaceC17544 = this.f10987) == null) {
            return;
        }
        interfaceC17544.mo1209(iAddAndGet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11076() {
        return this.f10990.get();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m11081() {
        InterfaceC7509 interfaceC7509 = this.f10986;
        return interfaceC7509 != null && interfaceC7509.mo924();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m11075(long j, long j2) {
        if (j2 == 0) {
            return 0;
        }
        return (int) ((j * 100) / j2);
    }
}
