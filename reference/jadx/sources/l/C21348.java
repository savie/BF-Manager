package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21348 extends AbstractC18154 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f69468;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        C4603 c4603 = (C4603) obj;
        m47878(c0309.mo1938(), c4603);
        C20145 c20145 = this.f69468;
        if (!c20145.m45554(c4603, (AbstractC16579) c0309, true)) {
            C23466 c23466 = new C23466(c20145, c4603, null, c0309.f53222);
            AbstractC8774 abstractC8774 = c4603.f16296;
            abstractC8774.getClass();
            c20145.m45545((AbstractC23903) c23466, (InterfaceC12260) abstractC8774, (AbstractC23903) c4603.f16301.f30086, (AbstractC16579) c0309, c0309.f53222.f77453, true);
        }
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        c0350.f1774.mo1928(this, (C4603) obj);
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        c8777.f30194.mo1928(this, (C4603) obj);
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6581(C13757 c13757, Object obj) {
        C4603 c4603 = (C4603) obj;
        m47878(c13757.f45367, c4603);
        c13757.f45368.mo1928(this, c4603);
        m47878(c13757.f45366, c4603);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47878(C21825 c21825, C4603 c4603) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            m20360(c4603, (AbstractC16579) it.next());
        }
    }

    public C21348(C20145 c20145) {
        this.f69468 = c20145;
    }
}
