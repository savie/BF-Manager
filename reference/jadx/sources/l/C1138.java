package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.֨۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F54P */
/* JADX INFO: loaded from: classes3.dex */
public final class C1138 extends AbstractC10708 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f5115;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f5116;

    public C1138(C2549 c2549, C23718 c23718, C4356 c4356) {
        super(c2549, 0);
        this.f5115 = new ArrayList();
        this.f5116 = m26936(c23718, c4356);
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۘ */
    public final int mo1519() {
        return this.f5116;
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۬ۙ */
    public final int mo1536() {
        return this.f5115.size();
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC12783 mo1530(int i) {
        return (C23367) this.f5115.get(i);
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۜۙ */
    public final void mo1531() {
        Collections.sort(this.f5115, new C5768());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4169(C23367 c23367) {
        int iMo31751;
        this.f5115.add(c23367);
        if (!c23367.mo31750() || (iMo31751 = c23367.mo31751() + 1) <= this.f5116) {
            return;
        }
        this.f5116 = iMo31751;
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo1522() {
        return (C1493) super.mo1522();
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ܰ */
    public final C2549 mo1537() {
        return (C2549) super.mo1537();
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC17721 mo1537() {
        return (C2549) super.mo1537();
    }
}
