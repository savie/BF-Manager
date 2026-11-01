package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.۠۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F54P */
/* JADX INFO: loaded from: classes4.dex */
public final class C8195 extends AbstractC10708 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f28552;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f28553;

    public C8195(C18778 c18778, C23718 c23718, C4356 c4356) {
        super(c18778, 0);
        this.f28552 = new ArrayList();
        this.f28553 = m26936(c23718, c4356);
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۘ */
    public final int mo1519() {
        return this.f28553;
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۬ۙ */
    public final int mo1536() {
        return this.f28552.size();
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC12783 mo1530(int i) {
        return (C23012) this.f28552.get(i);
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۜۙ */
    public final void mo1531() {
        Collections.sort(this.f28552, new C5768());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21487(C23012 c23012) {
        int iMo31751;
        this.f28552.add(c23012);
        if (!c23012.mo31750() || (iMo31751 = c23012.mo31751() + 1) <= this.f28553) {
            return;
        }
        this.f28553 = iMo31751;
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo1522() {
        return (C8901) super.mo1522();
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC17721 mo1537() {
        return (C18778) super.mo1537();
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ܰ */
    public final C18778 mo1537() {
        return (C18778) super.mo1537();
    }
}
