package l;

import net.engio.mbassy.bus.SyncMessageBus;

/* JADX INFO: renamed from: l.ۘ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9DJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4382 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f15789 = C16980.m40037(C4382.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SyncMessageBus f15790 = new SyncMessageBus(new C24520());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13990(AutoCloseable autoCloseable) {
        this.f15790.subscribe(autoCloseable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13991(InterfaceC6620 interfaceC6620) {
        this.f15790.publish(interfaceC6620);
    }
}
