package l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T20C */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19432 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f62588 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f62589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC4871 f62590;

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo4707();

    public AbstractC19432(boolean z) {
        this.f62589 = z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m44476() {
        return this.f62589;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44475(boolean z) {
        this.f62589 = z;
        InterfaceC4871 interfaceC4871 = this.f62590;
        if (interfaceC4871 != null) {
            interfaceC4871.mo3788();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4871 m44472() {
        return this.f62590;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44473(InterfaceC4871 interfaceC4871) {
        this.f62590 = interfaceC4871;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m44471() {
        Iterator it = this.f62588.iterator();
        while (it.hasNext()) {
            ((InterfaceC16672) it.next()).cancel();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44474(InterfaceC16672 interfaceC16672) {
        this.f62588.add(interfaceC16672);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44477(InterfaceC16672 interfaceC16672) {
        this.f62588.remove(interfaceC16672);
    }
}
