package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܳۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15289 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AtomicLong f49988 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f49989 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC8161 f49990;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f49991;

    public C15289(long j, InterfaceC8161 interfaceC8161) {
        this.f49991 = j == 0 ? 1L : j;
        this.f49990 = interfaceC8161;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36690(int i) {
        InterfaceC8161 interfaceC8161 = this.f49990;
        if (interfaceC8161 == null) {
            return;
        }
        int iAddAndGet = (int) ((this.f49988.addAndGet(i) * 100) / this.f49991);
        if (iAddAndGet != this.f49989.getAndSet(iAddAndGet)) {
            interfaceC8161.mo1552(iAddAndGet, iAddAndGet);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36691(long j) {
        InterfaceC8161 interfaceC8161 = this.f49990;
        if (interfaceC8161 == null) {
            return;
        }
        int iAddAndGet = (int) ((this.f49988.addAndGet(j) * 100) / this.f49991);
        if (iAddAndGet != this.f49989.getAndSet(iAddAndGet)) {
            interfaceC8161.mo1552(iAddAndGet, iAddAndGet);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17044 m36689(InterfaceC17044 interfaceC17044) {
        return this.f49990 == null ? interfaceC17044 : new C19765(this, interfaceC17044);
    }
}
