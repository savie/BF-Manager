package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩻ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2E */
/* JADX INFO: loaded from: classes.dex */
public final class C23446 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static volatile C23446 f75921;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f75922 = new AtomicReference();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f75923 = new ConcurrentMapC13783(20);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23446 m51665() {
        if (f75921 == null) {
            synchronized (C23446.class) {
                if (f75921 == null) {
                    f75921 = new C23446();
                }
            }
        }
        return f75921;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14274 m51667(C22823 c22823) {
        ConcurrentMapC13783 concurrentMapC13783 = this.f75923;
        InterfaceC14274 interfaceC14274 = (InterfaceC14274) concurrentMapC13783.get(c22823);
        if (interfaceC14274 != null) {
            return interfaceC14274;
        }
        InterfaceC10746 interfaceC10746 = (InterfaceC10746) f75922.get();
        InterfaceC14274 interfaceC14274M27041 = interfaceC10746 != null ? interfaceC10746.m27041() : null;
        if (interfaceC14274M27041 == null) {
            interfaceC14274M27041 = new C5806(c22823);
        }
        concurrentMapC13783.putIfAbsent(c22823, interfaceC14274M27041);
        return (InterfaceC14274) concurrentMapC13783.get(c22823);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51666(C22823 c22823) {
        this.f75923.remove(c22823);
    }
}
