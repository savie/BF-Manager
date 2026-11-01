package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public class C8838 extends AbstractC18715 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f30369;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10955 f30370;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C8753 f30371;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21825 f30372;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21825 f30373;

    @Override // l.AbstractC18715
    /* JADX INFO: renamed from: ۖ */
    public final void mo11337() {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1981(C18255 c18255) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22970() {
        C18009 c18009 = (C18009) this.f60692.m43727();
        while (c18009 != null) {
            AbstractC8774 abstractC8774 = c18009.f57603;
            boolean z = c18009 instanceof C19421;
            C10955 c10955 = this.f30370;
            if (z) {
                AbstractC16579 abstractC16579 = ((C19421) c18009).f62581;
                C8753 c8753 = this.f30371;
                if (c8753 != null && c8753.f30189 == abstractC8774.f30189) {
                    C20414 c20414 = c10955.f37257;
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(abstractC8774, new C5909("compiler", "unreported.exception.default.constructor", abstractC16579));
                } else if (abstractC8774.m22847(EnumC18651.f60554)) {
                    C6656 c6656 = (C6656) abstractC8774;
                    if (c6656.f22475.m17329()) {
                        C20414 c20415 = c10955.f37257;
                        AbstractC11242 abstractC11242 = c6656.f22475.f77453;
                        C5909 c59010 = C23879.f77204;
                        c20415.m48199(abstractC8774, new C5909("compiler", "unreported.exception.implicit.close", abstractC16579, abstractC11242));
                    } else {
                        C20414 c20416 = c10955.f37257;
                        C5909 c59011 = C23879.f77204;
                        c20416.m48199(abstractC8774, new C5909("compiler", "unreported.exception.need.to.catch.or.throw", abstractC16579));
                    }
                } else {
                    C20414 c20417 = c10955.f37257;
                    C5909 c59012 = C23879.f77204;
                    c20417.m48199(abstractC8774, new C5909("compiler", "unreported.exception.need.to.catch.or.throw", abstractC16579));
                }
            } else {
                C20414 c20418 = c10955.f37257;
                abstractC8774.getClass();
                C6171.m17176(c20418.m46180(abstractC8774));
            }
            c18009 = (C18009) this.f60692.m43727();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22969(AbstractC16579 abstractC16579, AbstractC8774 abstractC8774) {
        boolean zM47351;
        C10955 c10955 = this.f30370;
        C21017 c21017 = c10955.f37254;
        c21017.getClass();
        boolean z = true;
        try {
            zM47351 = c21017.m47351(abstractC16579);
        } catch (C4146 e) {
            c21017.m47261(abstractC8774, e);
            zM47351 = true;
        }
        if (zM47351) {
            return;
        }
        C21017 c21018 = c10955.f37254;
        C21825 c21825 = this.f30372;
        if (!c21018.m47351(abstractC16579) && !c21018.m47255(abstractC16579, c21825)) {
            z = false;
        }
        if (!z) {
            C19003 c19003 = this.f60692;
            C19421 c19421 = new C19421(abstractC8774);
            c19421.f62581 = abstractC16579;
            c19003.m43723(c19421);
        }
        this.f30373 = c10955.f37254.m47339(abstractC16579, this.f30373);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1065(C8753 c8753) {
        if (c8753.f30086 == null) {
            return;
        }
        C8753 c8754 = this.f30371;
        C21825 c21825M47326 = this.f30373;
        C21825 c21825 = this.f30372;
        C19003 c19003 = this.f60692;
        C10955 c10955 = this.f30370;
        C16826 c16826 = c10955.f37252;
        boolean z = c8753.f30093 == c10955.f37255.f77594;
        this.f60692 = new C19003();
        if (!z) {
            this.f30372 = C21825.m48588();
        }
        this.f30371 = c8753;
        this.f30373 = C21825.m48588();
        c10955.f37252 = c10955.f37252.m39465(c8753.f30086);
        try {
            for (C21825 c21826 = c8753.f30090; c21826.m48595(); c21826 = c21826.f70877) {
                if (!((AbstractC8774) c21826.f70876).m22847(EnumC18651.f60478) && (C3128.m9431((AbstractC8774) c21826.f70876) & 8) != 0) {
                    mo7248((AbstractC8774) c21826.f70876);
                    m22970();
                }
            }
            if (!z) {
                boolean z2 = true;
                for (C21825 c21827 = c8753.f30090; c21827.m48595(); c21827 = c21827.f70877) {
                    if (C3128.m9455((AbstractC8774) c21827.f70876)) {
                        C21825 c21825Mo33524 = ((C23195) c21827.f70876).f75263.f77449.mo33524();
                        if (z2) {
                            this.f30372 = c21825Mo33524;
                            z2 = false;
                        } else {
                            this.f30372 = c10955.f37254.m47331(c21825Mo33524, this.f30372);
                        }
                    }
                }
            }
            for (C21825 c21828 = c8753.f30090; c21828.m48595(); c21828 = c21828.f70877) {
                if (!((AbstractC8774) c21828.f70876).m22847(EnumC18651.f60478) && (C3128.m9431((AbstractC8774) c21828.f70876) & 8) == 0) {
                    mo7248((AbstractC8774) c21828.f70876);
                    m22970();
                }
            }
            if (z) {
                for (C21825 c21829 = c8753.f30090; c21829.m48595(); c21829 = c21829.f70877) {
                    if (C3128.m9466((AbstractC8774) c21829.f70876)) {
                        C23195 c23195 = (C23195) c21829.f70876;
                        mo7248(c23195);
                        c23195.f75264 = c10955.f37248.m14632(this.f30373);
                        c23195.f75263.f77449 = c10955.f37258.m52421(c23195.f75263.f77449, this.f30373);
                    }
                }
                c21825M47326 = c10955.f37254.m47326(this.f30373, c21825M47326);
            }
            for (C21825 c218210 = c8753.f30090; c218210.m48595(); c218210 = c218210.f70877) {
                if ((!z || !C3128.m9466((AbstractC8774) c218210.f70876)) && ((AbstractC8774) c218210.f70876).m22847(EnumC18651.f60478)) {
                    mo7248((AbstractC8774) c218210.f70876);
                    m22970();
                }
            }
            this.f30373 = c21825M47326;
        } finally {
            this.f60692 = c19003;
            this.f30372 = c21825;
            this.f30371 = c8754;
            c10955.f37252 = c16826;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        boolean z;
        if (c23195.f75268 == null) {
            return;
        }
        C21825 c21825 = this.f30372;
        C21825 c21825Mo33524 = c23195.f75263.f77449.mo33524();
        C10955 c10955 = this.f30370;
        C16826 c16826 = c10955.f37252;
        c10955.f37252 = c10955.f37252.m39465(c23195.f75263);
        C6171.m17176(this.f60692.isEmpty());
        try {
            for (C21825 c21826 = c23195.f75270; c21826.m48595(); c21826 = c21826.f70877) {
                mo7248((C6656) c21826.f70876);
            }
            if (C3128.m9455(c23195)) {
                this.f30372 = c10955.f37254.m47326(this.f30372, c21825Mo33524);
            } else if ((c23195.f75263.f77447 & 1048584) != 1048576) {
                this.f30372 = c21825Mo33524;
            }
            mo7248(c23195.f75268);
            C21825 c21825M43726 = this.f60692.m43726();
            this.f60692 = new C19003();
            while (c21825M43726.m48595()) {
                C18009 c18009 = (C18009) c21825M43726.f70876;
                c21825M43726 = c21825M43726.f70877;
                if (!(c18009 instanceof C19421)) {
                    if (!c18009.f57603.m22847(EnumC18651.f60528)) {
                        C20414 c20414 = c10955.f37257;
                        AbstractC8774 abstractC8774 = c18009.f57603;
                        abstractC8774.getClass();
                        z = c20414.m46180(abstractC8774);
                    }
                    C6171.m17176(z);
                } else {
                    this.f60692.m43723(c18009);
                }
            }
        } finally {
            this.f30372 = c21825;
            c10955.f37252 = c16826;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        if (c6656.f22481 != null) {
            C10955 c10955 = this.f30370;
            C16826 c16826 = c10955.f37252;
            c10955.f37252 = c10955.f37252.m39465(c6656.f22475);
            try {
                mo7248(c6656.f22481);
            } finally {
                c10955.f37252 = c16826;
            }
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
        m49334(c21452.f69737);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3914(C0285 c0285) {
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        mo7248(c0285.f1595);
        m43248(c0285);
        mo7248(c0285.f1596);
        m43245(c0285, c19003);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3960(C22885 c22885) {
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        mo7248(c22885.f74426);
        mo7248(c22885.f74425);
        m43248(c22885);
        m43245(c22885, c19003);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3944(C14398 c14398) {
        C19003 c19003 = this.f60692;
        m49334(c14398.f47204);
        this.f60692 = new C19003();
        AbstractC5930 abstractC5930 = c14398.f47207;
        if (abstractC5930 != null) {
            mo7248(abstractC5930);
        }
        mo7248(c14398.f47206);
        m43248(c14398);
        m49334(c14398.f47205);
        m43245(c14398, c19003);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3950(C16514 c16514) {
        mo3928(c16514.f53042);
        C19003 c19003 = this.f60692;
        mo7248(c16514.f53044);
        this.f60692 = new C19003();
        mo7248(c16514.f53043);
        m43248(c16514);
        m43245(c16514, c19003);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3920(C2732 c2732) {
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        mo7248(c2732.f10508);
        m43245(c2732, c19003);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3918(C2026 c2026) {
        m22966(c2026, c2026.f7570, c2026.f7568);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3934(C9789 c9789) {
        m22966(c9789, c9789.f33504, c9789.f33505);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22966(AbstractC8774 abstractC8774, AbstractC5930 abstractC5930, C21825 c21825) {
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        mo7248(abstractC5930);
        while (c21825.m48595()) {
            C18630 c18630 = (C18630) c21825.f70876;
            m49334(c18630.f60400);
            m49334(c18630.f60403);
            c21825 = c21825.f70877;
        }
        if (abstractC8774.m22847(EnumC18651.f60487)) {
            m43249(abstractC8774, c19003);
        } else {
            m43245(abstractC8774, c19003);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3942(C13713 c13713) {
        C10955 c10955;
        C21825 c21825Of;
        C21825 c21825;
        Iterator it;
        C21825 c21826;
        C21825 c21827;
        boolean zM47351;
        C14065 c14065;
        C21825<AbstractC16579> c21825Of2;
        C21825 c21825Of3;
        C21825 c21828 = this.f30372;
        C21825 c21829 = this.f30373;
        this.f30373 = C21825.m48588();
        C21825 c218210 = c13713.f45221;
        while (true) {
            boolean zM48595 = c218210.m48595();
            c10955 = this.f30370;
            if (!zM48595) {
                break;
            }
            if (((C19336) c218210.f70876).f62363.f22477.m22847(EnumC18651.f60502)) {
                c21825Of3 = ((C1011) ((C19336) c218210.f70876).f62363.f22477).f4699;
            } else {
                c21825Of3 = C21825.of((Object) ((C19336) c218210.f70876).f62363.f22477);
            }
            Iterator it2 = c21825Of3.iterator();
            while (it2.hasNext()) {
                this.f30372 = c10955.f37254.m47339(((AbstractC5930) it2.next()).f30190, this.f30372);
            }
            c218210 = c218210.f70877;
        }
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        for (AbstractC8774 abstractC8774 : c13713.f45222) {
            if (abstractC8774 instanceof C6656) {
                mo3928((C6656) abstractC8774);
            } else if (abstractC8774 instanceof AbstractC5930) {
                mo7248((AbstractC5930) abstractC8774);
            } else {
                throw new AssertionError(c13713);
            }
        }
        Iterator it3 = c13713.f45222.iterator();
        while (true) {
            boolean z = false;
            if (!it3.hasNext()) {
                break;
            }
            AbstractC8774 abstractC8775 = (AbstractC8774) it3.next();
            if (abstractC8775.f30190.mo12731()) {
                c21825Of2 = c10955.f37258.m52439(abstractC8775.f30190).m48597(c10955.f37258.m52432(abstractC8775.f30190));
            } else {
                c21825Of2 = C21825.of((Object) abstractC8775.f30190);
            }
            for (AbstractC16579 abstractC16579 : c21825Of2) {
                if (c10955.f37258.m52423(c10955.f37253.f14218.f53222, abstractC16579) != null) {
                    C20145 c20145 = c10955.f37250;
                    C4603 c4603 = c10955.f37256;
                    AbstractC16579 abstractC16579M52422 = c10955.f37258.m52422(abstractC16579, z);
                    AbstractC11242 abstractC11242 = c10955.f37255.f77582;
                    C21825 c21825M48588 = C21825.m48588();
                    C21825 c21825M48589 = C21825.m48588();
                    c20145.getClass();
                    AbstractC8774 abstractC8776 = abstractC8775;
                    AbstractC23903 abstractC23903M45543 = c20145.m45543(c13713, c4603, abstractC16579M52422.f53222, abstractC16579M52422, abstractC11242, c21825M48588, c21825M48589);
                    AbstractC16579 abstractC16579M52409 = c10955.f37258.m52409(abstractC23903M45543, abstractC8776.f30190);
                    if (abstractC23903M45543.f77452 == EnumC10477.f35879) {
                        Iterator it4 = abstractC16579M52409.mo33524().iterator();
                        while (it4.hasNext()) {
                            m22969((AbstractC16579) it4.next(), abstractC8776);
                        }
                    }
                    abstractC8775 = abstractC8776;
                    z = false;
                }
            }
        }
        mo7248(c13713.f45220);
        C21825 c21825M47326 = c10955.f37254.m47326(this.f30373, C21825.of((Object) c10955.f37253.f14233, (Object) c10955.f37253.f14278));
        this.f30373 = c21829;
        this.f30372 = c21828;
        C21825 c21825M485810 = C21825.m48588();
        C21825 c218211 = c13713.f45221;
        while (c218211.m48595()) {
            C6656 c6656 = ((C19336) c218211.f70876).f62363;
            if (c6656.f22477.m22847(EnumC18651.f60502)) {
                c21825Of = ((C1011) ((C19336) c218211.f70876).f62363.f22477).f4699;
            } else {
                c21825Of = C21825.of((Object) ((C19336) c218211.f70876).f62363.f22477);
            }
            C21825 c21825M485811 = C21825.m48588();
            C21825 c21825M47340 = c10955.f37254.m47340(c21825M47326, c21825M485810);
            Iterator it5 = c21825Of.iterator();
            C21825 c21825M47339 = c21825M485810;
            C21825 c218212 = c21825M485811;
            while (it5.hasNext()) {
                AbstractC8774 abstractC8777 = (AbstractC5930) it5.next();
                AbstractC16579 abstractC165710 = abstractC8777.f30190;
                if (abstractC165710 != c10955.f37253.f14247) {
                    C21825 c21825M48591 = c218212.m48591(abstractC165710);
                    it = it5;
                    if (c10955.f37258.m52399(abstractC165710, c10955.f37253.f14275)) {
                        c21825 = c21825Of;
                        c21826 = c21829;
                        c218212 = c21825M48591;
                    } else {
                        if (c21825Of.m48596() <= 1) {
                            abstractC8777 = (C19336) c218211.f70876;
                            abstractC8777.getClass();
                        }
                        if (c10955.f37254.m47255(abstractC165710, c21825M47339)) {
                            C20414 c20414 = c10955.f37257;
                            C5909 c5909 = C23879.f77204;
                            c21825 = c21825Of;
                            c21827 = c21825M48591;
                            c21826 = c21829;
                            c20414.m48199(abstractC8777, new C5909("compiler", "except.already.caught", abstractC165710));
                        } else {
                            c21825 = c21825Of;
                            c21826 = c21829;
                            c21827 = c21825M48591;
                            C21017 c21017 = c10955.f37254;
                            c21017.getClass();
                            try {
                                zM47351 = c21017.m47351(abstractC165710);
                            } catch (C4146 e) {
                                c21017.m47261(abstractC8777, e);
                                zM47351 = true;
                            }
                            if (!zM47351 && !m22967(abstractC165710) && !c10955.f37254.m47336(abstractC165710, c21825M47326)) {
                                C20414 c20415 = c10955.f37257;
                                C5909 c59010 = C23879.f77204;
                                c20415.m48199(abstractC8777, new C5909("compiler", "except.never.thrown.in.try", abstractC165710));
                            } else {
                                C21825 c21825M47331 = c10955.f37254.m47331(C21825.of((Object) abstractC165710), c21825M47326);
                                if (c10955.f37254.m47340(c21825M47331, c21825M47339).isEmpty() && !m22967(abstractC165710)) {
                                    if (c21825M47331.m48596() == 1) {
                                        C14065 c14066 = C9768.f32836;
                                        c14065 = new C14065("compiler", "unreachable.catch", c21825M47331);
                                    } else {
                                        C14065 c14067 = C9768.f32836;
                                        c14065 = new C14065("compiler", "unreachable.catch.1", c21825M47331);
                                    }
                                    c10955.f37257.m48204(abstractC8777, c14065);
                                }
                            }
                        }
                        c21825M47339 = c10955.f37254.m47339(abstractC165710, c21825M47339);
                        c218212 = c21827;
                    }
                } else {
                    c21825 = c21825Of;
                    it = it5;
                    c21826 = c21829;
                }
                it5 = it;
                c21825Of = c21825;
                c21829 = c21826;
            }
            mo7248(c6656);
            this.f30369.put(c6656.f22475, c10955.f37254.m47331(c218212, c21825M47340));
            mo7248(((C19336) c218211.f70876).f62362);
            this.f30369.remove(c6656.f22475);
            c218211 = c218211.f70877;
            c21825M485810 = c21825M47339;
        }
        C21825 c218213 = c21829;
        if (c13713.f45218 != null) {
            C21825 c218214 = this.f30373;
            this.f30373 = C21825.m48588();
            C19003 c19004 = this.f60692;
            this.f60692 = c19003;
            mo7248(c13713.f45218);
            if (!c13713.f45219) {
                this.f30373 = c10955.f37254.m47326(this.f30373, c218213);
                return;
            }
            this.f30373 = c10955.f37254.m47326(this.f30373, c10955.f37254.m47340(c21825M47326, c21825M485810));
            this.f30373 = c10955.f37254.m47326(this.f30373, c218214);
            while (c19004.m43722()) {
                this.f60692.m43723((C18009) c19004.m43727());
            }
            return;
        }
        this.f30373 = c10955.f37254.m47326(this.f30373, c10955.f37254.m47340(c21825M47326, c21825M485810));
        C19003 c19005 = this.f60692;
        this.f60692 = c19003;
        while (c19005.m43722()) {
            this.f60692.m43723((C18009) c19005.m43727());
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3924(C4849 c4849) {
        mo7248(c4849.f17076);
        mo7248(c4849.f17075);
        AbstractC14728 abstractC14728 = c4849.f17077;
        if (abstractC14728 != null) {
            mo7248(abstractC14728);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22967(AbstractC16579 abstractC16579) {
        AbstractC0618 abstractC0618 = abstractC16579.f53222;
        C10955 c10955 = this.f30370;
        return abstractC0618 == c10955.f37253.f14302.f53222 || abstractC16579.f53222 == c10955.f37253.f14237.f53222;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1066(C17924 c17924) {
        m43247(new C18009(c17924));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1068(C21473 c21473) {
        mo7248(c21473.f69790);
        m43247(new C18009(c21473));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1067(C20747 c20747) {
        m43247(new C18009(c20747));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3294(C11200 c11200) {
        mo7248(c11200.f37914);
        m43247(new C18009(c11200));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3923(C4539 c4539) {
        mo7248(c4539.f16146);
        AbstractC23903 abstractC23903M9471 = C3128.m9471(c4539.f16146);
        if (abstractC23903M9471 != null && abstractC23903M9471.f77452 == EnumC10477.f35878 && (abstractC23903M9471.mo20276() & 2199023255568L) != 0 && this.f30369.get(abstractC23903M9471) != null) {
            Iterator it = ((C21825) this.f30369.get(abstractC23903M9471)).iterator();
            while (it.hasNext()) {
                m22969((AbstractC16579) it.next(), c4539);
            }
            return;
        }
        m22969(c4539.f16146.f30190, c4539);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3947(C15434 c15434) {
        mo7248(c15434.f50296);
        m49334(c15434.f50298);
        for (C21825 c21825Mo33524 = c15434.f50296.f30190.mo33524(); c21825Mo33524.m48595(); c21825Mo33524 = c21825Mo33524.f70877) {
            m22969((AbstractC16579) c21825Mo33524.f70876, c15434);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        mo7248(c8378.f29093);
        m49334(c8378.f29099);
        for (C21825 c21825Mo33524 = c8378.f29100.mo33524(); c21825Mo33524.m48595(); c21825Mo33524 = c21825Mo33524.f70877) {
            m22969((AbstractC16579) c21825Mo33524.f70876, c8378);
        }
        C21825 c21825 = this.f30372;
        try {
            if (c8378.f29098 != null) {
                for (C21825 c21825Mo33525 = c8378.f29097.f77449.mo33524(); c21825Mo33525.m48595(); c21825Mo33525 = c21825Mo33525.f70877) {
                    this.f30372 = this.f30370.f37254.m47339((AbstractC16579) c21825Mo33525.f70876, this.f30372);
                }
            }
            mo7248(c8378.f29098);
        } finally {
            this.f30372 = c21825;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3959(C22489 c22489) {
        boolean z;
        C10955 c10955 = this.f30370;
        AbstractC16579 abstractC16579 = c22489.f30190;
        if (abstractC16579 == null || !abstractC16579.mo1926()) {
            C21825 c21825 = this.f30372;
            C21825 c21826 = this.f30373;
            C19003 c19003 = this.f60692;
            try {
                this.f60692 = new C19003();
                this.f30372 = c22489.m5634(c10955.f37258).mo33524();
                this.f30373 = C21825.m48588();
                mo7248(c22489.f73408);
                C21825 c21825M43726 = this.f60692.m43726();
                this.f60692 = new C19003();
                while (c21825M43726.m48595()) {
                    C18009 c18009 = (C18009) c21825M43726.f70876;
                    c21825M43726 = c21825M43726.f70877;
                    if (!(c18009 instanceof C19421)) {
                        if (!c18009.f57603.m22847(EnumC18651.f60528)) {
                            C20414 c20414 = c10955.f37257;
                            AbstractC8774 abstractC8774 = c18009.f57603;
                            abstractC8774.getClass();
                            z = c20414.m46180(abstractC8774);
                        }
                        C6171.m17176(z);
                    } else {
                        this.f60692.m43723(c18009);
                    }
                }
                m22970();
            } finally {
                this.f60692 = c19003;
                this.f30372 = c21825;
                this.f30373 = c21826;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22968(C4603 c4603, AbstractC8774 abstractC8774, C5286 c5286) {
        C10955 c10955 = this.f30370;
        try {
            c10955.f37256 = c4603;
            c10955.f37248 = c5286;
            this.f60692 = new C19003();
            this.f30369 = new HashMap();
            this.f30372 = null;
            this.f30373 = null;
            this.f30371 = null;
            mo7248(abstractC8774);
        } finally {
            this.f60692 = null;
            c10955.f37248 = null;
            this.f30372 = null;
            this.f30373 = null;
            this.f30371 = null;
        }
    }

    public C8838(C10955 c10955) {
        this.f30370 = c10955;
    }
}
