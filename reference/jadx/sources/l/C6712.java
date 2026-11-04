package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۛ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6712 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static volatile C6712 f22327;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f22328 = new AtomicReference();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f22329 = new ConcurrentMapC17249(20);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6712 m18748() {
        if (f22327 == null) {
            synchronized (C6712.class) {
                if (f22327 == null) {
                    f22327 = new C6712();
                }
            }
        }
        return f22327;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24612 m18750(C14168 c14168) {
        ConcurrentMapC17249 concurrentMapC17249 = this.f22329;
        InterfaceC24612 interfaceC24612 = (InterfaceC24612) concurrentMapC17249.get(c14168);
        if (interfaceC24612 != null) {
            return interfaceC24612;
        }
        InterfaceC12677 interfaceC12677 = (InterfaceC12677) f22328.get();
        InterfaceC24612 interfaceC24612M31454 = interfaceC12677 != null ? interfaceC12677.m31454() : null;
        if (interfaceC24612M31454 == null) {
            interfaceC24612M31454 = new C20882(c14168);
        }
        concurrentMapC17249.putIfAbsent(c14168, interfaceC24612M31454);
        return (InterfaceC24612) concurrentMapC17249.get(c14168);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18749(C14168 c14168) {
        this.f22329.remove(c14168);
    }
}
