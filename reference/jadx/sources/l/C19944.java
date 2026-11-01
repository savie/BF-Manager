package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19944 implements InterfaceC19445 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19445 f63887;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f63888;

    public C19944(InterfaceC19445 interfaceC19445, List list) {
        this.f63887 = interfaceC19445;
        this.f63888 = AbstractC22433.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m45239() {
        return this.f63888;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۬ */
    public final long mo1391() {
        return this.f63887.mo1391();
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final long mo1392() {
        return this.f63887.mo1392();
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1390(C14643 c14643) {
        return this.f63887.mo1390(c14643);
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1389() {
        return this.f63887.mo1389();
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final void mo1393(long j) {
        this.f63887.mo1393(j);
    }
}
