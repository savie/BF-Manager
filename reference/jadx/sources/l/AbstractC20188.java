package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4Q2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20188 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC13569 f65526;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11016 f65527;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1136 f65528;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9605 f65529;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6076 f65530;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15249 f65531;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0431 f65532;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC3253 f65533;

    public AbstractC20188(C15249 c15249, InterfaceC3253 interfaceC3253, C22596 c22596, C17884 c17884, C12241 c12241, C23530 c23530, C20707 c20707, InterfaceC1136 interfaceC1136) {
        this.f65531 = c15249;
        this.f65533 = interfaceC3253;
        this.f65526 = c22596;
        this.f65532 = c17884;
        this.f65527 = c12241;
        this.f65529 = c23530;
        this.f65530 = c20707;
        this.f65528 = interfaceC1136;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45640(C1428 c1428, Set set) {
        C15249 c15249 = this.f65531;
        c15249.m36527(29, 0);
        C15249.m36519(c15249, ((C22596) this.f65526).mo24178(c1428));
        C15249.m36519(c15249, set.size());
        AbstractC16706 abstractC16706ListIterator = AbstractC22433.m49798(AbstractC10959.m27715(AbstractC22436.f73218), set).listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            InterfaceC6533 interfaceC6533 = (InterfaceC6533) abstractC16706ListIterator.next();
            InterfaceC3253 interfaceC3253 = this.f65533;
            InterfaceC1136 interfaceC1136 = this.f65528;
            C15249.m36519(c15249, interfaceC3253.mo24178(interfaceC1136.mo3479(interfaceC6533)));
            C10310 c10310 = (C10310) this;
            c10310.f35351.mo22161(c10310, interfaceC1136.mo3475(interfaceC6533));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45638(List list) {
        C15249 c15249 = this.f65531;
        c15249.m36527(28, 0);
        C15249.m36519(c15249, list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10310 c10310 = (C10310) this;
            c10310.f35351.mo22161(c10310, it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45646(boolean z) {
        this.f65531.m36527(31, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45632(byte b) {
        this.f65531.m36525(0, b);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45633(char c) {
        this.f65531.m36529(3, c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45634(double d) {
        this.f65531.m36522(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45645(C18590 c18590) {
        this.f65531.m36529(27, ((C17884) this.f65532).mo24178(c18590));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45648(C18590 c18590) {
        this.f65531.m36529(25, ((C17884) this.f65532).mo24178(c18590));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45635(float f) {
        this.f65531.m36523(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45636(int i) {
        this.f65531.m36525(4, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45637(long j) {
        this.f65531.m36530(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45642(C5890 c5890) {
        this.f65531.m36529(26, ((C12241) this.f65527).mo24178(c5890));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45631() {
        this.f65531.write(30);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45647(int i) {
        this.f65531.m36525(2, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45641(C3067 c3067) {
        this.f65531.m36529(23, this.f65533.mo24178(c3067));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45639(C1428 c1428) {
        this.f65531.m36529(24, ((C22596) this.f65526).mo24178(c1428));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45644(C17179 c17179) {
        this.f65531.m36529(21, ((C23530) this.f65529).mo24178(c17179));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45643(C15769 c15769) {
        this.f65531.m36529(22, ((C20707) this.f65530).mo24178(c15769));
    }
}
