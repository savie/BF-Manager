package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0119 extends AbstractC8587 implements InterfaceC13320 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f1105;

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo1180() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119(C13609 c13609) {
        super(c13609, EnumC5992.HIERARCHY_PHASE, new C1530(c13609));
        this.f1105 = c13609;
    }

    @Override // l.AbstractC9293
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo1181(C21825 c21825) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            ((C4603) it.next()).f16301.f30086.f77451 = this;
        }
        Iterator it2 = c21825.iterator();
        while (it2.hasNext()) {
            ((C4603) it2.next()).f16301.f30086.mo49994();
        }
    }

    @Override // l.AbstractC9293
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1178(C4603 c4603) {
        C8753 c8753 = c4603.f16301;
        C22492 c22492 = c8753.f30086;
        C0309 c0309 = (C0309) c22492.f77449;
        C4603 c4603M22368 = AbstractC8587.m22368(c4603, c8753);
        m22369(c4603, c4603M22368);
        AbstractC11242 abstractC11242 = c22492.f73419;
        C13609 c13609 = this.f1105;
        if (abstractC11242 == c13609.f44901.f77535) {
            if (c8753.f30092 != null) {
                C21017 c21017 = c13609.f44902;
                AbstractC5930 abstractC5930 = c8753.f30092;
                abstractC5930.getClass();
                c21017.m47353(abstractC5930, c0309.f1654);
                c0309.f1654 = AbstractC16579.f53219;
            } else if (c8753.f30087.m48595()) {
                C21017 c21018 = c13609.f44902;
                AbstractC5930 abstractC5931 = (AbstractC5930) c8753.f30087.f70876;
                abstractC5931.getClass();
                c21018.m47353(abstractC5931, (AbstractC16579) c0309.f1658.f70876);
                c0309.f1658 = C21825.m48588();
            }
        }
        c13609.m33280(c22492, c8753.f30089.f70566, c4603M22368);
        C21017 c21019 = c13609.f44902;
        c21019.getClass();
        C19607 c19607 = new C19607(c21019);
        c8753.mo1802(c19607);
        if (c19607.f62956 || c19607.f62958) {
            return;
        }
        c8753.f30086.f77447 |= 1073741824;
    }

    @Override // l.AbstractC8587
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 mo1177(AbstractC5930 abstractC5930) {
        return C21286.f69283[abstractC5930.mo1803().ordinal()] != 1 ? abstractC5930 : ((C11596) abstractC5930).f38963;
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1179(AbstractC23903 abstractC23903) {
        C13609 c13609 = this.f1105;
        C6171.m17176((c13609.f44910 instanceof C5764) || c13609.f44910 == this);
        if (c13609.f44910 != this) {
            abstractC23903.f77451 = this;
        } else {
            super.mo1181(C21825.of((Object) c13609.f44903.m28678((C22492) abstractC23903)));
        }
    }
}
