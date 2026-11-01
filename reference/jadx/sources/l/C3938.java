package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3938 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f14655;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6761 f14656;

    public C3938(C6761 c6761, boolean z) {
        this.f14656 = c6761;
        this.f14655 = z;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3925(C5224 c5224) {
        this.f14656.f22834.m47343(c5224, false);
        super.mo3925(c5224);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3919(C2401 c2401) {
        if (c2401.f9659.f30190.mo1926()) {
            return;
        }
        super.mo3919(c2401);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3958(C22179 c22179) {
        C21017 c21017 = this.f14656.f22834;
        C21825 c21825 = c22179.f72546;
        c21017.getClass();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            c21017.m47343((C5224) it.next(), true);
        }
        m49334(c22179.f72547);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        AbstractC16579 abstractC16579;
        C6656 c6656 = c23195.f75262;
        if (c6656 != null && !c6656.f22477.f30190.mo1926()) {
            C6656 c6657 = c23195.f75262;
            m11414(c6657.f22475, c6657.f22476.f70566);
        }
        AbstractC5930 abstractC5930 = c23195.f75266;
        if (abstractC5930 != null && (abstractC16579 = abstractC5930.f30190) != null) {
            m11413(abstractC16579, abstractC5930);
        }
        if (this.f14655) {
            mo7248(c23195.f75267);
            mo7248(c23195.f75266);
            m49334(c23195.f75269);
            mo7248(c23195.f75262);
            m49334(c23195.f75270);
            m49334(c23195.f75264);
            return;
        }
        mo7248(c23195.f75265);
        mo7248(c23195.f75268);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        C6263 c6263 = c6656.f22475;
        if (c6263 != null && c6263.f77449 != null && !c6656.m18039()) {
            m11413(c6656.f22475.f77449, c6656.f22477);
        }
        mo7248(c6656.f22476);
        mo7248(c6656.f22477);
        if (this.f14655) {
            return;
        }
        mo7248(c6656.f22481);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1261(C2422 c2422) {
        AbstractC16579 abstractC16579;
        AbstractC8774 abstractC8774 = c2422.f9707;
        if (abstractC8774 != null && (abstractC16579 = abstractC8774.f30190) != null) {
            m11413(abstractC16579, abstractC8774);
        }
        super.mo1261(c2422);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3938(C11906 c11906) {
        AbstractC16579 abstractC16579;
        AbstractC8774 abstractC8774 = c11906.f39946;
        if (abstractC8774 != null && !(abstractC8774 instanceof AbstractC20372) && (abstractC16579 = abstractC8774.f30190) != null) {
            m11413(abstractC16579, abstractC8774);
        }
        super.mo3938(c11906);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        AbstractC5930 abstractC5930 = c8378.f29095;
        if (abstractC5930 != null && abstractC5930.f30190 != null) {
            if (abstractC5930.m22847(EnumC18651.f60535)) {
                AbstractC5930 abstractC5931 = c8378.f29095;
                m11414(abstractC5931.f30190.f53222, ((C2401) abstractC5931).f9658);
            }
            C8753 c8753 = c8378.f29098;
            if (c8753 != null) {
                m11414(c8378.f29095.f30190.f53222, c8753.f30089.f70566);
            }
            AbstractC5930 abstractC5932 = c8378.f29095;
            m11413(abstractC5932.f30190, abstractC5932);
        }
        super.mo3932(c8378);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3953(C18961 c18961) {
        AbstractC5930 abstractC5930 = c18961.f61402;
        if (abstractC5930 != null && abstractC5930.f30190 != null) {
            if (abstractC5930.m22847(EnumC18651.f60535)) {
                AbstractC5930 abstractC5931 = c18961.f61402;
                m11414(abstractC5931.f30190.f53222, ((C2401) abstractC5931).f9658);
            }
            AbstractC5930 abstractC5932 = c18961.f61402;
            m11413(abstractC5932.f30190, abstractC5932);
        }
        super.mo3953(c18961);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        if (this.f14655) {
            mo7248(c8753.f30089);
            m49334(c8753.f30088);
            mo7248(c8753.f30092);
            m49334(c8753.f30087);
        }
        for (AbstractC8774 abstractC8774 : c8753.f30090) {
            if (!abstractC8774.m22847(EnumC18651.f60468)) {
                abstractC8774.mo1802(this);
            }
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
        if (this.f14655) {
            return;
        }
        m49334(c21452.f69737);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11413(AbstractC16579 abstractC16579, AbstractC8774 abstractC8774) {
        C20414 c20414 = this.f14656.f22832;
        if (abstractC16579.mo9482()) {
            return;
        }
        boolean z = true;
        AbstractC8774 abstractC8775 = abstractC8774;
        while (z) {
            if (abstractC8775.m22847(EnumC18651.f60493)) {
                C21825 c21825Mo1938 = abstractC16579.mo1938();
                C11596 c11596 = (C11596) abstractC8775;
                C21825 c21825 = c11596.f38962;
                if (c21825.m48596() > 0 && c21825Mo1938.m48596() == c21825.m48596()) {
                    for (int i = 0; i < c21825Mo1938.m48596(); i++) {
                        m11413((AbstractC16579) c21825Mo1938.get(i), (AbstractC8774) c21825.get(i));
                    }
                }
                abstractC8775 = c11596.f38963;
            }
            if (abstractC8775.m22847(EnumC18651.f60473)) {
                abstractC8775 = ((C23570) abstractC8775).f76357;
                if (abstractC16579 != null && !abstractC16579.m39001(EnumC6617.NONE)) {
                    abstractC16579 = abstractC16579.mo1934();
                }
            } else if (abstractC8775.m22847(EnumC18651.f60535)) {
                C2401 c2401 = (C2401) abstractC8775;
                if (abstractC16579 == null || abstractC16579.m39001(EnumC6617.NONE)) {
                    if (c2401.f9658.m48596() == 1) {
                        AbstractC5930 abstractC5930 = c2401.f9659;
                        abstractC5930.getClass();
                        C11867 c11867 = ((C5224) c2401.f9658.f70876).f18119;
                        C5909 c5909 = C23879.f77204;
                        c20414.m48199(abstractC5930, new C5909("compiler", "cant.type.annotate.scoping.1", c11867));
                    } else {
                        C19003 c19003 = new C19003();
                        Iterator it = c2401.f9658.iterator();
                        while (it.hasNext()) {
                            c19003.m43723(((C5224) it.next()).f18119);
                        }
                        AbstractC5930 abstractC5931 = c2401.f9659;
                        abstractC5931.getClass();
                        C21825 c21825M43726 = c19003.m43726();
                        C5909 c59010 = C23879.f77204;
                        c20414.m48199(abstractC5931, new C5909("compiler", "cant.type.annotate.scoping", c21825M43726));
                    }
                    z = false;
                }
                abstractC8775 = c2401.f9659;
            } else {
                if (!abstractC8775.m22847(EnumC18651.f60465)) {
                    if (abstractC8775.m22847(EnumC18651.f60537)) {
                        C15124 c15124 = (C15124) abstractC8775;
                        if (c15124.mo1801() == EnumC12490.EXTENDS_WILDCARD || c15124.mo1801() == EnumC12490.SUPER_WILDCARD) {
                            AbstractC8774 abstractC8776 = c15124.f49398;
                            m11413(abstractC8776.f30190, abstractC8776);
                        }
                    } else if (abstractC8775.m22847(EnumC18651.f60566)) {
                        AbstractC5930 abstractC5932 = ((C0990) abstractC8775).f4638;
                        m11413(abstractC5932.f30190, abstractC5932);
                    } else if (abstractC8775.m22847(EnumC18651.f60502)) {
                        for (AbstractC8774 abstractC8777 : ((C1011) abstractC8775).f4699) {
                            m11413(abstractC8777.f30190, abstractC8777);
                        }
                    } else if (abstractC8775.m22847(EnumC18651.f60547)) {
                        for (AbstractC8774 abstractC8778 : ((C5245) abstractC8775).f18177) {
                            m11413(abstractC8778.f30190, abstractC8778);
                        }
                    } else if (abstractC8775.mo1801() != EnumC12490.PRIMITIVE_TYPE && abstractC8775.mo1801() != EnumC12490.ERRONEOUS) {
                        C6171.m17174("Unexpected tree: " + abstractC8775 + " with kind: " + abstractC8775.mo1801() + " within: " + abstractC8774 + " with kind: " + abstractC8774.mo1801());
                        throw null;
                    }
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11414(AbstractC23903 abstractC23903, C21825 c21825) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C5224 c5224 = (C5224) it.next();
            if (!c5224.f30190.mo1926()) {
                C6761 c6761 = this.f14656;
                if (c6761.f22796.m14387(c5224.f18119, abstractC23903) == EnumC4500.DECLARATION) {
                    C20414 c20414 = c6761.f22832;
                    AbstractC16579 abstractC16579 = c5224.f30190;
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(c5224, new C5909("compiler", "annotation.type.not.applicable.to.type", abstractC16579));
                }
            }
        }
    }
}
