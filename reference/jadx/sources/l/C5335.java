package l;

import net.engio.mbassy.bus.SyncMessageBus;

/* JADX INFO: renamed from: l.ۚۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9DJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5335 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f18403 = C13488.m32997(C5335.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SyncMessageBus f18404 = new SyncMessageBus(new C2512());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14812(AutoCloseable autoCloseable) {
        this.f18404.subscribe(autoCloseable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14813(InterfaceC11686 interfaceC11686) {
        this.f18404.publish(interfaceC11686);
    }
}
