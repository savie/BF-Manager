package l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T20C */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f21428 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f21429;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC19479 f21430;

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo2768();

    public AbstractC6323(boolean z) {
        this.f21429 = z;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m18046() {
        return this.f21429;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18045(boolean z) {
        this.f21429 = z;
        InterfaceC19479 interfaceC19479 = this.f21430;
        if (interfaceC19479 != null) {
            interfaceC19479.mo4064();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19479 m18042() {
        return this.f21430;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18044(InterfaceC19479 interfaceC19479) {
        this.f21430 = interfaceC19479;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m18048() {
        Iterator it = this.f21428.iterator();
        while (it.hasNext()) {
            ((InterfaceC0685) it.next()).cancel();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18043(InterfaceC0685 interfaceC0685) {
        this.f21428.add(interfaceC0685);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18047(InterfaceC0685 interfaceC0685) {
        this.f21428.remove(interfaceC0685);
    }
}
